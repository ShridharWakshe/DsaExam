import java.util.*;

class LL{
	static Node head;
	static  class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		static void insert(int data){
		Node temp = new Node(data);
		if (head == null){
			head = new Node(temp.data);
			return;
		}
		temp.next = null;
		Node last = head;
		while(last.next !=null)
			last = last.next;
		last.next = temp;
		return;
	}
		void print(Node node){
		
			while (node != null){
				System.out.print(node.data+"->");
				node = node.next;
			}System.out.print("null");
		}
		
		Node reverse(Node node){
			Node prev = null;
			Node current = node;
			Node  next = null;
			while(current != null){
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			return node;
		}
	public static void main(String [] args){
		LL list = new LL();
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int elements = sc.nextInt();
		
		for(int i = 0; i < elements; i++){
		   list.insert(sc.nextInt());
		}
		list.print(head);
		head = list.reverse(head);
		System.out.println("");
		list.print(head);
	}
}