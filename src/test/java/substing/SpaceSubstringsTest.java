package substing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpaceSubstringsTest {

    @Test
    public void getSpaceSubstringsWithOutSubStings() {
        String inputText = "Hello world";
        assertEquals(0, SpaceSubstrings.getSpaceSubstrings(inputText));
    }

    @Test
    public void getSpaceSubstringsWithOneSubSting() {
        String inputText = "  Hello world";
        assertEquals(1, SpaceSubstrings.getSpaceSubstrings(inputText));
    }

    @Test
    public void getSpaceSubstringsWithSubStings() {
        String inputText = "  Hello  world";
        assertEquals(2, SpaceSubstrings.getSpaceSubstrings(inputText));
    }
}