public class Student extends Person {

    private int cardNumber;

    public Student(String firstName, String lastName, int cardNumber) {
        super(firstName, lastName);
        this.cardNumber = cardNumber;
    }

    public void setCardNumber(int cardNumber) {

        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void print() {
        System.out.println("Student details: ");
        super.print();
        System.out.println("The student's number is: " + cardNumber);
        System.out.println("----------------------------------");
    }
}