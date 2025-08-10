package com.example.demoSpringBoot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class FruitsController {

    @Autowired
    private FruitsServices fruitsServices;

    @GetMapping("/fruits")
    public ResponseEntity<List<Fruits>> getFruits(){
        return new ResponseEntity<>(fruitsServices.getAllFruits(), HttpStatus.OK);
    }

    @PostMapping("/fruits")
    public ResponseEntity<String> addFruits(@RequestBody Fruits fruit){
        String result = fruitsServices.addNewFruits(fruit);
        if(result.startsWith("Error")){
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
    }

    @GetMapping("/fruits/{id}")
    public ResponseEntity<?> getFruitById(@PathVariable int id){
        Fruits fruits = fruitsServices.getFruitById(id);

        if (fruits ==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fruits not found");
        }
        return ResponseEntity.ok(fruits);
    }

    @DeleteMapping("/fruits/{id}")
    public ResponseEntity<String> deleteFruitById(@PathVariable int id){
        boolean removed = fruitsServices.deleteFruitById(id);
        if (removed){
            return ResponseEntity.ok("Fruit delete Successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fruit not found");
        }
    }

    @PutMapping("/fruits/{id}")
    public ResponseEntity<String> updateFruits(@PathVariable int id, @RequestBody Fruits updateFruit){
        boolean update = fruitsServices.updateFruit(id, updateFruit);
        if(update){
            return ResponseEntity.ok("Fruit update successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fruit not found");
        }
    }
}
