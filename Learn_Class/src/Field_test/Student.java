package Field_test;

import java.util.StringJoiner;

public class Student extends Person {
    public String desc;
    private int score;


    public Student() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("desc='" + desc + "'")
                .add("score=" + score)
                .add("age=" + age)
                .add("name='" + name + "'")
                .toString();
    }
}
