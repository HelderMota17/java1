/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.fpoo.pp_fp04;

/**
 * <h3>
 * ESTGF – Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP – Instituto Politécnico do Porto <br>
 * LEI – Licenciatura em Engenharia Informática<br>
 * PP – Paradigmas de Programação / Programming Paradigms<br>
 * </h3>
 * <p>
 * <strong>Description: </strong><br>
 * Class that represents the user structure
 * </p>
 */
public class User {
    private static final int ID_SIZE = 3;
    protected static char[] id = new char[ID_SIZE];
    protected static char[] name;
    protected static char[] email;
    Expenses despesas = new Expenses();
}

