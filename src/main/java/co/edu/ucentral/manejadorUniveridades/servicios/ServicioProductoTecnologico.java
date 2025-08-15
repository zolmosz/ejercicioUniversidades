package co.edu.ucentral.manejadorUniveridades.servicios;

import co.edu.ucentral.manejadorUniveridades.entidades.ProductoTecnologico;
import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import co.edu.ucentral.manejadorUniveridades.repositorios.RepositorioProductoTecnologico;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServicioProductoTecnologico {
@Autowired
private RepositorioProductoTecnologico repositorioProductoTecnologico;

    public void registrar(ProductoTecnologico productoTecnologico){
        this.repositorioProductoTecnologico.save(productoTecnologico);
    }

    public List<ProductoTecnologico> consultarTodos(){
        return this.repositorioProductoTecnologico.findAll();
    }

    public void borrar(Long id){this.repositorioProductoTecnologico.deleteById(id);
    }
}
