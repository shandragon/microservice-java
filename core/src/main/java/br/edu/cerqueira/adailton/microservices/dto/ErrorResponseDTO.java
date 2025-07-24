package br.edu.cerqueira.adailton.microservices.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ErrorResponseDTO {
    private final int status;
    private final String message;
    private final LocalDateTime timestamp;
    private List<String> details;

    public ErrorResponseDTO(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
