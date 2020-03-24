package Shaman.Inc.demo;

import Shaman.Inc.demo.model.Region;
import Shaman.Inc.demo.model.data.RegionDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargaInicial {

    @Bean
    public CommandLineRunner demo(RegionDao regionDao){

        return(args ->{
        Region region1= new Region();
        region1.setNombre("Arica y Parinacota");
        Region region2= new Region();
        region2.setNombre("Tarapacá");
            Region region3= new Region();
            region3.setNombre("Antofagasta");
            Region region4= new Region();
            region4.setNombre("Atacama");
            Region region5= new Region();
            region5.setNombre("Coquimbo");
            Region region6= new Region();
            region6.setNombre("Valparaíso");
            Region region7= new Region();
            region7.setNombre("Metropolitana");
            Region region8= new Region();
            region8.setNombre("O’Higgins");
            Region region9= new Region();
            region9.setNombre("Maule");
            Region region10= new Region();
            region10.setNombre("Ñuble");
            Region region11= new Region();
            region11.setNombre("Biobío");
            Region region12= new Region();
            region12.setNombre("Araucanía");
            Region region13= new Region();
            region13.setNombre("Los Ríos");
            Region region14= new Region();
            region14.setNombre("Los Lagos");
            Region region15= new Region();
            region15.setNombre("Aysén");
            Region region16= new Region();
            region16.setNombre("Magallanes");
            Region region17= new Region();
            region17.setNombre("Total");
            regionDao.save(region1);
            regionDao.save(region2);
            regionDao.save(region3);
            regionDao.save(region4);
            regionDao.save(region5);
            regionDao.save(region6);
            regionDao.save(region7);
            regionDao.save(region8);
            regionDao.save(region9);
            regionDao.save(region10);
            regionDao.save(region11);
            regionDao.save(region12);
            regionDao.save(region13);
            regionDao.save(region14);
            regionDao.save(region15);
            regionDao.save(region16);
            regionDao.save(region17);


        });


    }
    }



