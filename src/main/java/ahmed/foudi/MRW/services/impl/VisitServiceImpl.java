package ahmed.foudi.MRW.services.impl;

import ahmed.foudi.MRW.dao.VisitDAO;
import ahmed.foudi.MRW.dao.VisitorDAO;
import ahmed.foudi.MRW.dao.WaitingRoomDAO;
import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.entities.Visit;
import ahmed.foudi.MRW.exceptions.visit.VisitNotFoundException;
import ahmed.foudi.MRW.exceptions.visitor.VisitorNotFoundException;
import ahmed.foudi.MRW.exceptions.waitingroom.WaitingRoomNotFoundException;
import ahmed.foudi.MRW.mapper.VisitMapper;
import ahmed.foudi.MRW.services.interfaces.VisitServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitServiceImpl implements VisitServiceI {
    private final VisitDAO visitDAO;
    private final VisitorDAO visitorDAO;
    private final WaitingRoomDAO waitingRoomDAO;
    private final VisitMapper visitMapper;

    @Override
    public VisiteResponseDTO save(VisitRequestDTO visitRequestDTO) {
        validateVisitorAndWaitingRoom(visitRequestDTO);
        Visit visit = visitMapper.toEntity(visitRequestDTO);
        visit.setVisitor(visitorDAO.getReferenceById(visitRequestDTO.getVisitorId()));
        visit.setWaitingRoom(waitingRoomDAO.getReferenceById(visitRequestDTO.getWaitingRoomId()));
        return visitMapper.toDto(visitDAO.save(visit));
    }

    @Override
    public VisiteResponseDTO update(VisitRequestDTO visitRequestDTO) {
        validateVisitorAndWaitingRoom(visitRequestDTO);
        Visit visit = visitMapper.toEntity(visitRequestDTO);
        visit.setVisitor(visitorDAO.getReferenceById(visitRequestDTO.getVisitorId()));
        visit.setWaitingRoom(waitingRoomDAO.getReferenceById(visitRequestDTO.getWaitingRoomId()));
        return visitMapper.toDto(visitDAO.save(visit));
    }

    @Override
    public VisiteResponseDTO delete(VisitRequestDTO visitRequestDTO) {
        Visit visit = visitMapper.toEntity(visitRequestDTO);
        visitDAO.delete(visit);
        return visitMapper.toDto(visit);
    }

    @Override
    public VisiteResponseDTO find(Long id) {
        return visitMapper.toDto(visitDAO.findById(id)
                .orElseThrow(() -> new VisitNotFoundException("Visit not found with id: " + id)));
    }

    @Override
    public List<VisiteResponseDTO> findAll() {
        return visitDAO.findAll().stream()
                .map(visitMapper::toDto)
                .collect(Collectors.toList());
    }

    private void validateVisitorAndWaitingRoom(VisitRequestDTO visitRequestDTO) {
        if (!visitorDAO.existsById(visitRequestDTO.getVisitorId())) {
            throw new VisitorNotFoundException("Visitor not found with id: " + visitRequestDTO.getVisitorId());
        }
        if (!waitingRoomDAO.existsById(visitRequestDTO.getWaitingRoomId())) {
            throw new WaitingRoomNotFoundException("WaitingRoom not found with id: " + visitRequestDTO.getWaitingRoomId());
        }
    }
}
