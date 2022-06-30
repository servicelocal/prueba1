package com.local.prueba1.usuario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name = "email", length = 30, nullable = false)
    private String email;

    @Column(name = "prioridad", nullable = false, columnDefinition = "tinyint")
    private Integer prioridad;

}
