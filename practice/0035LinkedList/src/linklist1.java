

public class driver5 {
class Node{
    Node next;
    Node prev;
    int value;
} 
class LinkList{

    Node head;//default null
    //hey all objects are default null

    public void insertNode(int data)
        {
        Node node =new Node();
        node.value= data;
        node.next=null;
        if(head==null)//first element 
            {
            head=node;      
            }                    
        else          //after first elemetns
            {
            Node temp=head;
            while(temp.next!=null) // traverse to the last element
                {
                temp=temp.next;  
                }
            temp.next=node;               
            } 
        }
    public void printNode(){
    Node temp= head;
    while(temp!=null)
    {
    System.out.println(temp.value);
    temp=temp.next;
    }

    }
}    
public static void main(String args[]){

    System.err.println("Linked List");

    driver5 dr= new driver5();
    driver5.LinkList linkObject = dr.new LinkList();
    
    linkObject.insertNode(34);
    linkObject.insertNode(35);
    linkObject.insertNode(36);
    linkObject.printNode();
    
}


}
