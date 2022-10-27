import java.util.Scanner;

public class U4L1Runner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();

        /* complete me! */
        int halving = 0;
        while (userNumber > 1)
        {
            userNumber /= 2;
            System.out.println(userNumber);
            halving++;
        }
        if (halving == 1)
        {
            System.out.println("There is " + halving + " halving to get to 1.");
        }
        else
        {
            System.out.println("There are " + halving + " halvings to get to 1.");
        }
    }
}
