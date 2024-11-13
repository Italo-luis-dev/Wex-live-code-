import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    @Test
    void test_ReverseString(){
        String expectedResult = "etset";
        String result = Main.reverseString("teste");
        assertEquals(expectedResult, result);
    }

    @Test
    void test_ReverseStringNull(){
        String result = Main.reverseString(null);
        assertNull(result);
    }

    @Test
    void test_CheckIfPalindrome(){
        boolean expectedResult = true;
        boolean result = Main.checkIfPalindrome("arara");
        assertEquals(expectedResult, result);
    }

    @Test
    void test_CheckIfPalindromeFalse(){
        boolean expectedResult = false;
        boolean result = Main.checkIfPalindrome("italo");
        assertEquals(expectedResult, result);
    }

    @Test
    void test_CheckIfPalindromeNull(){
        boolean expectedResult = Main.checkIfPalindrome("italo");
        assertFalse(expectedResult);
    }
}
