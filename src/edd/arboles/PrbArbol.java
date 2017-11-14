/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import edd.listasdobles.AlumnoArbol;
import edd.listasdobles.ListaDobleArbol;
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
                    + "\n4. Desplegar grupos"
                    + "\n5. Opciones de grupo"
                    + "\n6. Salir");
            op = Integer.parseInt(mLeer.readLine());
            switch (op)
            {
                case 1:
                    System.out.println("\nIngrese el nombre del grupo");
                    String mGrupo = mLeer.readLine();
                    NodoArbol mNodoArb = new NodoArbol(mGrupo);
                    if (mAr.vacio() == true)
                    {
                        mAr.setR(mAr.insertarNodo(mNodoArb, mAr.getR()));
                    } else if (mAr.busquedaDeNodo(mGrupo, mAr.getR()) == null)
                    {
                        mAr.setR(mAr.insertarNodo(mNodoArb, mAr.getR()));
                    } else
                    {
                        System.out.println("\nEl grupo ya existe");
                    }
                    break;
                case 2:
                    if (!mAr.vacio())
                    {
                        System.out.println("\nIngrese el grupo a eliminar");
                        mGrupo = mLeer.readLine();
                        if (mAr.busquedaDeNodo(mGrupo, mAr.getR()) != null)
                        {
                            mAr.setR(mAr.elimina(mGrupo, mAr.getR(), mAr));
                            System.out.println("\nGrupo eliminado con éxito");
                        } else
                        {
                            System.out.println("\nEl grupo no existe");
                        }
                    } else
                    {
                        System.out.println("\nNo hay grupos");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    mAr.preOrden(mAr.getR());
                    break;
                case 5:
                    int op2;
                    do
                    {
                        System.out.println("\n1. Ingresar alumno"
                                + "\n2. Eliminar alumno"
                                + "\n3. Modificar alumno"
                                + "\n4. Lista de alumnos"
                                + "\n5. Regresar al menú principal");
                        op2 = Integer.parseInt(mLeer.readLine());
                        switch (op2)
                        {
                            case 1:

                                if (!mAr.vacio())
                                {
                                    System.out.println("\nIngrese el nombre del alumno");
                                    String mNombre = mLeer.readLine();
                                    System.out.println("Ingrese el No. de control");
                                    int mNoControl = Integer.parseInt(mLeer.readLine());
                                    System.out.println("Ingrese el Grupo");
                                    mGrupo = mLeer.readLine();
                                    System.out.println("Ingrese el promedio");
                                    int mProm = Integer.parseInt(mLeer.readLine());
                                    AlumnoArbol mObj = new AlumnoArbol(mNombre, mProm, mNoControl, mGrupo);
                                    NodoArbol mBus = mAr.busquedaDeNodo(mGrupo, mAr.getR());
                                    ListaDobleArbol mLis = mAr.busquedaDeNodo(mGrupo, mAr.getR()).getmLA();
                                    if (!mLis.vacio())
                                    {
                                        if (mAr.buscarAlumEnLista(mNombre, mNoControl, mGrupo, mAr.getR()) != true)
                                        {
                                            mAr.insertarAlumno(mObj, mGrupo, mAr.getR());
                                        } else
                                        {
                                            System.out.println("\nEl alumno ya existe");
                                        }
                                    } else
                                    {
                                        mAr.insertarAlumno(mObj, mGrupo, mAr.getR());
                                    }
                                } else
                                {
                                    System.out.println("\nNo hay grupos"
                                            + "\nInserte un grupo");
                                }

                                break;
                            case 2:
                                if (!mAr.vacio())
                                {
                                    System.out.println("\nIngrese el nombre del alumno a eliminar");
                                    String mNombre = mLeer.readLine();
                                    System.out.println("Ingrese el no. de control");
                                    int mNoControl = Integer.parseInt(mLeer.readLine());
                                    System.out.println("Ingrese el Grupo");
                                    mGrupo = mLeer.readLine();
                                    NodoArbol mBus = mAr.busquedaDeNodo(mGrupo, mAr.getR());
                                    if (mBus != null)
                                    {
                                        if (mAr.buscarAlumEnLista(mNombre, mNoControl, mGrupo, mAr.getR()) == true)
                                        {
                                            mAr.eliminarAlumno(mNombre, mGrupo);
                                            System.out.println("\nAlumno eliminado con éxito");
                                        } else
                                        {
                                            System.out.println("\nNo existe el alumno");
                                        }
                                    } else
                                    {
                                        System.out.println("\nNo exite el grupo");
                                    }
                                } else
                                {
                                    System.out.println("\nNo hay grupos");
                                }
                                break;
                            case 3:
                                System.out.println("\nIngrese el nombre del alumno");
                                String mNombre = mLeer.readLine();
                                System.out.println("Ingrese el No. de control");
                                int mNoControl = Integer.parseInt(mLeer.readLine());
                                System.out.println("Ingrese el Grupo");
                                mGrupo = mLeer.readLine();
                                System.out.println("Ingrese el promedio");
                                int mProm = Integer.parseInt(mLeer.readLine());
                                mAr.modificarAlumno(mNombre, mGrupo, mNoControl, mProm);
                                break;
                            case 4:
                                System.out.println("\nIngrese el Grupo");
                                mGrupo = mLeer.readLine();
                                NodoArbol mBusqueda = mAr.busquedaDeNodo(mGrupo, mAr.getR());
                                if (!mBusqueda.getmLA().vacio())
                                {
                                    mAr.despAlumnos(mGrupo, mAr.getR());
                                } else
                                {
                                    System.out.println("\nNo hay alumnos");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (op2 != 5);
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 6);
    }
}
