package ahmed.foudi.MRW.services.impl;

import ahmed.foudi.MRW.dao.WaitingRoomDAO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomRequestDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomResponseDTO;
import ahmed.foudi.MRW.entities.WaitingRoom;
import ahmed.foudi.MRW.exceptions.waitingroom.WaitingRoomNotFoundException;
import ahmed.foudi.MRW.mapper.WaitingRoomMapper;
import ahmed.foudi.MRW.services.interfaces.WaitingRoomServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WaitingRoomServiceImpl implements WaitingRoomServiceI {
    private final WaitingRoomDAO waitingRoomDAO;
    private final WaitingRoomMapper waitingRoomMapper;

    @Override
    public WaitingRoomResponseDTO save(WaitingRoomRequestDTO requestDTO) {
        WaitingRoom waitingRoom = waitingRoomMapper.toEntity(requestDTO);
        return waitingRoomMapper.toDto(waitingRoomDAO.save(waitingRoom));
    }

    @Override
    public WaitingRoomResponseDTO update(Long id,WaitingRoomRequestDTO requestDTO) {
        if (!waitingRoomDAO.existsById(id)) {
            throw new WaitingRoomNotFoundException("WaitingRoom not found with id: " + id);
        }
        WaitingRoom waitingRoom = waitingRoomMapper.toEntity(requestDTO);
        return waitingRoomMapper.toDto(waitingRoomDAO.save(waitingRoom));
    }

    @Override
    public WaitingRoomResponseDTO delete(Long id) {
        WaitingRoom waitingRoom = waitingRoomDAO.findById(id)
                .orElseThrow(() -> new WaitingRoomNotFoundException("WaitingRoom not found with id: " + id));
        waitingRoomDAO.deleteById(id);
        return waitingRoomMapper.toDto(waitingRoom);
    }

    @Override
    public WaitingRoomResponseDTO findById(Long id) {
        return waitingRoomMapper.toDto(waitingRoomDAO.findById(id)
                .orElseThrow(() -> new WaitingRoomNotFoundException("WaitingRoom not found with id: " + id)));
    }

    @Override
    public List<WaitingRoomResponseDTO> findAll() {
        return waitingRoomDAO.findAll().stream()
                .map(waitingRoomMapper::toDto)
                .collect(Collectors.toList());
    }
}
