        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        if (a != null) temp.next = a;
        else temp.next = b;

        return dummy.next;
    }
}