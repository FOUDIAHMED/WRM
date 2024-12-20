package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomEmbddedDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomRequestDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomResponseDTO;
import ahmed.foudi.MRW.entities.WaitingRoom;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface WaitingRoomMapper {

    WaitingRoom toEntity(WaitingRoomRequestDTO dto);
    
    WaitingRoomResponseDTO toDto(WaitingRoom entity);

    WaitingRoomEmbddedDTO toEmbeddedDto(WaitingRoom entity);
} 