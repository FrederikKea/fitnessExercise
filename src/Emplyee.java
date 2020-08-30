public class Emplyee extends Person {
    private int hours;
    private int salary;

    public Emplyee() {
    }

    public Emplyee(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public Emplyee(String name, String cpr) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours() {
        return 37;
    }

    public int getSalary() {
        return 23000;
    }


}
