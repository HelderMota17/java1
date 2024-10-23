package pt.ipp.estg.fpoo.pp_fp02;

public class Ex5 {
    public class Ex1
    {

        public static void main(String[] args)
        {
            if (args.length == 2)
            {
                String nome = args[0];
                String apelido = args[1];

                System.out.println("Apelido: " + apelido + " Nome: " + nome);
            }
            else
            {
                System.out.println("Por favor, forneça o ultimo nome ");
            }
        }
    }
}