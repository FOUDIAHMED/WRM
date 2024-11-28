package ahmed.foudi.MRW.controllers;

import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomRequestDTO;
import ahmed.foudi.MRW.dto.waitingroomDTO.WaitingRoomResponseDTO;
import ahmed.foudi.MRW.services.interfaces.WaitingRoomServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ahmed.foudi.MRW.services.impl.WaitingRoomServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/waiting-rooms")
@RequiredArgsConstructor
public class WaitingRoomController {
    private final WaitingRoomServiceI waitingRoomService;

    @PostMapping
    public ResponseEntity<WaitingRoomResponseDTO> createWaitingRoom(@RequestBody WaitingRoomRequestDTO waitingRoomRequest) {
        return ResponseEntity.ok(waitingRoomService.save(waitingRoomRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WaitingRoomResponseDTO> updateWaitingRoom(
            @PathVariable Long id,
            @RequestBody WaitingRoomRequestDTO waitingRoomRequest) {
        return ResponseEntity.ok(waitingRoomService.update(id, waitingRoomRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WaitingRoomResponseDTO> deleteWaitingRoom(@PathVariable Long id) {
        return ResponseEntity.ok(waitingRoomService.delete(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WaitingRoomResponseDTO> getWaitingRoom(@PathVariable Long id) {
        return ResponseEntity.ok(waitingRoomService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<WaitingRoomResponseDTO>> getAllWaitingRooms() {
        return ResponseEntity.ok(waitingRoomService.findAll());
    }
} 