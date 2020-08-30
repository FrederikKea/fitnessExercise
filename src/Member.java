public class Member extends Person{
    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(){
        if (isBasic == true)
            return "Basic";
        return "Full";
    }

    public int monthlyFee(){
        if (isBasic == true)
            return 199;
        return 299;
    }

    @Override
    public String toString() {
        return name + "\t" + cpr;
    }

}
