package main.java.com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by omar-laptop on 11/23/17.
 */
public class PalindromeTest {

    @Test
    static public void returnTrueIfWordIsAPalindrome() {
        Assert.assertTrue(Main.isAPalindrome("Dr. Awkward"));
    }


}