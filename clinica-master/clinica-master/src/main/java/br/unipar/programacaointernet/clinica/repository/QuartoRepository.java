package br.unipar.programacaointernet.clinica.repository;

import br.unipar.programacaointernet.clinica.model.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {
}
