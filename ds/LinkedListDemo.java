package ds;

public class LinkedListDemo {

	public static void main(String[] args) {
		IntLinkdeList l = new IntLinkdeList(2);
		l.insert(5);
		l.insert(15);
		l.insert(25);
		l.insert(5);
		l.printNode();
		System.out.println("Middle:"+l.findMiddle());
		l.delete(15);
		l.printNode();
		System.out.println("Middle:"+l.findMiddle());
		//l.changeToCirculer();
		System.out.println(l.isCirculer());
		//l.printNode();
	}
}

class IntLinkdeList {

	private Node head;
	
	public IntLinkdeList(int item) {
		Node n = new Node();
		n.data = item;
		n.next = null;
		head = n;
	}
	
	public boolean isCirculer() {
		Node sp = head;
		Node fp = head.next;
		while(sp.next != null && fp.next !=null && sp !=fp) {
			sp= sp.next;
			fp = fp.next.next;
		}
		if(sp==fp)return true;
		return false;
			
		}
	public int findMiddle() {
		Node sp = head;
		Node fp = head;
		while(fp != null && fp.next !=null ) {
			sp= sp.next;
			fp = fp.next.next;
		}
			return sp.data;
		}
	
	public void changeToCirculer() {
		Node n = head;
		
		while(n.next !=null) {
			n= n.next;
		}
		n.next=head;
	}

	
	
	public boolean insert(int item) {
		Node n = new Node();
		n.data = item;
		//Add first
		n.next = head;
		head =n;
		
		//Add last
		/*Node n2 = head;
		while(n2.next !=null)
			{
				n2=n2.next;
			}
		n.next = null;
		n2.next = n;*/
		return true;
	}
	
	public boolean delete(int item) {
		Node n = head;
		if(n.data == item) { 
			head = head.next;
			return true;
			}
		Node p = head;
		Node q = head.next;
		while(q.next!=null && q.data !=item) {
		p = q;
		q=q.next;
		}
			if(q.data==item) {
				p.next = q.next;
				return true;
			}else {
				System.out.println("GIven element not found");
			}
		return false;
	}

	public void printNode() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	class Node {

		private Node next, prev;
		private int data;

	}
}
