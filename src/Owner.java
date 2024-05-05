/**
 * A class that holds the foundations of the Owner of a Vehicle.
 *
 * @author Tensenrin
 */
public class Owner {
    public enum Gender {
        MALE,
        FEMALE,
    }
    // Attributes
    private final String FIRST_NAME;
    private final String SURNAME;
    private int age;
    private final Gender GENDER;
    private String address;
    private Vehicle ownedVehicle;

    public Owner(String firstName, String surname, Gender gender, int age, String address) {
        this.FIRST_NAME = firstName;
        this.SURNAME = surname;
        this.GENDER = gender;
        this.age = age;
        this.address = address;
        this.ownedVehicle = null;
    }

    public String getFirstName() {
        return this.FIRST_NAME;
    }

    public String getSurname() {
        return this.SURNAME;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.GENDER;
    }

    public String getAddress() {
        return this.address;
    }

    // Overridden methods

    @Override
    public String toString() {
        return "Owner{" +
                "FIRST_NAME='" + FIRST_NAME + '\'' +
                ", SURNAME='" + SURNAME + '\'' +
                ", age=" + age +
                ", GENDER=" + GENDER +
                ", address='" + address + '\'' +
                '}';
    }
}
