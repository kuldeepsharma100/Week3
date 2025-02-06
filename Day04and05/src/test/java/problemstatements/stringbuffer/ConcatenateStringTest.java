package problemstatements.stringbuffer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problemstatements.stringbuffer.concatenatestring.CancatenateString;

public class ConcatenateStringTest {
    @Test
    public void concatenateString(){
        String[] input = {"Hello", " ", "World",};
        String result = CancatenateString.concatenateStrings(input);
        Assertions.assertEquals("Hello World", result);
    }
}
