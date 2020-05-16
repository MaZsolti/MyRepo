package home.szakdolgozat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Munkarend;

@Repository
public interface MunkarendRepository extends JpaRepository<Munkarend, Long> {

}
