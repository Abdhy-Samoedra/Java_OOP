package Session2;

public class practice {

    public static void main(String[] args) {
        Integer a = 7;
        int b = Integer.MAX_VALUE;
        String str = new String("hello wolrd");

        System.out.println(Math.abs(a));
        System.out.println(Math.floor(Math.random() * 10));
        System.out.println(Math.floor(500 + Math.random() * 501));

        System.out.println(str == "hello world");
        // false karena secara objek ini merupakan objek yang berbeda

        System.out.println(str.equals("hello wolrd"));

        String c[] = str.split(" ");
        System.out.println(c[0]);

        System.out.println(str.toUpperCase());

        System.out.println(str.contains("ed"));
        System.out.println(str.contains("ll"));
        System.out.println(str.contains("LL"));

        char kata[] = str.toCharArray();
        kata[5] = 'W';
        System.out.println(kata);

    }
}
