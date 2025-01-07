package SMP;


public class User extends Entity {
    private static int userGenId = 0;
    private String name;
    private String gender;

    public User(String name, String gender) {
        super(userGenId++);
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User {name='" + name + "', userID=" + id + ", gender='" + gender + "'}";
    }
}

