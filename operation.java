import java.util.*;

class operation {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int no, no1, ch;
        System.out.println("enter the two no");

        no = sc.nextInt();
        no1 = sc.nextInt();
        System.out.println("enter the choice");
        ch = sc.nextInt();
        double ans;

        switch (ch) {
            case 1:
                ans = no + no1;
                System.out.println("addition" + ans);
                break;
            case 2:
                ans = no - no1;
                System.out.println("subtraction" + ans);
                break;
            case 3:
                ans = no * no1;
                System.out.println("multiplication" + ans);
                break;
            case 4:
                ans = no / no1;
                System.out.println("division" + ans);
                break;
            default:
                System.out.println("please select no from 1 to 4");
        }

    }
}