package lv.javaguru.courses.ingenico.lecture2.enums;

import java.util.Arrays;

public enum Color {

    RED, GREEN, BLUE;

    public static void main(String[] args) {
        System.out.println(Color.RED.name());
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.valueOf("RED"));
        System.out.println(Arrays.toString(Color.values()));
        System.out.println(Color.RED == Color.RED);
    }
}
