package org.exercises.L2;

public class SpellChecker {
    Dictionary dictionary;

    SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void checkSpelling() {
        System.out.println(dictionary.getName());
    }
}
