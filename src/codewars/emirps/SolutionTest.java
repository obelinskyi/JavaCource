package codewars.emirps;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
        // assertEquals("expected", "actual");
        assertEquals(Arrays.toString(new long[]{0, 0, 0}), Arrays.toString(Emirps.findEmirp(0)));
        assertEquals(Arrays.toString(new long[]{4, 37, 98}), Arrays.toString(Emirps.findEmirp(50)));
        assertEquals(Arrays.toString(new long[]{15, 199, 1489}), Arrays.toString(Emirps.findEmirp(200)));
    }
}