
package com.mycompany.concesionariaautos.gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class ControllerBotonesModificar implements MouseListener{
    //Instanciasmos la interfaz gráfica
    public final ModicarDatos view;
    
    
    public final void events(){
        view.btnAgregar.addMouseListener(this);
        view.btnLimpiar.addMouseListener(this);
        view.btnRegresar.addMouseListener(this);
    }
    
    //Constructor
    public ControllerBotonesModificar(ModicarDatos view) {
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
        
        if (evt.equals(view.btnAgregar)){
            changeBackground(view.ContainerBtnAgregar, new Color(60,226,46));
        }else if(evt.equals(view.btnLimpiar)){
            changeBackground(view.ContainerBtnLimpiar, new Color(240,215,64));
        }else if(evt.equals(view.btnRegresar)){
            changeBackground(view.ContainerBtnRegresar, new Color(184,63,227));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
       Object evt = e.getSource();
        
        if (evt.equals(view.btnAgregar)){
            changeBackground(view.ContainerBtnAgregar, new Color(60,173,98));
        }else if(evt.equals(view.btnLimpiar)){
            changeBackground(view.ContainerBtnLimpiar, new Color(211,176,64));
        }else if(evt.equals(view.btnRegresar)){
            changeBackground(view.ContainerBtnRegresar, new Color(144,44,149));
        }
    }
    
    
    private void changeBackground(JPanel panel, Color color){
        panel.setBackground(color);
    }
}
