package com.danachury.samples.javathreads;

import java.util.Optional;
import java.util.Random;

/**
 * Initialize var
 */
public final class Generator {

    private static final int OFFSET = 48; // numeral '0'
    private static final int LIMIT = 122; // letter 'z'
    private static final int LENGTH = 10; // Length of String

    private static final Random random = new Random();

    /**
     * Private Constructor to disable instantiation of class
     */
    private Generator() {
    }

    /**
     * Generate a new String from {@link #randomStr()}
     *
     * @return Optional of String
     * @throws InterruptedException if {@link Thread} is interrupted
     */
    static Optional<String> generateStr() throws InterruptedException {
        System.out.println("Generating random String");
        final var str = randomStr();
        System.out.printf("String generated: %s %n", str);
        return Optional.of(str);
    }

    /**
     * Generate random String
     *
     * @throws InterruptedException if {@link Thread} is interrupted
     */
    private static String randomStr() throws InterruptedException {
        Thread.sleep(500L);
        return random.ints(OFFSET, LIMIT + 1) // Plus 1, to include last letter
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(LENGTH)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }
}
