package home.szakdolgozat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Felhasznalo;

@Repository
public interface FelhasznaloRepository extends CrudRepository<Felhasznalo, Long> {

}
