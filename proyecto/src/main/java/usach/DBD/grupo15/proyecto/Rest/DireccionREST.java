package usach.DBD.grupo15.proyecto.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Direccion;
import usach.DBD.grupo15.proyecto.Model.Producto;
import usach.DBD.grupo15.proyecto.Service.DireccionService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Direccion")
public class DireccionREST {
    @Autowired
    private DireccionService direccionService;

    @GetMapping
    private ResponseEntity<List<Direccion>> getAllDirecciones(){
        return ResponseEntity.ok(direccionService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Direccion>> getDireccion(@PathVariable Long id){
        return ResponseEntity.ok(direccionService.findById(id));
    }

    @PostMapping
    private ResponseEntity<Direccion> saveDireccion(@RequestBody Direccion direccion){
        try{
            Direccion direccion1 = direccionService.save(direccion);
            return ResponseEntity.created(new URI("/Direccion"+direccion1.getId_direccion())).body(direccion1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PostMapping(value = "/{id}")
    private ResponseEntity<Direccion> updateDireccion(@RequestBody Direccion direccion, @PathVariable Long id){
        try{
            direccion.setId_direccion(id);
            Direccion direccion1 = direccionService.save(direccion);
            return ResponseEntity.created(new URI("/Direccion"+direccion1.getId_direccion())).body(direccion1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Boolean> deleteDireccion(@PathVariable Long id){
        direccionService.deleteById(id);
        return ResponseEntity.ok(direccionService.findById(id).isEmpty());
    }



}
