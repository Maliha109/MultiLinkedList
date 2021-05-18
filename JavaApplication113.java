
package javaapplication113;

public class JavaApplication113 {

    public static void main(String[] args) {
        MultiLinkedList list= new MultiLinkedList();
        list.addFirst(5);
        list.addFirst(8);
        list.addLast(10);
        list.addLast(45);
        list.printParent();
        list.addChildFirst(10, 35);
        list.addChildFirst(10, 45);
        list.addChildLast(10,65);
        list.addChildLast(8,15);
        list.addChildLast(45,65);
        list.printChild(10);
        list.printChild(45);
    }
    
}
