import java.util.Iterator;
import java.util.List;

public class Program3 {
    // public static void main(String[] args) {
    // Object o = 1; GetType(o);
    // o = 1.2; GetType(o);
    // }
    // static void GetType(Object obj) {
    // System.out.println(obj.getClass().getName());

    // System.out.println(Sum(1,2));
    // System.out.println(Sum(1.0, 2));
    // System.out.println(Sum(2, 1.2));
    // System.out.println(Sum(1.2, 2.0));
    // }
    // static Object Sum(Object a, Object b) {
    // if (a instanceof Double && b instanceof Double) {
    // return (Object)((Double) a + (Double) b);
    // } else if (a instanceof Integer && b instanceof Integer) {
    // return (Object)((Integer) a + (Integer) b);
    // } else {
    // return 0;
    // }
    // int[] a = new int[] {1, 9};
    // int[] b = new int[3];
    // System.arraycopy(a, 0, b, 0, a.length);
    // for (int i : a) {
    // System.out.printf("%d", i);
    // }
    // for (int j : b) {
    // System.out.printf("%d", j);
    // }
    // static int[] AddItem(int[] array, int item) {
    // int length = array.length;
    // int[] temp = new int[length + 1];
    // System.arraycopy(array, 0, temp, 0, length);
    // temp[length] = item;
    // return temp;
    // }
    // public static void main(String[] args) {
    // int[] a = new int[] {0, 9};
    // for (int i : a) {
    // System.out.printf("%d", i);
    // }
    // a = AddItem(a, 2);
    // a = AddItem(a, 3);
    // for (int j : a) {
    // System.out.printf("%d", j);
    // }
    // }
    // public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<Integer>();
    // list.add(2809);
    // for (Object o : list) {
    // System.out.println(o);
    // }
    // }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();
        while (col.hasNext()) {
            System.out.println(col.next());
            // col.next();
            // col.remove();
        }
    }
}
