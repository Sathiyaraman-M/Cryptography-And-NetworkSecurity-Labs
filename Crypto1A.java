import java.util.*;

public class Crypto1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        int shift = sc.nextInt();
        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i);
            ch -= 97;
            ch += shift;
            if (ch >= 26)
                ch = ch % 26;
            char c = (char) ch;
            System.out.print(c);
        }
        sc.close();
    }
}