package practica_proyecto;

import frames.ini;
import frames.menuPrincipal;
import frames.inicioSesion;

public class Practica_proyecto {

    public static void main(String[] args) {
        ini frame1 = new ini();
        menuPrincipal frame2 = new menuPrincipal();

        frame1.setLocationRelativeTo(null);
        frame1.setTitle("Iniciar sesión");
        frame1.getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        frame1.setVisible(true);
    }

}
