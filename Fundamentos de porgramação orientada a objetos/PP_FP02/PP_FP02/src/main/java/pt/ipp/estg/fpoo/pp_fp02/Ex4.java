package pt.ipp.estg.fpoo.pp_fp02;

public class Ex4
{
    public static void main(String[] args)
    {
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int x = 0;

        // a. O nome e o apelido no formato: Apelido, Nome;
        while (x < nome.length && nome[x] != '\n')
        {
            x++;
        }

        // Imprime o sobrenome primeiro
        for (int i = x + 1; i < nome.length - 1; i++)
        {
            System.out.print(nome[i]);
        }
        System.out.print(", ");

        // Imprime o nome
        for (int i = 0; i < x; i++)
        {
            System.out.print(nome[i]);
        }
        System.out.println();

        // b. O número de vogais e consoantes;
        int vogais = 0, consoantes = 0;
        for (int i = 0; i < nome.length - 1; i++)
        {
            if (nome[i] == 'a' || nome[i] == 'e' || nome[i] == 'i' || nome[i] == 'o' || nome[i] == 'u' ||
                    nome[i] == 'A' || nome[i] == 'E' || nome[i] == 'I' || nome[i] == 'O' || nome[i] == 'U')
            {
                vogais++;
            } else if (Character.isLetter(nome[i]) && nome[i] != ' ')
            {
                consoantes++;
            }
        }

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
    }
}


