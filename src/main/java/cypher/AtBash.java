package cypher;

import java.util.Scanner;

public class AtBash {

    static String encrypt(String pt) {
        int a;
        int i;
        char ch;
        char[] encrypt1 = pt.toCharArray();
        for (i = 0; i < pt.length(); i++) {
            if (Character.isUpperCase(pt.charAt(i))) {
                a = encrypt1[i];
                a = 91 - (a - 64);
                ch = (char) a;
                encrypt1[i] = ch;
            } else if (Character.isLowerCase(pt.charAt(i))) {
                a = encrypt1[i];
                a = 123 - (a - 96);
                ch = (char) a;
                encrypt1[i] = ch;
            } else {
                a = encrypt1[i];
                ch = (char) a;
                encrypt1[i] = ch;
            }
        }
        return new String(encrypt1);
    }

    public static void main(String[] args) {
        String pt;
        String encrypt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Text:");
        pt=scanner.nextLine();

        encrypt = encrypt(pt);
        System.out.println("Encrypted Text: ");
        System.out.println(encrypt);
    }

}
