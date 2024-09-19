class MyLinkedList {
    // Class attributes
    int val;
    MyLinkedList next;
    MyLinkedList head;  // Reference to the head of the linked list

    // Constructor for initializing the linked list
    public MyLinkedList() {
        head = null;  // The linked list is initially empty
    }

    // Constructor to create a new node with a given value
    public MyLinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    // Get the value of the node at the given index
    public int get(int index) {
        MyLinkedList temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.val;
            }
            count++;
            temp = temp.next;
        }
        return -1; // If index is out of bounds
    }

    // Add a node at the head (start) of the linked list
    public void addAtHead(int val) {
        MyLinkedList newnode = new MyLinkedList(val);
        newnode.next = head;
        head = newnode;
    }

    // Add a node at the tail (end) of the linked list
    public void addAtTail(int val) {
        MyLinkedList newnode = new MyLinkedList(val);
        if (head == null) {
            head = newnode;  // If the list is empty, the new node becomes the head
            return;
        }
        MyLinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // Add a node at a specified index
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        MyLinkedList newnode = new MyLinkedList(val);
        MyLinkedList temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            count++;
            temp = temp.next;
        }
        if (temp == null) {
            return; // If index is out of bounds, do nothing
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // Delete the node at a specified index
    public void deleteAtIndex(int index) {
        if (head == null) {
            return; // If the list is empty, do nothing
        }
        if (index == 0) {
            head = head.next; // Remove the head node
            return;
        }
        MyLinkedList temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            count++;
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return; // If index is out of bounds, do nothing
        }
        temp.next = temp.next.next; // Skip over the node at the specified index
    }
}
