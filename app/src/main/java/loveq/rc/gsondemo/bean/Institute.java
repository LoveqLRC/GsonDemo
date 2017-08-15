package loveq.rc.gsondemo.bean;

/**
 * Created by rc on 2017/8/15.
 * Description:
 */

public class Institute {
    String name;
    String description;

    public Institute(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
