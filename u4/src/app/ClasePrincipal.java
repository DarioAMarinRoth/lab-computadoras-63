package app;

import modelos.Usuario;
import modelos.Usuario.*;

public class ClasePrincipal {
    public static void main(String[] args) {
        Usuario miUsuario = new Usuario();
        Usuario otroUsuario = new Usuario();
        Usuario otroUsuario2 = new Usuario();
        Usuario otroUsuario3 = new Usuario();

        System.out.println(miUsuario.getID());
        System.out.println(otroUsuario.getID());
        System.out.println(otroUsuario2.getID());
        System.out.println(otroUsuario3.getID());

        System.out.println(Usuario.getContadorUsuarios());

    }
}
