package co.edu.ucentral.manejadorUniveridades.controladores;

import co.edu.ucentral.manejadorUniveridades.entidades.ProductoTecnologico;
import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioProductoTecnologico;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/productostecnologicos")
public class ControladorProductoTecnologico {
    @Autowired
    private ServicioProductoTecnologico servicioProductoTecnologico;

    @PostMapping("/")
    public void crear(@RequestBody ProductoTecnologico productoTecnologico){this.servicioProductoTecnologico.registrar(productoTecnologico);}

    @DeleteMapping("/{codigo}")
    public String borrar(@PathVariable Long codigo){this.servicioProductoTecnologico.borrar(codigo);
            return "ok";
    }

    @GetMapping("/")
    public List<ProductoTecnologico> consultar(){
        return this.servicioProductoTecnologico.consultarTodos();
    }
}
