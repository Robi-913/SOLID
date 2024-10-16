package solid.s.good;

public class GoodEmployee {

    private String name;
    private String status;
    private int hours;

    public GoodEmployee(String status, String name, int hours) {
        this.name = name;
        this.status = status;
        this.hours = hours;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "GoodEmployee{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", hours=" + hours +
                '}';
    }
}
