package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.entities.EmbdedId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-18T01:36:24+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
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
