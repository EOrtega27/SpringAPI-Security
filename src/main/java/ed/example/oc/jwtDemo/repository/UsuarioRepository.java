package ed.example.oc.jwtDemo.repository;

import ed.example.oc.jwtDemo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
