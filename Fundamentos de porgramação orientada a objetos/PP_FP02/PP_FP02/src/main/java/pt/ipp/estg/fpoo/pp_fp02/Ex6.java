package pt.ipp.estg.fpoo.pp_fp02;

public class Ex6
{



        public static void main(String[] args)
        {
            // array de numeros interiros
            int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
            int[] listaB = {6, 99, -1, 12, 1, -2};

            //a. Unir os dois vetores
            int [] listaunida = new int[listaA.length + listaB.length];

            int proximo = 0;
            for (int i = 0; i < listaA.length; i++)
                listaunida[i] = listaA[i];
            proximo++;

            for (int i = 0; i < listaA.length; i++)
                System.out.print(listaunida[i] = listaA[i]);

            for (int i = 0; i < listaB.length; i++)
                listaunida[i + proximo] = listaB[i];

            for (int i = 0; i < listaB.length; i++)
                System.out.print(listaunida[i] + ",");

            // b. Apresente quantos elementos repetidos existem no vetor criado na alínea a;

            int nrepetidos = 0;
            for(int i=0; i<listaunida.length-1; i++)
                for(int j=i+1; j<listaunida.length; j++)
               if(listaunida[i] == listaunida[j])
               {
                    //contar repetidos
                   nrepetidos++;

               }
            System.out.println("Número de elementos repetidos: " + nrepetidos);


        // c) Preencher um novo vetor com os elementos do vetor “listaA” que não se encontram no vetor “listaB”;
            int[] nãorepetidos = new int[listaA.length];
            int posicao = 0;

        // Iterar sobre listaA
            for (int i = 0; i < listaA.length; i++)
            {
                boolean repetidos = false;
                // Verificar se o elemento de listaA está em listaB
                for (int j = 0; j < listaB.length; j++)
                {
                    if (listaA[i] == listaB[j])
                    {
                        repetidos = true;
                        break; // Termina a verificação assim que encontrar um elemento repetido
                    }
                }

                // Se não está repetido, adiciona ao vetor nãorepetidos
                if (!repetidos)
                {
                    nãorepetidos[posicao] = listaA[i];
                    posicao++;
                }
            }
                // Imprimir os elementos não repetidos
            System.out.print("Elementos de listaA que não estão em listaB: ");
            for (int i = 0; i < posicao; i++)
            {
                System.out.print(nãorepetidos[i] + (i < posicao - 1 ? ", " : "\n"));
            }

            // d. Preencher um novo vetor com os elementos que se encontram simultaneamente nos dois vetores (sem repetidos).
            int[] comuns = new int[Math.min(listaA.length, listaB.length)]; // Vetor para armazenar os elementos comuns
            int indexComuns = 0;

            for (int i = 0; i < listaA.length; i++)
            {
                boolean encontrado = false;
                for (int j = 0; j < listaB.length; j++)
                {
                    if (listaA[i] == listaB[j])
                    {
                        encontrado = true;
                        break; // Encontrou o elemento em listaB, pode parar de procurar
                    }
                }

                if (encontrado)
                {
                    boolean jaInserido = false;
                    // Verificar se o elemento já foi adicionado ao vetor "comuns"
                    for (int k = 0; k < indexComuns; k++)
                    {
                        if (comuns[k] == listaA[i])
                        {
                            jaInserido = true;
                            break;
                        }
                    }

                    // Se o elemento ainda não foi inserido, adicionar ao vetor "comuns"
                    if (!jaInserido)
                    {
                        comuns[indexComuns] = listaA[i];
                        indexComuns++;
                    }
                }
            }

            // Imprimir os elementos comuns sem repetição
            System.out.print("Elementos que estão em ambos os vetores (sem repetidos): ");
            for (int i = 0; i < indexComuns; i++) {
                System.out.print(comuns[i] + (i < indexComuns - 1 ? ", " : "\n"));
            }


        }
}
