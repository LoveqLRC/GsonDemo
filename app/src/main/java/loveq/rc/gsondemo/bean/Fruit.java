package loveq.rc.gsondemo.bean;

import com.google.gson.annotations.Expose;

/**
 * Created by rc on 2017/8/16.
 * Description:
 */

public class Fruit {
    @Expose(serialize = false)
    String name;

    @Expose
    String color;

    @Expose(deserialize = false)
    String price;

    public Fruit(String name, String color, String price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
