package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Carrito;
import usach.DBD.grupo15.proyecto.Model.Direccion;
import usach.DBD.grupo15.proyecto.Model.Producto;
import usach.DBD.grupo15.proyecto.Model.User;
import usach.DBD.grupo15.proyecto.Service.CarritoService;
import usach.DBD.grupo15.proyecto.Service.DireccionService;
import usach.DBD.grupo15.proyecto.Service.UserService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserREST {
    @Autowired
    private UserService userService;
    @Autowired
    private CarritoService carritoService;

    @Autowired
    private DireccionService direccionService;

    @GetMapping
    private ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.findAll());
    }


    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<User>> getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping()
    private ResponseEntity<User> saveUser(@RequestBody User user){
        try{
            User user1 = userService.save(user);
            return ResponseEntity.created(new URI("/User"+user1.getId_user())).body(user1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping(value = "/{id}")
    private ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id){
        try{
            user.setId_user(id);
            User user1 = userService.save(user);
            return ResponseEntity.created(new URI("/User"+user.getId_user())).body(user);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteUser(@PathVariable Long id){
        try{
            userService.deleteById(id);
            return new ResponseEntity<Long>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/login")
    private User matchUser(@RequestBody User user){
        List<User> userList = userService.findAll();
        for (User user1 : userList) {
            if (Objects.equals(user1.getEmail(), user.getEmail())) {
                if (Objects.equals(user.getPassword(), user1.getPassword())){
                    user1.setPassword("Campo privado");
                    return user1;
                }

                else {
                    return null;
                }
            }
        }
        return null;
    }
}
