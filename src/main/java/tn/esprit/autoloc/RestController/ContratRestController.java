package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContrat;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/contrat")
public class ContratRestController {

    private final IContrat contratService;

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addcontrat(contrat);
    }

    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getAllContrats() {
        return contratService.retrieveContrat();
    }

    @GetMapping("/retrieve-contrat/{id}")
    public Contrat getContrat(@PathVariable Long id) {
        return contratService.retrieveContratById(id);
    }

    @DeleteMapping("/remove-contrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deletecontrat(id);
    }
}