package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void iFail_whenCalled_throwsArithmeticExceptionWithAsdf() {
//        Assertions.assertThrows(ArithmeticException.class, () -> {
//            Main.iFail()
//        });

        try {
            Main.iFail();
            Assertions.fail();
        } catch (ArithmeticException e) {
            Assertions.assertEquals("asdf", e.getMessage());
        }
    }
}