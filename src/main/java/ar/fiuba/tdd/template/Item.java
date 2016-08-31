package ar.fiuba.tdd.template;

public interface Item<T> {

    public void insertNext(Item<T> previous, T data);

    public void setNext(Item<T> item);

    public T getData();

    public Item<T> getNext();

    public int getPending();

    public void delete(Item<T> previous);
}
