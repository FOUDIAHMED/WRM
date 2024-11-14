package ahmed.foudi.MRW.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmbdedId {

    @Column(name = "visitor_id")
    Long visitorId;

    @Column(name = "waitingRoomId")
    Long waitingRoomId;


}
