package loveq.rc.gsondemo.bean;

/**
 * Created by rc on 2017/8/16.
 * Description:
 */

public class Developer {
    boolean isDeveloper;
    String name;
    int age;

    public Developer(boolean isDeveloper, String name, int age) {
        this.isDeveloper = isDeveloper;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "isDeveloper=" + isDeveloper +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
