public class Email {

    String firstName;
    String lastName;
    String department;
    String emailAddress;
    String password;
    String alternativeEmail;
    int mailCapacity;

    Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void generateEmail() {
        return firstName + "." + lastName + "@department.company.com";
    }

    void generatePassword() {
        return null;
    }

    void changePassword() {

    }

    void setMailCapacity(int capacity) {
        mailCapacity = capacity;
    }

    void getName() {

    }

    void getEmail() {

    }

    void getMailCapacity() {

    }


}
