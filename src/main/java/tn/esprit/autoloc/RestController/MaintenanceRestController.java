package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenance;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/maintenance")
public class MaintenanceRestController {

    private final IMaintenance maintenanceService;

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addmaintenance(maintenance);
    }

    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.retrieveMaintenance();
    }

    @GetMapping("/retrieve-maintenance/{id}")
    public Maintenance getMaintenance(@PathVariable Long id) {
        return maintenanceService.retrieveMaintenanceById(id);
    }

    @DeleteMapping("/remove-maintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deletemaintenance(id);
    }
}