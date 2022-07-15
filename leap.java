import java.util.*;

class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year_1;
        System.out.println("enter the leap ");
        year_1 = sc.nextInt();
        if (year_1 % 4 == 0) {
            System.out.println("leap year");
        }

    }
}