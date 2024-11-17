package ahmed.foudi.MRW.dao;

import ahmed.foudi.MRW.entities.Visitor;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorDAO extends JpaRepository<Visitor, Long> {
}
