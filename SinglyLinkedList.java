public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;

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
    
    public void printValues(){
        Node runner = head;
        while(runner.next != null){
            System.out.println(runner.value);
            runner = runner.next;
        } 
    }

}