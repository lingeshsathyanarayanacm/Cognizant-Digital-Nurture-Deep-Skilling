package com.example.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Optional<Country> findByCode(String code) {
        return countryRepository.findById(code);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String code, Country updated) {
        return countryRepository.findById(code)
            .map(existing -> {
                existing.setName(updated.getName());
                return countryRepository.save(existing);
            }).orElseGet(() -> {
                updated.setCode(code);
                return countryRepository.save(updated);
            });
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> searchByName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
    public List<Country> getAllCountries() {
    return countryRepository.findAll();
    }
 
}
