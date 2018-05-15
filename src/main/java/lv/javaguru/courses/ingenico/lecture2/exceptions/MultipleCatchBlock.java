package lv.javaguru.courses.ingenico.lecture2.exceptions;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultipleCatchBlock {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader("file.txt");
            bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
            System.out.println(lines);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            close(fileReader);
            close(bufferedReader);
        }
    }

    static void close(Closeable closeable){
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }

}
