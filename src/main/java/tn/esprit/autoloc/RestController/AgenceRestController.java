package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgence;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/agence")
public class AgenceRestController {

    private final IAgence agenceService;

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addagence(agence);
    }

    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAllAgences() {
        return agenceService.retrieveAgence();
    }

    @GetMapping("/retrieve-agence/{id}")
    public Agence getAgence(@PathVariable Long id) {
        return agenceService.retrieveAgenceById(id);
    }

    @DeleteMapping("/remove-agence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteagence(id);
    }
}