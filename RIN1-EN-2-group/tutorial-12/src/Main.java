public class Main {
    public static void main(String[] args) {
        // Linked List
        MyLinkedList ll = new MyLinkedList();
        ll.printList();

        ll.insert(7);
        ll.insert(8);
        ll.insert(4);
        ll.insert(2);
        ll.printList();

        System.out.println("Contains 7: " + ll.contains(7));
        System.out.println("Contains 8: " + ll.contains(8));
        System.out.println("Contains 16: " + ll.contains(16));

        System.out.println("Delete 4: "+ ll.delete(4));
        System.out.println("Delete 4: "+ ll.delete(4));

        ll.printList();

        System.out.println("Length: " + ll.length());

        System.out.println("-----------SORTED LINKED LIST----------");
        MySortedLinkedList sll = new MySortedLinkedList();
        sll.printList();

        sll.insert(8);
        sll.insert(2);
        sll.insert(4);
        sll.insert(10);
        sll.insert(7);
        sll.insert(1);
        sll.insert(9);
        sll.insert(6);

        sll.printList();

        System.out.println("Max: " + sll.max());
        System.out.println("Min: " + sll.min());


    }
}