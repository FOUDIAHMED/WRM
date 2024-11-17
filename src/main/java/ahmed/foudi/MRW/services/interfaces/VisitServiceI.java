package ahmed.foudi.MRW.services.interfaces;

import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;

import java.util.List;

public interface VisitServiceI {
    VisiteResponseDTO save(VisitRequestDTO visitRequestDTO);
    VisiteResponseDTO update(VisitRequestDTO visitRequestDTO);
    VisiteResponseDTO delete(VisitRequestDTO visitRequestDTO);
    VisiteResponseDTO find(Long id);
    List<VisiteResponseDTO> findAll();

}
