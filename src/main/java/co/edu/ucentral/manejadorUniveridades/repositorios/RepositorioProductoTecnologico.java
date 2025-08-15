package co.edu.ucentral.manejadorUniveridades.repositorios;
import co.edu.ucentral.manejadorUniveridades.entidades.ProductoTecnologico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProductoTecnologico  extends JpaRepository<ProductoTecnologico, Long>{
    void deleteByCodigo(long codigo);
}
