package com.demo.SpringBoot.service;

import com.demo.SpringBoot.model.Usuario;
import com.demo.SpringBoot.repository.UsuarioRepo;
import exception.UserNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarUsuario() {
        return usuarioRepo.findAll();
    }

    public Usuario editarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepo.findById(id).orElseThrow(() -> new UserNotFoundException("usuario no encontrado"
        ));
    }
}
