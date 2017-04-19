package example.codeclan.com.wordcount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordTest {

    @Test
    public void testWordCount() {
        Word word = new Word();
        assertEquals(2, word.getWordCount("Hello world"));
    }

    @Test
    public void testWordCountAgain() {
        Word word = new Word();
        assertEquals(7, word.getWordCount("Hello world it is a nice day"));
    }
}
