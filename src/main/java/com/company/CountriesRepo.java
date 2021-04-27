package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CountriesRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public String addCountry(String name, String capital, Double population) {
        String sql = "INSERT INTO countries (name, capital, population) VALUES (:a, :b, :c )";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", name);
        paramMap.put("b", capital);
        paramMap.put("c", population);
        jdbcTemplate.update(sql, paramMap);
        return "Account created!";
    }


//    public String addCountry(String name, String capital, double population) {
//        String sql = "INSERT INTO countries (name, capital, population) VALUES (:a, :b, :c )";
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("a", name);
//        paramMap.put("b", capital);
//        paramMap.put("c", population);
//        jdbcTemplate.update(sql, paramMap);
//        return "Country added to the table";
//    }
}