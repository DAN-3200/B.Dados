package com.banco.banco.controller;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RestController;
    import com.banco.banco.banco.UsuarioBanco;
    import com.banco.banco.entidade.Usuario;
    import java.util.List;
    import java.util.Optional;

@RestController
public class UsuarioController{
    @Autowired
    private UsuarioBanco acessoBanco;

    @GetMapping("/usuarios")
    public List<Usuario> ListarUsuarios(){
        return (List<Usuario>) acessoBanco.findAll();
    }

    @GetMapping("/ususario/{id}")
    public Optional<Usuario> peguePorId(@PathVariable int id){
        return acessoBanco.findById(id);
    }
    
}