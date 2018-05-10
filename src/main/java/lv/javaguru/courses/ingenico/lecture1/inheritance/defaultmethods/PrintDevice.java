package lv.javaguru.courses.ingenico.lecture1.inheritance.defaultmethods;

public abstract class PrintDevice {

    public void print(Object o){
        System.out.println("PrintDevice.print() : " + o);
    }

}
