package lv.javaguru.courses.ingenico.lecture0;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BasicTypes {

    public static void main(String[] args) {
        byte b = 123;
        b = Byte.MIN_VALUE;

        short s = 34;

        int i = 4;
        i = 1_000_000;
        i = Integer.SIZE;

        long l = 99;
        l = 99_000L;
        l = Long.SIZE;

        char c = 99;
        c = '3';
        c = '\u0000';

        float f = 45;
        f = 45F;
        f = 45F;
        f = 0.45F;
        f = .45f;

        double d = 53;
        d = 0.53;
        d = .53;

        boolean bool = true;

        String string = "some value";

        String anotherString = new String("some value");

        BigDecimal bigDecimal = new BigDecimal("0.13");

        BigDecimal result = bigDecimal.add(new BigDecimal(15));

        BigInteger bigInteger = new BigInteger("1234");

        int[] intes = new int[2];
        byte bytes[] = new byte[3];
        long[][] longs = new long[3][3];
        char[][] chars = new char[4][];
        String[] strings[] = new String[3][4];

        // single line comment

        /*
        * multi-line comment
        * */

        /**
         * javadoc comment
         * */

    }
}
