package lv.javaguru.courses.ingenico.lecture1.inheritance.plain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface MessageConverter<T> {

    boolean supports(Class<?> clazz);

    List<String> getSupportedMediaTypes();

    T read(InputStream inputStream) throws IOException;

    void write(T object, OutputStream outputStream) throws IOException;
}
