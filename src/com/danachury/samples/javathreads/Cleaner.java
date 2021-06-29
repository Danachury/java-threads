package com.danachury.samples.javathreads;

import java.util.Optional;

public final class Cleaner {

    /**
     * Private Constructor to disable instantiation of class
     */
    private Cleaner() {
    }

    /**
     * @throws InterruptedException if {@link Thread} is interrupted
     */
    public static Optional<String> clean() throws InterruptedException {
        System.out.println("Clearing myVar...");
        Thread.sleep(500L);
        return Optional.empty();
    }
}
