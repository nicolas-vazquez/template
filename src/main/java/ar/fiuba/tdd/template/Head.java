package ar.fiuba.tdd.template;

public class Head<T> implements Item<T> {

    private Item<T> next;

    public Head() {
        this.next = new Tail<T>();
    }

    public void insertNext(Item<T> previous, T data) {
        this.next.insertNext(this, data);
    }

    public void setNext(Item<T> item) {
        this.next = item;
    }

    public T getData() {
        return null;
    }

    public Item<T> getNext() {
        return this.next;
    }

    public int getPending() {
        return this.next.getPending();
    }

    public void delete(Item<T> previous) {
        this.next.delete(this);
    }
}
