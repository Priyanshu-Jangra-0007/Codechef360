
static Node rotateRight(Node head, int R) {
    if (head == null || head.next == null || R == 0) {
        return head;
    }

    // Find the length of the list and the last node
    Node last = head;
    int length = 1;
    while (last.next != null) {
        last = last.next;
        length++;
    }

    // Adjust R if it's larger than the length of the list
    R = R % length;
    if (R == 0) {
        return head;
    }

    // Find the new head and the new last node
    Node newLast = head;
    for (int i = 0; i < length - R - 1; i++) {
        newLast = newLast.next;
    }

    // Perform the rotation
    Node newHead = newLast.next;
    newLast.next = null;
    last.next = head;
