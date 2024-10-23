import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exemplo1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 5, hora;

        //Perguntar as horas
        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora <= 12 )
        {
            System.out.println("Bom dia");

        }
        else
        {
            System.out.println("Boa tarde");
        }


    }
}