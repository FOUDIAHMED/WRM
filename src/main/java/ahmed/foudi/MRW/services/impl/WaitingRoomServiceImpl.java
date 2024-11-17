package ahmed.foudi.MRW.services.impl;

import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomRequestDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomResponseDTO;
import ahmed.foudi.MRW.services.interfaces.WaitingRoomServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class WaitingRoomServiceImpl implements WaitingRoomServiceI {

    @Override
    public WaitingRoomResponseDTO save(WaitingRoomRequestDTO requestDTO) {
        return null;
    }

    @Override
    public WaitingRoomResponseDTO update(WaitingRoomRequestDTO requestDTO) {
        return null;
    }

    @Override
    public WaitingRoomResponseDTO delete(Long id) {
        return null;
    }

    @Override
    public WaitingRoomResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<WaitingRoomResponseDTO> findAll() {
        return List.of();
    }
}
