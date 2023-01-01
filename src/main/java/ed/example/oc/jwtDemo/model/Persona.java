package ed.example.oc.jwtDemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Persona {
    private static final long serialversionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String email;
    @Column
    private String phone;
}
