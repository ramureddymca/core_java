import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;

public class JpmcTest {

  /*  selct tmp.cls over select std.id from student  as st std group by std.cls ) row>2


    public static JpmcTest instance;
    public JpmcTest getInstance(){
        if(instance != null){
            return instance;
        }
        synchronized (JpmcTest.class){
        if(instance != null){
            return instance;
        }else {
            instance = new JpmcTest();
        }

    }*/
    //printer 10 jobs



    public static void main(String[] args) {
        BlockingQueue b = new ArrayBlockingQueue(10);

        String  str = "ramu lives in singapore";
        int len = str.length();
        Map<Character, Integer> charMap = new HashMap<>(len);
        char[] charr = str.toCharArray();
        for (int i = 0; i < len; i++) {
            if(charMap.get(charr[i])==null){
                charMap.put(charr[i], 1);
            }
        }


    List<Student> students = new ArrayList<>();

   // Map<Integer, List<Student>> studentMap = students.stream().collect(Collectors.groupingBy(s->s.getCls(), Collectors.maxBy((o1, o2) -> o1.getCls()));
//studentMap.values().stream().sorted(Comparator.comparingInt(Student::getCls)).findFirst();
    }

}
class Student{
    int id;
    int cls;
    String section;
    double marks;
    List<String> address;

   // public

    public Student(int id, int cls, String section, double marks, List<String> address) {
        this.id = id;
        this.cls = cls;
        this.section = section;
        this.marks = marks;
        this.address = address;
    }

    public int getId() {
        return id;
    }




}

//id for each class and sec with high marks


