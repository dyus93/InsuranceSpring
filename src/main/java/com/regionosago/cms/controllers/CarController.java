package com.regionosago.cms.controllers;

import com.regionosago.cms.dto.CarDto;
import com.regionosago.cms.persistence.entities.Image;
import com.regionosago.cms.services.CarService;
import com.regionosago.cms.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

//    @GetMapping("/{id}")
//    public String getOne(Model model, @PathVariable String id){
//       carService.getOneById(UUID.fromString(id)).ifPresent(
//               car -> model.addAttribute("car", car)
//                );
//        return "cars";
//    }

    @GetMapping
    public String CarPage(Model model){
        model.addAttribute("cars", carService.findAllCars());
        return "cars";
    }

    @PostMapping
    public String addCar(@RequestParam("image") MultipartFile image, CarDto carDto) throws IOException{
        Image img = imageService.uploadImage(image, carDto.getModel());
        carService.save(carDto, img);
        return "redirect:/";
    }

    @GetMapping("/remove/{id}")
    public String deleteCar( @PathVariable UUID id){
        carService.deleteById(id);
        return "redirect:/cars";
    }

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
