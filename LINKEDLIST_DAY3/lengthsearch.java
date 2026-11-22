
public class lengthsearch {
    public static void printLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

        public static int llength(Node head){
             Node temp=head;
             int count=0;
        while(temp!=null){
            count++;
           temp=temp.next;
        }
        return count;
    }
    public static int search(Node head,String Key){
            Node temp=head;
            int index=0;
            while(temp!=null){
                if(temp.data.equals(Key)){
                    return index;
                }
            index++;
            temp=temp.next;
    }
    return -1;
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
        
        head.data="boom";
        printLinkedList(head);
        System.out.println(llength(head));
        System.out.println(search(head,"n"));

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

