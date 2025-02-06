package problemstatements.stringbuilder.reversestring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void reverseStringTest(){
        Assert.assertEquals("olleh", ReverseString.reverseString("hello"));
        System.out.println("Test case passed");
    }
}
