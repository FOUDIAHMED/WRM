package ahmed.foudi.MRW.services.interfaces;

import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomRequestDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomResponseDTO;

import java.util.List;

public interface WaitingRoomServiceI {
    WaitingRoomResponseDTO save(WaitingRoomRequestDTO requestDTO);
    WaitingRoomResponseDTO update(Long id,WaitingRoomRequestDTO requestDTO);
    WaitingRoomResponseDTO delete(Long  id);
    WaitingRoomResponseDTO findById(Long id);
    List<WaitingRoomResponseDTO> findAll();
}
