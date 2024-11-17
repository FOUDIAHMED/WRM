package ahmed.foudi.MRW.services.impl;

import ahmed.foudi.MRW.dto.visitorDTO.VisitorRequestDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorResponseDTO;
import ahmed.foudi.MRW.services.interfaces.VisitorServiceI;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorServiceI {
    @Override
    public VisitorResponseDTO save(VisitorRequestDTO visitorRequestDTO) {
        return null;
    }

    @Override
    public VisitorResponseDTO update(VisitorRequestDTO visitorRequestDTO) {
        return null;
    }

    @Override
    public VisitorResponseDTO delete(Long id) {
        return null;
    }

    @Override
    public VisitorResponseDTO find(Long id) {
        return null;
    }

    @Override
    public List<VisitorResponseDTO> findAll() {
        return List.of();
    }
}
