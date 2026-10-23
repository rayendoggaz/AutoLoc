package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;
import java.util.List;

public interface IPaiement {
    Paiement addpaiement(Paiement paiement);
    void deletepaiement(long id);
    List<Paiement> retrievePaiement();
    Paiement retrievePaiementById(long id);
    Paiement updatePaiement(Paiement paiement);
}