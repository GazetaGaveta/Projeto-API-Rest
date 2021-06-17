package one.digitalinovation.personAPI.repositories;

import one.digitalinovation.personAPI.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
