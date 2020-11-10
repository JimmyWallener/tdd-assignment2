package se.gritacademy;

public class AccountMember {

    private final String firstName;
    private final String lastName;
    private final String streetAddress;
    private final long phoneNumber;


    public AccountMember(String firstName, String lastName, String streetAddress, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }




}
