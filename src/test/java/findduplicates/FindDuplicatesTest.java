package findduplicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicatesTest {

    @Test
    public void findDuplicatesWithoutHash() {
        FindDuplicates findDuplicates = new FindDuplicates();
        findDuplicates.findDuplicatesWithoutHash(new int[]{1, 2, 1, 2, 3});

    }

    @Test
    public void findDuplicatesWithHash() {
        FindDuplicates findDuplicates = new FindDuplicates();
        findDuplicates.findDuplicatesWithHash(new int[]{1, 2, 1, 2, 3});

    }
}