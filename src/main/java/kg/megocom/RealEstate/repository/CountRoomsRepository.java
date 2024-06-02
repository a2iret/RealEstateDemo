package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.CountRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRoomsRepository extends JpaRepository<CountRoom, Long> {
}
