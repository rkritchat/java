package stringpool;

public class StringPool {
    /*
     *
     *
     *
     *
     */
    public static void main(String... args) {
        //x and y will has same hasCode because x and y point to String value "cat"
        String x = "cat";
        String y = "cat";

        String z = "car";
        String a = new String("car");
        int x_addr = System.identityHashCode(x);  // ex 11111
        int y_addr = System.identityHashCode(y);  // ex 11111
        int z_addr = System.identityHashCode(z);  // ex 22222 because z point to String value "car"
        int a_addr = System.identityHashCode(a);  // ex 33333 a is difference, it create by object like a we put String value car in to hash 33333
        System.out.println(x_addr);
        System.out.println(y_addr);
        System.out.println(z_addr);
        System.out.println(a_addr);


        //Why we need StringBuffer ??
        /*
        *
        *  if we working on loop, we must use StringBuffer because String is immutable....
        *  in cases we use normal concat string system will away create new object...
         */
        String test = "";
        for (int i = 1; i <= 10; i++) {
            test += i;
            System.out.println("text = " + test + " address: " + System.identityHashCode(test)); //This will away difference
        }

        System.out.println("============================================================================");

        StringBuilder test2 = new StringBuilder();  //Create String buffer and just change value in object
        for (int i = 1; i <= 10; i++) {
            test2.append(i);
            System.out.println("text = " + test2.toString() + " address: " + System.identityHashCode(test2)); //This will away same
        }

        System.out.println("============================================================================");

        //This is also difference because we use normal concat
        String test3 = new String("1");
        System.out.println("text = " + test3 + " address: " + System.identityHashCode(test3));
        test3 += "2";
        System.out.println("text = " + test3 + " address: " + System.identityHashCode(test3));


        System.out.println("============================================================================");

        // this example will show in multiple thread,
        /*
        * event use multiple thread hashCode will difference except Object "bbbbWithTd" because it not re-assign
         */
        for (int k = 0; k <= 10; k++) {
            Thread td = new Thread(() -> {
                String testWithTd = "";
                for (int i = 1; i <= 10; i++) {
                    testWithTd += i;
                    System.out.println("text = " + testWithTd + " address: " + System.identityHashCode(testWithTd));
                    if (i == 10) {
                        String bbbbWithTd = "12345678910";
                        System.out.println("textB = " + bbbbWithTd + " address: " + System.identityHashCode(bbbbWithTd));
                    }
                }
            });
            td.start();
        }
    }
}
