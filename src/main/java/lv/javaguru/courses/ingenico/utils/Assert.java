package lv.javaguru.courses.ingenico.utils;

import java.util.List;

public class Assert {

    public static <T> T nonNull(T object, String objectName){
        if (object == null){
            throw new IllegalArgumentException(objectName + " must not be null");
        }
        return object;
    }

    public static String notEmpty(String string, String objectName){
        if (nonNull(string, objectName).isEmpty()){
            throw new IllegalArgumentException(objectName + " must not be empty");
        }
        return string;
    }

    public static <T> List<T> notEmpty(List<T> list, String objectName){
        if (nonNull(list, objectName).isEmpty()){
            throw new IllegalArgumentException(objectName + " must not be empty");
        }
        return list;
    }
}
