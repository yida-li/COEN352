public class yida1 {
    

public class Node{


    Node next;
    int value;
}
public class stacker{

    Node top;

    public void push(int x){

    Node node = new Node();
    node.value=x;
       
    if (top==null){
        top=node;
     
    }
    else{
        node.next=top;
        top=node;
 
        
    }

    }

    public void pop(){

    System.out.println("poped" + top.value);
    top=top.next;

    }

}

public static void main(String args[]){

driver5 dr= new driver5();
driver5.stacker st= dr.new stacker();

st.push(4434);
st.push(2434);
st.push(1434);
st.push(1);
st.push(0);
st.pop();
st.pop();
st.pop();

}

}
