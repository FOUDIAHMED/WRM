package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.entities.EmbdedId;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EmbeddedIdMapper {
    
    @Mapping(target = "visitorId", source = "visitorId")
    @Mapping(target = "waitingRoomId", source = "waitingRoomId")
    EmbdedId toEntity(VisitEmbddedDTO dto);
    
    @Mapping(target = "visitorId", source = "visitorId")
    @Mapping(target = "waitingRoomId", source = "waitingRoomId")
    VisitEmbddedDTO toDto(EmbdedId entity);
} 