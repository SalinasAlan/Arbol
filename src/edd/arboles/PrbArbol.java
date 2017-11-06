/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import edd.listasdobles.AlumnoArbol;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Salinas
 */
public class PrbArbol
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader mLeer = new BufferedReader(new InputStreamReader(System.in));
        Arbol mAr = new Arbol();
        int op;

        do
        {
            System.out.println("\n1. Insertar grupo"
                    + "\n2. Eliminar grupo"
                    + "\n3. Modificar grupo"
                    + "\n4. opciones de grupo"
                    + "\n5. Salir");
            op = Integer.parseInt(mLeer.readLine());
            switch (op)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    int op2;
                    do
                    {
                        System.out.println("\n1. Ingresar alumno"
                                + "\n2. Eliminar Alumno"
                                + "\n3. Modificar Alumno"
                                + "\n4. Lista de alumnos"
                                + "\n5. Regresar al menú principal");
                        op2 = Integer.parseInt(mLeer.readLine());
                        switch (op2)
                        {
                            case 1:
                                System.out.println("Ingrese el nombre del alumno");
                                String mNombre = mLeer.readLine();
                                System.out.println("Ingrese el No. de control");
                                int mNoControl = Integer.parseInt(mLeer.readLine());
                                System.out.println("Ingrese el Grupo");
                                String mGrupo = mLeer.readLine();
                                System.out.println("Ingrese el promedio");
                                int mProm = Integer.parseInt(mLeer.readLine());
                                AlumnoArbol mObj = new AlumnoArbol(mNombre, mProm, mNoControl, mGrupo);
                                NodoArbol mAuxRArb = mAr.getR();
                                mAr.insertarAlumno(mObj, mGrupo, mAuxRArb);
                                break;
                            case 2:
                                if (mAr.getR() != null)
                                {
                                    System.out.println("Ingrese el nombre del alumno a eliminar");
                                    mNombre = mLeer.readLine();
                                    System.out.println("Ingrese el Grupo");
                                    mGrupo = mLeer.readLine();
                                    mAuxRArb = mAr.getR();
                                    mAr.eliminarAlumno(mNombre, mGrupo, mAuxRArb);
                                } else
                                {
                                    System.out.println("No hay grupos");
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre del alumno");
                                mNombre = mLeer.readLine();
                                System.out.println("Ingrese el No. de control");
                                mNoControl = Integer.parseInt(mLeer.readLine());
                                System.out.println("Ingrese el Grupo");
                                mGrupo = mLeer.readLine();
                                System.out.println("Ingrese el promedio");
                                mProm = Integer.parseInt(mLeer.readLine());
                                mAuxRArb = mAr.getR();
                                mAr.modificarAlumno(mNombre, mGrupo, mNoControl, mProm, mAuxRArb);
                                break;
                            case 4:
                                System.out.println("Ingrese el Grupo");
                                mGrupo = mLeer.readLine();
                                mAuxRArb = mAr.getR();
                                mAr.despAlumnos(mGrupo, mAuxRArb);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (op2 != 5);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 5);
    }
}
