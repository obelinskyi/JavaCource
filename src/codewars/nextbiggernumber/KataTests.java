package codewars.nextbiggernumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber2(2017));
        assertEquals(441, Kata.nextBiggerNumber(414));
        assertEquals(414, Kata.nextBiggerNumber(144));
    }

    @Test
    public void basicTests2() {
        assertNotEquals(1357835356, Kata.nextBiggerNumber(1357835356));
        assertNotEquals(1481599277, Kata.nextBiggerNumber(1481599277));
        assertNotEquals(87597640, Kata.nextBiggerNumber(87597640));
        assertNotEquals(1144823377, Kata.nextBiggerNumber(1144823377));
        assertNotEquals(57127213, Kata.nextBiggerNumber(57127213));
        assertNotEquals(2138270173, Kata.nextBiggerNumber(2138270173));
        assertNotEquals(587135450, Kata.nextBiggerNumber(587135450));
        assertNotEquals(837240414, Kata.nextBiggerNumber(837240414));
        assertNotEquals(294061494, Kata.nextBiggerNumber(294061494));
        assertNotEquals(1420966657, Kata.nextBiggerNumber(1420966657));
    }
}