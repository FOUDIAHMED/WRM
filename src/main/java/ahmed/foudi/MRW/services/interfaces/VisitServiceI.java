package ahmed.foudi.MRW.services.interfaces;

import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;

import java.util.List;

public interface VisitServiceI {
    VisiteResponseDTO save(VisitRequestDTO visitRequestDTO);
    VisiteResponseDTO update(Long visitorId, Long waitingRoomId, VisitRequestDTO visitRequestDTO);
    VisiteResponseDTO delete(Long visitorId, Long waitingRoomId);
    VisiteResponseDTO find(Long visitorId, Long waitingRoomId);
    List<VisiteResponseDTO> findAll();
    List<VisiteResponseDTO> findByVisitorId(Long visitorId);
    List<VisiteResponseDTO> findByWaitingRoomId(Long waitingRoomId);

}
