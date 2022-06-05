import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int count , num1 = 0, num2 = 1;
        System.out.print("How many numbers do you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        System.out.print("Fibonacci Series of number " + count + " numbers is :");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfprevTwo = num1 + num2;
            num1=num2;
            num2=sumOfprevTwo;
            i++;
        }

}
}
