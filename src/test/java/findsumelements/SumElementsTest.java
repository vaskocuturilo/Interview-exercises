package findsumelements;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumElementsTest {

    @Test
    public void findNumberOfPairInEvenArray() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(1, sumElements.findNumberOfPair(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    public void findNumberOfPairInOddArray() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(1, sumElements.findNumberOfPair(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void findNumberOfTwoPair() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(2, sumElements.findNumberOfPair(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void findNumberOfPairInEmptyArray() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(0, sumElements.findNumberOfPair(new int[]{}, 5));
    }

    @Test
    public void findNumberOfPairInNull() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(0, sumElements.findNumberOfPair(null, 5));
    }

    @Test
    public void findNumberOfPairInNegativeArray() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(0, sumElements.findNumberOfPair(new int[]{-1, -2, -3, -4, -5}, 1));
    }

    @Test
    public void findNumberOfPairInZeroArray() {
        CalculateElements sumElements = new CalculateElements();
        assertEquals(0, sumElements.findNumberOfPair(new int[]{0}, 1));
    }

}