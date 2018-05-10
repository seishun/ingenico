package lv.javaguru.courses.ingenico.lecture1.inheritance.defaultmethods;

public class PrinterImpl extends PrintDevice implements Printable, Printer{

    @Override
    public void print(Object o) {
        super.print(o);
        Printable.super.print(o);
        Printer.super.print(o);
    }

    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        printer.print(new Object());
    }

}
