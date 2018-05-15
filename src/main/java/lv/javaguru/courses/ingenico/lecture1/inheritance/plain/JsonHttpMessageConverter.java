package lv.javaguru.courses.ingenico.lecture1.inheritance.plain;

import lv.javaguru.courses.ingenico.utils.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.function.Supplier;

public class JsonHttpMessageConverter extends AbstractHttpMessageConverter<String> {

    public JsonHttpMessageConverter() {
        super(Assert.notEmpty("application/json", "media type"));
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

    @Override
    public String toString() {
        return "JsonHttpMessageConverter{}";
    }

    @Override
    public List<String> getSupportedMediaTypes() {
        return null;
    }
}
