package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorEmbddedDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorRequestDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorResponseDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomEmbddedDTO;
import ahmed.foudi.MRW.entities.EmbdedId;
import ahmed.foudi.MRW.entities.Visit;
import ahmed.foudi.MRW.entities.Visitor;
import ahmed.foudi.MRW.entities.WaitingRoom;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-18T01:36:24+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class VisitorMapperImpl implements VisitorMapper {

    @Override
    public Visitor toEntity(VisitorRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Visitor visitor = new Visitor();

        visitor.setFirstName( dto.getFirstName() );
        visitor.setLastName( dto.getLastName() );

        return visitor;
    }

    @Override
    public VisitorResponseDTO toDto(Visitor entity) {
        if ( entity == null ) {
            return null;
        }

        VisitorResponseDTO visitorResponseDTO = new VisitorResponseDTO();

        visitorResponseDTO.setId( entity.getId() );
        visitorResponseDTO.setFirstName( entity.getFirstName() );
        visitorResponseDTO.setLastName( entity.getLastName() );
        visitorResponseDTO.setVisits( visitListToVisiteResponseDTOList( entity.getVisits() ) );

        return visitorResponseDTO;
    }

    @Override
    public VisitorEmbddedDTO toEmbeddedDto(Visitor entity) {
        if ( entity == null ) {
            return null;
        }

        VisitorEmbddedDTO visitorEmbddedDTO = new VisitorEmbddedDTO();

        visitorEmbddedDTO.setId( entity.getId() );
        visitorEmbddedDTO.setFirstName( entity.getFirstName() );
        visitorEmbddedDTO.setLastName( entity.getLastName() );

        return visitorEmbddedDTO;
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

    protected WaitingRoomEmbddedDTO waitingRoomToWaitingRoomEmbddedDTO(WaitingRoom waitingRoom) {
        if ( waitingRoom == null ) {
            return null;
        }

        WaitingRoomEmbddedDTO waitingRoomEmbddedDTO = new WaitingRoomEmbddedDTO();

        waitingRoomEmbddedDTO.setId( waitingRoom.getId() );
        waitingRoomEmbddedDTO.setDate( waitingRoom.getDate() );
        waitingRoomEmbddedDTO.setAlgorithme( waitingRoom.getAlgorithme() );
        waitingRoomEmbddedDTO.setCapacity( waitingRoom.getCapacity() );

        return waitingRoomEmbddedDTO;
    }

    protected VisiteResponseDTO visitToVisiteResponseDTO(Visit visit) {
        if ( visit == null ) {
            return null;
        }

        VisiteResponseDTO visiteResponseDTO = new VisiteResponseDTO();

        visiteResponseDTO.setId( embdedIdToVisitEmbddedDTO( visit.getId() ) );
        visiteResponseDTO.setVisitor( toEmbeddedDto( visit.getVisitor() ) );
        visiteResponseDTO.setWaitingRoom( waitingRoomToWaitingRoomEmbddedDTO( visit.getWaitingRoom() ) );
        visiteResponseDTO.setStartTime( visit.getStartTime() );
        visiteResponseDTO.setEndTime( visit.getEndTime() );
        visiteResponseDTO.setStatus( visit.getStatus() );
        visiteResponseDTO.setPriority( visit.getPriority() );
        visiteResponseDTO.setEstimatedProcessTime( visit.getEstimatedProcessTime() );

        return visiteResponseDTO;
    }

    protected List<VisiteResponseDTO> visitListToVisiteResponseDTOList(List<Visit> list) {
        if ( list == null ) {
            return null;
        }

        List<VisiteResponseDTO> list1 = new ArrayList<VisiteResponseDTO>( list.size() );
        for ( Visit visit : list ) {
            list1.add( visitToVisiteResponseDTO( visit ) );
        }

        return list1;
    }
}
