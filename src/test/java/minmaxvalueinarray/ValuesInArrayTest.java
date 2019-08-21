package minmaxvalueinarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValuesInArrayTest {

    @Test
    public void getMinValueInArray() {
        ValuesInArray valuesInArray = new ValuesInArray();
        assertEquals(1, valuesInArray.getMinValueInArray(new int[]{1, 2, 3}));
    }

    @Test
    public void getMaxValueInArray() {
        ValuesInArray valuesInArray = new ValuesInArray();
        assertEquals(3, valuesInArray.getMaxValueInArray(new int[]{1, 2, 3}));

    }
}