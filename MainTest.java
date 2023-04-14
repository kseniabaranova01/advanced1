import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testCountOccurrences() {
        String first = "hello world";
        String second = "world";
        int count = Main.countOccurrences(first, second);
        assertEquals(1, count);
    }
}
