import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        // ver se o numero é par ou impar
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Digite um numeroa: ");
        a = sc.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("É par:");
        }
        else
        {
            System.out.println("É impar");
        }

    }
}
