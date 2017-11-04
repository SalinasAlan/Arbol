/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arboles;

import edd.listas.Alumno;

/**
 *
 * @author Salinas
 */
public class AlumnoArbol extends Alumno
{
 
    private String mGrupo;
    
    public AlumnoArbol(String mNombre, int mProm, int mNoControl)
    {
        super(mNombre, mProm, mNoControl);
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
    
    
}
