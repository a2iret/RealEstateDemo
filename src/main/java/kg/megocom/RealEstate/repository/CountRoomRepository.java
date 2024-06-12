package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.CountRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRoomRepository extends JpaRepository<CountRoom, Long> {
    CountRoom findByCount(Integer count);
}
