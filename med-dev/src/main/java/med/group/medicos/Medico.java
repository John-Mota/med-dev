package med.group.medicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.group.endereco.Endereco;

@Table(name = "medicos")
@Entity(name =  "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private  String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    private Endereco endereco;

}
