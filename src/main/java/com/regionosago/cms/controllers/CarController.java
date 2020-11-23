package com.regionosago.cms.controllers;

import com.regionosago.cms.persistence.entities.Cars;
import com.regionosago.cms.services.CarService;
import com.regionosago.cms.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cars")
public class CarController {

    private final ImageService imageService;
    private final CarService carService;


    public String getOne(Model model, @PathVariable String id){
       model.addAttribute("cars", carService.getOneById(UUID.fromString(id)));
        return "cars";
    }

//    @GetMapping("car-create")
//    public String createCarForm(Cars car){
//        return "car-create"; //создать html страницу с таким названием
//    }

//    @PostMapping("/car-create")
//    public String createCar(Cars car){
//        carService.saveCar(car);
//        return "redirect:/cars";
//    }

//    @GetMapping("car-delete/{id}")
//    public String deleteCar(@PathVariable("id") UUID id){
//        carService.deleteById(id);
//        return "redirect:/cars";
//    }

//    @GetMapping("car-update/{id}")
//    public String updateCarForm(@PathVariable("id") UUID id, Model model){
//        Optional<Cars> car = carService.findById(id);
//        model.addAttribute("car", car);
//        return "/car-update";
//    }

//    @PostMapping("/cars")
//    public String updateCar(Cars car){
//        carService.saveCar(car);
//        return "redirect:/cars";
//    }

    @GetMapping(value = "/images/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody
    byte[] getImage(@PathVariable String id){
        try{
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(imageService.loadFileAsResource(id), "jpg", byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
