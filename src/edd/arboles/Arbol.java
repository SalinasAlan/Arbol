/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import edd.listasdobles.AlumnoArbol;
import edd.listasdobles.ListaDobleArbol;

/**
 *
 * @author Salinas
 */
public class Arbol
{

    private NodoArbol r;

    public Arbol()
    {
        this.r = null;
    }

    /**
     * @return the r
     */
    public NodoArbol getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    public void insertNodo(NodoArbol mNodo)
    {
        if (mNodo == null)
        {

        }
    }
    
    public NodoArbol busquedaDeNodo(String mGrupo, NodoArbol mNodo)
    {
        if (mNodo != null)
        {
            if (mNodo.getmGrupo().compareTo(mGrupo) == 0)
            {
                busquedaDeNodo(mGrupo, mNodo.getmIzq());
                busquedaDeNodo(mGrupo, mNodo.getmDer());
            }
            return mNodo;
        }
        return null;
    }

    public void insertarAlumno(AlumnoArbol mObj, String mGrupo, NodoArbol mNodo)
    {
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupo, mNodo).getmLA();
        mListaAux.insertar(mObj);
    }

    public void eliminarAlumno(String mNombre, String mGrupoE, NodoArbol mNodo)
    {
        AlumnoArbol mAlumElim;
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupoE, mNodo).getmLA();
        mAlumElim = mListaAux.eliminar(mNombre);
        System.out.println("\nSe elimino a: " + mAlumElim.getmNombre()
                + "\nNo. de control: " + mAlumElim.getmNoControl()
                + "\nGrupo: " + mAlumElim.getmGrupo()
                + "\nPromedio: " + mAlumElim.getmProm());

    }

    public void modificarAlumno(String mNombre, String mGrupo, int mNoControl, int mProm, NodoArbol mNodo)
    {
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupo, mNodo).getmLA();
        mListaAux.modificar(mNombre, mNoControl, mGrupo, mProm);
    }

    public void despAlumnos(String mGrupo, NodoArbol mNodo)
    {
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupo, mNodo).getmLA();
        AlumnoArbol aux = mListaAux.getmInicio();
        while (aux != null)
        {

            System.out.println("\n Nombre del alumno: " + aux.getmNombre()
                    + "\n No. de control: " + aux.getmNoControl()
                    + "\n Grupo: " + aux.getmGrupo()
                    + "\n Promedio: " + aux.getmProm());
            aux = aux.getmSigLA();
        }
    }

}
