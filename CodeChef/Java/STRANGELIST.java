public static Node flatten(Node head) {
        if (head == null) return head;

        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node nextNode = current.next;
                Node childList = flatten(current.child);

                // Attach the flattened child list to the current node
                current.next = childList;
                current.child = null;

                // Reconnect the tail of the child list with the next node of the current 
                    node.
                Node curChild = childList;
                while (curChild.next != null) {
                    curChild = curChild.next;
                }
                curChild.next = nextNode;
                
                // Continue processing from the next node which is now chained after child 
                    nodes
                current = nextNode;
            } else {
                current = current.next;
            }
        }
        return head;
    }