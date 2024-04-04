package com.incubyte.module2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailingTest {

    @Test
    void failing_test() {
        Assertions.fail("Failing deliberately");
    }
}
