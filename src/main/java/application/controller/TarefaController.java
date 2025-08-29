package application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.Tarefa;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @RequestMapping("/list")
    public String list(Model doguinho){
        tarefas.add(new Tarefa(1, "Aprender java"));
        tarefas.add(new Tarefa(2, "Aprender IOT"));
        

        doguinho.addAttribute("tarefas", tarefas);
        return "list";
    }
}
