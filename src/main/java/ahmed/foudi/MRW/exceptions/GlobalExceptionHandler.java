package ahmed.foudi.MRW.exceptions;

import ahmed.foudi.MRW.dto.error.ErrorDTO;
import ahmed.foudi.MRW.exceptions.visit.VisitNotFoundException;
import ahmed.foudi.MRW.exceptions.visitor.VisitorNotFoundException;
import ahmed.foudi.MRW.exceptions.waitingroom.WaitingRoomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VisitNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleVisitNotFoundException(VisitNotFoundException ex, WebRequest request) {
        return buildErrorResponse(ex.getMessage(), request, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(VisitorNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleVisitorNotFoundException(VisitorNotFoundException ex, WebRequest request) {
        return buildErrorResponse(ex.getMessage(), request, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WaitingRoomNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleWaitingRoomNotFoundException(WaitingRoomNotFoundException ex, WebRequest request) {
        return buildErrorResponse(ex.getMessage(), request, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> handleGlobalException(Exception ex, WebRequest request) {
        return buildErrorResponse(ex.getMessage(), request, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ErrorDTO> buildErrorResponse(String message, WebRequest request, HttpStatus status) {
        ErrorDTO errorDTO = ErrorDTO.builder()
                .message(message)
                .path(request.getDescription(false))
                .status(status.value())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorDTO, status);
    }
} 