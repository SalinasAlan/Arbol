/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import edd.listas.ListaDoble;

/**
 *
 * @author Salinas
 */
public class NodoArbol
{
    private String mGrupo;
    private ListaDoble mLD = new ListaDoble();
    private NodoArbol mIzq;
    private NodoArbol mDer;

    public NodoArbol(String mGrupo, ListaDoble mLD)
    {
        this.mGrupo = mGrupo;
        this.mLD = mLD;
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
     * @return the mLD
     */
    public ListaDoble getmLD()
    {
        return mLD;
    }

    /**
     * @param mLD the mLD to set
     */
    public void setmLD(ListaDoble mLD)
    {
        this.mLD = mLD;
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
    
    
}
