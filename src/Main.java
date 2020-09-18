import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Emplyee> employees = new ArrayList<>();
        ArrayList<Administration> fulltimeEmployees = new ArrayList<>();
        ArrayList<Instructor> partTimeEmployees = new ArrayList<>();
        ArrayList<Member> members = new ArrayList<>();

        Administration a1 = new Administration("Fred", "160595-2525");
        Administration a2 = new Administration("Lars", "140570-1203");
        Administration a3 = new Administration("Claus", "140571-3403");
        Administration a4 = new Administration("Anna", "260585-1208");
        Administration a5 = new Administration("Henning", "020544-2501");

        fulltimeEmployees.add(a1);
        fulltimeEmployees.add(a2);
        fulltimeEmployees.add(a3);
        fulltimeEmployees.add(a4);
        fulltimeEmployees.add(a5);
        /*
        for (int i = 0; i < fulltimeEmployees.size(); i++) {
            System.out.println(fulltimeEmployees.get(i) + " " + fulltimeEmployees.get(i).getHours() +" " + fulltimeEmployees.get(i).getSalary() +" "+ fulltimeEmployees.get(i).getVacation());
        }
        */
        Instructor i1 = new Instructor("Bent", "141207-1232", 12);
        Instructor i2 = new Instructor("Anders", "160300-1409", 20);
        Instructor i3 = new Instructor("Lise", "160101-1530", 8);

        partTimeEmployees.add(i1);
        partTimeEmployees.add(i2);
        partTimeEmployees.add(i3);
        /*
        for (int i = 0; i < partTimeEmployees.size(); i++) {
            System.out.println(partTimeEmployees.get(i) + " " + partTimeEmployees.get(i).getHours() +" " + partTimeEmployees.get(i).getSalary());
        }
        */
        employees.addAll(fulltimeEmployees);
        employees.addAll(partTimeEmployees);

        System.out.println("Fitness employees");
        System.out.println("Name \tCpr \t \t    Hours \tSalary Vacation");
        System.out.println("************************************************");

        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getSalary() < 23000) {
                System.out.println(employees.get(i)  + "\t \t" + employees.get(i).getSalary());
            }else {
                System.out.println(employees.get(i) + "\t" + employees.get(i).getHours() + "\t \t" + employees.get(i).getSalary() + "\t" + fulltimeEmployees.get(i).getVacation());
            }
        }
        System.out.println("================================================");
        System.out.println("");
        //TEST

        Member m1 = new Member("Morten","121200-1237",false);
        Member m2 = new Member("Martin","160999-1899",true);
        Member m3 = new Member("Martina","020496-0507",false);

        members.add(m1);
        members.add(m2);
        members.add(m3);

        System.out.println("Fitness Members");
        System.out.println("Name \tCpr \t \t    Member type  Fee");
        System.out.println("************************************************");
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i) + "\t \t" + members.get(i).getMemberType() +"\t \t " + members.get(i).monthlyFee());
        }
        System.out.println("================================================");
        System.out.println("");

        persons.addAll(fulltimeEmployees);
        persons.addAll(partTimeEmployees);
        persons.addAll(members);

        System.out.println("Employees & Members name and cpr");
        System.out.println("Name \tCpr ");
        System.out.println("************************************************");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).getName() + "\t" + persons.get(i).getCpr());
        }
        System.out.println("================================================");
        System.out.println("");

    }
}
