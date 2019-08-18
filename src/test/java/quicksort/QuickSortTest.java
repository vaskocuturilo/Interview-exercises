package quicksort;

        import org.junit.Test;

        import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] inputNumber = {3, 2, 1};
        QuickSort.quickSort(inputNumber, 0, inputNumber.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, QuickSort.quickSort(inputNumber, 0, inputNumber.length - 1));

    }
}