package lv.javaguru.courses.ingenico.lecture3.maps;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

    public static void main(String[] args) {
        String text = "The quick, brown fox jumps over a lazy dog";
        Map<String, Integer> result = new HashMap<>();
        for (String s : text.split("")) {
            Integer count = result.get(s);
            if (count == null){
                result.put(s, 1);
            } else {
                result.put(s, ++count);
            }
        }

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
        }
    }

}
