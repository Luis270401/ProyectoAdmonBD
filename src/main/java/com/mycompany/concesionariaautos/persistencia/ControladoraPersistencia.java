
package com.mycompany.concesionariaautos.persistencia;

import com.mycompany.concesionariaautos.logica.Automovil;
import com.mycompany.concesionariaautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    //Instanciasmos a nuestro JpaController
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void guardar(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

    public Automovil traerUnAuto(int id_auto) {
        return autoJpa.findAutomovil(id_auto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarAuto(int num_cliente) {
        try {
            autoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
