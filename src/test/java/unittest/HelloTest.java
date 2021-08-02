package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("First case test")
    public void case01() {
        Hello hello = new Hello();

        String actualResult = hello.hi("Toon");

        assertEquals("Hello, Toon", actualResult);
    }
}