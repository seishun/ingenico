package lv.javaguru.courses.ingenico.lecture1.inheritance.defaultmethods;

public interface Printable {

    default void print(Object o){
        System.out.println("Printable.print() : " + o);
    }

}
