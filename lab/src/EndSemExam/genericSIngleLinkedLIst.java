package EndSemExam;
class List{
	Node <?>head=null;
	<T>void insert(T t) {
		Node <T>node=new Node<>();
		node.data=t;
		if(head==null) {
			head=node;
			node.next=null;
			return;
		}
		Node <?>trav=head;
		while(trav.next!=null)
			trav=trav.next;
		trav.next=node;
	}
	void delete(){
		Node<?> trav=head;
		while(trav.next.next!=null)
			trav=trav.next;
		trav.next=null;
	}
	void display() {
		Node<?> trav=head;
		while(trav!=null) {
			System.out.print(trav.data);
			trav=trav.next;
		}
	}
}
class Node<T>{
	T data;
	Node<?> next;
}
public class genericSIngleLinkedLIst {
public static void main(String []args) {
	List list=new List();
	list.insert(3);
	list.insert(5);
	list.insert("sajan");
	list.display();
}
}