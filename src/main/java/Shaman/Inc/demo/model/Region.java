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
    @Column(name = "reg_casos")
    private int casos;
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

    public int getCasos() {
        return casos;
    }

    public void setCasos(int casos) {
        this.casos = casos;
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

        if(this.casos<51){
            setColor("ffeeee");
        }else if(this.casos<101){
            setColor("ffd6d6");

        }else if(this.casos<501){
            setColor("ffb4b4");

        }else if(this.casos<1001){
            setColor("fd8f8f");
        }else if(this.casos<5001){
            setColor("fc6b6b");
        }else if(this.casos<10001){
            setColor("fa3d3d");
        }else{
            setColor("ff0000");
        }

    }


}
