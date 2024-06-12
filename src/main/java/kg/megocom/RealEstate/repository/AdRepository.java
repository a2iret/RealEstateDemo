package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.Ad;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {

    List<Ad> findAll(Specification<Ad> adParameters);
}
