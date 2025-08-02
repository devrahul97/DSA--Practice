class Node{
    int value;
    Node next;
    
    public Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    Node head = new Node(11);
	    head.next = new Node(21);
	    head.next.next = new Node(31);
	    head.next.next.next = new Node(41);
	    head.next.next.next.next = new Node(19);
	    head.next.next.next.next.next = new Node(37);
	    
	    // 11-> 21->31-> 41->19-> 37-> null
	    
	    //Reverse a LinkedList
	    printLinkedList(head);
	    head = reverseLinkedList(head);
	    printLinkedList(head);
	    
	    //Basic Operations On LinkedList
	   printLength(head);
	   // printLinkedList(head);
	   System.out.println(searchInLinkedList(head, 41));
	   //DeleteANode(head, 41);
	   //DeleteNodeAtNthPosition(head, 3);
	   // NthNodeFromStart(head);
	   // NthNodeFromEnd(head);
	    
		
	}
	
	public static void printLength(Node head){
	    
	    int count = 0;
	    Node curr = head;
	    while(curr!=null){
	        count++;
	        curr = curr.next;
	    }
	    
	    System.out.println("Length of Linkedlist: "+ count);
	}
	
	public static void printLinkedList(Node head){
	   
	    Node curr = head;
	    while(curr.next!=null){
	        System.out.print(curr.value+"->");
	        curr = curr.next;
	    }
	    System.out.println(curr.value);
	}
	
	public static Node reverseLinkedList(Node head){
	    
	    Node curr = head;
	    Node prev = null;
	    Node next;
	    
	    while(curr!=null){
	        
	        next = curr.next;
	        curr.next= prev;
	        prev = curr;
	        curr = next;
	    }
	    return prev;
	}
	
	public static boolean searchInLinkedList(Node head, int key){
	    
	    boolean isKeyPresent = false;
	    Node curr = head;
	    
	    while(curr!=null){
	        if(curr.value == key)
	        {
	            return !isKeyPresent;
	        }
	        curr= curr.next;
	    }
	    
	    return isKeyPresent;
	}
	
	public static void DeleteNodeAtNthPosition(Node Node, int position){
	    
	    Node curr= head;
	    int count = 0;
	    
	    while(curr! =null){
	        count+=;
	        if(count==position){
	            
	        }
	    }
	}
}
