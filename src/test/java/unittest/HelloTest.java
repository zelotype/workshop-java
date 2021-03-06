package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDBWithSuccess implements UserDB {
    @Override
    public String getNameByID(int id) {
        return "Toon";
    }
}

class UserDBWithIDNotFound implements UserDB {
    @Override
    public String getNameByID(int id) {
        throw new UserNotFoundException("ID=" + id + " not found");
    }
}

class HelloTest {

    @Test
    @DisplayName("Greeting test case")
    public void case01() {
        Hello hello = new Hello();

        String actualResult = hello.hi("Toon");

        assertEquals("Hello, Toon", actualResult);
    }

    @Test
    @DisplayName("Test with DB : Success case (I = Isolate/Independent)")
    public void case02() {
        Hello hello = new Hello();
        hello.userDB = new UserDBWithSuccess();

        String name = hello.workWithDB(1);

        assertEquals("Toon", name);
    }

    @Test
    @DisplayName("Test with DB : Fail case with ID not found")
    public void case03() {
        Hello hello = new Hello();
        hello.userDB = new UserDBWithIDNotFound();

        Exception exception = assertThrows(UserNotFoundException.class, () -> hello.workWithDB(2));

        assertEquals("ID=2 not found", exception.getMessage());
    }
}