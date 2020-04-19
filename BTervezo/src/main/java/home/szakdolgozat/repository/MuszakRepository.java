package home.szakdolgozat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Muszak;

@Repository
public interface MuszakRepository extends JpaRepository<Muszak, Long> {

}
