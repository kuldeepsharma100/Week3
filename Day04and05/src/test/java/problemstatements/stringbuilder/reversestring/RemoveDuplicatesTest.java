package problemstatements.stringbuilder.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problemstatements.stringbuilder.removeduplicates.RemoveDuplicates;

public class RemoveDuplicatesTest {
    @Test
    public void removeDuplicateTest(){
        String result = RemoveDuplicates.removeDuplicates("kuldeep");
        Assertions.assertEquals("kuldep", result );
        System.out.println("Test case passed");
    }
}
