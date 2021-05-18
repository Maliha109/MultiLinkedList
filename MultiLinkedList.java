package javaapplication113;

public class MultiLinkedList {

    public Node head;

    public MultiLinkedList() {
        head = null;
    }

    public void addFirst(Object value) {
        Node node = new Node(value, null, null);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void addLast(Object value) {
        Node node = new Node(value, null, null);
        if (head == null) {
            head = node;
            return;
        }
        Node iter = head;
        while (iter.next != null) {
            iter = iter.next;
        }
        iter.next = node;

    }

    public void printParent() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public void addChildFirst(Object element, Object value) {
        Node node = new Node(value, null, null);
        Node iter=head;
        while(iter.value!=element){
            iter=iter.next;
        }
        if(iter.child==null){
            iter.child=node;
            return;
        }
        node.next=iter.child;
        iter.child=node;
    }
    public void addChildLast(Object element, Object value) {
        Node node = new Node(value, null, null);
        Node iter=head;
        while(iter.value!=element){
            iter=iter.next;
        }
        if(iter.child==null){
            iter.child=node;
            return;
        }
        Node a=iter.child;
        while(a.next!=null){
            a=a.next;
        }
        a.next=node;
    }
    public void printChild(Object item){
        System.out.println("");
        Node node=head;
        while(node.value!=item) {
            node=node.next;
        
        }
        Node a=node.child;
        while(a!=null){
            System.out.print(a.value+ " ");
            a=a.next;
        }
    
    
    }
}
