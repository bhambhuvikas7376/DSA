package linknedlist;

/*public class linkedlist1 {

	public static void main(String[] args) {
         LL list=new LL();
         list.insertfirst(2);
         list.insertfirst(3);
         list.insertfirst(4);
         list.insertfirst(5);
         list.display();
         

	}

}

class LL{
	 private Node head;
	 private Node tail;
	 private int size;
	 
	 public LL()
	 {
		 this.size=0;
	 }
	 
	 public void insertfirst(int val)
	 {
		 Node node=new Node(val);
		 node.next=head;
		 head=node;
		 
		 if(tail==null)
		 {
			 tail=head;
		 }
		 size +=1;
	 }
	 
	 public void display()
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 System.out.print(temp.value+""+"->");
			 temp=temp.next;
		 }
		 System.out.println("End");
	 }
	 
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value)
		{
			this.value=value;
		}
		
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
		
	}
	
*/

public class linkedlist1 {

	public static void main(String[] args) {
        Node n1=new Node(2);
        Node n2=new Node(3);
        Node n3=new Node(4);
        Node n4=new Node(5);
        
        Node head=n1;
        head.next=n1;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        display(head);
        
	}
	
	static void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+""+"->");
			temp=temp.next;
		}
		System.out.println("End");
	}

}

/*class LL{
	private Node head;
	private Node tail;
	private int size=0;
	
	public LL()
	 {
		 this.size=0;
	 }
	 
	 public void insertfirst(int val)
	 {
		 Node node=new Node(val);
		 node.next=head;
		 head=node;
		 
		 if(tail==null)
		 {
			 tail=head;
		 }
		 size +=1;
	 }
	 
	
	void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+""+"->");
			temp=temp.next;
		}
		System.out.println("End");
	}*/
	
	class Node{
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
	


