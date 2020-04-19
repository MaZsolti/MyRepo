package home.szakdolgozat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.MTerulet;

@Repository
public interface MTeruletRepository extends CrudRepository<MTerulet, Long> {

}
