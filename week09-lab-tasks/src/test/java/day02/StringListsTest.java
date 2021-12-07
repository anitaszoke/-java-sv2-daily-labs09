package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWordTest() {
        StringLists s = new StringLists();
        List<String> words = Arrays.asList("aaa", "aaaaa", "a", "bb", "bbbb", "b");

        assertEquals(2, s.shortestWord(words).size());
        assertEquals("a", s.shortestWord(words).get(0));
    }
}