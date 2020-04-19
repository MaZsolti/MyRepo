package home.szakdolgozat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.szakdolgozat.entity.Munkakor;

@Repository
public interface MunkakorRepository extends JpaRepository<Munkakor, Long> {

}
