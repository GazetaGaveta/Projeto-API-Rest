package one.digitalinovation.personAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/*Notações Lombok*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/*-------------------*/

public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 3, max = 30)
    private String country;

    @NotEmpty
    @Size(min = 3, max = 30)
    private String state;

    @NotEmpty
    @Size(min = 3, max = 30)
    private String city;

    @NotEmpty
    @Size(min = 3, max = 30)
    private String neighborhood;

    @NotEmpty
    @Size(min = 3, max = 60)
    private String street;

    @NotNull
    @Size(min = 3, max = 7)
    private String number;
}
