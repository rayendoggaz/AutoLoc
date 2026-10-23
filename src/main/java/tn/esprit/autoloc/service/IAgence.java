package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgence {
    Agence addagence(Agence agence);
    void deleteagence(long id);
    List<Agence> retrieveAgence();
    Agence retrieveAgenceById(long id);
    Agence updateAgence(Agence agence);
}
