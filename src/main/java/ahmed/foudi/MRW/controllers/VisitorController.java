package ahmed.foudi.MRW.controllers;

import ahmed.foudi.MRW.dto.visitorDTO.VisitorRequestDTO;
import ahmed.foudi.MRW.dto.visitorDTO.VisitorResponseDTO;
import ahmed.foudi.MRW.services.interfaces.VisitorServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/visitors")
@RequiredArgsConstructor
public class VisitorController {
    private final VisitorServiceI visitorService;

    @PostMapping
    public ResponseEntity<VisitorResponseDTO> createVisitor(@RequestBody VisitorRequestDTO visitorRequest) {
        return ResponseEntity.ok(visitorService.save(visitorRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VisitorResponseDTO> updateVisitor(
            @PathVariable Long id,
            @RequestBody VisitorRequestDTO visitorRequest) {
        return ResponseEntity.ok(visitorService.update(id, visitorRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<VisitorResponseDTO> deleteVisitor(@PathVariable Long id) {
        return ResponseEntity.ok(visitorService.delete(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisitorResponseDTO> getVisitor(@PathVariable Long id) {
        return ResponseEntity.ok(visitorService.find(id));
    }

    @GetMapping
    public ResponseEntity<List<VisitorResponseDTO>> getAllVisitors() {
        return ResponseEntity.ok(visitorService.findAll());
    }
} 