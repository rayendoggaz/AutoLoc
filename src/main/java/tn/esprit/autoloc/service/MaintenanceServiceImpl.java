package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.IMaintenanceRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenance {

    private final IMaintenanceRepo maintenanceRepo;

    @Override
    public Maintenance addmaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public void deletemaintenance(long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public List<Maintenance> retrieveMaintenance() {
        return maintenanceRepo.findAll();
    }

    @Override
    public Maintenance retrieveMaintenanceById(long id) {
        return maintenanceRepo.findById(id).orElse(null);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }
}