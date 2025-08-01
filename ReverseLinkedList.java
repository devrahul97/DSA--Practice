class Node {
    int data;
    Node next;
    
    public Node(int data){
        
        this.data = data;
        this.next = null;
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next =new Node(30);
		head.next.next.next =new Node(40);
		
		printLinkedList(head);
	    head = reverseLinkedList(head);
		printLinkedList(head);
		
		
		
	}
	
	public static void printLinkedList(Node head){
	    Node curr = head;
	    
	    System.out.print("Given Linked list:");
	    while(curr.next!=null){
	        System.out.print(curr.data+"->");
	        curr = curr.next;
	    }
	    System.out.println(curr.data);
	    
	}
	
	public static Node reverseLinkedList(Node head){
	    
	    Node curr = head;
	    Node prev = null;;
	    Node next;
	    
	    while(curr!=null){
	        next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }
	    return prev;
	    
	}
}
