class Solution {

    public Node rearrange(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        Node leftSorted = rearrange(head);
        Node rightSorted = rearrange(right);

        return merge(leftSorted, rightSorted);
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node temp = dummy;
