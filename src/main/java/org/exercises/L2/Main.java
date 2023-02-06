package org.exercises.L2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var bean = context.getBean(Document.class);
        bean.spellChecker.checkSpelling();
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
