
package com.mycompany.concesionariaautos.logica;

import com.mycompany.concesionariaautos.persistencia.ControladoraPersistencia;
import com.mycompany.concesionariaautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraLogica {
    //Instanciamos a nuestra controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String modelo, String marca, String color, String motor, String placa, String carac, int puertas) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setCaracteristicas(carac);
        auto.setCantPuertas(puertas);
        
        controlPersis.guardar(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public Automovil traerUnAuto(int id_auto) {
        return controlPersis.traerUnAuto(id_auto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String color, String motor, String placa, String carac, int puertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setCantPuertas(puertas);
        auto.setCaracteristicas(carac);
        
        controlPersis.modificarAuto(auto);
    }

    public void borrarAuto(int num_cliente) {
        controlPersis.borrarAuto(num_cliente);
    }

    
    
    
}
