import com.java.leetcode.LastWordLength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastWordLengthTest {

    @Test
    void testLastWorldLength() {
        LastWordLength obj = new LastWordLength();
        int lastWordLength = obj.lengthOfLastWord("Hello World!");
        assertEquals(6, lastWordLength);
    }
}
