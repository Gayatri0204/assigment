import java.time.Year;
import java.util.*;

class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year;
        System.out.println("enter the leap ");
        Year = sc.nextInt();
        if (Year % 4 == 0) {
            System.out.println("leap year");
        }

    }
}