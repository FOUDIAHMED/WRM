package ahmed.foudi.MRW.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

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

    @OneToMany(mappedBy = "waitingRoom" , fetch = FetchType.EAGER)
    private List<Visit> visits;

}
