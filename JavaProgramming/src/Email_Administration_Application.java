import java.util.Scanner;

import java.util.Random;

/*
Email Administration Application

Scenario : You are an IT Support Administrator Specialist and are charged with the task of creating email accounts
for new hires.

Your application should do the following :-

- Generate an email with the following syntax : firstname.lastname@department.company.com
- Determine the department (finance, marketing, operations management, human resources and information technology),
  if none leave blank
- Generate a random string for a password
- Have set methods to change the password, set the mailbox capacity, and define an alternate email address
- Have get methods to display the email and mailbox capacity
 */

class Email {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String department;
    final String company = "coders";
    private String email;
    private String password = "";
    private int mailbox_capacity = 100;
    private String alternateEmail;

    // A method to take first and last name as input.
    void input_name()
    {
        System.out.print("Enter First Name : ");
        firstName = scanner.nextLine().toLowerCase();

        System.out.print("Enter Last Name : ");
        lastName = scanner.nextLine().toLowerCase();
    }

    // A method to determine the department of an employee.
    void input_department()
    {
        int department_id;

        do
        {
            System.out.println("Department : None, Id : 0");
            System.out.println("Department : Finance, Id : 1");
            System.out.println("Department : Marketing, Id : 2");
            System.out.println("Department : Operations Management, Id : 3");
            System.out.println("Department : Human Resources, Id : 4");
            System.out.println("Department : Information Technology, Id : 5");

            System.out.print("Enter Department Id : ");
            department_id = scanner.nextInt();

            if (department_id < 0 || department_id > 5)
            {
                System.out.println("Please enter the department id from the given choices only");
            }

        } while (department_id < 0 || department_id > 5);

        switch (department_id)
        {
            case 0:
                department = "";
                break;

            case 1:
                department = "Finance";
                break;

            case 2:
                department = "Marketing";
                break;

            case 3:
                department = "OperationsManagement";
                break;

            case 4:
                department = "HumanResources";
                break;

            case 5:
                department = "InformationTechnology";
                break;
        }
    }

    // A method to generate an email address of specified syntax.
    void generateEmail()
    {
        email = firstName + "." + lastName + "@" + department + "." + company + ".com";
    }

    /* A method to generate a random password of the length between 10 - 15 characters and containing
    lower case letters, uppercase letters and digits. */
    void generatePassword()
    {
        int max = 15, min = 10;
        int length = new Random().nextInt(max - min + 1) + min;

        for (int i = 0; i < length; i++)
        {
            char[] randoms = new char[3];

            randoms[0] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
            randoms[1] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
            randoms[2] = (char) (new Random().nextInt(122 - 97 + 1) + 97);

            password = password + randoms[new Random().nextInt(randoms.length)];
        }

        getPassword();
    }

    /* A method to set a new password of the length between 10 - 15 characters and containing at least one lower case
    letter, at least one uppercase letter and at least one digit. */
    void setPassword()
    {
        String newPassword;

        scanner.nextLine();

        boolean containsUppercaseCharacter = false;

        boolean containsLowercaseCharacter = false;

        boolean containsDigit = false;

        do
        {
            System.out.print("Enter New Password of length 10 - 15 : ");
            newPassword = scanner.nextLine();

            if (newPassword.length() < 10)
            {
                System.out.println("Password should contain at least 10 characters");
            }

            if (newPassword.length() > 15)
            {
                System.out.println("Password should not contain more than 15 characters");
            }

            for (int i = 65; i <= 90; i++)
            {
                char ch = (char) (i);

                if (newPassword.contains(Character.toString(ch)))
                {
                    containsUppercaseCharacter = true;
                    break;
                }
            }

            if (!containsUppercaseCharacter)
            {
                System.out.println("Password should contain at least one uppercase letter");
            }

            for (int i = 48; i <= 57; i++)
            {
                char ch = (char) (i);

                if (newPassword.contains(Character.toString(ch)))
                {
                    containsDigit = true;
                    break;
                }
            }

            if (!containsDigit)
            {
                System.out.println("Password should contain at least one digit");
            }

            for (int i = 97; i <= 122; i++)
            {
                char ch = (char) (i);

                if (newPassword.contains(Character.toString(ch)))
                {
                    containsLowercaseCharacter = true;
                    break;
                }
            }

            if (!containsLowercaseCharacter)
            {
                System.out.println("Password should contain at least one lowercase letter");
            }

        } while (newPassword.length() < 10 || newPassword.length() > 15 || !containsUppercaseCharacter || !containsDigit || !containsLowercaseCharacter);

        password = "";

        password = newPassword;

        System.out.println("New Password has been set successfully");
    }

