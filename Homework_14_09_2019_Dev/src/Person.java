public class Person {
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);          // age is set to 10

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);              // age is set to 18

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstName() {
        String s1 = firstName;
        return s1;
    }

    public String getLastName() {
        String s1 = lastName;
        return s1;
    }

    public int getAge() {
        int s1 = age;
        return s1;
    }

    public void setFirstName(String s1) {
        firstName = s1;
    }

    public void setLastName(String s1) {
        lastName = s1;
    }

    public void setAge(int s1) {
        if (s1 < 0 || s1 > 100)
            age = 0;
        else
            age = s1;
    }

    public boolean isTeen() {
        boolean ans = true;
        if ((age > 12) && (age < 20)) {
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            firstName = " ";
        }
        if (lastName.isEmpty()) {
            lastName = " ";
        }
        String s1 = firstName + " " + lastName;
        return s1;
    }
}
