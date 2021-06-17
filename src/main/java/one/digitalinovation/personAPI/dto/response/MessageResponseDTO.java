package one.digitalinovation.personAPI.dto.response;

import lombok.Builder;
import lombok.Data;

/*Notações Lombok*/
@Data
@Builder
/*-------------------*/
public class MessageResponseDTO {
    private String message;
}
