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
    date = "2024-11-19T09:36:42+0100",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class WaitingRoomMapperImpl implements WaitingRoomMapper {

    @Override
    public WaitingRoom toEntity(WaitingRoomRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        WaitingRoom waitingRoom = new WaitingRoom();

        waitingRoom.setAlgorithme( dto.getAlgorithme() );
        waitingRoom.setCapacity( dto.getCapacity() );
        waitingRoom.setDate( dto.getDate() );

        return waitingRoom;
    }

    @Override
    public WaitingRoomResponseDTO toDto(WaitingRoom entity) {
        if ( entity == null ) {
            return null;
        }

        WaitingRoomResponseDTO waitingRoomResponseDTO = new WaitingRoomResponseDTO();

        waitingRoomResponseDTO.setAlgorithme( entity.getAlgorithme() );
        waitingRoomResponseDTO.setCapacity( entity.getCapacity() );
        waitingRoomResponseDTO.setDate( entity.getDate() );
        waitingRoomResponseDTO.setId( entity.getId() );
        waitingRoomResponseDTO.setVisits( visitListToVisiteResponseDTOList( entity.getVisits() ) );

        return waitingRoomResponseDTO;
    }

    @Override
    public WaitingRoomEmbddedDTO toEmbeddedDto(WaitingRoom entity) {
        if ( entity == null ) {
            return null;
        }

        WaitingRoomEmbddedDTO waitingRoomEmbddedDTO = new WaitingRoomEmbddedDTO();

        waitingRoomEmbddedDTO.setAlgorithme( entity.getAlgorithme() );
        waitingRoomEmbddedDTO.setCapacity( entity.getCapacity() );
        waitingRoomEmbddedDTO.setDate( entity.getDate() );
        waitingRoomEmbddedDTO.setId( entity.getId() );

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

        visitorEmbddedDTO.setFirstName( visitor.getFirstName() );
        visitorEmbddedDTO.setId( visitor.getId() );
        visitorEmbddedDTO.setLastName( visitor.getLastName() );

        return visitorEmbddedDTO;
    }

    protected VisiteResponseDTO visitToVisiteResponseDTO(Visit visit) {
        if ( visit == null ) {
            return null;
        }

        VisiteResponseDTO visiteResponseDTO = new VisiteResponseDTO();

        visiteResponseDTO.setEndTime( visit.getEndTime() );
        visiteResponseDTO.setEstimatedProcessTime( visit.getEstimatedProcessTime() );
        visiteResponseDTO.setId( embdedIdToVisitEmbddedDTO( visit.getId() ) );
        visiteResponseDTO.setPriority( visit.getPriority() );
        visiteResponseDTO.setStartTime( visit.getStartTime() );
        visiteResponseDTO.setStatus( visit.getStatus() );
        visiteResponseDTO.setVisitor( visitorToVisitorEmbddedDTO( visit.getVisitor() ) );
        visiteResponseDTO.setWaitingRoom( toEmbeddedDto( visit.getWaitingRoom() ) );

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
