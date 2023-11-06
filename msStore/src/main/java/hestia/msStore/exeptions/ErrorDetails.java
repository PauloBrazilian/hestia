package hestia.msStore.exeptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
}