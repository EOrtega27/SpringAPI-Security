package ed.example.oc.jwtDemo.repository;

import ed.example.oc.jwtDemo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}
