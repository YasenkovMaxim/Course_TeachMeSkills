package DZ_10.Task_1;

import java.util.Objects;

public class UserTest {
    String name;
    int age;
    char sex;

    @Override
    public String toString() {
        return "UserTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public UserTest(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserTest userTest = (UserTest) o;
        return age == userTest.age && sex == userTest.sex && Objects.equals(name, userTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
