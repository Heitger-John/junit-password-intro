import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrange
        String password = "hello";

        // act
        PasswordUtils.describePasswordLength(password);
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthExactly12Chars()
    {
        // arrange
        String password = "************";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        //assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword()
    {
        String password = ";djk;owohef;kqjwnefqiuhfkjnknafiuhqkfnqieuhfkqjnefiquefkqfrq";

        String actual = PasswordUtils.describePasswordLength(password);

        assertEquals("extra long", actual);
    }

    @Test
    void testIsAlphaNumeric()
    {
        //arrange
        String password = "Fa!f1gj";

        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        //assert
        assertEquals(false, actual);
    }
}
