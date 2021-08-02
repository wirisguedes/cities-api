package com.github.wiris.citiesapi.countries.repository;


import com.github.wiris.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long>{

}
