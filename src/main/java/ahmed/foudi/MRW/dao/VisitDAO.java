package ahmed.foudi.MRW.dao;

import ahmed.foudi.MRW.entities.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitDAO extends JpaRepository<Visit, Long> {

}
