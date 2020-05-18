package ua.stu.model;

import ua.stu.test.TestStoreObject;

public class Wood extends TestStoreObject {
    private int id;
    private String name;
    transient float density;   //плотность

    public Wood(int id, String name, float density) {
        this.id = id;
        this.name = name;
        this.density = density;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return "Wood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", density=" + density +
                '}';
    }
}
