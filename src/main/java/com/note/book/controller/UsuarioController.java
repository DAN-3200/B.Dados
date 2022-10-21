package com.note.book.controller;
    // Tudo importação pra ultilizar Methods específicos
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    // import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;
    import com.note.book.banco.UsuarioBanco;
    import com.note.book.entidade.Usuario;
    import java.util.List;
    import java.util.Optional;

@RestController //Esqueci oq esse Arroba faz
public class UsuarioController{
    @Autowired
    private UsuarioBanco acessoBanco;

    @GetMapping("/usuarios")
    public List<Usuario> ListarUsuarios(){
        return (List<Usuario>) acessoBanco.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> peguePorId(@PathVariable int id){
        return acessoBanco.findById(id);
    }

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Usuario NovoUsuario){
        acessoBanco.save(NovoUsuario);
    }

    // @PutMapping("/alterar/{id}")
    // public void alterar(@PathVariable int id, @RequestBody Usuario usuario){
    //     acessoBanco.findById(id).map(user ->{
    //         user.setNome(usuario.getNome());
    //         user.setUsuario(usuario.getUsuario());
    //         user.setEmail(usuario.getEmail());
    //         user.setEmail(usuario.getSenha());
    //         return acessoBanco.save(user);
    //     })
    // }

}