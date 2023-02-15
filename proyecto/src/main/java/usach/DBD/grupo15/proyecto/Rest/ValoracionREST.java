package usach.DBD.grupo15.proyecto.Rest;

import ch.qos.logback.classic.spi.EventArgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Valoracion;
import usach.DBD.grupo15.proyecto.Repository.ValoracionRepository;
import usach.DBD.grupo15.proyecto.Service.ValoracionService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/Valoracion")
public class ValoracionREST {
    @Autowired
    private ValoracionService valoracionService;

    @GetMapping
    private ResponseEntity<List<Valoracion>> getValoraciones(){
        return ResponseEntity.ok(valoracionService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Valoracion> getValoracion(@PathVariable Long id){
        return ResponseEntity.ok(valoracionService.getById(id));
    }

    @PostMapping
    private ResponseEntity<Valoracion> saveValoracion(@RequestBody Valoracion valoracion){
        List<Valoracion> valoraciones = valoracionService.findAll();
        for (Valoracion valoracione : valoraciones) {
            if (Objects.equals(valoracion.getUser().getId_user(), valoracione.getUser().getId_user())) {
                if (Objects.equals(valoracion.getPyme().getId_pyme(), valoracione.getPyme().getId_pyme())){
                    return new ResponseEntity<>(HttpStatus.CONFLICT);
                }
            }
        }
        try{
            Valoracion valoracion1 = valoracionService.save(valoracion);
            return ResponseEntity.created(new URI("/Valoracion"+valoracion1.getId_valoracion())).body(valoracion1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Valoracion> updateValoracion(@RequestBody Valoracion valoracion, @PathVariable Long id){
        try{
            valoracion.setId_valoracion(id);
            Valoracion valoracion1 = valoracionService.save(valoracion);
            return ResponseEntity.created(new URI("/Valoracion"+valoracion1.getId_valoracion())).body(valoracion1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteValoracion(@PathVariable Long id){
        try {
            valoracionService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
