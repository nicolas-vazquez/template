package ar.fiuba.tdd.template;

public class LastNode<T> implements Item<T> {

    private int weight;

    public LastNode() {
        this.weight = 0;
    }

    public void insertNext(Item<T> previous, T data) {
        previous.setNext(new Node<T>(data));
    }

    public T getData() {
        throw new AssertionError();
    }

    public int getPending() {
        return this.weight;
    }

    public Item<T> getNext() {
        throw new AssertionError();
    }

    public void setNext(Item<T> item) {
        throw new AssertionError();
    }

    public void delete(Item<T> previous) {
        throw new AssertionError();
    }
}
