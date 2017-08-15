package loveq.rc.gsondemo.bean;

/**
 * Created by rc on 2017/8/15.
 * Description:
 */

public class UserAddress {
    String street;
    String city;
    String province;

    public UserAddress(String street, String city, String province) {
        this.street = street;
        this.city = city;
        this.province = province;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
