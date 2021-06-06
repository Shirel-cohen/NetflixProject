public class Lecturer extends Person {

    private int yearOfExperience;

    public Lecturer(String firstName, String lastName, int yearOfExperience) {
        super(firstName, lastName);
        this.yearOfExperience = yearOfExperience;
    }

    public int getYearOfExperience() {

        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {

        this.yearOfExperience = yearOfExperience;
    }
    public void print (){
        System.out.println("Lecturer details : ");
        super.print();
        System.out.println("Experience: " + this.yearOfExperience + " years");
        System.out.println("------------------------");
    }
    public void printForDepartmentHead (){
        super.print();
        System.out.println("Experience: " + this.yearOfExperience + " years");
    }

}
