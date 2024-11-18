package ahmed.foudi.MRW.dao;

import ahmed.foudi.MRW.entities.EmbdedId;
import ahmed.foudi.MRW.entities.Visit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitDAO extends JpaRepository<Visit, EmbdedId> {
  
    List<Visit> findByVisitorId(Long visitorId);
    List<Visit> findByWaitingRoomId(Long waitingRoomId);

}
