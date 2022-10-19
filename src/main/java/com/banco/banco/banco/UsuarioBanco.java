package com.banco.banco.banco;
    import org.springframework.data.repository.CrudRepository;
    import org.springframework.stereotype.repository;
    import com.banco.banco.entidade.Usuario;
@repository
public interface UsuarioBanco extends CrudRepository< Integer, Usuario{
    
}