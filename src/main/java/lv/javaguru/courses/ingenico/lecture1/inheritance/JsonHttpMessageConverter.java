package lv.javaguru.courses.ingenico.lecture1.inheritance;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JsonHttpMessageConverter extends AbstractHttpMessageConverter<String> {

    public JsonHttpMessageConverter() {
        super("application/json");
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return CharSequence.class.isAssignableFrom(clazz)
                || clazz == byte[].class
                || clazz == Byte[].class;
    }

    @Override
    public String read(InputStream inputStream) throws IOException {
        //todo : implement
        throw new NotImplementedException();
    }

    @Override
    public void write(String object, OutputStream outputStream) throws IOException {
        //todo : implement
        throw new NotImplementedException();
    }
}
