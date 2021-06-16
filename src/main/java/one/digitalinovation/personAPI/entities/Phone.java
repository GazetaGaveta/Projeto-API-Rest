package one.digitalinovation.personAPI.entities;

import one.digitalinovation.personAPI.enums.PhoneType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*Notações Lombok*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/*-------------------*/

/*Notações Lombok*/
@Entity
/*-------------------*/

public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false, unique = true)
    private String number;

}
