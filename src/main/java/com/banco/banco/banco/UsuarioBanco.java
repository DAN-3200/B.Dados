package com.banco.banco.banco;
    import org.springframework.data.repository.CrudRepository;
    import org.springframework.stereotype.Repository;
    import com.banco.banco.entidade.Usuario;
@Repository
public interface UsuarioBanco extends CrudRepository<Usuario, Integer>{
    
}