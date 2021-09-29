import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String s = scnr.next();
        Long n = scnr.nextLong();

        System.out.println(sums(s,n));
    }

    public static String sums(String s, long n) {
        int length = s.length();
        for(int i = 1; i < length; i++) {
                Long left = Long.parseLong(s.substring(0,i));
                Long right = Long.parseLong(s.substring(i));

                if(left + right == n) 
                        return left.toString() + "+" + right.toString();

                if(left < n && !sums(right.toString(), n-left).equals("false"))
                        return left.toString() + "+" + sums(right.toString(), n-left);
        }
        return "false";
    }
}