    // A method to set new mailbox capacity.
    void setMailboxCapacity()
    {
        System.out.print("Enter New Mailbox Capacity : ");
        int new_capacity = scanner.nextInt();
        mailbox_capacity = new_capacity;
        System.out.println("Mailbox capacity has been set to " + mailbox_capacity);
    }

    // A method to set alternate email address.
    void setAlternateEmail()
    {
        boolean atSymbolCorrect = false;

        boolean domainNameCorrect = false;

        do
        {
            atSymbolCorrect = false;

            domainNameCorrect = false;

            System.out.print("Enter an alternate email address : ");
            alternateEmail = scanner.nextLine();

            // Checking if @ symbol is present in the email address.

            if (!alternateEmail.contains("@"))
            {
                System.out.println("@ symbol is missing");
            }
            else
            {
                // Checking if prefix before @ symbol is present or not.

                if (alternateEmail.indexOf("@") == 0)
                {
                    System.out.println("Prefix is missing");
                }
                else
                {
                    /* If @ symbol is present and prefix before @ symbol is also present, set the 'atSymbolCorrect'
                     to true denoting that every thing before the @ symbol is correct. */

                    atSymbolCorrect = true;
                }
            }

            // Checking if the domain is present in the email address.

            if (!alternateEmail.contains("."))
            {
                System.out.println("domain is missing");
            }
            else
            {
                if (alternateEmail.indexOf(".") == alternateEmail.indexOf("@") + 1)
                {
                    System.out.println("The domain name is missing after the @ symbol and before the top level domain");
                }
                else if (alternateEmail.indexOf(".") == alternateEmail.length() - 1)
                {
                    System.out.println("Top level domain is missing");
                }
                else
                {
                    domainNameCorrect = true;
                }
            }

        } while (!atSymbolCorrect || !domainNameCorrect);

        System.out.println("Alternate Email Address : " + alternateEmail);
    }

    // A method to display the email address generated for an employee.
    void getEmail()
    {
        System.out.println("Email Address : " + email);
    }

    /* A method to display the password. The method is made private due to fact that we don't want anyone to see
    the password just by calling this method. This method would only gets called when a new email address is generated. */
    private void getPassword()
    {
        System.out.println("Password : " + password);
    }

    // A method to display the current mailbox capacity.
    void getMailboxCapacity()
    {
        System.out.println("Current Mailbox Capacity : " + mailbox_capacity);
    }

}

public  class Email_Administration_Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Email employee1 = new Email();

        int choice;

        do
        {
            System.out.println("Operations");
            System.out.println("1. Generate a New Email Address");
            System.out.println("2. Set New Password");
            System.out.println("3. Set Alternate Email Address");
            System.out.println("4. Set New Mailbox Capacity");
            System.out.println("5. Display the Email Address");
            System.out.println("6. Display the Mailbox Capacity");
            System.out.println("7. Exit");

            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    employee1.input_name();
                    employee1.input_department();
                    employee1.generateEmail();
                    employee1.getEmail();
                    employee1.generatePassword();
                    employee1.getMailboxCapacity();
                    break;

                case 2:
                    employee1.setPassword();
                    break;

                case 3:
                    employee1.setAlternateEmail();
                    break;

                case 4:
                    employee1.setMailboxCapacity();
                    break;

                case 5:
                    employee1.getEmail();
                    break;

                case 6:
                    employee1.getMailboxCapacity();
                    break;
            }

        }while (choice != 7);

        scanner.close();

    }
}