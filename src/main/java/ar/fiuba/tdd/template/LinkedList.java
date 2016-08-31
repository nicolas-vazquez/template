package ar.fiuba.tdd.template;

public class LinkedList<T> implements Queue<T> {

    private Item<T> head;

    public LinkedList() {
        this.head = new Head<T>();
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    @Override
    public int size() {
        return this.head.getPending();
    }

    @Override
    public void add(T item) {
        this.head.insertNext(this.head, item);
    }

    @Override
    public T top() {
        return this.head.getNext().getData();
    }

    @Override
    public void remove() {
        this.head.delete(this.head);
    }
}
