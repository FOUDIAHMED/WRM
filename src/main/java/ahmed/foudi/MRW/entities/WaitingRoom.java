package ahmed.foudi.MRW.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Data
public class WaitingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String algorithme;
    @Column(nullable = false)
    private  int capacity;

}
