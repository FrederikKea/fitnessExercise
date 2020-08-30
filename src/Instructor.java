public class Instructor extends Emplyee {
    private int hours;

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }


    public int getSalary(){
        return this.hours * 456;
    }

    @Override
    public String toString() {
        return name + "\t" + cpr + "\t \t" + hours ;
    }
}
