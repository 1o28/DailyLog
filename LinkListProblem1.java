public class LinkListProblem1 {
    Node head = null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Add at given position
    public void add(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        int count = 1;
        Node temp = head;
        while(count != pos-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkListProblem1 list = new LinkListProblem1();

        list.add(2,1);

        list.printList();
    }
}
