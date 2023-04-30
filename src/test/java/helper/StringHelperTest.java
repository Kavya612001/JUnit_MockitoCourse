package helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

    StringHelper helper = new StringHelper();


    @Test
    public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
        // one among the assert methods
        // fail("Not yet implemented");

        // expected, actual
        assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_NoA() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AAtLast2Positions() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }
}
