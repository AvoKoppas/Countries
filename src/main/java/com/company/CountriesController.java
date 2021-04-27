package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    CountriesService countriesService;

    @PutMapping("addCountry/{name}/{capital}/{population}")
    public String addCountry(@PathVariable("name") String country,
                           @PathVariable("capital") String capital,
                           @PathVariable("population") Double population) {
    countriesService.addCountry(country, capital, population);
    return "Country is added to the table";
    }
}
