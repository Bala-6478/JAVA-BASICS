import java.util.*;

class Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voteage = 18;
        System.out.println("Enter your age:");
        int a = sc.nextInt();

        if (a >= voteage) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        sc.close();
    }
}
