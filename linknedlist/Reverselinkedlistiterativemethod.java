package linknedlist;
import java.util.*;

public class Reverselinkedlistiterativemethod {

	public static void main(String[] args) {

		
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(1);
		Node n4=new Node(4);
		Node n5=new Node(5);
		
		
		Node head=n1;
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		
		
		display(head);
		//reverse(head);
		//removeduplicate(head);
	    //display(head);
		
		System.out.println(middle(head));
		

	}

	private static int middle(Node head) {
		Node p=head;
		Node q=head.next;
				
				while(q!=null)
				{
					p=p.next;
					q=q.next;
				}
		return p.val;
		
	}

	@SuppressWarnings("unused")
	private static void removeduplicate(Node head) {
		HashSet<Integer> set=new HashSet<>();
		
		Node p=head;
		Node q=null;
		
		while(p!=null)
		{
			if(set.contains(p.val))
			{
				q.next=p.next;
			}
			else
			{
				set.add(p.val);
				q=p;
			}
			p=p.next;
			
		}
		
		
	}

	@SuppressWarnings("unused")
	private static Node recursionrecursive(Node head) {
		if(head==null || head.next==null)
		{
			return head;
		}
		
		Node newnode=recursionrecursive(head.next);
		head.next.next=head;
		head.next=null;
		
		return newnode;
		
	}

	private static void display(Node head) {
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.val+" --> ");
			temp=temp.next;
		}
		System.out.println("END");
		
	}

	@SuppressWarnings("unused")
	private static void reverse(Node head) {
		if(head==null || head.next==null)
		{
			return; 
		}
		
		Node prenode=head;
		Node curnode=head.next;
		
		while(curnode!=null)
		{
			Node nextnode=curnode.next;
			curnode.next=prenode;
			
			//update
			
			prenode=curnode;
			curnode=nextnode;
		}
		
		head.next=null;
		head=prenode;
		
		display(head);
		
		
	}
	
}
class Node
{
	int val;
	Node next;
	
	Node(int val)
	{
		this.val=val;
	}
	
	Node(int val,Node next)
	{
		this.val=val;
		this.next=next;
	}
}
//		LinkedList<Integer> list=new LinkedList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		System.out.println(list);
//		
//		System.out.println(reverse(list));
//	}
//
//	private static LinkedList<Integer> reverse(LinkedList<Integer> list) {
//		for(int i=0;i<list.size()/2;i++)
//		{
//			Integer temp=list.get(i);
//			list.set(i, list.get(list.size()-i-1));
//			list.set(list.size()-i-1,temp);
//		}
//		
//		return list;
//		
//	}
//}

