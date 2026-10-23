package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehicule;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vehicule")
public class VehiculeRestController {

    private final IVehicule vehiculeService;

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addvehicule(vehicule);
    }

    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.retrieveVehicule();
    }

    @GetMapping("/retrieve-vehicule/{id}")
    public Vehicule getVehicule(@PathVariable Long id) {
        return vehiculeService.retrieveVehiculeById(id);
    }

    @DeleteMapping("/remove-vehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deletevehicule(id);
    }
}