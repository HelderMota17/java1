package pt.ipp.estg.fpoo.pp_fp04;

public class ex2
{
    static User user1;
    public static void main(String[] args)
    {
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';

        user1.name = new char[] {'B', 'r', 'u', 'n', 'o'};

        // Inicializar o email
        user1.email = new char[] {'b', 'm', 'o', '@', 'e', 's', 't',
                'f', '.', 'i', 'p', 'p', '.', 't'};

        user1.despesas = new Expenses();
        //inserir valorea de despesas


    }
}
