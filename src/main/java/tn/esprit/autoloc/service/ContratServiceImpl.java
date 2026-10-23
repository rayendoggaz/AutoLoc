package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.IContratRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContrat {

    private final IContratRepo contratRepo;

    @Override
    public Contrat addcontrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }

    @Override
    public void deletecontrat(long id) {
        contratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> retrieveContrat() {
        return contratRepo.findAll();
    }

    @Override
    public Contrat retrieveContratById(long id) {
        return contratRepo.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }
}