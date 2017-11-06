/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Salinas
 */
public class PrbArbol
{

    public static void main(String[] args)
    {
        BufferedReader mLeer = new BufferedReader(new InputStreamReader(System.in));
        Arbol mAr = new Arbol();
        int op = 0;

        do
        {
            System.out.println("\n1. Insertar grupo"
                    + "\n2. Eliminar grupo"
                    + "\n3. Modificar grupo");
            switch (op)
            {
                case 1:
                case 2:
                case 3:
            }
        } while (op != 4);
    }
}
