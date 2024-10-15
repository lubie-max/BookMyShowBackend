package services;

import models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitService {

    @Autowired
    private CityService cityService;


    public void initialise(){


        City city = new City();
        city.setName("Bangalore");
         city = cityService.createCity(city);
//        city.setTheatres(List.of(theatre));

    }
}
