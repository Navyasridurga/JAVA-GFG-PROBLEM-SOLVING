public class linked {
    public static void printLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
    }
    public static void main(String args[]){
        Node node1=new Node("a");
        Node node2=new Node("e");
        Node node3=new Node("d");
        Node node4=new Node("f");
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        Node head=node1;
        printLinkedList(head);

    }
   static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;

        }
    }
}

