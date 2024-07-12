package mate.academy.hibernate.relations.dao;

import mate.academy.hibernate.relations.model.Movie;

import java.util.Optional;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
