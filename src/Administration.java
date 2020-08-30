public class Administration extends Emplyee {
    private int vacation;

    public Administration(String name, String cpr) {
        super(name, cpr);


    }

    public int getVacation(){
        return 5;
    }

    @Override
    public String toString() {
        return name + "\t" + cpr + "\t";
    }
}
