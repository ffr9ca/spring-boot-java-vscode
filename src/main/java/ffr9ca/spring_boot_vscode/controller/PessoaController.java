package ffr9ca.spring_boot_vscode.controller;

import java.util.List;

import ffr9ca.spring_boot_vscode.model.Pessoa;
import ffr9ca.spring_boot_vscode.service.PessoaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PessoaController {
    
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }
}