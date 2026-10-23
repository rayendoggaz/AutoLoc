package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.IAgenceRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgence{

    private final IAgenceRepo agenceRepo;

    @Override
    public Agence addagence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void deleteagence(long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> retrieveAgence() {
        return agenceRepo.findAll();
    }

    @Override
    public Agence retrieveAgenceById(long id) {
        return agenceRepo.findById(id).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }
}
