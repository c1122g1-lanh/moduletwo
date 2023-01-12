package ss_10_dsalist.LinkedList;

import ss_10_dsalist.LinkedList.MyLinkedList;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Result");
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.add(4, 4);
        linkedList.add(4, 5);
        linkedList.remote(3);
        linkedList.remoteFirst();
        linkedList.remoteLast();
        linkedList.printList();
    }

}
