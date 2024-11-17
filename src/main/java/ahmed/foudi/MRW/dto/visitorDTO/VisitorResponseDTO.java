package ahmed.foudi.MRW.dto.visitorDTO;

import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class VisitorResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private List<VisiteResponseDTO> visits;
}
