package banyuan.day08.package02;
import java.util.Arrays;

/**
 * @author 陈浩
 * @date Created on 2019/10/31
 */
public class City {
    private String name;
    Person[] per = new Person[10];

    public City() {
    }

    public City(String name, Person[] per) {
        this.name = name;
        this.per = per;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getPer() {
        return per;
    }

    public void setPer(Person[] per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", per=" + Arrays.toString(per) +
                '}';
    }
}

