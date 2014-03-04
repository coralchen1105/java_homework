
public class Node {
	Node next;
	People data;
	
	//last node constructor
	public Node(People data){
//		next = null; 
		this.data = data;
	}
	
	// general node constructor
	public Node(Node next, People data){
		this.next = next;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public People getData() {
		return data;
	}

	public void setData(People data) {
		this.data = data;
	}
	
}
