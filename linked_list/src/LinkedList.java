
public class LinkedList {
	//first node of the list
	private Node head;
	private int listNumber;
	
	public LinkedList(){
		this.head = new Node(null);
		this.listNumber = 0;
	}
	
	public void iniList(){
		listNumber = 0;
		
		if(head.getNext() != null){
			head.setNext(null);
		}
	}
	
	//add new node to the last of the list 
	public void addNodeToList(People data){
		Node newNode = new Node(data);
		Node current = head;
		
		//if the index 1 is not empty, then loop for the last node
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		//if the index 1 is empty, then directly run this part,
		current.setNext(newNode);
		listNumber++;
		
		System.out.println("People added. Now there are " + listNumber + "in the list");
	}
	
}
