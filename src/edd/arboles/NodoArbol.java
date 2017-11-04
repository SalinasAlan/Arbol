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

    public void insertAlumno(AlumnoArbol mObj)
    {
        mLA.insertar(mObj);
    }

    

}
