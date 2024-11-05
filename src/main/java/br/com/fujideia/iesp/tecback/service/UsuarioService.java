package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.entity.Usuario;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        // Implementar lógica de salvamento
        return null;
    }

    public Usuario buscarPorId(Long id) {
        // Implementar lógica de busca por ID
        return null;
    }

    public List<Usuario> listarTodos() {
        // Implementar lógica de listagem de todos os usuários
        return null;
    }

    public void deletar(Long id) {
        // Implementar lógica de deleção
    }
}