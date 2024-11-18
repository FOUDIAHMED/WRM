package ahmed.foudi.MRW.services.interfaces;

import ahmed.foudi.MRW.dto.visitorDTO.VisitorRequestDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorResponseDTO;

import java.util.List;

public interface VisitorServiceI {
    VisitorResponseDTO save(VisitorRequestDTO visitorRequestDTO);
    VisitorResponseDTO update(Long id,VisitorRequestDTO visitorRequestDTO);
    VisitorResponseDTO delete(Long id);
    VisitorResponseDTO find(Long id);
    List<VisitorResponseDTO> findAll();
}
