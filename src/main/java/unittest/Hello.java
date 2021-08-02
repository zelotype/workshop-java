package unittest;

public class Hello {
    public String hi(String name) {
        return "Hello, " + name;
    }

    UserDB userDB = new UserDB();

    public String workWithDB(int id) {
        return userDB.getNameByID(id);
    }
}

class UserDB {
    public String getNameByID(int id) {
        throw new RuntimeException("DB disconnected");
    }
}