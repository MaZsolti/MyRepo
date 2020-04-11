package home.szakdolgozat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Muszak;

@Repository
public interface MuszakRepository extends CrudRepository<Muszak, Integer> {

}
