

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  
    public void remove() {
        
    }  
    public void printVals() {
        Node runner = this.head;

        if(this.head == null){
            System.out.println("this head is null");
            return;
        }
        System.out.println("print values" + runner);
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
        


    }
}