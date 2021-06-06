import java.util.Scanner;

public class Users implements Print {

    private String firstName;
    private String lastName;
    private String password;

    public Users(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
     return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void print(){
        System.out.println("Name: " + this.lastName+ " " + this.firstName);
        System.out.println("Password: " + this.password);
    }

    public void openAccount (){
        Scanner scanner = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        System.out.println("Enter user name");
        String userName = scanner.nextLine();
        System.out.println("Enter a password");
        int password = in.nextInt();
    }
}
