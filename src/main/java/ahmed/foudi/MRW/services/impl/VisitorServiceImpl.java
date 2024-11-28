package ahmed.foudi.MRW.services.impl;

import ahmed.foudi.MRW.dao.VisitorDAO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorRequestDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorResponseDTO;
import ahmed.foudi.MRW.entities.Visitor;
import ahmed.foudi.MRW.exceptions.visitor.VisitorNotFoundException;
import ahmed.foudi.MRW.mapper.VisitorMapper;
import ahmed.foudi.MRW.services.interfaces.VisitorServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitorServiceImpl implements VisitorServiceI {
    private final VisitorDAO visitorDAO;
    private final VisitorMapper visitorMapper;

    @Override
    public VisitorResponseDTO save(VisitorRequestDTO visitorRequestDTO) {
        
        Visitor visitor = visitorMapper.toEntity(visitorRequestDTO);
        return visitorMapper.toDto(visitorDAO.save(visitor));
    }

    @Override
    public VisitorResponseDTO update(Long id,VisitorRequestDTO visitorRequestDTO) {
        if (!visitorDAO.existsById(id)) {
            throw new VisitorNotFoundException("Visitor not found with id: " + id);
        }
        Visitor savedVisitor=visitorDAO.findById(id).get();
        if(visitorRequestDTO.getFirstName()!=null) {
            savedVisitor.setFirstName(visitorRequestDTO.getFirstName());
        }
        if(visitorRequestDTO.getLastName()!=null) {
            savedVisitor.setLastName(visitorRequestDTO.getLastName());
        }

        return visitorMapper.toDto(visitorDAO.save(savedVisitor));
    }

    @Override
    public VisitorResponseDTO delete(Long id) {
        Visitor visitor = visitorDAO.findById(id)
                .orElseThrow(() -> new VisitorNotFoundException("Visitor not found with id: " + id));
        visitorDAO.deleteById(id);
        return visitorMapper.toDto(visitor);
    }

    @Override
    public VisitorResponseDTO find(Long id) {
        return visitorMapper.toDto(visitorDAO.findById(id)
                .orElseThrow(() -> new VisitorNotFoundException("Visitor not found with id: " + id)));
    }

    @Override
    public List<VisitorResponseDTO> findAll() {
        return visitorDAO.findAll().stream()
                .map(visitorMapper::toDto)
                .collect(Collectors.toList());
    }
}
