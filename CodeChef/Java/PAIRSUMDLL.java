        Node right = head;

        // Move right to end
        while (right.next != null)
            right = right.next;

        boolean found = false;

        // Two-pointer search
        while (left != null && right != null && left.data < right.data) {
            int sum = left.data + right.data;

            if (sum == target) {
                sb.append("[").append(left.data).append(", ").append(right.data).append("] "
                    );
                found = true;
                left = left.next;
                right = right.prev;
            } 
            else if (sum < target)
                left = left.next;
            else
                right = right.prev;
        }

        if (!found)
            sb.append("[]");
    }
