/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2.pkg1;

/**
 *
 * @author Usuario
 */
public class FuncionesUsuario {

    public int calculoDeImp(Usuario u) {
        int retorno = 0;
        if (u.getEdad() > 17 && u.getEdad() < 31) {
            if (u.getCantHijos() * 0.3 > 1000) {
                retorno = 1000;
            } else {
                retorno = (int) (2000 - (u.getCantHijos() * 0.3));
            }
        } else {
            if (u.getEdad() > 29 && u.getEdad() < 66) {
                if (u.getCantHijos() * 0.3 > 3500) {
                    retorno = 3500;
                } else {
                    retorno = (int) (7000 - (u.getCantHijos() * 0.3));
                }
            } else {
                if (u.getEdad() > 64) {
                    if (u.getCantHijos() * 0.3 > 1000) {
                        retorno = 1000;
                    } else {
                        retorno = (int) (2000 - (u.getCantHijos() * 0.3));
                    }
                }
            }
        }
        return retorno;
    }
    
}
