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
public class NodoArbol
{

    private String mGrupo;
    private NodoArbol mIzq;
    private NodoArbol mDer;
    ListaDobleArbol mLA = new ListaDobleArbol();

    public NodoArbol(String mGrupo)
    {
        this.mGrupo = mGrupo;
        this.mIzq = null;
        this.mDer = null;
    }

    /**
     * @return the mGrupo
     */
    public String getmGrupo()
    {
        return mGrupo;
    }

    /**
     * @param mGrupo the mGrupo to set
     */
    public void setmGrupo(String mGrupo)
    {
        this.mGrupo = mGrupo;
    }

    /**
     * @return the mIzq
     */
    public NodoArbol getmIzq()
    {
        return mIzq;
    }

    /**
     * @param mIzq the mIzq to set
     */
    public void setmIzq(NodoArbol mIzq)
    {
        this.mIzq = mIzq;
    }

    /**
     * @return the mDer
     */
    public NodoArbol getmDer()
    {
        return mDer;
    }

    /**
     * @param mDer the mDer to set
     */
    public void setmDer(NodoArbol mDer)
    {
        this.mDer = mDer;
    }

    public void insertarAlumno(AlumnoArbol mObj)
    {
        mLA.insertar(mObj);
    }

    public void eliminar(String mNombre, String mGrupoE)
    {
        AlumnoArbol mAlumElim;
        if (mGrupo.compareTo(mGrupoE) == 0)
        {
            mAlumElim = mLA.eliminar(mNombre);
            System.out.println("\nSe elimino a: " + mAlumElim.getmNombre()
                    + "\nNo. de control: " + mAlumElim.getmNoControl()
                    + "\nGrupo: " + mAlumElim.getmGrupo()
                    + "\nPromedio: " + mAlumElim.getmProm());
        }
    }

    public void modificar(String mNombre, int mNoControl)
    {
        mLA.modificar(mNombre, mNoControl);
    }

    public void desp()
    {
        AlumnoArbol aux = mLA.getmInicio();
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
