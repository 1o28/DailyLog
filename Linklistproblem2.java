class LinkedList {
    Node head = null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void addFirst(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
}
public class Linklistproblem2 {
    public static void main(String[] args) {
        
    }
}
