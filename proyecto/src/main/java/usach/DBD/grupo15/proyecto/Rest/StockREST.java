package usach.DBD.grupo15.proyecto.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Stock;
import usach.DBD.grupo15.proyecto.Service.StockService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/Stock")
public class StockREST {
    @Autowired
    private StockService stockService;

    @GetMapping
    private ResponseEntity<List<Stock>> getStocks(){
        return ResponseEntity.ok(stockService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Stock> getStock(@PathVariable Long id){
        return ResponseEntity.ok(stockService.getById(id));
    }

    @PostMapping
    private ResponseEntity<Stock> saveStock(@RequestBody Stock stock){
        try{
            Stock stock1 = stockService.save(stock);
            return ResponseEntity.created(new URI("/Stock"+stock1.getId_stock())).body(stock1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Stock> updateStock(@RequestBody Stock stock, @PathVariable Long id){
        try{
            stock.setId_stock(id);
            Stock stock1 = stockService.save(stock);
            return ResponseEntity.created(new URI("/Stock"+stock1.getId_stock())).body(stock1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteStock(@PathVariable Long id){
        try {
            stockService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
