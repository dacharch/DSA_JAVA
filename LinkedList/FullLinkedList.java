class FullLinkedList{
    Node head ;    
    
    void insertNodeAtFirst(int data){
        Node  newNode = new Node(data) ;
        if(head == null){
            head = newNode ;
        }else{
            newNode.next = head;
            head = newNode ;
        }
    }

    void insertNodeAtLast(int data){
        Node newNode = new Node(data) ;

        if(head == null){
            head = newNode ;
        }else{
            Node loop = head ;
            while(loop.next != null){
                loop = loop.next ;
            }
            loop.next = newNode ;
        }
    }

    void insertNodeAtPos(int data, int pos){
        
    }

    void display(){
       Node loop = head  ;
       while(loop != null){
         System.out.println(loop.data+" ") ;
         loop = loop.next ;
       }
    }

    public static void main(String args[]){
       FullLinkedList ob  = new FullLinkedList() ;
       ob.insertNodeAtFirst(300); 
       ob.insertNodeAtFirst(500);
       ob.insertNodeAtFirst(100);
       ob.insertNodeAtLast(200);
       ob.display();
    }
}

// Node Structure DataBase 

class Node{
    int data ;
    Node next ;

    Node(int data){
        this.data = data ;
        this.next  = null ;
    }
}