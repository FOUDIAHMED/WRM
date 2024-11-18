package ahmed.foudi.MRW.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class EmbdedId {

    @Column(name = "visitor_id")
    Long visitorId;

    @Column(name = "waitingRoomId")
    Long waitingRoomId;


}
