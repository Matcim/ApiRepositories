package co.develhope.EsercizioApiSpringRepositories.repositories;


import co.develhope.EsercizioApiSpringRepositories.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepositories extends JpaRepository<Car,Long> {
}
