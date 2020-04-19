package home.szakdolgozat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Dolgozo;

@Repository
public interface DolgozoRepository extends CrudRepository<Dolgozo, Long> {

}
