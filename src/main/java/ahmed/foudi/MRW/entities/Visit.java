package ahmed.foudi.MRW.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity

@Data
public class Visit {
    @EmbeddedId
    private EmbdedId id;

    @ManyToOne
    @MapsId("visitorId")
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    @ManyToOne
    @MapsId("waitingRoomId")
    @JoinColumn(name = "waitingRoomId")
    private WaitingRoom waitingRoom;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Status status;
    private byte priority;
    private Duration estimatedProcessTime;


}
