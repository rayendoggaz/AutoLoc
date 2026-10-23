package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;
import java.util.List;

public interface IContrat {
    Contrat addcontrat(Contrat contrat);
    void deletecontrat(long id);
    List<Contrat> retrieveContrat();
    Contrat retrieveContratById(long id);
    Contrat updateContrat(Contrat contrat);
}