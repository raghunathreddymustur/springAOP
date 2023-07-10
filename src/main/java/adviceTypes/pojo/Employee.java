package adviceTypes.pojo;

public class Employee {
    private long id;

    public Employee(long id) {

        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
