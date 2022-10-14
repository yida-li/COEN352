public class driver6 {
    

class Node{
    Node next;
    Node prev;
    int value;
}    
class LinkedList{

    Node head;

    public void insertNode(int data){

    Node node = new Node();
    node.value=data;
    node.next=null;
    if(head==null)
    {
        head=node;   
    }
    else
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        
        temp.next=node;  
        node.prev=temp;
        
    }
}

    public void print(){

    Node temp= head;
    while(temp!=null)
    {
    System.out.print(temp.value+" ");
    temp=temp.next;
    }    
    }

   

    public void delete(int data){


    Node temp = head;
    while(temp!=null){

        if(temp.value==data && temp.prev==null ){

            head=temp.next;
            break;
        }
        else if(temp.value==data && temp.next!=null){
            
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            break;
            
        }
        else if(temp.value==data && temp.next==null)
        {
            temp.prev.next=null;
            break;
            
        }
        
        temp=temp.next;
    }    
    }
}

public static void main(String args[])
{

driver6 dr= new driver6();
driver6.LinkedList linklist= dr.new LinkedList();
linklist.insertNode(34);
linklist.insertNode(566);
linklist.insertNode(434);
linklist.delete(434);
linklist.print();

}

}
