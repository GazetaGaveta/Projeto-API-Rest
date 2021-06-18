package one.digitalinovation.personAPI.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinovation.personAPI.enums.PhoneType;

import javax.persistence.*;


@Entity
/*Notações Lombok*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/*-------------------*/
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false, unique = true)
    private String number;

}
