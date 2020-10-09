

public class linkedList { 
    node head = null; 
    // node a, b; 
    static class node { 
        int val; 
        node next; 
  
        public node(int val) 
        { 
            this.val = val; 
        } 
    } 
  
    node sortedMerge(node a, node b) 
    { 
        node result = null; 
        /* Base cases */
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  // 2 nodes that points to nothing but hold in our imagination
        /* Pick either a or b, and recur */
        if (a.val <= b.val) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    } 
  
    node mergeSort(node h)  // all these sorts are going to be in interviews anyways, so might as well....
    
    						// this is basic recursion which will be asked in google interviews
    						// recursive function is the brimestone of mechanic advantage/ or circuit advantage
    { 
        // Base case : if there is no node or if only 1 node, there would be nothing to sort... only annoying Ta's will annoy you with this
        if (h == null || h.next == null) { 
            return h;} 
        
        
        
        
        // there real sorting starts here
        
        // get the middle node of the current list,the list :  could be 4 nodes, could be 353 nodes, could be even 6330 nodes,  
        node middle = getMiddle(h); 
        node nextofmiddle = middle.next;// a reference to the node after middle, behind middle, or below middle, which way a person interprets it
        
        // set the next of middle node to null 
        middle.next = null;  // sever the string of destiny
  
        // Apply mergeSort on left list  
        // lowest case would be 2 nodes,
        node left = mergeSort(h); 
  
        // Apply mergeSort on right list 
        node right = mergeSort(nextofmiddle); 
  
        // Merge the left and right lists 
        node sortedlist = sortedMerge(left, right);  // in the end all that matters is that 2 node at a time
        return sortedlist; 
    } 
  
    // Utility function to get the middle of the linked list 
    
    public static node getMiddle(node head)  
    // this idea is incredibly smart idea, both pointer starts a head position 
    // first pointer increasing a 1x rate
    // the second pointer increasing at 2x rate, when it hits the null, then first pointer will be at the presumably at the middle
    // 
    // i will take this as my tool,  absorb this algorithm  															
    { 
        if (head == null) 
            return head; 
  
        node slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) {   // as long it is not just 2 node, in that case, the first node is the middle
        														// if there is 4 nodes, the second node is the middle
        														//
            slow = slow.next; 		//increment 1x rate
            fast = fast.next.next;  // increment 2x rate
        }  
        return slow;     // returning the middle 
    } 
  
    void push(int new_data) 
    { 
        /* allocate node */
        node new_node = new node(new_data); 
  
        /* link the old list off the new node */
        new_node.next = head; 
  
        /* move the head to point to the new node */
        head = new_node; 
    } 
  
    // Utility function to print the linked list 
    void printList(node headref) 
    { 
        while (headref != null) { 
            System.out.print(headref.val + " "); 
            headref = headref.next; 
        } 
    } 
    void print() {
    	
    	node n= head; // hey i didnt know node can be static... learn something new everyday
    	while(n!=null) {
    		
    		System.out.println(n.val);
    		n=n.next;
    	}
    	
    }
  
    public static void main(String[] args) 
    { 
  
        linkedList li = new linkedList(); 
  
        li.push(15); 
        li.push(10); 
        li.push(5); 
        li.push(20); 
        li.push(3); 
        li.push(2); 
  
        // what are the benefits are doing it this way? no idea and have no time right now to verify
        // li.head = li.mergeSort(li.head);  
        // not that simple but it's taking the head of linkedlist object, that head has a value, in this case 20 fyi
        // that head will equal the smallest value after sorting the head itself... what a stiff way to write this...
        
        li.mergeSort(li.head);
        
        
        //li.printList(li.head);  // printing the head and possibly what ever its linked to?
        li.print(); // the only way to not copy is to fully absorb their algorithm and make it fully urs, because chances are they took from someone else, that is the true definition of ADT   abstract idea 
    } 
}