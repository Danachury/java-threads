package com.danachury.samples.javathreads;

import java.util.Optional;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public final class Consumer {

    /**
     * Private Constructor to disable instantiation of class
     */
    private Consumer() {
    }

    /**
     * Print {@param str} to console
     *
     * @param str to be printed
     * @throws InterruptedException if {@link Thread} is interrupted
     */
    static void printVar(Optional<String> str) throws InterruptedException {
        System.out.println("Printing myVar");
        Thread.sleep(500L);
        System.out.printf("My Var value: %s %n", str);
    }
}
