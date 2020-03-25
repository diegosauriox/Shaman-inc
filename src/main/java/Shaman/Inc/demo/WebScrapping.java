package Shaman.Inc.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScrapping {


    public Element Conexion() throws IOException {
        Document doc = Jsoup.connect("https://www.minsal.cl/nuevo-coronavirus-2019-ncov/casos-confirmados-en-chile-covid-19/").get();
        Element tabla = doc.select("table").get(0); //select the first table.
        Elements filas = tabla.select("tr");
        for (int i = 2; i < filas.size(); i++) { //first row is the col names so skip it.
            Element fila = filas.get(i);
            Elements columna = fila.select("td");
            System.out.println(columna.get(0).text());

        }
            return tabla;
        }



}
