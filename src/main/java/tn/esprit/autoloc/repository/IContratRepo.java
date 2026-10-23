package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.autoloc.domain.Contrat;

public interface IContratRepo extends JpaRepository<Contrat, Long> {
}
