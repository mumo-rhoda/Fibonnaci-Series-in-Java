public class Whileloop {
    public static void main(String[] args) {
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + count + " numbers is :");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfprevTwo = num1+num2;
            num1=num2;
            num2=sumOfprevTwo;
            i++;
        }
    }
}
