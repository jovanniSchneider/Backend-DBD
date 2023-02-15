package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.*;
import usach.DBD.grupo15.proyecto.Service.RolService;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rol")
public class RolREST {
    @Autowired
    private RolService rolService;

    @GetMapping
    private ResponseEntity<List<Rol>> getAllRol(){
        return ResponseEntity.ok(rolService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Rol>> getRol(@PathVariable Long id){
        return ResponseEntity.ok(rolService.findById(id));
    }

    @PutMapping(value = "/User")
    @CrossOrigin("*")
    private ResponseEntity<Rol> getRolByUserId(@RequestBody User user){
        Rol rol = rolService.findByUser_Email(user.getEmail());
        rol.setUser(null);
        return ResponseEntity.ok(rol);
    }

    @PostMapping
    private ResponseEntity<Rol> saveRol(@RequestBody Rol rol){
        try{
            Rol rol1 = rolService.save(rol);
            return ResponseEntity.created(new URI("/Rol"+rol1.getId_rol())).body(rol1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping(value = "/{id}")
    private ResponseEntity<Rol> updateRol(@RequestBody Rol rol, @PathVariable Long id){
        try{
            rol.setId_rol(id);
            Rol rol1 = rolService.save(rol);
            return ResponseEntity.created(new URI("/Rol"+rol1.getId_rol())).body(rol1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteRol(@PathVariable Long id){
        try{
            rolService.deleteById(id);
            return new ResponseEntity<Long>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
