package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Mediodepago;
import usach.DBD.grupo15.proyecto.Model.Producto;
import usach.DBD.grupo15.proyecto.Service.MediodePagoService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/MedioPago")
public class MediodePagoREST {
    @Autowired
    private MediodePagoService mediodePagoService;

    @GetMapping
    private ResponseEntity<List<Mediodepago>> getAllMediosPago(){
        return ResponseEntity.ok(mediodePagoService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Mediodepago>> getMedioPago(@PathVariable Long id){
        return ResponseEntity.ok(mediodePagoService.findById(id));
    }

    @PostMapping
    private ResponseEntity<Mediodepago> saveMedioPago(@RequestBody Mediodepago mediodepago){
        try{
            Mediodepago mediodepago1 = mediodePagoService.save(mediodepago);
            return ResponseEntity.created(new URI("/MedioPago"+mediodepago1.getCodigo_pago())).body(mediodepago1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Mediodepago> updateMedio(@RequestBody Mediodepago mediodepago,@PathVariable Long id){
        try{
            mediodepago.setCodigo_pago(id);
            Mediodepago mediodepago1 = mediodePagoService.save(mediodepago);
            return ResponseEntity.created(new URI("/MedioPago"+mediodepago1.getCodigo_pago())).body(mediodepago1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deteleMedio(@PathVariable Long id){
        try{
            mediodePagoService.deleteById(id);
            return new ResponseEntity<Long>(id, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
