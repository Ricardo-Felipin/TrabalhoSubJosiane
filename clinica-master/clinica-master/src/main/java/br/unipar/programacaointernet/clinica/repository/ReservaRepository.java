package br.unipar.programacaointernet.clinica.repository;

import br.unipar.programacaointernet.clinica.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
