package lv.javaguru.courses.ingenico.lecture2.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TryWithResources {

    public static void main(String[] args) {
        try (
                FileReader fileReader = new FileReader("file.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
