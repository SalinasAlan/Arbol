/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

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
    private ListaDobleArbol mLA;

    public NodoArbol(String mGrupo)
    {
        this.mGrupo = mGrupo;
        mLA = new ListaDobleArbol();
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

    /**
     * @return the mLA
     */
    public ListaDobleArbol getmLA()
    {
        return mLA;
    }

    /**
     * @param mLA the mLA to set
     */
    public void setmLA(ListaDobleArbol mLA)
    {
        this.mLA = mLA;
    }

    
}
