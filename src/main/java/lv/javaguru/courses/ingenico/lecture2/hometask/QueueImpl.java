package lv.javaguru.courses.ingenico.lecture2.hometask;

import java.util.Iterator;
import java.util.function.Predicate;

// TODO : implement
public class QueueImpl<E> implements Queue<E> {

    @Override
    public void add(Object element) {

    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public void addAll(Queue<E> queue) {

    }

    @Override
    public boolean contains(Predicate<E> predicate) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
