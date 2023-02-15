package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.*;
import usach.DBD.grupo15.proyecto.Service.RolPermisosService;
import usach.DBD.grupo15.proyecto.Service.RolService;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/RolPermisos")
public class RolPermisosREST {

    @Autowired
    private RolPermisosService rolPermisosService;

    @GetMapping
    private ResponseEntity<List<RolPermisos>> getAllRolPermisos() {
        return ResponseEntity.ok(rolPermisosService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<RolPermisos>> getRolPermisos(@PathVariable Long id) {
        return ResponseEntity.ok(rolPermisosService.findById(id));
    }

    @PostMapping
    private ResponseEntity<RolPermisos> saveRolPermisos(@RequestBody RolPermisos rolPermisos) {
        try {
            RolPermisos rolPermisos1 = rolPermisosService.save(rolPermisos);
            return ResponseEntity.created(new URI("/RolPermisos" + rolPermisos1.getId_rol_permiso())).body(rolPermisos1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    @PutMapping("/{id}")
    private ResponseEntity<RolPermisos> updateRolPermisos(@RequestBody RolPermisos rolPermisos, @PathVariable Long id){
        try{
            rolPermisos.setId_rol_permiso(id);
            RolPermisos rolPermisos1 = rolPermisosService.save(rolPermisos);
            return  ResponseEntity.created(new URI("/RolPermisos"+rolPermisos1.getId_rol_permiso())).body(rolPermisos1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }


    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteRolPermisos(@PathVariable Long id){
        try{
            rolPermisosService.deleteById(id);
            return new ResponseEntity<Long>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
