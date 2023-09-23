package Linked_List;

public class Basic_linked_list {
    public Node head;
    public Node tail;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Basic_linked_list ll=new Basic_linked_list();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
    }
}
