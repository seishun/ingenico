package lv.javaguru.courses.ingenico.lecture0;

public class ClassStructure {

    public static final String INITIALIZED_STATIC_CONSTANT = "static initialized constant";

    private static final int INT_CONSTANT;

    private static long staticVariable;

    //static initialization block
    static {
        //do something
        INT_CONSTANT = 4;
    }

    private String instanceStringField;

    private int instanceIntField;

    // instance initialization block, executes before constructor
    {
        instanceIntField = 10;
    }

    public ClassStructure(String instanceStringField) {
        this.instanceStringField = instanceStringField;
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
}
