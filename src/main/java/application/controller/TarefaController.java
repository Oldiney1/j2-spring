package application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Tarefa;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @RequestMapping("/list")
    public String list(Model doguinho){
        
        doguinho.addAttribute("tarefas", tarefas);
        return "list";
    }

    @RequestMapping(value = "/insert", method =  RequestMethod.POST)
    public String add(@RequestParam("tarefa") String nomeTarefa){
        tarefas.add(new Tarefa(0, nomeTarefa));
        return "redirect:/tarefas/list";
    }
}
