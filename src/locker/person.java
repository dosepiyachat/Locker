package locker;

public class person {

    private String firstName[];
    private String lastName[];
    private int count = -1;

    public person(int number) {

        firstName = new String[number];
        lastName = new String[number];
    }

    public boolean addName(String fName, String lName) {
        if (count < firstName.length) {
            count++;
            this.firstName[count] = fName;
            this.lastName[count] = lName;
            return true;
        } else {
            return false;
        }
    }

    public String[] getFirstName() {
        return firstName;
    }

    public String[] getLastName() {
        return lastName;
    }


   

    public int getCount() {
        return count;
    }

}
