
package com.mycompany.concesionariaautos.gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class ControladoraBotones implements MouseListener{
    //Instanciasmos la interfaz gráfica
    public final MenuPrincipal view;
    
    
    public final void events(){
        view.btnAltaAutos.addMouseListener(this);
        view.btnModificar.addMouseListener(this);
        view.btnSalir.addMouseListener(this);
    }
    
    //Constructor
    public ControladoraBotones(MenuPrincipal view) {
        this.view = view;
        events();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();
        
        if (evt.equals(view.btnAltaAutos)){
            changeBackground(view.ContainerBtnAlta, new Color(229,137,35));
        }else if(evt.equals(view.btnModificar)){
            changeBackground(view.ContainerBtnCeb, new Color(229,137,35));
        }else if(evt.equals(view.btnSalir)){
            changeBackground(view.ContainerBtnSalir, new Color(102,107,109));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
       Object evt = e.getSource();
        
        if (evt.equals(view.btnAltaAutos)){
            changeBackground(view.ContainerBtnAlta, new Color(229,173,61));
        }else if(evt.equals(view.btnModificar)){
            changeBackground(view.ContainerBtnCeb, new Color(229,173,61));
        }else if(evt.equals(view.btnSalir)){
            changeBackground(view.ContainerBtnSalir, new Color(144,157,162));
        }
    }
    
    
    private void changeBackground(JPanel panel, Color color){
        panel.setBackground(color);
    }
    
    
}
