package lv.javaguru.courses.ingenico.lecture2.exceptions;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionException;

public class SingleCatchBlock {

    public static void main(String[] args) {
        String string = "23";
        try{
            int i = Integer.parseInt(string);
        } catch (NumberFormatException | NullPointerException e){
            e.printStackTrace();
        }
    }

}
