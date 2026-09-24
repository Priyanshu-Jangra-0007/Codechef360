    // Function to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to add 1 to the number represented by linked list
    public static Node addOne(Node head) {
        head = reverse(head);

        Node curr = head;
        int carry = 1;
        Node prev = null;

        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            prev = curr;
            curr = curr.next;
        }

        if (carry > 0) {
            prev.next = new Node(carry);
        }