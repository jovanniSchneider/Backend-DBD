package usach.DBD.grupo15.proyecto.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Direccion;
import usach.DBD.grupo15.proyecto.Model.Pyme;
import usach.DBD.grupo15.proyecto.Service.DireccionService;
import usach.DBD.grupo15.proyecto.Service.PymeService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/Pyme")
public class PymeREST {
    @Autowired
    private PymeService pymeService;

    @Autowired
    private DireccionService direccionService;

    @GetMapping
    private ResponseEntity<List<Pyme>> getPymes(){
        return ResponseEntity.ok(pymeService.findAll());
    }

    @GetMapping(value = "/Filtered/{id_direccion}")
    private ResponseEntity<List<Pyme>> getPymes(@PathVariable Long id_direccion){
        Direccion direccion = direccionService.getById(id_direccion);
        List<Pyme> pymes = pymeService.findAll();
        List<Pyme> retorno = new ArrayList<>();
        for (Pyme pyme : pymes) {
            if (Objects.equals(direccion.getRegion(), pyme.getUser().getDireccion().getRegion())) {
                retorno.add(pyme);
            }
        }
        return ResponseEntity.ok(retorno);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Pyme> getPyme(@PathVariable Long id){
        return ResponseEntity.ok(pymeService.getById(id));
    }

    @PostMapping
    private ResponseEntity<Pyme> savePyme(@RequestBody Pyme pyme){
        try{
            Pyme pyme1 = pymeService.save(pyme);
            return ResponseEntity.created(new URI("/Pyme"+pyme1.getId_pyme())).body(pyme1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Pyme> updatePyme(@RequestBody Pyme pyme, @PathVariable Long id){
        try{
            pyme.setId_pyme(id);
            Pyme pyme1 = pymeService.save(pyme);
            return ResponseEntity.created(new URI("/Pyme"+pyme1.getId_pyme())).body(pyme1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deletePyme(@PathVariable Long id){
        try{
            pymeService.deleteById(id);
            return new ResponseEntity<Long>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
