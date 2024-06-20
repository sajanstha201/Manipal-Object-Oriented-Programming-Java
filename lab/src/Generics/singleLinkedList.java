package Generics;
class node<T>{
	T data;
	node<?> next;
}
public class singleLinkedList {
	node<?> head=null;
	public static void main(String [] args) {
		singleLinkedList s=new singleLinkedList();
		s.insert(45);
		s.insert(4);
		s.insert("sajan");
		s.display();
	}
<T>void insert(T t) {
	node<?> trav=head;
	if(head==null) {
		node<T> n=new node<>();
		n.data=t;
		n.next=null;
		head=n;
		return;
	}
	while(trav.next!=null) {
		trav=trav.next;
	}
	node<T> n=new node<>();
	n.data=t;
	n.next=null;
	trav.next=n;
}
<T>void display(){
	node<?> trav=head;
	while(trav!=null) {
		System.out.println(trav.data+" ");
		trav=trav.next;
	}
}
}
