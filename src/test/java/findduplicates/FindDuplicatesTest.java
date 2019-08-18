package findduplicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicatesTest {

    @Test
    public void findDuplicates() {
        FindDuplicates findDuplicates = new FindDuplicates();
        findDuplicates.findDuplicates(new int[]{1, 2, 1, 2, 3});

    }
}