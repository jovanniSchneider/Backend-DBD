package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Permisos;
import usach.DBD.grupo15.proyecto.Service.PermisosService;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Permisos")
public class PermisosREST {

    @Autowired
    private PermisosService permisosService;

    @GetMapping
    private ResponseEntity<List<Permisos>> getAllPermisos() {
        return ResponseEntity.ok(permisosService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Permisos>> getPermisos(@PathVariable Long id) {
        return ResponseEntity.ok(permisosService.findById(id));
    }

    @PostMapping
    private ResponseEntity<Permisos> createPermisos(@RequestBody Permisos permisos) throws URISyntaxException {
        permisosService.save(permisos);
        return ResponseEntity.ok(permisos);
    }

    @PutMapping("/{id}")
    private ResponseEntity<Permisos> updatePermisos(@PathVariable("id") Long id, @RequestBody Permisos permisos) throws URISyntaxException {
        permisos.setId_permiso(id);
        permisosService.save(permisos);
        return ResponseEntity.ok(permisos);
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deletePermiso(@PathVariable Long id){
        try{
            permisosService.deleteById(id);
            return new ResponseEntity<Long>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}