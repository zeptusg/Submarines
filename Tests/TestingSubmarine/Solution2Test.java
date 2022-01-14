package TestingSubmarine;

import Submarine.Solution2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void testGetSubmarineCount() {

        assertEquals(2, Solution2.getSubmarineCount(Oceans.OCEAN));
        assertEquals(4, Solution2.getSubmarineCount(Oceans.OCEAN2));
        assertEquals(1, Solution2.getSubmarineCount(Oceans.OCEAN3));
        assertEquals(0, Solution2.getSubmarineCount(Oceans.OCEAN4));
        assertEquals(2, Solution2.getSubmarineCount(Oceans.OCEAN5));
        assertEquals(4, Solution2.getSubmarineCount(Oceans.OCEAN6));
        assertEquals(0, Solution2.getSubmarineCount(Oceans.OCEAN7));
        assertEquals(1, Solution2.getSubmarineCount(Oceans.OCEAN8));
        assertEquals(13, Solution2.getSubmarineCount(Oceans.OCEAN9));
    }
}