package loveq.rc.gsondemo.bean;

import java.util.List;

/**
 * Created by rc on 2017/8/15.
 * Description:
 */

public class School {
    String name;
    List<Institute> mInstituteList;

    public School(String name, List<Institute> instituteList) {
        this.name = name;
        mInstituteList = instituteList;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", mInstituteList=" + mInstituteList +
                '}';
    }
}
