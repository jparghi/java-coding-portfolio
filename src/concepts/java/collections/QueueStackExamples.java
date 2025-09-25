import java.util.*;

public class QueueStackExamples {
    public static boolean validParentheses(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c=='('||c=='{'||c=='[') st.push(c);
            else {
                if (st.isEmpty()) return false;
                char o = st.pop();
                if ((o=='('&&c!=')')||(o=='{'&&c!='}')||(o=='['&&c!=']')) return false;
            }
        }
        return st.isEmpty();
    }

    public static List<Integer> kSmallest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int v: a) pq.offer(v);
        List<Integer> out = new ArrayList<>();
        for (int i=0;i<k && !pq.isEmpty();i++) out.add(pq.poll());
        return out;
    }

    public static void main(String[] args) {
        System.out.println(validParentheses("{[()]}"));
        System.out.println(kSmallest(new int[]{5,1,9,2,6,3}, 3));
    }
}
