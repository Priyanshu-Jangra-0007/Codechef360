static Node deleteMiddle(Node head) {
        if (head == null || head.next == null)
            return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // delete middle node
        prev.next = slow.next;
        return head;
    }