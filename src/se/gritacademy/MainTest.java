package se.gritacademy;


import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

private final ByteArrayOutputStream content = new ByteArrayOutputStream();
private final PrintStream defaultOut = System.out;


    // Uppgift 1

    @DisplayName("Test reversed word")
    @Test
    public void testReturnReversedWord(){
        StringBuilder sb = new StringBuilder("Jag");
        String reversed = sb.reverse().toString();
        String expected = "gaJ";

        assertEquals(expected, reversed);
    }

    //Uppgift 2
    @DisplayName("Test if Strings match")
    @Test
    public void testIfStringsMatch(){
        String name = "My name";
        String expected = "My name";

        assertEquals(expected, name);
    }

    //Uppgift 3
    @DisplayName("Test User Account Information")
    @Test
    public void testAccountInformation(){
        AccountMember person = new AccountMember("Jimmy","Wallener", "Heimdallgatan", 7311111111L);

        assertAll("person",
                () -> assertEquals("Jimmy", person.getFirstName()),
                () -> assertEquals("Wallener", person.getLastName()),
                () -> assertEquals("Heimdallgatan", person.getStreetAddress()),
                () -> assertEquals(7311111111L, person.getPhoneNumber()));

    }

    //Uppgift 4
    @DisplayName("Test length of word")
    @Test
    public void testStringLength(){
        System.setOut(new PrintStream(content));
        System.out.println("Junit 5");

        // Checks string length - 2 which accounts for "", since content shows all outgoing chars.
        assertEquals(7, content.toString().length() -2,"String length do not match");
    }

    //Uppgift 5
    @DisplayName("Compare and test integers")
    @Test
    public void testCompareIntegers(){
        assertEquals(100,100);
    }

    //Uppgift 6
    @DisplayName("Test if Objects are same")
    @Test
    public void testCompareObjects(){
        String s1 = new String("S1");
        String s2 = s1;

        assertSame(s1,s2);
    }

    //Uppgift 7
    @DisplayName("Test if value of byte is true")
    @Test
    public void testIsBytesMatched(){
        byte smallByte1 = 100;
        byte smallByte2 = smallByte1;

        assertTrue(smallByte1 == smallByte2);
    }

    //Uppgift 8 saknas i pdf

    //Uppgift 9

    @DisplayName("Test if Object is true")
    @Test
    public void testIsObjectEqual(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1,obj2);
    }

    //Uppgift 10

    @DisplayName("Test if Object is false")
    @Test
    public void testIsObjectFalse(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertFalse(obj1 == obj2);
    }


    @AfterAll
    public void tearDown(){
        System.setOut(defaultOut);
    }


}
