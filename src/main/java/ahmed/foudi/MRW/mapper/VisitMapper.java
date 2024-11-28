package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.entities.Visit;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {VisitorMapper.class, WaitingRoomMapper.class})
public interface VisitMapper {

    Visit toEntity(VisitRequestDTO dto);

    VisiteResponseDTO toDto(Visit entity);
    VisitEmbddedDTO toEmbeddedDto(Visit entity);
} 