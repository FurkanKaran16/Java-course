package linkedlist;

  public class Node <E> {
  private E data;
  private Node<E> next;

  // constructor
  public Node(E inputdata){
    this.data = inputdata;
    this.next = null;
    
  }

  public void setNext(Node<E> nextNext){
    this.next=nextNext;
  }
  public Node<E> getNext(){
    return this.next;
  }

  public E getData(){
    return this.data;
  }
}
