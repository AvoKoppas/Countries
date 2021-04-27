package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {
    @Autowired
    public CountriesRepo countriesRepo;

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public void addCountry(String name, String capital, Double population) {
        countriesRepo.addCountry(name, capital, population);
    }
}