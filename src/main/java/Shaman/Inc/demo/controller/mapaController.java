package Shaman.Inc.demo.controller;

import Shaman.Inc.demo.model.data.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/mapa")
public class mapaController {

    @Autowired
    private RegionDao regionDao;

    @RequestMapping(value ="")
    public String listar(Model modelo){

        modelo.addAttribute("regiones",regionDao.findAll());

        return "mapa";
    }


}
