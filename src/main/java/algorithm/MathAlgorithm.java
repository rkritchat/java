package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithm {
    public static void main(String... args) {

        System.out.println(isPrimeNo(100));

    }

    public static void findGDC(int firstNo, int secondNo) {

    }

    public static List<Integer> primeNumber(int size) {
        int counter;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            counter = 1;
            for (int j = i/2; j >= 1; j--) {
                if (i % j == 0) {
                    counter += 1;
                }
            }

            if (counter == 2) {
                result.add(i);
            }

        }
        return result;
    }

    public static boolean isPrimeNo(int data) {
        int counter = 1;
        for (int i = data / 2; i >= 1; i--) {
            if (data % i == 0) {
                counter++;
            }
        }
        return counter == 2;
    }
}


