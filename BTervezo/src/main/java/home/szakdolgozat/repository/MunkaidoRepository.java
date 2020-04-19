package home.szakdolgozat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Munkaido;

@Repository
public interface MunkaidoRepository extends JpaRepository<Munkaido, Long> {

}
