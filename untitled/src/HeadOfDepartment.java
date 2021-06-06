public class HeadOfDepartment extends Lecturer{

    private String degree;
    private String specialty;

    public HeadOfDepartment(String firstName, String lastName, int yearOfExperience, String degree, String specialty) {
        super(firstName, lastName, yearOfExperience);
        this.degree = degree;
        this.specialty = specialty;
    }

    public String getSpecialty() {

        return specialty;
    }

    public void setSpecialty(String specialty) {

        this.specialty = specialty;
    }

    public String getDegree() {

        return degree;
    }

    public void setDegree(String degree) {

        this.degree = degree;
    }

    public void print(){
        super.printForDepartmentHead();
        System.out.println("Degree: " + this.degree);
        System.out.println("Speciality: " + this.specialty);

    }
}
