public class Main {
    public static void main(String[] args) {
        // Пример использования класса ListNode
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        
        // Пример использования класса Solution
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(node1, node2);
        
        // Вывод результата
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
