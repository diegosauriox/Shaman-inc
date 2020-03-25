package Shaman.Inc.demo.model;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Entity
@Table(name = "Region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reg_id")
    private Long id;
    @Column(name = "reg_nombre")
    private String nombre;
    @Column(name = "reg_casos_totales")
    private int casos_totales;

    @Column(name= "reg_casos_nuevos")
    private int casos_nuevos;

    @Column(name= "reg_fallecidos")
    private int fallecidos;

    public int getCasos_nuevos() {
        return casos_nuevos;
    }

    public void setCasos_nuevos(int casos_nuevos) {
        this.casos_nuevos = casos_nuevos;
    }

    public int getFallecidos() {
        return fallecidos;
    }

    public void setFallecidos(int fallecidos) {
        this.fallecidos = fallecidos;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCasos_totales() {
        return casos_totales;
    }

    public void setCasos_totales(int casos) {
        this.casos_totales = casos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region() {
    }



}
