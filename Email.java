import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;

    // Constructor to receive the firstname and the lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " +  this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " +  this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " +  this.password);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department Code: \n1. Sales\n2. Development\n3. Accounting\n0 None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if(deptChoice == 1){
            return "Sales";
        } else if(deptChoice == 2){
            return "Development";
        } else if(deptChoice == 3){
            return "Accounting";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()1234567890";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password

}