
static Node reverseSegment(Node head, int L, int R) {
    if (head == null || L == R) {
        return head;
    }

    Node dummy = new Node(0);
    dummy.next = head;
    Node prev = dummy;

    for (int i = 1; i < L; i++) {
        prev = prev.next;
    }

    Node start = prev.next;
    Node then = start.next;

    for (int i = L; i < R; i++) {
        start.next = then.next;
        then.next = prev.next;
        prev.next = then;
        then = start.next;
    }

    return dummy.next;
}
