/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pt.ipp.estg.fpoo.pp_fp04;

/**
 *
 * @author helde
 */
public class main 
{
    static User user1;

    public static void main(String[] args) 
    {
        User user1 = null;

        // Inicializar o ID
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';

        // Inicializar o nome
        user1.name = new char[] {'B', 'r', 'u', 'n', 'o'};

        // Inicializar o email
        user1.email = new char[] {'b', 'm', 'o', '@', 'e', 's', 't', 
                                  'f', '.', 'i', 'p', 'p', '.', 't'};

        // Imprimir os atributos
        System.out.println("------User 1------");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);

        // ex2.2 Associe as despesas ao utilizador criado no exercício 1. De seguida e utilizando uma outra classe com
        //um método main, inicialize e imprima os valores do utilizador e as suas despesas


    }
}
