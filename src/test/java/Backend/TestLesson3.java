package Backend;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestLess3 {

    private Palindrome palindrome;
    private String input;

    @Before
    public void setUp() throws Exception {

        input = null;
        palindrome = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() throws Exception {

        palindrome.isPalindrome(null);

    }

    @Test
    public void emptyStringTest() throws Exception {
        input = "";
        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void singleCharTest() throws Exception {

        input = "G";

        assertTrue(palindrome.isPalindrome(input));
    }


}
