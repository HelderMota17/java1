import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;

        //Ver se os numeros são multiplos
        System.out.println("Numero A:");
        System.out.println("numeroB");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0)
        {
            System.out.println("São Multiplos");

        }
        else
        {
            System.out.println("Não são multiplos ");
        }
        sc.close();

    }
}
