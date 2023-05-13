public class LinkListDemo {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    // Adding node at first place
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Adding node at last place
    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    // Deleting first node
    public void deleteFirst(){
        if(head == null){
            System.out.println("list Empty");
            return;
        }

        head = head.next;
    }
    // Deleting last Node
    public void deleteLast(){
        if(head == null){
            System.out.println("list Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next; 
        }

        secondLast.next = null;
    }
    // Printing list
    public void printList(){
        if(head == null){
            System.out.println("list empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkListDemo list = new LinkListDemo();
        
        list.printList();
    }
}
