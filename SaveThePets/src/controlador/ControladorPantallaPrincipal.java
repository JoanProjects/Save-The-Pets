package controlador;

import vista.PantallaPrincipal;
import vista.AcercaDe;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import vista.FormMascotas;
import vista.LoginV;

/**
 *
 * @author WilfredoFC
 */
public class ControladorPantallaPrincipal implements MouseListener {
    PantallaPrincipal pl = new PantallaPrincipal();
    AcercaDe ad = new AcercaDe();

    public ControladorPantallaPrincipal(PantallaPrincipal pp) {
        this.pl = pp;
        this.pl.lblMascotas.addMouseListener(this);
        this.pl.lblAcercaDe.addMouseListener(this);
        this.pl.ImgSalir.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Validando si se presiono la tecla de ingreso
        if (e.getSource() == pl.lblMascotas) {
            FormMascotas v = new FormMascotas();
            ControladorMascotas control = new ControladorMascotas(v);
            v.setVisible(true);
            v.setLocationRelativeTo(null);
        }
        //Validando si se presiono la tecla de cancelar
        if (e.getSource() == pl.lblAcercaDe) {
            AcercaDe v = new AcercaDe();
            v.setVisible(true);
            v.setLocationRelativeTo(null);
        }
        
        if (e.getSource() == pl.ImgSalir) {
            LoginV v = new LoginV();
            ControladorLogin control = new ControladorLogin(v);
            v.setVisible(true);
            pl.dispose();
            v.setLocationRelativeTo(null);
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent arg0) {}

    @Override
    public void mouseExited(MouseEvent arg0) {}

    @Override
    public void mousePressed(MouseEvent arg0) {}

    @Override
    public void mouseReleased(MouseEvent arg0) {}  
}
