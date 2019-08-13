package numberelement;

public class NumberElement {

    public int getNumberOfIndexElement(int[] inputNumber, int target) {
        if (target > inputNumber[inputNumber.length - 1]) {
            return inputNumber.length;
        }

        int left = 0;
        int right = inputNumber.length - 1;


        while (left < right) {
            int middle = left + (right - left) / 2;
            if (target > inputNumber[middle]) {
                left = middle + 1;

            } else {
                right = middle;
            }
        }

        return left;
    }
}
