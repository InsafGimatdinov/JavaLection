
/**
 * Program
 * Lection1
 */
// import java.util.Scanner; // Для того чтобы брать данные от поьзователя
// import java.io.BufferedReader;
// import java.io.FileReader;
// // import java.io.FileWriter;
// import java.io.IOException;


// public class Program1 {

    // public static void main(String[] args) {
    // public static void main(String[] args) throws IOException { // Для считывания файла
        // System.out.println("Hello world!");

        // String s = null;
        // System.out.println(s);

        // short age = 10;
        // int salary = 23141123;
        // System.out.println(age); // 10
        // System.out.println(salary); // 23141123

        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e); // 2.7
        // System.out.println(pi); // 3.1415

        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false

        // String msg = "Hello world!";
        // System.out.println(msg); // "Hello world!"

        // var i = 123;
        // System.out.println(i); // 123
        // var d = 123.756;
        // System.out.println(d); // 123.756
        // var ch = 'a';
        // System.out.println(ch); // 123.756
        // System.out.println(getType(i)); // integer
        // System.out.println(getType(d)); // double
        // System.out.println(getType(ch)); // character
        // }
        // static String getType(Object o) {
        // return o.getClass().getSimpleName();
        // }

        // int i = 123;
        // System.out.println("Max value " + Integer.MIN_VALUE);
        // System.out.println("Max value " + Integer.MAX_VALUE);

        // String s = "qwer";
        // System.err.println(s.charAt(1));

        // int a = 123;
        // a++;a
        // System.out.println(a); // 124
        // System.err.println(a++); // 123

        // int a = 5;
        // a = --a - a--;
        // System.out.println(a); // 0

        // boolean f = 123 <= 234;
        // System.out.println(f);

        // int a = 8;
        // // 1000
        // a = a << 1;
        // System.out.println(a); // 16 или 10000

        // int a = 5; // 101 101 101
        // int b = 2; // 010 010 010
        // // 111 000 111
        // System.out.println(a | b); // 7
        // System.out.println(a & b); // 0
        // System.out.println(a ^ b); // 7

        // String a = "qwe1"; //
        // // boolean b = a.length() >= 5 && a.charAt(4) == '1';
        // boolean b = a.length() >= 5 & a.charAt(4) == '1';

        // System.out.println(b); // true

        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        // System.out.println(arr1.length); // 7
        // arr[2] = 2;
        // System.out.println(arr[2]); // 2

        // int[] arr[] = new int[5][5];
        // for (int[] line : arr) {
        // for (int item : line) {
        // System.out.printf("%d ", +item);
        // }
        // System.out.println();
        // }
        // int[][] arr = new int[3][3];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = (int) (Math.random() * 10);
        // System.out.printf("%d ", +arr[i][j]);
        // }
        // System.out.println();
        // }

        // int i = 123;
        // double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.12532;
        // i = (int) d;
        // System.out.println(d); // 3.12532
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("123345");
        // System.out.println(b); // Error переполнение типов

        // int[] a = new int[10];
        // double[] d = a; // Не можем массив целых чисел положить в массив
        // вещественных.

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %S!", name);
        // iScanner.close();
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // int a = 10, b = 40;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);
        // String s = "qwe";
        // int a = 123;
        // String q = s + a;
        // System.out.println(q);

        // int a = 10, b = 40;
        // int c = a + b;
        // String res = String.format("%d + %d = %d\n", a, b, c);
        // System.out.printf("%d + %d = %d\n", a, b, c);
        // System.out.println(res);

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3.141500
        // System.out.printf("%.2f\n", pi); // 3.14
        // System.out.printf("%.3f\n", pi); // 3.141
        // System.out.printf("%f\n", pi); // 3.141500
        // System.out.printf("%e\n", pi); // 3.141500e+00
        // System.out.printf("%.3e\n", pi); // 3.14e+00

        // {
        // int a = 222;
        // System.out.println(a);
        // }
        // int a = 132;
        // System.out.println(a);

        // lib.sayHi();
        // System.out.println(lib.sum(2, 3));
        // System.out.println(lib.factor(5));

        // int a = 1;
        // int b = 2;
        // int c;
        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
        // }
        // System.out.println(c);

        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b;
        // System.out.println(min);

        // int mounth = value;
        // String text = "";
        // switch (mounth) {
        // case 1:
        // text = "Autumn";
        // break;
        // case 2:
        // text = "Winter";
        // break;
        // case 3:
        // text = "Spring";
        // break;
        // case 4:
        // text = "Summer";
        // break;
        // default:
        // text = "Mistake";
        // break;
        // }
        // System.out.println(text);
        // iScanner.close();
        // int a = 123;
        // switch (a) {
        // case 1:
        // System.out.println('a');
        // break;
        // case 2:
        // System.out.println('b');
        // break;
        // case 123:
        // System.out.println('c');
        // break;
        // }

        // int value = 321;
        // int count = 0;
        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);

        // for (int i = 0; i < 10; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.print(i);
        // }

        // int s = 0;
        // for (int i = 0; i <= 10; i++) {
        // s += i;
        // }
        // System.out.println(s);

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("+ ");
        // }
        // System.out.println();
        // }

        // int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // for (int item : arr) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
        // System.out.println(arr[5]);

        // try (FileWriter fw = new FileWriter("file.txt", false)) {
        // fw.write("line 1");
        // fw.append('\n');
        // fw.append('2');
        // fw.append('\n');
        // fw.write("line 2");
        // fw.flush();
        // } catch (IOException ex) {
        // System.out.println(ex.getMessage());
        // }

        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        // char ch = (char) c;
        // if (ch == '\n') {
        // System.out.print(ch);
        // } else {
        // System.out.print(ch);
        // }
        // }

//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }
