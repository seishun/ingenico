package lv.javaguru.courses.ingenico.lecture2.generics.tuples;

public class Tuples {

    public static void main(String[] args) {
        Tuple3<String, Integer, Long> tuple = new Tuple3<>("string", 4, 5L);
        System.out.println(tuple);

        Tuple3<String, Integer, Long> tuple3Copy = new Tuple3<>("string", 4, 5L);
        System.out.println(tuple3Copy.equals(tuple));
    }

}
