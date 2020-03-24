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

    public Region() {
    }

    @Column(name = "reg_color")
    private String color;
    @Column(name = "reg_latitud")
    private String[] latitud;
    @Column(name = "reg_longitud")
    private String[] longitud;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getLatitud() {
        return latitud;
    }

    public void setLatitud(String[] latitud) {
        this.latitud = latitud;
    }

    public String[] getLongitud() {
        return longitud;
    }

    public void setLongitud(String[] longitud) {
        this.longitud = longitud;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void color(){

        if(this.casos_totales<51){
            setColor("ffeeee");
        }else if(this.casos_totales<101){
            setColor("ffd6d6");

        }else if(this.casos_totales<501){
            setColor("ffb4b4");

        }else if(this.casos_totales<1001){
            setColor("fd8f8f");
        }else if(this.casos_totales<5001){
            setColor("fc6b6b");
        }else if(this.casos_totales<10001){
            setColor("fa3d3d");
        }else{
            setColor("ff0000");
        }

    }


}
