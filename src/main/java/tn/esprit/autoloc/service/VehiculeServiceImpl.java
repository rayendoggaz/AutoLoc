package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.IVehiculeRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehicule {

    private final IVehiculeRepo vehiculeRepo;

    @Override
    public Vehicule addvehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public void deletevehicule(long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> retrieveVehicule() {
        return vehiculeRepo.findAll();
    }

    @Override
    public Vehicule retrieveVehiculeById(long id) {
        return vehiculeRepo.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }
}