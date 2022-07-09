import java.util.*;

// Приоритетные коллекции

public class Lection3 {
    // LinkedList - двусвязный список
    // Queue - First input first output
    // PriorityQueue - Наивысший приоритет имеет наименьший жлемент
    // Dequeue
    // Stack
    public static void main(String[] args) {

        // LinkedList<Integer> ll = new LinkedList<Integer>();

        // ll.add(1);
        // ll.add(2);
        // ll.add(3);

        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // pq.add(123);
        // pq.add(3);
        // pq.add(13);

        // System.out.println(pq);
        // System.out.println(pq);

        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }

    public static boolean isDigit(String string) {
        return false;
    }

}
