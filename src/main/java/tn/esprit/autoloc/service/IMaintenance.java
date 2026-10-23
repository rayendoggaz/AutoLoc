package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;
import java.util.List;

public interface IMaintenance {
    Maintenance addmaintenance(Maintenance maintenance);
    void deletemaintenance(long id);
    List<Maintenance> retrieveMaintenance();
    Maintenance retrieveMaintenanceById(long id);
    Maintenance updateMaintenance(Maintenance maintenance);
}