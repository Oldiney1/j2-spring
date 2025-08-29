package application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tarefa {
    private long id;
    private String nome;    

    public Tarefa(long id, String nome){
        this.setId(id);
        this.setNome(nome);
    }
}
