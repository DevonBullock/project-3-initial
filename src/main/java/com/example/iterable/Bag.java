package com.example.iterable;
import java.util.*;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    protected List<T> Bag;

    public Bag() {
        Bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.Bag.isEmpty();
    }

    @Override
    public int size() {
        return this.Bag.size();
    }

    @Override
    public void add(T item) {
        this.Bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.Bag.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        this.Bag.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return this.Bag.spliterator();
    }
}
