package count;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfCharacterTest {

    @Test
    public void getCountOfDigits() {
        long digits = 1000;
        assertEquals(4,NumberOfCharacter.getCountOfDigits(digits));
    }

    @Test
    public void getCountFromZero() {
        long digits =0;
        assertEquals(1,NumberOfCharacter.getCountOfDigits(digits));
    }

    @Test
    public void getCountFromLessZero() {
        long digits =-100;
        assertEquals(0,NumberOfCharacter.getCountOfDigits(digits));
    }
}