import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Comparator<Person> p = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };*/

        List<Person> lp=new ArrayList<Person>();

        Person man1 = new Person ("John", 31, 101);
        Person man2 = new Person ("Alex", 32, 105);
        Person man3 = new Person ("Fred", 28, 103);
        Person man4 = new Person ("Louis", 50, 104);
        Person man5 = new Person ("Feda", 31, 102);

        lp.add(man1); // 0
        lp.add(man2); // 1
        lp.add(man3);  // 2
        lp.add(man4);  // 3
        lp.add(man5);

        for (Person person : lp) {
            System.out.println(person);
        }

        System.out.println("-----------");

        Collections.sort(lp);

        for (Person person : lp) {
            System.out.println(person);
        }
    }

    }
