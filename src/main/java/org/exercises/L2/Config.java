package org.exercises.L2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Dictionary getDictionary() {
        return new OxfordDictionary();
    }

    @Bean
    public SpellChecker getSpellChecker() {
        return new SpellChecker(getDictionary());
    }

    @Bean
    public Document getDocument() {
        return new Document(getSpellChecker());
    }
}
