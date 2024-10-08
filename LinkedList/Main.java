package LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode list1_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2_1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode merged1 = solution.mergeTwoLists(list1_1, list2_1);
        System.out.println(merged1); // Ожидаемый вывод: 1 -> 1 -> 2 -> 3 -> 4 -> 4

        // Example 2
        ListNode list1_2 = null;
        ListNode list2_2 = null;
        ListNode merged2 = solution.mergeTwoLists(list1_2, list2_2);
        System.out.println(merged2 != null ? merged2 : "Список пустой"); // Ожидаемый вывод: пустой список

        // Example 3
        ListNode list1_3 = null;
        ListNode list2_3 = new ListNode(0);
        ListNode merged3 = solution.mergeTwoLists(list1_3, list2_3);
        System.out.println(merged3); // Ожидаемый вывод: 0
    }
}
