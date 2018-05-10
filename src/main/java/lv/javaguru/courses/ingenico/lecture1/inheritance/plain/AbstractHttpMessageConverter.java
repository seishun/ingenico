package lv.javaguru.courses.ingenico.lecture1.inheritance.plain;

import lv.javaguru.courses.ingenico.utils.Assert;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class AbstractHttpMessageConverter<T> implements MessageConverter<T> {

    private List<String> supportedMediaTypes = Collections.emptyList();

    private Charset defaultCharset = Charset.forName("UTF-8");

    protected AbstractHttpMessageConverter() {
    }

    protected AbstractHttpMessageConverter(String... supportedMediaTypes) {
        setSupportedMediaTypes(Arrays.asList(supportedMediaTypes));
    }

    @Override
    public List<String> getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    public void setSupportedMediaTypes(List<String> supportedMediaTypes) {
        this.supportedMediaTypes = Assert.notEmpty(supportedMediaTypes, "supportedMediaTypes");
    }

    public Charset getDefaultCharset() {
        return defaultCharset;
    }

    public void setDefaultCharset(Charset defaultCharset) {
        this.defaultCharset = defaultCharset;
    }

}
