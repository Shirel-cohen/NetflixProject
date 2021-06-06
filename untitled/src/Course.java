public class Course {

    private String nameOfCourse;
    private Lecturer lecturer ;
    private Student [] studentsList;
    private  int credits;


    public Course(String nameOfCourse, Lecturer lecturer, Student [] studentList, int credits) {
        this.nameOfCourse = nameOfCourse;
        this.lecturer = lecturer;
        this.studentsList = studentList;
        this.credits = credits;
    }

    public String getNameOfCourse() {

        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {

        this.nameOfCourse = nameOfCourse;
    }
    public Lecturer getLecturer() {

        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {

        this.lecturer = lecturer;
    }
    public Student[] getStudents() {

        return studentsList;
    }

    public void setStudents(Student[] students) {

        this.studentsList = students;
    }
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        credits = credits;
    }

    public void addStudent (Student newStudent) {
        if (this.studentsList == null) {
            Student[] biggerList = new Student[1];
            biggerList [0] = newStudent;
            this.studentsList=biggerList;

        } else {
            Student[] biggerList = new Student[this.studentsList.length + 1];
            for (int i = 0; i < this.studentsList.length; i++) {
                if (studentsList[i] == null) {
                    studentsList[i] = newStudent;
                }
                biggerList[i] = this.studentsList[i];
            }
            biggerList[this.studentsList.length] = newStudent;
            this.studentsList = biggerList;
        }

    }
    public void print (){
        System.out.println("The name of the course is: "+ this.nameOfCourse);
        this.lecturer.print();
        System.out.println("The number of credit points that the course earns: " + this.credits);
        if (studentsList==null){
            System.out.println("There is no students in this course! ");
        }
        else{
            int count = 0;
            System.out.println("The students of this course are: " );
            for (int i=0; i< studentsList.length; i++){
                if (studentsList[i]!=null){
                    Student s = studentsList[i];
                    s.print();
                    count++;
                }
            }
            System.out.println("Count of the students: " + count );
        }
        System.out.println();
    }


}
