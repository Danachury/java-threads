package com.danachury.samples.javathreads;

import java.util.Optional;

/**
 * This is the Parent process
 */
@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class Main {

    private static Optional<String> myVar = Optional.empty();

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Initial value: %s %n", myVar);
        changeMyVarValue();
        printMyVarValue();
        cleanUpMyVarValue();
        System.out.printf("Final value: %s %n", myVar);
    }

    private static void changeMyVarValue() throws InterruptedException {
        myVar = Generator.generateStr();
    }

    private static void printMyVarValue() throws InterruptedException {
        Consumer.printVar(myVar);
    }

    private static void cleanUpMyVarValue() throws InterruptedException {
        myVar = Cleaner.clean();
    }
}
