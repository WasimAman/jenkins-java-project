package in.javahome.myweb.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(30, 10 + 20);
    }

    @Test
    public void testSub() {
        assertEquals(10, 20 - 10);
    }
}
