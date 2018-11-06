package core_java.serialization;

import java.io.Serializable;

/**
 * Created by ashishm on 21/5/18.
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -6470090944414208496L;

    private int id;
    private transient String name;
    private String location;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
