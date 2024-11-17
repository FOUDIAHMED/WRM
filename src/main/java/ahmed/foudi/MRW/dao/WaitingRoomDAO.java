package ahmed.foudi.MRW.dao;

import ahmed.foudi.MRW.entities.WaitingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaitingRoomDAO extends JpaRepository<WaitingRoom, Long> {
}
