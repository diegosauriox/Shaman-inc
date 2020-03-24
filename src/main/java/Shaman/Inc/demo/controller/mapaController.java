package Shaman.Inc.demo.controller;

import Shaman.Inc.demo.WebScrapping;
import Shaman.Inc.demo.model.Region;
import Shaman.Inc.demo.model.data.RegionDao;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
@RequestMapping(value = "/mapa")
public class mapaController {

    @Autowired
    private RegionDao regionDao;

    @RequestMapping(value ="")
    public String listar(Model modelo) throws IOException {

        webScrapping();
        modelo.addAttribute("regiones",regionDao.findAll());

        return "mapa";
    }


    public void webScrapping() throws IOException {
        Document doc = Jsoup.connect("https://www.minsal.cl/nuevo-coronavirus-2019-ncov/casos-confirmados-en-chile-covid-19/").get();
        Element tabla = doc.select("table").get(0); //select the first table.
        Elements filas = tabla.select("tr");
        for (int i = 3; i < filas.size(); i++) { //first row is the col names so skip it.
            Element fila = filas.get(i);
            Elements columna = fila.select("td");
            Region act = regionDao.findByNombre(columna.get(0).text());
            act.setCasos_nuevos(Integer.parseInt(columna.get(1).text()));
            act.setCasos_totales(Integer.parseInt(columna.get(2).text()));
            act.setFallecidos(Integer.parseInt(columna.get(3).text()));
            regionDao.save(act);
        }
    }


}
