package TestingSubmarine;

import Submarine.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testGetSubmarineCount() {

        assertEquals(2, Solution.getSubmarineCount(Oceans.OCEAN));
        assertEquals(4, Solution.getSubmarineCount(Oceans.OCEAN2));
        assertEquals(1, Solution.getSubmarineCount(Oceans.OCEAN3));
        assertEquals(0, Solution.getSubmarineCount(Oceans.OCEAN4));
        assertEquals(2, Solution.getSubmarineCount(Oceans.OCEAN5));
        assertEquals(4, Solution.getSubmarineCount(Oceans.OCEAN6));
        assertEquals(0, Solution.getSubmarineCount(Oceans.OCEAN7));
        assertEquals(1, Solution.getSubmarineCount(Oceans.OCEAN8));
        assertEquals(13, Solution.getSubmarineCount(Oceans.OCEAN9));
    }
}