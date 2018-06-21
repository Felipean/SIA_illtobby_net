/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author felip
 */
public class Datos {
    private Usuario misUsuarios[] = new Usuario[50];
    private int conUsu = 0;
    
    public Datos()
    {
        Usuario miUsuario = new Usuario("zulu", "Felipe Andres", "Campos Torrejon", "123", 1);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
    }
    
    public Usuario[] getUsuarios()
    {
        return misUsuarios;
    }
    
    
    public boolean validarUsuario(String usuario, String clave)
    {
        boolean aux = false;
        for(int i=0;i<conUsu;i++)
        {
            if(misUsuarios[i].getIdUsuario().equals(usuario) && misUsuarios[i].getClave().equals(clave))
            {
                return true;
            }
        }
        return false;
    }
}
