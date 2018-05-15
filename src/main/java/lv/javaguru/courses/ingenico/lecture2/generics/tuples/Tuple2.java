package lv.javaguru.courses.ingenico.lecture2.generics.tuples;

public class Tuple2<T1, T2> extends Tuple<T1> {

    private T2 second;

    public Tuple2(T1 first, T2 second) {
        super(first);
        this.second = second;
    }

    public T2 getSecond() {
        return second;
    }

    public T2 replaceSecond(T2 second){
        T2 old = this.second;
        this.second = second;
        return old;
    }

    @Override
    public String toString() {
        return "Tuple2{" +
                super.toString() +
                ", second=" + second +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;

        return second != null ? second.equals(tuple2.second) : tuple2.second == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
