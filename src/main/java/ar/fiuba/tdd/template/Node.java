package ar.fiuba.tdd.template;

public class Node<T> implements Item<T> {

    private T data;
    private int weight = 1;
    private Item<T> next = new LastNode<T>();

    public Node(T data) {
        this.data = data;
    }

    public void insertNext(Item<T> previous, T data) {
        this.next.insertNext(this, data);
    }

    public T getData() {
        return this.data;
    }

    public Item<T> getNext() {
        return this.next;
    }

    public int getPending() {
        return (this.weight + this.next.getPending());
    }

    public void setNext(Item<T> item) {
        this.next = item;
    }

    public void delete(Item<T> previous) {
        previous.setNext(this.next);
    }
}
