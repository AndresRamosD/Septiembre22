package com.andresramos.app.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L; //Implementación del Serializable

    @Id //Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincremental
    @Column(name = "id", nullable = false)
    private Long id;

    //Se mapean automáticamente a la BD
    private String nombre;
    private String apellido;
    private String email;

    @Column(name = "create_at")//Cambiamos el nombre porque debe separarse con un guión bajo
    @Temporal(TemporalType.DATE)//Anotación para hacer referencia a un dato tipo fecha
    private Date createAt;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
