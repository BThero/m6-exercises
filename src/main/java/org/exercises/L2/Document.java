package org.exercises.L2;

public class Document {
    SpellChecker spellChecker;

    Document(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Document is created!");
    }
}
