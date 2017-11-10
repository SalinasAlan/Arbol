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

    /**
     * Método vacio
     *
     * @return
     */
    public boolean vacio()
    {
        return r == null;
    }

    /**
     * Método recursivo insertar, ingresa un nodo en el árbol
     *
     * @param mNodo es el nodo que se insertará
     * @param mRaiz es la raiz de arbol donde se insertará el nodo
     * @return la raiz del árbol (o el nodo al que se avanzó)
     */
    public NodoArbol insertarNodo(NodoArbol mNodo, NodoArbol mRaiz)
    {
        if (mRaiz == null)
        {
            return mNodo;
        } else
        {
            if (mRaiz.getmGrupo().compareTo(mNodo.getmGrupo()) > 0)
            {
                mRaiz.setmIzq(insertarNodo(mNodo, mRaiz.getmIzq()));
            } else
            {
                mRaiz.setmDer(insertarNodo(mNodo, mRaiz.getmDer()));
            }

            return mRaiz;
        }

    }

    public void enOrden(NodoArbol r)
    {
        if (r != null)
        {
            enOrden(r.getmIzq());
            System.out.print(r.getmGrupo() + "\t");
            enOrden(r.getmDer());
        }
    }

    public void preOrden(NodoArbol r)
    {
        if (r != null)
        {
            System.out.print(r.getmGrupo() + "\t");
            preOrden(r.getmIzq());
            preOrden(r.getmDer());
        }
    }

    public void posOrden(NodoArbol r)
    {
        if (r != null)
        {
            posOrden(r.getmIzq());
            posOrden(r.getmDer());
            System.out.print(r.getmGrupo() + "\t");
        }
    }

    public NodoArbol busquedaDeNodo(String mGrupo, NodoArbol mNodo)
    {
        boolean b = false;
        while (b != true && mNodo != null)
        {
            if (mNodo.getmGrupo().compareTo(mGrupo) == 0)
            {
                b = true;
                return mNodo;
            } else if (mNodo.getmGrupo().compareTo(mGrupo) > 0)
            {
                mNodo = mNodo.getmIzq();
            } else
            {
                mNodo = mNodo.getmDer();
            }
        }
        return null;
    }

    public void insertarAlumno(AlumnoArbol mObj, String mGrupo, NodoArbol mRaiz)
    {
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupo, mRaiz).getmLA();
        mListaAux.insertar(mObj);
    }

    public void eliminarAlumno(String mNombre, String mGrupoE)
    {
        AlumnoArbol mAlumElim;
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupoE, r).getmLA();
        mAlumElim = mListaAux.eliminar(mNombre);
        System.out.println("\nSe elimino a: " + mAlumElim.getmNombre()
                + "\nNo. de control: " + mAlumElim.getmNoControl()
                + "\nGrupo: " + mAlumElim.getmGrupo()
                + "\nPromedio: " + mAlumElim.getmProm());

    }

    public void modificarAlumno(String mNombre, String mGrupo, int mNoControl, int mProm)
    {
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupo, r).getmLA();
        mListaAux.modificar(mNombre, mNoControl, mGrupo, mProm);
    }

    public void despAlumnos(String mGrupo, NodoArbol mRaiz)
    {
        ListaDobleArbol mListaAux = busquedaDeNodo(mGrupo, mRaiz).getmLA();
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
