package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;
import java.util.List;

public interface IEquipement {
    Equipement addequipement(Equipement equipement);
    void deleteequipement(long id);
    List<Equipement> retrieveEquipement();
    Equipement retrieveEquipementById(long id);
    Equipement updateEquipement(Equipement equipement);
}