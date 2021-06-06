import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Course[] courses1 = new Course[0];
        Course[] courses2 = new Course[0];
        Course[] courses3 = new Course[0];
        Lecturer[] lecturers1 = new Lecturer[0];
        Lecturer[] lecturers2 = new Lecturer[0];
        Lecturer[] lecturers3 = new Lecturer[0];
        HeadOfDepartment headOfDepartments1 = new HeadOfDepartment("Shalom", "Levi", 12, "B.Sc. In computer science", "Big Dats");
        HeadOfDepartment headOfDepartments2 = new HeadOfDepartment("Dana", "Cohen", 15, "B.A. In economics and accounting", "Advises and markets a pensioner");
        HeadOfDepartment headOfDepartments3 = new HeadOfDepartment("Shani", "Hen", 20, "B.A. In politics and government", "Social Sciences Law");

        Class[] classes = {
                new Class(123, "Computer Science", courses1, lecturers1, headOfDepartments1),
                new Class(124, "Faculty of Economics", courses2, lecturers2, headOfDepartments2),
                new Class(125, "Social Science", courses3, lecturers3, headOfDepartments3)
        };

        while (true) {
            System.out.println("The classes are:\n 0: " + classes[0].getClassName() + "\n 1: " + classes[1].getClassName() + "\n 2: " + classes[2].getClassName());
            System.out.println("Which classes do you chose? (0-2) ");
            int userChoice = in.nextInt();
            while (userChoice > 2 || userChoice < 0) {
                System.out.println("Your choice is not exist, try again");
                userChoice = in.nextInt();
            }
            boolean run = true;
            while (run) {
                int userOperation;
                System.out.println();
                menu();
                System.out.println();
                System.out.println("Which operation do you choose? (0-5) ");
                userOperation = in.nextInt();
                System.out.println();
                switch (userOperation) {
                    case 0:
                        classes[userChoice].print();
                        break;
                    case 1:
                        renameClass(classes, userChoice);
                        break;
                    case 2:
                        classes[userChoice].addLecturer();
                        break;
                    case 3:
                        addCourse(classes, userChoice);
                        break;
                    case 4:
                        Course[] listOfCourses = classes[userChoice].getCourse();
                        if (listOfCourses.length== 0){
                            System.out.println("There is no curses");
                        }
                        else if (listOfCourses!=null) {
                            int courseChoice = additionalActionsOnCourse(listOfCourses);
                            if (courseChoice >= 0 && courseChoice <= listOfCourses.length) {
                                    switchOperation4(listOfCourses, courseChoice);
                                }
                            } else {
                              System.out.println("Your choice is not exist, please try again ");
                    } break;

                    case 5:
                        run = false;
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            }
        }
    }


    public static void menu() {
        System.out.println("Actions that can be performed for this department:\n" +
                " 0 - Print all the information about the department \n" +
                " 1 - Renaming the department \n" +
                " 2 - Adding a lecturer to the department \n" +
                " 3 - Adding a course to the department \n" +
                " 4 - Select an existing course to perform additional actions \n" +
                " 5 - Back to the previous menu\n");

    }

    public static void menuOfOption4() {
        System.out.println("The options menu for this course: \n" +
                "1. Printing course information \n" +
                "2. Renaming the course \n" +
                "3. Adding a student to the course \n" +
                "4. Back to the previous menu  ");
    }

    public static void renameClass(Class[] classes, int userChoice) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which new name do you want? ");
        String newName = scanner.nextLine();
        classes[userChoice].setClassName(newName);
        System.out.println("The classes are:\n" + classes[0].getClassName() + "\n" + classes[1].getClassName() + "\n" + classes[2].getClassName());
    }

    public static void addCourse(Class[] classes, int userChoice) {
        if (classes[userChoice].getSizeArrayLecturer() == 0) {
            System.out.println("You cant open new course because you don't have any lecturer");
        } else if (classes[userChoice].getSizeArrayLecturer() == 1) {
            classes[userChoice].addCourse();
            Course[] currentCourse = classes[userChoice].getCourse();
            Lecturer[] currentLecturer = classes[userChoice].getLecturers();
            currentCourse[currentCourse.length-1].setLecturer(currentLecturer[0]);
        } else {
            Lecturer[] listOfLecturer = classes[userChoice].getLecturers();
            int counter = 0;
            System.out.println("The options of the lecturer are: ");
            for (int j = 0; j < listOfLecturer.length; j++) {
                System.out.print(counter + " ");
                listOfLecturer[j].print();
                counter++;
            }
            int userChoiceLecturer = chosenLecturer(listOfLecturer);
            classes[userChoice].addCourse();
            Course[] currentCourse = classes[userChoice].getCourse();
            Lecturer[] currentLecturer = classes[userChoice].getLecturers();
            currentCourse[currentCourse.length - 1].setLecturer(listOfLecturer[userChoiceLecturer]);
        }
    }

    public static int chosenLecturer(Lecturer[] listOfLecturer) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which lecturer do you choose? ");
        int userChoiceLecturer = in.nextInt();
        while (userChoiceLecturer < 0 || userChoiceLecturer > (listOfLecturer.length - 1)) {
            System.out.println("There is no lecturer at that index, try again");
            userChoiceLecturer = in.nextInt();
        }
        return userChoiceLecturer;
    }

    public static int additionalActionsOnCourse(Course[] listOfCourses) {
        Scanner in = new Scanner(System.in);
            System.out.println("The courses of this class are: ");
            int counter = 0;
            for (int i = 0; i < listOfCourses.length; i++) {
                System.out.println(counter + " : " + listOfCourses[i].getNameOfCourse());
                counter++;
            }
                    System.out.println("Which course do you want? ");
                    int courseChoice = in.nextInt();
                    while (courseChoice<0 || courseChoice>=counter){
                        System.out.println("There is no course at that index, try again");
                        courseChoice = in.nextInt();
                    }

        return courseChoice;

    }

    public static void addStudentToCourse(Course[] listOfCourses, int courseChoice) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("New student: \n First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Card number: ");
        int cardNumber = in.nextInt();
        Student s1 = new Student(firstName, lastName, cardNumber);
        listOfCourses[courseChoice].addStudent(s1);
    }

    public static void switchOperation4(Course[] listOfCourses, int courseChoice) {
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            menuOfOption4();
            System.out.println("Which operation do you choose? ");
            int userOp = in.nextInt();
            while (userOp<0 || userOp>4){
                System.out.println("Your choose invalid, try again");
                userOp = in.nextInt();
            }
            switch (userOp) {
                case 1:
                    listOfCourses[courseChoice].print();
                    break;
                case 2:
                    System.out.println("Which new name do you want? ");
                    String newNameCourse = scanner.nextLine();
                    listOfCourses[courseChoice].setNameOfCourse(newNameCourse);
                    break;
                case 3:
                    addStudentToCourse(listOfCourses, courseChoice);
                    break;
                case 4:
                    run=false;
                    break;
            }
        }
    }

}
