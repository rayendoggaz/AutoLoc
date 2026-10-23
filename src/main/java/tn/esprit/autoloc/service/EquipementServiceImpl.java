package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.IEquipementRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipement {

    private final IEquipementRepo equipementRepo;

    @Override
    public Equipement addequipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public void deleteequipement(long id) {
        equipementRepo.deleteById(id);
    }

    @Override
    public List<Equipement> retrieveEquipement() {
        return equipementRepo.findAll();
    }

    @Override
    public Equipement retrieveEquipementById(long id) {
        return equipementRepo.findById(id).orElse(null);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }
}