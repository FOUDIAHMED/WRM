package ahmed.foudi.MRW.dto.waitingroomDTO;

import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class WaitingRoomResponseDTO {
    private Long id;
    private LocalDate date;
    private String algorithme;
    private int capacity;
    private List<VisiteResponseDTO> visits;
}
