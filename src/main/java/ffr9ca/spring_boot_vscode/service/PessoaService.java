package ffr9ca.spring_boot_vscode.service;

import java.util.List;

import ffr9ca.spring_boot_vscode.model.Pessoa;
import ffr9ca.spring_boot_vscode.repository.PessoaRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {
    
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }
    
}