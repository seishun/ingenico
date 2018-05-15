package lv.javaguru.courses.ingenico.lecture2.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WithoutCatch {

    public void method() {
        try {
            new BufferedReader(new FileReader("ddd"));
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public void method1() {
        method();
    }

}
