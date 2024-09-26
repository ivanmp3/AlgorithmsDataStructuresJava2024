public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: list1 = [1, 2, 4], list2 = [1, 3, 4]
        ListNode list1Ex1 = createList(new int[]{1, 2, 4});
        ListNode list2Ex1 = createList(new int[]{1, 3, 4});
        ListNode resultEx1 = solution.mergeTwoLists(list1Ex1, list2Ex1);
        System.out.print("Example 1: ");
        printList(resultEx1);  // Expected Output: [1, 1, 2, 3, 4, 4]

        // Example 2: list1 = [], list2 = []
        ListNode list1Ex2 = createList(new int[]{});
        ListNode list2Ex2 = createList(new int[]{});
        ListNode resultEx2 = solution.mergeTwoLists(list1Ex2, list2Ex2);
        System.out.print("Example 2: ");
        printList(resultEx2);  // Expected Output: []

        // Example 3: list1 = [], list2 = [0]
        ListNode list1Ex3 = createList(new int[]{});
        ListNode list2Ex3 = createList(new int[]{0});
        ListNode resultEx3 = solution.mergeTwoLists(list1Ex3, list2Ex3);
        System.out.print("Example 3: ");
        printList(resultEx3);  // Expected Output: [0]
    }

    // Метод для создания связного списка из массива
    private static ListNode createList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Метод для печати связного списка
    private static void printList(ListNode node) {
        if (node == null) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
