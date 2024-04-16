package Java_Coding_Question_50;

public class reverselinkedlist {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);

        Node head=n1;
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        display(head);
        display(reverse(head));
        //display(recursionreverse(head));
        

    }

    private static Node recursionreverse(Node head) {
        if(head==null || head.next==null)
        {
            return head;
        }

        Node newNode=recursionreverse(head.next);
        head.next.next=head;
        head.next=null;

        return newNode;
    }

    private static Node reverse(Node head) {
        if(head == null || head.next==null)
        {
            return head;
        }

        Node prevNode=head;
        Node curNode=head.next;

        while(curNode!=null)
        {
            Node nextNode=curNode.next;
                 curNode.next=prevNode;

                 prevNode=curNode;
                 curNode=nextNode;
        }

        head.next=null;
        head=prevNode;

        return head;
    }

    private static void display(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("End");

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
