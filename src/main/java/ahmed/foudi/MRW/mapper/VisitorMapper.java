package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitorDTO.VisitorEmbddedDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorRequestDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorResponseDTO;
import ahmed.foudi.MRW.entities.Visitor;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface VisitorMapper {
    
    Visitor toEntity(VisitorRequestDTO dto);
    VisitorResponseDTO toDto(Visitor entity);
    VisitorEmbddedDTO toEmbeddedDto(Visitor entity);
} 