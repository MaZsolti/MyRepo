package home.szakdolgozat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Munkarend;

@Repository
public interface MunkarendRepository extends CrudRepository<Munkarend, Long> {

}
