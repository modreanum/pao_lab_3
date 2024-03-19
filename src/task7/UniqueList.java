package task7;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueList<T> implements List<T> {

    private final List<T> storage;

    public UniqueList() {
        storage = new ArrayList<>();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return storage.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }

    @Override
    public Object[] toArray() {
        return storage.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return storage.toArray(a);
    }

    @Override
    public boolean add(T t) {
        if (!this.contains(t))
        {return storage.add(t);}
        return false;

    }

    @Override
    public boolean remove(Object o) {

        return storage.remove(o);

    }

    @Override
    public boolean containsAll(Collection<?> c) {

        return storage.containsAll(c);

    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        return storage.addAll(c.stream().distinct().filter(e -> !storage.contains(e)).toList());
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return storage.addAll(index,c.stream().distinct().filter(e -> !storage.contains(e)).toList());
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return storage.removeAll(c.stream().distinct().toList());
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return storage.retainAll(c);
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public T get(int index) {
        return storage.get(index);
    }

    @Override
    public T set(int index, T element) {
        if (!storage.contains(element)) {
            return storage.set(index, element);

        }
        return null;
    }

    @Override
    public void add(int index, T element) {
        if (!storage.contains(element)) {
            storage.add(index, element);

        }

    }

    @Override
    public T remove(int index) {
       return storage.remove(index);
    }

    @Override
    public int indexOf(Object o) {
       return storage.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
       return storage.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
       return storage.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return storage.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return storage.subList(fromIndex,toIndex);
    }
}
