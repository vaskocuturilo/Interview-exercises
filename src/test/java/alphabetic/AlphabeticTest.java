package alphabetic;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

public class AlphabeticTest {

    @Test
    public void countOfNumberCharacterElements() {
        Alphabetic alphabetic = new Alphabetic();
        alphabetic.countOfNumberCharacterElements("A1B222b3c4");
        Map<Character, Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put('A', 1);
        hashMap.put('B', 1);
        hashMap.put('b', 1);
        hashMap.put('c', 1);
        assertEquals(hashMap, alphabetic.countOfNumberCharacterElements("A1B222b3c4"));
    }
}