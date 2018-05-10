package lv.javaguru.courses.ingenico.lecture1.inheritance.defaultmethods;

public interface Printer {

    default void print(Object o){
        System.out.println("Printer.print() : " + o);
    }
}
