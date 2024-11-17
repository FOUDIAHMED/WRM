package ahmed.foudi.MRW.services.impl;

import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.services.interfaces.VisitServiceI;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitServiceImpl implements VisitServiceI {

    @Override
    public VisiteResponseDTO save(VisitRequestDTO visitRequestDTO) {
        return null;
    }

    @Override
    public VisiteResponseDTO update(VisitRequestDTO visitRequestDTO) {
        return null;
    }

    @Override
    public VisiteResponseDTO delete(VisitRequestDTO visitRequestDTO) {
        return null;
    }

    @Override
    public VisiteResponseDTO find(Long id) {
        return null;
    }

    @Override
    public List<VisiteResponseDTO> findAll() {
        return List.of();
    }
}
