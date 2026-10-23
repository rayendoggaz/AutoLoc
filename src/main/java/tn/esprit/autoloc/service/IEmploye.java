package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;
import java.util.List;

public interface IEmploye {
    Employe addemploye(Employe employe);
    void deleteemploye(long id);
    List<Employe> retrieveEmploye();
    Employe retrieveEmployeById(long id);
    Employe updateEmploye(Employe employe);
}