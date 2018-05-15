package lv.javaguru.courses.ingenico.lecture2.generics.tuples;

public class Tuple3<T1, T2, T3> extends Tuple2<T1, T2> {

    private T3 third;

    public Tuple3(T1 first, T2 second, T3 third) {
        super(first, second);
        this.third = third;
    }

    public T3 getThird() {
        return third;
    }

    public T3 replaceThird(T3 third){
        T3 old = this.third;
        this.third = third;
        return old;
    }

    @Override
    public String toString() {
        return "Tuple3{" +
                super.toString() +
                "third=" + third +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;

        Tuple3<?, ?, ?> tuple3 = (Tuple3<?, ?, ?>) o;

        return third != null ? third.equals(tuple3.third) : tuple3.third == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (third != null ? third.hashCode() : 0);
        return result;
    }
}
