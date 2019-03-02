package bubblesort;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckBubbleSortTest {

    @Test
    @Description("Check the even sort")
    public void testAssertEvenSort() {
        int[] numbers = {4, 5, 22, 44, 32, 1};
        CheckBubbleSort.assertSort(numbers);
        assertArrayEquals(new int[]{1, 4, 5, 22, 32, 44}, numbers);
    }

    @Test
    @Description("Check the not even sort")
    public void testAssertNotEvenSort() {
        int[] numbers = {4, 5, 22, 44, 32, 1, 2};
        CheckBubbleSort.assertSort(numbers);
        assertArrayEquals(new int[]{1, 2, 4, 5, 22, 32, 44}, numbers);
    }

    @Test
    @Description("Check the empty sort")
    public void testAssertEmptySort() {
        int[] numbers = {};
        CheckBubbleSort.assertSort(numbers);
        assertArrayEquals(new int[]{}, numbers);
    }

    @Test
    @Description("Check the null sort")
    public void testAssertNullSort() {
        int[] numbers = null;
        CheckBubbleSort.assertSort(numbers);
        assertArrayEquals(null, numbers);
    }
}