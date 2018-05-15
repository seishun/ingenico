package lv.javaguru.courses.ingenico.lecture2.generics.typeparameters;

import lv.javaguru.courses.ingenico.lecture2.generics.tuples.Tuple;
import lv.javaguru.courses.ingenico.lecture2.generics.tuples.Tuple2;

import java.util.List;
import java.util.Set;

public class GenericTypeParameter {

    public static void main(String[] args) {
        Tuple2<String, Integer> tuple2 = new Tuple2<>("string", 4);
        Tuple2 copy = tuple2;
        copy.replaceSecond("second string");
        System.out.println(tuple2);
//         class cast exception
        Integer intValue = tuple2.getSecond();

//        because after compilation it looks
//        Tuple2 tuple2 = new Tuple2("string", 4);
//        Integer intValue = (Integer) tuple2.getSecond();
    }

}
