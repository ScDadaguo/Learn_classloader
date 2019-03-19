package Constructor_test;

import java.util.StringJoiner;

public class User {
    private String userName;
    private int age;

    private User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("userName='" + userName + "'")
                .add("age=" + age)
                .toString();
    }
}
