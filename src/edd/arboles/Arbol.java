/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import edd.listasdobles.AlumnoArbol;

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

}
