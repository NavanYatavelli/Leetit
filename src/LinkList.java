/* Online Java Compiler and Editor */
public class TestList{

     public static void main(String []args){
        System.out.println("Hello, World!");
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.display();
     }
}

 class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
}

class LinkedList {

    public LinkedList() {
        
    }

    private Node head = null;
    
 // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If list is empty, make newNode the head
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; // Add newNode at the end
        }
    }
    
    public void display(){
        Node current = head;
        int index = 0;
        while (current != null) { // Traverse to the end of the list
           index++;
            System.out.println("Node Value = " + current.value + " Index = " + index);
            current = current.next;
            
        }
         System.out.println("Total Nodes = " + index);
    }
    
}
