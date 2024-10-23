import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o numero:");

        int n = sc.nextInt();

        if (n >= 0)
        {
            System.out.println("Não negativo");
        }
        else
        {
            System.out.println("negativo");
        }
    }

}
