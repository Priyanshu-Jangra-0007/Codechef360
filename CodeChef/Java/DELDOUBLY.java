public static Node deleteAllOccurrences(Node head, int X) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == X) {

                // If it is head node
                if (curr == head) {
                    head = curr.next;
                    if (head != null)
                        head.prev = null;

                } else {
                    curr.prev.next = curr.next;
                    if (curr.next != null)
                        curr.next.prev = curr.prev;
                }
            }
            curr = curr.next;
        }
        return head;
    }