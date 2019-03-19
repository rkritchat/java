import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AliceAndBob {

    public static void main(String... args) {
        List<Integer> data = new LinkedList<>(Arrays.asList(6, 9, 1, 2, 16, 8)); //6, 9, 1, 2, 16, 8

        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        while(data.size()!=0){
            pickCoin(data, alice);
            pickCoin(data, bob);
        }

        System.out.println("Alice is " + alice + " sum : " + alice.stream().mapToInt(e -> e).sum());
        System.out.println("Bob "+bob + " sum :" + bob.stream().mapToInt(e -> e).sum());
    }

    public static void pickCoin(List<Integer> data, List<Integer> people) {
        int size = data.size();
        if(size==0) return;
        int bestPosition = 0;
        if(size!=1) { //if size equal 1 then add it immediately.
            if (size == 2 || size == 3) { // size equal 2 or 3 no choice, just compare first and last element
                if (data.get(0) < data.get(size - 1)) {
                    bestPosition = size - 1;
                }
            } else {
                //more than 4 element
                if (data.get(0) < data.get(1) || data.get(size - 1) < data.get(size - 2)) { // next of first index or before of last index more than first and last
                    if (data.get(1) > data.get(size - 2)) { //next of first index more than before of last index ; then choose last
                        bestPosition = size - 1;
                    }
                }else{// normal compare between first and last
                    if (data.get(0) < data.get(size - 1)) {
                        bestPosition = size - 1;
                    }
                }
            }
        }
        addCoin(data, people, bestPosition);
    }

    public static void addCoin(List<Integer> data, List<Integer> people , int bestPosition) {
        people.add(data.get(bestPosition));
        data.remove(bestPosition);
    }
}
