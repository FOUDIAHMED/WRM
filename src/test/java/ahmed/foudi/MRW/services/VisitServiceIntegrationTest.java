package ahmed.foudi.MRW.services;

import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.entities.EmbdedId;
import ahmed.foudi.MRW.entities.Visit;
import ahmed.foudi.MRW.dao.VisitDAO;
import ahmed.foudi.MRW.mapper.VisitMapper;
import ahmed.foudi.MRW.services.interfaces.VisitServiceI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("dev")
@Transactional
public class VisitServiceIntegrationTest {

    @Autowired
    private VisitServiceI visitService;

    @Autowired
    private VisitDAO visitRepository;

    @Autowired
    VisitMapper visitMapper;

//    @Test
//    void shouldCreateVisit() {
//        // Given
//        VisitRequestDTO visit = new VisitRequestDTO();
//        EmbdedId embdedId = new EmbdedId();
//        embdedId.setVisitorId(1L);
//        embdedId.setWaitingRoomId(1L);
//        visit.setId(embdedId);
//        VisitRequestDTO visitRequestDTO = new VisitRequestDTO();
//        visitRequestDTO.setVisitorId();
//
//
//        // Set other required fields...
//
//        // When
//        VisiteResponseDTO savedVisit = visitService.save(visitMapper.toDto(visit));
//
//        // Then
//        assertThat(savedVisit.getId()).isNotNull();
//        assertThat(savedVisit.getId().getVisitorId()).isEqualTo(1L);
//    }

//    @Test
//    void shouldFindVisitById() {
//        // Given
//        Visit visit = new Visit();
//        EmbdedId embdedId = new EmbdedId();
//        embdedId.setVisitorId(1L);
//        embdedId.setWaitingRoomId(1L);
//        visit.setId(embdedId);
//        Visit savedVisit = visitRepository.save(visit);
//
//        // When
//        VisiteResponseDTO foundVisit = visitService.find(1L,1L);
//
//        // Then
//        assertThat(foundVisit).isNotNull();
//        assertThat(foundVisit.getId()).isEqualTo(savedVisit.getId());
//    }
} 