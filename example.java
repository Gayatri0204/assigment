import java.util.*;

public class example {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int no_1;
        System.out.println("enter the no");
        no_1 = sc.nextInt();
        if (no_1 % 2 == 0) {
            System.out.println("even no");

        } else {
            System.out.println(" not even no");
        }
    }
}