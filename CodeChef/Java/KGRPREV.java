public class Main {
    private static Node reverseSublist(Node start, Node end) {
        Node prev = end;
        while (start != end) {
            Node temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }
        return prev;
    }

    private static Node reverseMSizeGroups(Node head, int M) {
        if (M == 1 || head == null) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (head != null) {
            Node groupStart = head;
            Node groupEnd = head;
            for (int i = 1; i < M && groupEnd.next != null; i++) {
                groupEnd = groupEnd.next;
            }
            Node nextGroupStart = groupEnd.next;

            prev.next = reverseSublist(groupStart, groupEnd.next);
