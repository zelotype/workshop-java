package unittest;

public class Hello {
    public String hi(String name) {
        return "Hello, " + name;
    }

    UserDB userDB;

    public String workWithDB(int id) {
        return userDB.getNameByID(id);
    }
}

interface UserDB {
    public String getNameByID(int id) throws RuntimeException;
}