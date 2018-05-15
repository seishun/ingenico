package lv.javaguru.courses.ingenico.lecture2.generics.tuples;

public class Tuple<T1> {

    private T1 first;

    public Tuple(T1 first) {
        this.first = first;
    }

    public T1 getFirst() {
        return first;
    }

    public T1 replaceFirst(T1 first){
        T1 old = this.first;
        this.first = first;
        return old;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "first=" + first +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple<?> tuple = (Tuple<?>) o;

        return first != null ? first.equals(tuple.first) : tuple.first == null;
    }

    @Override
    public int hashCode() {
        return first != null ? first.hashCode() : 0;
    }
}
