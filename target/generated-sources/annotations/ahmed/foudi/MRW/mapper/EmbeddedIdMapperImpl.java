package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.entities.EmbdedId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T09:25:46+0100",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class EmbeddedIdMapperImpl implements EmbeddedIdMapper {

    @Override
    public EmbdedId toEntity(VisitEmbddedDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EmbdedId embdedId = new EmbdedId();

        embdedId.setVisitorId( dto.getVisitorId() );
        embdedId.setWaitingRoomId( dto.getWaitingRoomId() );

        return embdedId;
    }

    @Override
    public VisitEmbddedDTO toDto(EmbdedId entity) {
        if ( entity == null ) {
            return null;
        }

        VisitEmbddedDTO visitEmbddedDTO = new VisitEmbddedDTO();

        visitEmbddedDTO.setVisitorId( entity.getVisitorId() );
        visitEmbddedDTO.setWaitingRoomId( entity.getWaitingRoomId() );

        return visitEmbddedDTO;
    }
}
