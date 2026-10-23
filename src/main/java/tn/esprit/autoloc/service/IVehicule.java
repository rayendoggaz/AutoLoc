package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;
import java.util.List;

public interface IVehicule {
    Vehicule addvehicule(Vehicule vehicule);
    void deletevehicule(long id);
    List<Vehicule> retrieveVehicule();
    Vehicule retrieveVehiculeById(long id);
    Vehicule updateVehicule(Vehicule vehicule);
}