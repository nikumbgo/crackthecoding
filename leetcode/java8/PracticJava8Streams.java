package leetcode.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticJava8Streams {


    public static void main(String args[])
    {
       List<Employee> l = new ArrayList<>();
        IntStream.range(0,10).forEach(a->{
            Employee e = new Employee();
            e.name= "EMPloyee"+a;
            e.salary = a*100;
            l.add(e);
        });

//salary greater than 100

        List<Employee> l1= l.stream().filter(p->{
         return p.salary>100;
        }).collect(Collectors.toList());
        l.stream().forEach(a->
                System.out.println(a.name+" "+a.salary)
        );
        l1.stream().forEach(a->
                System.out.println(a.name+" "+a.salary)
        );

    }
}
