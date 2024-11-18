package ahmed.foudi.MRW.mapper;

import ahmed.foudi.MRW.dto.visitdto.VisitEmbddedDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorEmbddedDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomEmbddedDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomRequestDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomResponseDTO;
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
public class WaitingRoomMapperImpl implements WaitingRoomMapper {

    @Override
    public WaitingRoom toEntity(WaitingRoomRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        WaitingRoom waitingRoom = new WaitingRoom();

        waitingRoom.setDate( dto.getDate() );
        waitingRoom.setAlgorithme( dto.getAlgorithme() );
        waitingRoom.setCapacity( dto.getCapacity() );

        return waitingRoom;
    }

    @Override
    public WaitingRoomResponseDTO toDto(WaitingRoom entity) {
        if ( entity == null ) {
            return null;
        }

        WaitingRoomResponseDTO waitingRoomResponseDTO = new WaitingRoomResponseDTO();

        waitingRoomResponseDTO.setId( entity.getId() );
        waitingRoomResponseDTO.setDate( entity.getDate() );
        waitingRoomResponseDTO.setAlgorithme( entity.getAlgorithme() );
        waitingRoomResponseDTO.setCapacity( entity.getCapacity() );
        waitingRoomResponseDTO.setVisits( visitListToVisiteResponseDTOList( entity.getVisits() ) );

        return waitingRoomResponseDTO;
    }

    @Override
    public WaitingRoomEmbddedDTO toEmbeddedDto(WaitingRoom entity) {
        if ( entity == null ) {
            return null;
        }

        WaitingRoomEmbddedDTO waitingRoomEmbddedDTO = new WaitingRoomEmbddedDTO();

        waitingRoomEmbddedDTO.setId( entity.getId() );
        waitingRoomEmbddedDTO.setDate( entity.getDate() );
        waitingRoomEmbddedDTO.setAlgorithme( entity.getAlgorithme() );
        waitingRoomEmbddedDTO.setCapacity( entity.getCapacity() );

        return waitingRoomEmbddedDTO;
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

    protected VisitorEmbddedDTO visitorToVisitorEmbddedDTO(Visitor visitor) {
        if ( visitor == null ) {
            return null;
        }

        VisitorEmbddedDTO visitorEmbddedDTO = new VisitorEmbddedDTO();

        visitorEmbddedDTO.setId( visitor.getId() );
        visitorEmbddedDTO.setFirstName( visitor.getFirstName() );
        visitorEmbddedDTO.setLastName( visitor.getLastName() );

        return visitorEmbddedDTO;
    }

    protected VisiteResponseDTO visitToVisiteResponseDTO(Visit visit) {
        if ( visit == null ) {
            return null;
        }

        VisiteResponseDTO visiteResponseDTO = new VisiteResponseDTO();

        visiteResponseDTO.setId( embdedIdToVisitEmbddedDTO( visit.getId() ) );
        visiteResponseDTO.setVisitor( visitorToVisitorEmbddedDTO( visit.getVisitor() ) );
        visiteResponseDTO.setWaitingRoom( toEmbeddedDto( visit.getWaitingRoom() ) );
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
