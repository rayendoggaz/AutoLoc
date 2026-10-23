package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/equipement")
public class EquipementRestController {

    private final IEquipement equipementService;

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addequipement(equipement);
    }

    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getAllEquipements() {
        return equipementService.retrieveEquipement();
    }

    @GetMapping("/retrieve-equipement/{id}")
    public Equipement getEquipement(@PathVariable Long id) {
        return equipementService.retrieveEquipementById(id);
    }

    @DeleteMapping("/remove-equipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteequipement(id);
    }
}