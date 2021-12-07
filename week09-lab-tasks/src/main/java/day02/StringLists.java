package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWord(List<String> words) {
        List<String> shortestWord = new ArrayList<>();
        int shortest = shortestWordLength(words);
        for (String w : words) {
            if (shortest == w.length()) {
                shortestWord.add(w);
            }
        }
        return shortestWord;
    }

    private int shortestWordLength(List<String> words) {

        int shortest = words.get(0).length();
        for (String word : words) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }
        return shortest;
    }
}