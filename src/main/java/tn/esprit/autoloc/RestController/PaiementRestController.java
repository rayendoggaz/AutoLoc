package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/paiement")
public class PaiementRestController {

    private final IPaiement paiementService;

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addpaiement(paiement);
    }

    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getAllPaiements() {
        return paiementService.retrievePaiement();
    }

    @GetMapping("/retrieve-paiement/{id}")
    public Paiement getPaiement(@PathVariable Long id) {
        return paiementService.retrievePaiementById(id);
    }

    @DeleteMapping("/remove-paiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletepaiement(id);
    }
}