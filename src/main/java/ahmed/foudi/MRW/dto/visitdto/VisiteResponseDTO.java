package ahmed.foudi.MRW.dto.visitdto;

import ahmed.foudi.MRW.dto.visitorDTO.VisitorEmbddedDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomEmbddedDTO;
import ahmed.foudi.MRW.entities.Status;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Data
public class VisiteResponseDTO {
    private VisitEmbddedDTO id;
    private VisitorEmbddedDTO visitor;
    private WaitingRoomEmbddedDTO waitingRoom;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Status status;
    private byte priority;
    private Duration estimatedProcessTime;
}
