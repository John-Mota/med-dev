package med.group.pacientes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import med.group.controller.PacienteController;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
  Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}
