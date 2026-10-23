package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.IPaiementRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiement {

    private final IPaiementRepo paiementRepo;

    @Override
    public Paiement addpaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public void deletepaiement(long id) {
        paiementRepo.deleteById(id);
    }

    @Override
    public List<Paiement> retrievePaiement() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement retrievePaiementById(long id) {
        return paiementRepo.findById(id).orElse(null);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }
}