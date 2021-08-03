package testdouble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateIDServiceTest {

    @Test
    @DisplayName("ID = XYZ7")
    public void case01() {
        GenerateIDService service = new GenerateIDService();

        String id = service.get();
        
        assertEquals("XYZ7", id);
    }
}