package lv.javaguru.courses.ingenico.lecture0;

import java.math.BigDecimal;

public class ClassStructure {

    public static final String INITIALIZED_STATIC_CONSTANT = "static initialized constant";

    private static final int INT_CONSTANT;

    private static long staticVariable;

    //static initialization block, executes once by Class Loader
    static {
        INT_CONSTANT = 4;
        staticVariable = -1L;
    }

    private final BigDecimal bigDecimal;

    private String instanceStringField;

    private int instanceIntField;

    public ClassStructure(String instanceStringField) {
        this.instanceIntField = 10;
        this.instanceStringField = instanceStringField;
        this.bigDecimal = new BigDecimal("13");
    }

    public ClassStructure(String instanceStringField, int instanceIntField) {
        this(instanceStringField);
        this.instanceIntField = instanceIntField;
    }

    public static long getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(long staticVariable) {
        ClassStructure.staticVariable = staticVariable;
    }

    public String getInstanceStringField() {
        return instanceStringField;
    }

    public void setInstanceStringField(String instanceStringField) {
        this.instanceStringField = instanceStringField;
    }

    public int getInstanceIntField() {
        return instanceIntField;
    }

    public void setInstanceIntField(int instanceIntField) {
        this.instanceIntField = instanceIntField;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        Boolean b = null;
        System.out.println(b);
    }
}
