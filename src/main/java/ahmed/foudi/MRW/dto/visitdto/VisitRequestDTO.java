package ahmed.foudi.MRW.dto.visitdto;

import ahmed.foudi.MRW.entities.Status;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Data
public class VisitRequestDTO {
    private Long visitorId;
    private Long waitingRoomId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Status status;
    private byte priority;
    private Duration estimatedProcessTime;
}
