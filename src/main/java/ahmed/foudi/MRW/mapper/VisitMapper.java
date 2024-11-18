package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.entities.Visit;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {VisitorMapper.class, WaitingRoomMapper.class})
public interface VisitMapper {
    
    @Mapping(target = "id.visitorId", source = "visitorId")
    @Mapping(target = "id.waitingRoomId", source = "waitingRoomId")
    @Mapping(target = "visitor", ignore = true)
    @Mapping(target = "waitingRoom", ignore = true)
    Visit toEntity(VisitRequestDTO dto);
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "visitor", source = "visitor")
    @Mapping(target = "waitingRoom", source = "waitingRoom")
    VisiteResponseDTO toDto(Visit entity);
    
    @Mapping(target = "visitorId", source = "id.visitorId")
    @Mapping(target = "waitingRoomId", source = "id.waitingRoomId")
    VisitEmbddedDTO toEmbeddedDto(Visit entity);
} 