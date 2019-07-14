import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TestJava {
    public static void main(String... args) {

//        int[] y = new int[5];
//        y[0] = 2;
//        y[1] = 1;
//        y[2] = 5;
//        y[3] = 6;
//        y[4] = 7;
//
//        for (int i =0;i<5;i++) {
//            System.out.println(y[i]);
//        }
//        for (int z : y) {
//            System.out.println(z);
//        }


//        List x = new ArrayList();
//        x.add(1);
//        x.add(2);
//        x.add(3);
//        x.add(4);
//
//        x.add(x.size() - 1, 10);
//
//        for (Object j : x) {
//            System.out.println(j);
//        }


//        List a = new LinkedList();
//        a.add(new Student("earl","1234"));
//        a.add(new Student("Kritchat","111"));
//        ((LinkedList) a).addFirst(new Student("First", "aa"));
//        for (Object e : a) {
//            System.out.println(e);
//        }

//        List stack = new Stack();
//        ((Stack) stack).add(10);
//        ((Stack) stack).add(11);
//        ((Stack) stack).add(22);
//        System.out.println(stack);
//        System.out.println(((Stack) stack).peek());
//        System.out.println(stack);

        //System.out.println(factorial(3));
       // System.out.println(" Is perfect number : " + isPerfectNumber(33550335));

//        long startTime = System.nanoTime();
//        try{
//            System.out.println(generatePerfectNumber(1000000));
//        }finally {
//            long endTime = System.nanoTime();
//            System.out.println("Time in use " + (endTime-startTime)/1000000);
//
//        }

    }


    public static int factorial(int n) {
        if(n==1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    public static boolean isPerfectNumber(int number) {
        int round = number / 2;
        List<Integer> data = new ArrayList<>();
        for (int i = 1; i <= round;i++) {
            if(number%i==0){
                data.add(i);
            }
        }
        //System.out.println(data);
        int summation = data.stream().mapToInt(e -> e).sum();
        return summation==number;
    }

    public static List generatePerfectNumber(long n) {
        // 2 -> n

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPerfectNumber(i)) {
                result.add(i);
            }
            System.out.println("thread " + i);

//            Thread thread = new Thread(new Runnable() {
//                private int number;
//
//                @Override
//                public void run() {
//                    if (isPerfectNumber(number)) {
//                        result.add(number);
//                    }
//                }
//
//                public Runnable init(int number) {
//                    System.out.println("thread " + number);
//                    this.number = number;
//                    return this;
//                }
//            }.init(i));
//
//            thread.start();
        }

        System.out.println("---------- Result ------------");
        return result;
    }


}

class Student{
    private String name;
    private String lastName;

    public Student() {
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class HelloMessage implements Runnable{
    private int round;

    public HelloMessage() {
    }

    public HelloMessage(int round) {
        this.round = round;
    }

    @Override
    public void run() {
        System.out.println(round);
    }
}