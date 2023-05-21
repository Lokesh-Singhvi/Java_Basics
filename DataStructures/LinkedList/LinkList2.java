//detect cycle in a LL
/*public class LinkList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null || fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true;// cycle exist
            }
        }
        return false;// cycle not exist
    }

    static Node head;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
    }
}*/
//Remove a cycle/Loop in a LL
/* 
public class LinkList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true;// cycle exist
            }
        }
        return false;// cycle not exist
    }
    public static void removeCycle(){
        //1.detect loop
        Node slow = head;
        Node fast = head;
        boolean cycle=false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle=true;// cycle exist
                break;
            }
        }
        if(cycle==false){
           return;
        }
        //find meeting point
        slow=head;
        Node prev=null;//last node
        while(slow!=fast){
           prev=fast;
           slow=slow.next;
           fast=fast.next;
        }
        //remove cycle->last.next=null
        prev.next=null;
    }
    

    static Node head;

    public static void main(String args[]) {
        head = new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle()); 
        removeCycle();
        System.out.println(isCycle()); //check now cycle exist or not
    }
}*/
//mergesort in linked list
/* 
public class LinkList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        // step-1 create new node
        // className objName = new ClassName(Contructor Passed)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2-New node next =head
        newNode.next = head; // link

        // step-3 head = newNode
        head = newNode;

    }
    public void print() { // TC=O(N)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow; // slow is my midNode
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head1=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = findMid(head);
        // left and rigt MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        // Merge
        return merge(newLeft, newRight);
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String args[]) {
       LinkList2 ll=new LinkList2();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);
       ll.addFirst(6);
       ll.print();
       ll.head=ll.mergeSort(ll.head);
       ll.print();
    }
}*/
/*public class LinkList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(int data) {
        // create node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2
        tail.next = newNode;
        // step-3
        tail = newNode;
    }

    public void addFirst(int data) {
        // step-1 create new node
        // className objName = new ClassName(Contructor Passed)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2-New node next =head
        newNode.next = head; // link

        // step-3 head = newNode
        head = newNode;

    }

    public void print() { // TC=O(N)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        Node mid = slow;// slow is my midNode
        // reverse 2nd part
        Node curr =mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        //alt-merge - zig zag merge
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;

        }


    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String args[]) {
        LinkList2 ll=new LinkList2();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}*/



/*****************DOUBLY LINK LIST******************** */
public class LinkList2{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }

    }
    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //remove first
    public int removeFirst(){
        if(head==null){
            System.out.print("DLL IS EMPTY");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String args[]){
       LinkList2 dll=new LinkList2();
       dll.addFirst(3);
       dll.addFirst(2);
       dll.addFirst(1);
       dll.print();
       System.out.println(dll.size);

       dll.removeFirst();
       dll.print();
       System.out.println(dll.size);
    }
}