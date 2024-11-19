package ahmed.foudi.MRW.controllers;

import ahmed.foudi.MRW.dto.visitdto.VisitRequestDTO;
import ahmed.foudi.MRW.dto.visitdto.VisiteResponseDTO;
import ahmed.foudi.MRW.services.impl.VisitServiceImpl;
import ahmed.foudi.MRW.services.interfaces.VisitServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/visits")
@RequiredArgsConstructor
public class VisitController {
    private final VisitServiceI visitService;

    @PostMapping
    public ResponseEntity<VisiteResponseDTO> createVisit(@RequestBody VisitRequestDTO visitRequest) {
        return ResponseEntity.ok(visitService.save(visitRequest));
    }

    @PutMapping("/{visitorId}/{waitingRoomId}")
    public ResponseEntity<VisiteResponseDTO> updateVisit(
            @PathVariable Long visitorId,
            @PathVariable Long waitingRoomId,
            @RequestBody VisitRequestDTO visitRequest) {
        return ResponseEntity.ok(visitService.update(visitorId, waitingRoomId, visitRequest));
    }

    @DeleteMapping("/{visitorId}/{waitingRoomId}")
    public ResponseEntity<VisiteResponseDTO> deleteVisit(
            @PathVariable Long visitorId,
            @PathVariable Long waitingRoomId) {
        return ResponseEntity.ok(visitService.delete(visitorId, waitingRoomId));
    }

    @GetMapping("/{visitorId}/{waitingRoomId}")
    public ResponseEntity<VisiteResponseDTO> getVisit(
            @PathVariable Long visitorId,
            @PathVariable Long waitingRoomId) {
        return ResponseEntity.ok(visitService.find(visitorId, waitingRoomId));
    }

    @GetMapping
    public ResponseEntity<List<VisiteResponseDTO>> getAllVisits() {
        return ResponseEntity.ok(visitService.findAll());
    }

    @GetMapping("/visitor/{visitorId}")
    public ResponseEntity<List<VisiteResponseDTO>> getVisitsByVisitor(@PathVariable Long visitorId) {
        return ResponseEntity.ok(visitService.findByVisitorId(visitorId));
    }


    @GetMapping("/waiting-room/{waitingRoomId}")
    public ResponseEntity<List<VisiteResponseDTO>> getVisitsByWaitingRoom(@PathVariable Long waitingRoomId) {
        return ResponseEntity.ok(visitService.findByWaitingRoomId(waitingRoomId));
    }
} 