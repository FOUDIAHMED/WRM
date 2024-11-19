package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.entities.EmbdedId;
import ahmed.foudi.MRW.entities.Visit;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T09:32:11+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class VisitMapperImpl implements VisitMapper {

    @Autowired
    private VisitorMapper visitorMapper;
    @Autowired
    private WaitingRoomMapper waitingRoomMapper;

    @Override
    public Visit toEntity(VisitRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Visit visit = new Visit();

        visit.setId( visitRequestDTOToEmbdedId( dto ) );
        visit.setStartTime( dto.getStartTime() );
        visit.setEndTime( dto.getEndTime() );
        visit.setStatus( dto.getStatus() );
        visit.setPriority( dto.getPriority() );
        visit.setEstimatedProcessTime( dto.getEstimatedProcessTime() );

        return visit;
    }

    @Override
    public VisiteResponseDTO toDto(Visit entity) {
        if ( entity == null ) {
            return null;
        }

        VisiteResponseDTO visiteResponseDTO = new VisiteResponseDTO();

        visiteResponseDTO.setId( embdedIdToVisitEmbddedDTO( entity.getId() ) );
        visiteResponseDTO.setVisitor( visitorMapper.toEmbeddedDto( entity.getVisitor() ) );
        visiteResponseDTO.setWaitingRoom( waitingRoomMapper.toEmbeddedDto( entity.getWaitingRoom() ) );
        visiteResponseDTO.setStartTime( entity.getStartTime() );
        visiteResponseDTO.setEndTime( entity.getEndTime() );
        visiteResponseDTO.setStatus( entity.getStatus() );
        visiteResponseDTO.setPriority( entity.getPriority() );
        visiteResponseDTO.setEstimatedProcessTime( entity.getEstimatedProcessTime() );

        return visiteResponseDTO;
    }

    @Override
    public VisitEmbddedDTO toEmbeddedDto(Visit entity) {
        if ( entity == null ) {
            return null;
        }

        VisitEmbddedDTO visitEmbddedDTO = new VisitEmbddedDTO();

        visitEmbddedDTO.setVisitorId( entityIdVisitorId( entity ) );
        visitEmbddedDTO.setWaitingRoomId( entityIdWaitingRoomId( entity ) );

        return visitEmbddedDTO;
    }

    protected EmbdedId visitRequestDTOToEmbdedId(VisitRequestDTO visitRequestDTO) {
        if ( visitRequestDTO == null ) {
            return null;
        }

        EmbdedId embdedId = new EmbdedId();

        embdedId.setVisitorId( visitRequestDTO.getVisitorId() );
        embdedId.setWaitingRoomId( visitRequestDTO.getWaitingRoomId() );

        return embdedId;
    }

    protected VisitEmbddedDTO embdedIdToVisitEmbddedDTO(EmbdedId embdedId) {
        if ( embdedId == null ) {
            return null;
        }

        VisitEmbddedDTO visitEmbddedDTO = new VisitEmbddedDTO();

        visitEmbddedDTO.setVisitorId( embdedId.getVisitorId() );
        visitEmbddedDTO.setWaitingRoomId( embdedId.getWaitingRoomId() );

        return visitEmbddedDTO;
    }

    private Long entityIdVisitorId(Visit visit) {
        EmbdedId id = visit.getId();
        if ( id == null ) {
            return null;
        }
        return id.getVisitorId();
    }

    private Long entityIdWaitingRoomId(Visit visit) {
        EmbdedId id = visit.getId();
        if ( id == null ) {
            return null;
        }
        return id.getWaitingRoomId();
    }
}
