package com.cognizant.spring_learn5.controller;

import com.cognizant.spring_learn5.model.Country;
import com.cognizant.spring_learn5.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");
        Country country = countryService.getCountryIndia();
        LOGGER.info("END - getCountryIndia()");
        return country;
    }
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry({})", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END - getCountry({})", code);
        return country;
    }
}
