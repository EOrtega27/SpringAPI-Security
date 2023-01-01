package ed.example.oc.jwtDemo.security;

import ed.example.oc.jwtDemo.model.Usuario;
import ed.example.oc.jwtDemo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("El usuario no existe"));
        return new UserDetailsImpl(user);
    }
}
