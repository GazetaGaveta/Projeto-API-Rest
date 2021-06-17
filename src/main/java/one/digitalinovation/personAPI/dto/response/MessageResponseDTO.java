package one.digitalinovation.personAPI.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/*Notações Lombok*/
@Data
@Builder
/*-------------------*/
public class MessageResponseDTO {
    private String message;
}
