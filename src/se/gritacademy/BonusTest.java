package se.gritacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

public class BonusTest {

    Bonus user;

    @BeforeEach
    public void init() {
        user = new Bonus("Jimmy","Wallener",  44);
    }

    @DisplayName("Test first & lastname")
    @Test
    public void firstAndLastnameTest(){
        String firstname = "Jimmy";
        assertNotNull(firstname);
        String lastname = "Wallener";


        // Check so that all data is accurate
        assertAll("names",
                () -> assertEquals(firstname, user.getFirstName(),"No match found for " + user.getFirstName()),
                () -> assertEquals(lastname, user.getLastName(), "No match found for " + user.getLastName()));
    }

    @DisplayName("Tests age")
    @ParameterizedTest
    @ValueSource(ints = {44})
    public void testIsAgeCorrect(int age){

        String errorMsg = String.format("Age is not a match: Expected %d but found %d\n",age,user.getAge());

        assertTrue(age == user.getAge(), errorMsg);

    }

    @DisplayName("Test if first & last letter match")
    @Test
    public void testNamesCompareChar(){

        assertAll("first name",
                () -> assertNotNull(user.getFirstName(),"Firstname returned null\n"),
                () -> assertTrue(user.getFirstName().startsWith("J")),
                () -> assertTrue(user.getFirstName().endsWith("y")));
        assertAll("surname",
                () -> assertNotNull(user.getLastName(), "Lastname returned null\n"),
                () -> assertTrue(user.getLastName().startsWith("W")),
                () -> assertTrue(user.getLastName().endsWith("r")));
    }
}
