package loveq.rc.gsondemo.bean;

/**
 * Created by rc on 2017/8/15.
 * Description:
 */

public class UserWithAddress {
    String name;
    String password;
    int age;
    UserAddress userAddress;

    public UserWithAddress(String name, String password, int age, UserAddress userAddress) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "UserWithAddress{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", userAddress=" + userAddress +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
}
