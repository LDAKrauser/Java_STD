import java.util.Scanner;

public class NumberIsPrime
{
    public static void main(String[] args)
    {
        int i = 2;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            CheckNumber(number,i);

    }
    public static void CheckNumber(int number, int i)
    {
        if (number > 1)
        {
            if (number % i != 0)
            {
                i++;
                CheckNumber(number, i);
            }
            else if (number % i == 0)
            {
                printNumber(number,i);
            }
        }
        else
        {
            printNumber(number,1);
        }

    }
    public static void printNumber (int number,int i)
    {
        if (number == i) {
            System.out.println("Number is prime");

        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}