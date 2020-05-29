package home.szakdolgozat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.MTerulet;

@Repository
public interface MTeruletRepository extends JpaRepository<MTerulet, Long> {

}
