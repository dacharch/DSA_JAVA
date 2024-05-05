public class DoublyLinkedList {
    Node head ;

    void insertAtFirst(int data){
        Node newNode = new Node(data) ;
        if(head == null){
            head = newNode ;
            newNode.prev = head ;
        }else{
            newNode.next = head ;
            head = newNode ;
            newNode.prev = head ;

        }
    }

    void display(){
         
        
    }
    public static void main(String args[]){
        DoublyLinkedList ob = new DoublyLinkedList() ;

        ob.insertAtFirst(20);
        ob.insertAtFirst(40);
        ob.insertAtFirst(500);
        ob.insertAtFirst(90);
        ob.insertAtFirst(353);
        ob.insertAtFirst(323) ;

        
   }    
}

class Node{
    int data ;
    Node next;
    Node prev ;

    public Node(int data){
       this.data = data ;
       this.next = null ;
       this.prev = null ;
    }
}
