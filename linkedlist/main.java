package linkedlist;
// Singly Linked List

public class main {

    public static void main(String[] args) {
        // Node sınıfını kullanarak nesneler (node) oluştur.
        // içlerinde sayılar tutan 3 tane node olusturuyoruz.
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        // Bu node'ları birbirine bağlayalım.
        // node1 -> node2 -> node3
        node1.setNext(node2);
        node2.setNext(node3);

        // "node1" den başlayarak zincirdeki verileri yaz.
        System.out.println("Node 1's data: " + node1.getData());
        System.out.println("Node 2's data: " + node1.getNext().getData());
        System.out.println("Node 3's data: " + node1.getNext().getNext().getData());


        // node3'ün `next` değeri null olmalı.
        if (node3.getNext() == null) {
            System.out.println("List over.");
        }
    }
}
