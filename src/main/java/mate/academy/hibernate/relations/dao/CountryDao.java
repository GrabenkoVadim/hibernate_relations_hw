package mate.academy.hibernate.relations.dao;

import mate.academy.hibernate.relations.model.Country;

import java.util.Optional;

public interface CountryDao {
    Country add(Country country);

    Optional<Country> get(Long id);
}
