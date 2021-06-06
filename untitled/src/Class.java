import java.util.Scanner;
public class Class {

    private int identificationNumber;
    private String className;
    private Course [] course ;
    private Lecturer [] lecturers;
    private HeadOfDepartment headOfDepartment;


    public Class(int identificationNumber, String className, Course[] course, Lecturer[] lecturers, HeadOfDepartment headOfDepartment) {
        this.identificationNumber = identificationNumber;
        this.className = className;
        this.course = course;
        this.lecturers = lecturers;
        this.headOfDepartment= headOfDepartment;
    }


    public int getIdentificationNumber() {

        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {

        this.identificationNumber = identificationNumber;
    }

    public String getClassName() {

        return className;
    }

    public void setClassName(String className) {

        this.className = className;
    }

    public Course[] getCourse() {

        return course;
    }

    public void setCourse(Course[] course) {

        this.course = course;
    }

    public Lecturer[] getLecturers() {

        return lecturers;
    }


    public void setLecturers(Lecturer[] lecturers) {

        this.lecturers = lecturers;
    }

    public HeadOfDepartment getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public void print (){

        System.out.println("The identification number of this class is : " + this.identificationNumber);
        System.out.println("The name of this class is : " + this.className);
        System.out.println("*****************************");
        System.out.println("The head of department is: " );
        this.headOfDepartment.print();
        System.out.println("*****************************");
        if (this.getSizeArrayLecturer()  == 0){
            System.out.println("There is no lecturer! "); }
        else{
            int counter=0;
            for (int i=0; i< lecturers.length; i++){
                counter++;
                Lecturer l = lecturers[i];
                System.out.print(counter + " : " );  l.print();
                System.out.println("------------------------------");
            }
        }
            if (this.getSizeArrayCourses()==0){
                System.out.println("There is no courses! ");
            }
            else{
            for (int i = 0; i < this.course.length; i++) {
                Course c = this.course[i];
                    c.print();
                System.out.println("------------------------------");
            }
        }

    }

    public void addCourse (){
        Scanner scanner = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        Course [] biggerCourse = new Course[this.course.length + 1];
        System.out.println("Which course do you want to add ? ");
        String courseName = scanner.nextLine();
        System.out.println("How many credit points does this course earn? ");
        int credit = in.nextInt();
        for (int i=0; i<this.course.length; i++){
            if (this.course[i]==null){
                Course newCourse = new Course(courseName, null,null, credit);
                biggerCourse[i]= newCourse;
            }
            biggerCourse[i] = this.course[i];
        }
        Course newCourse = new Course(courseName, null,null, credit);
        biggerCourse [this.course.length] = newCourse;
        this.course = biggerCourse;
    }
    public void addLecturer (){
        Scanner scanner = new Scanner (System.in);
        Lecturer [] biggerLecturer = new Lecturer[this.lecturers.length + 1];
        System.out.println("Enter the details of the new lecturer:");
        System.out.println("First name: ");
        String lecturerFirstName = scanner.nextLine();
        System.out.println("Last name: ");
        String lecturerLastName = scanner.nextLine();
        System.out.println("Experience: ");
        int experience = scanner.nextInt();
        for (int i=0; i<this.lecturers.length;i++){
            if (this.lecturers[i]==null){
                Lecturer newLecturer = new Lecturer(lecturerFirstName, lecturerLastName,experience);
                biggerLecturer[i]=newLecturer;
            }
            biggerLecturer[i]=this.lecturers[i];
        }
        Lecturer newLecturer = new Lecturer(lecturerFirstName, lecturerLastName,experience);
        biggerLecturer [this.lecturers.length] = newLecturer;
        this.lecturers = biggerLecturer;
    }

    public int getSizeArrayLecturer (){
        int count = 0;
        for (int i=0; i<this.lecturers.length;i++){
            if (this.lecturers[i]==null){
               count = 0;
            } else{
                count++;
            }

        }
        return count;
    }
    public int getSizeArrayCourses (){
        int count = 0;
        for (int i=0; i<this.course.length;i++){
            if (this.course[i]==null){
                count = 0;
            } else{
                count++;
            }

        }
        return count;
    }

}
