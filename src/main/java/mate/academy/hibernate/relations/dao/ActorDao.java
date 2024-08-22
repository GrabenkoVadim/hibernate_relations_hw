package mate.academy.hibernate.relations.dao;

import mate.academy.hibernate.relations.model.Actor;

import java.util.Optional;

public interface ActorDao {
    Actor add(Actor actor);

    Optional<Actor> get(Long id);
}
