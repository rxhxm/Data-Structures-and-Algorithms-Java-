/*
 * Name: Roham Mehrabi
 * PID: A17025640
 */

import java.util.*;

/**
 * TODO
 *
 * @author TODO
 * @since TODO
 */

public class Tasks {

    /**
     * TODO: Question A
     * @param entries
     * @return
     */
    public static boolean raffleChecker(int[] entries) {
        HashSet<Integer> seen = new HashSet<>();
        for (int entry : entries) {
            if (!seen.add(entry)) {
                return true;
            }
        }
        return false; 
    }


    public static class Node {
        Node next;
        String name;
        public Node(String name) {
            this.name = name;
        }
    }

    /**
     * TODO: Question B
     * @param head
     * @return
     */
    public static String middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.name;
    }

    /**
     * TODO: Question C
     * @param newMessage
     * @param oldMessage
     * @return
     */
    public static boolean canConstruct(String newMessage, String oldMessage) {
    int[] charCount = new int[26];
    for (char c : oldMessage.toCharArray()) {
        charCount[c - 'A']++;
    }
    for (char c : newMessage.toCharArray()) {
        if (--charCount[c - 'A'] < 0) {
            return false; 
        }
    }
    return true;
}

    /**TODO:
     * Question D
     * @param buyers
     * @param k
     * @return
     */
    public static String[] frequentCustomers(String[] buyers, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String buyer : buyers) {
            frequencyMap.put(buyer, frequencyMap.getOrDefault(buyer, 0) + 1);
        }
    
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(frequencyMap.entrySet());
    
        String[] result = new String[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }
    
        return result;


}
}
