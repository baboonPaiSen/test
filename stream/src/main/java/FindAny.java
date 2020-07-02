import java.util.*;

import com.gsk.pojo.Student;
import org.junit.Test;


/**
 * @description: TODO
 * @date: 2020/5/30 16:03
 * @author: ShangKun
 * @version: 2.0.0
 */
public class FindAny {



    List<Student> createData(){

        List<Student> students  = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student(i, "名字" + i, i);
            students.add(student);
        }

        return students;
    }


    @Test
    public void  findAny(){
        List<Student> data = this.createData();

        Student student = data.stream().filter(x -> x.getAge() == 11).findAny().orElseGet(() -> new Student(1231, "213123", 1));

        Optional<Student> any = data.stream().filter(x -> x.getAge() == 11).findAny();
        any.ifPresent(System.out::println);

        Student student1 = data.stream().filter(x -> x.getAge() == 11).findFirst().orElseGet(() -> data.stream().filter(x -> x.getAge() == 4).findAny().orElse(null));

    }
}
