package one.digitalinovation.personAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*Notações Lombok*/
@Getter
@AllArgsConstructor
/*-------------------*/

public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
