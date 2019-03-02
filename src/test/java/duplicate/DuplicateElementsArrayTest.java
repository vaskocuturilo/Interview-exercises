package duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateElementsArrayTest {

    @Test
    public void removeDuplicateNotEvenElements() {
        Integer[] inputElements = {1, 2, 2, 3, 3, 4, 4};
        assertArrayEquals(new Integer[]{1, 2, 4, 3}, DuplicateElementsArray.removeDuplicateElements(inputElements));
    }

    @Test
    public void removeDuplicateEvenElements() {
        Integer[] inputElements = {2, 2, 3, 3, 4, 4};
        assertArrayEquals(new Integer[]{2, 4, 3}, DuplicateElementsArray.removeDuplicateElements(inputElements));
    }

    @Test
    public void removeDuplicateEmptyElements() {
        Integer[] inputElements = {};
        assertArrayEquals(new Integer[]{}, DuplicateElementsArray.removeDuplicateElements(inputElements));
    }

    @Test
    public void removeDuplicateNullElements() {
        Integer[] inputElements = {null};
        assertArrayEquals(new Integer[]{null}, DuplicateElementsArray.removeDuplicateElements(inputElements));
    }

    @Test
    public void removeDuplicateZeroElements() {
        Integer[] inputElements = {0};
        assertArrayEquals(new Integer[]{0}, DuplicateElementsArray.removeDuplicateElements(inputElements));
    }

}