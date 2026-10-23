package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmploye;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employe")
public class EmployeRestController {

    private final IEmploye employeService;

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addemploye(employe);
    }

    @GetMapping("/retrieve-all-employes")
    public List<Employe> getAllEmployes() {
        return employeService.retrieveEmploye();
    }

    @GetMapping("/retrieve-employe/{id}")
    public Employe getEmploye(@PathVariable Long id) {
        return employeService.retrieveEmployeById(id);
    }

    @DeleteMapping("/remove-employe/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteemploye(id);
    }
}