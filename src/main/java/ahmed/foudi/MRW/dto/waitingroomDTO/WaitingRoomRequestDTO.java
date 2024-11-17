package ahmed.foudi.MRW.dto.waitingroomDTO;

import lombok.Data;
import java.time.LocalDate;

@Data
public class WaitingRoomRequestDTO {
    private LocalDate date;
    private String algorithme;
    private int capacity;
}
