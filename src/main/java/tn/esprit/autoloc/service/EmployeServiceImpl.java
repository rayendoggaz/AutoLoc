package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.IEmployeRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmploye {

    private final IEmployeRepo employeRepo;

    @Override
    public Employe addemploye(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public void deleteemploye(long id) {
        employeRepo.deleteById(id);
    }

    @Override
    public List<Employe> retrieveEmploye() {
        return employeRepo.findAll();
    }

    @Override
    public Employe retrieveEmployeById(long id) {
        return employeRepo.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepo.save(employe);
    }
}