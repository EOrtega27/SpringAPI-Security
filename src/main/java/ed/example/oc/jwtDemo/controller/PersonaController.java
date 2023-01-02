package ed.example.oc.jwtDemo.controller;

import ed.example.oc.jwtDemo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/clientes")
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping(" ")
    public ResponseEntity listarClientes(){
        return new ResponseEntity<>(personaRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getClienteById(@PathVariable int id){
        return new ResponseEntity(personaRepository.findById(id), HttpStatus.OK);
    }

}
