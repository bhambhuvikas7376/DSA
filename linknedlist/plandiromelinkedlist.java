package linknedlist;

import java.util.HashSet;

public class plandiromelinkedlist {

	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(2);
		Node n4=new Node(1);
		//Node n5=new Node(1);
		
		
		Node head=n1;
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
		//n5.next=null;
		
		
		display(head);
		
		//reverse(head);
		//removeduplicate(head);
	    //display(head);
		//System.out.println(palindrome(head));
		int n=2;
		display(deletenthnodefromend(head,n));
		
		

	}

	private static Node deletenthnodefromend(Node head,int n) {
		if(head == null)
		{
			return null;
		}
		
		int size=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
		    size++;
		}
		
		if(n==size)
		{
			return head.next;
		}
		
		int index=size-n-1;
		System.out.println(index);
		System.out.println(size);
		Node pre=head;
		int i=0;
		while (i<index)
		{
			pre=pre.next;
			i++;
		}
		
		pre.next=pre.next.next;
		return head;
		
	}

	private static boolean palindrome(Node head) {
		Node mid=middle(head);
		Node sh=reverse(mid.next);
		Node fh=head;
		
		while(sh!=null)
		{
			if(fh.val!=sh.val) return false;
			
			fh=fh.next;
			sh=sh.next;
		}
		return true;
		
	}

	private static Node middle(Node head) {
		Node p=head;
		Node q=head;
				
		while(q.next != null && q.next.next != null)
		{
				q=q.next.next;
				p=p.next;
		}
		return p;
		
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

	private static Node reverse(Node head) {
		if(head==null || head.next==null)
		{
			return head; 
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
		
		//display(head);
		return head;
		
		
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
	


