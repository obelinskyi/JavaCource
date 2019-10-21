package codewars.powersumdigitterm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerSumDigTest {

    private static void testing(long act, long exp) {
        assertEquals(exp, act);
    }
    @Test
    public void test1() {
        testing(PowerSumDig.powerSumDigTerm(1), 81);
        testing(PowerSumDig.powerSumDigTerm(2), 512);
        testing(PowerSumDig.powerSumDigTerm(3), 2401);
        testing(PowerSumDig.powerSumDigTerm(4), 4913);
        testing(PowerSumDig.powerSumDigTerm(30), 248155780267521L);
    }
}