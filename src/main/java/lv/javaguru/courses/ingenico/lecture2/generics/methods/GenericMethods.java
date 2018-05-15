package lv.javaguru.courses.ingenico.lecture2.generics.methods;

import lv.javaguru.courses.ingenico.lecture2.enums.ObjectPredicates;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericMethods {

    @SuppressWarnings("unchecked")
    public static <T> T[] mergeArrays(T[] t0, T[]t1){
        Class<T> componentType = (Class<T>) t0.getClass().getComponentType();
        T[] result = (T[])Array.newInstance(componentType, t0.length + t1.length);
        System.arraycopy(t0, 0, result, 0, t0.length);
        System.arraycopy(t1, 0, result, t0.length, t1.length);
        return result;
    }

    public static <T> List<T> findAll(List<T> list, Predicate<? super T> predicate){
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] array0 = new Integer[]{1};
        Integer[] array1 = new Integer[]{3};
        Integer[] merged = mergeArrays(array0, array1);
        System.out.println(Arrays.toString(merged));

        List<String> list = new ArrayList<>();
        list.add("string");
        list.add("string 2");
        Predicate<String> p = (string) -> string.isEmpty();
        List<String> all = findAll(list, ObjectPredicates.ALWAYS_TRUE);
        System.out.println(all);
    }

}
