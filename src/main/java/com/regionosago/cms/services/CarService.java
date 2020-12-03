package com.regionosago.cms.services;

import com.regionosago.cms.dto.CarDto;
import com.regionosago.cms.persistence.entities.Cars;
import com.regionosago.cms.persistence.entities.Image;
import com.regionosago.cms.persistence.repositories.CarRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService{

    private final CarRepository carRepository;

    public Optional<Cars> getOneById(UUID id){
        return carRepository.findById(id);
    }

    public List<Cars> findAllCars(){
        return carRepository.findAll();
    }

    public void deleteById(UUID id){
        carRepository.deleteById(id);
    }

    public String save(CarDto carDto, Image image){
        Cars car = Cars.builder()
                .carYear(carDto.getYear())
                .model(carDto.getModel())
                .serial(carDto.getSerial())
                .number(carDto.getNumber())
                .vinCode(carDto.getVinCode())
//            .status(carDto.getStatus())
//            .to(carDto.getTo())
                .image(image)
            .build();

        carRepository.save(car);
        log.info("New Car added {}", car);
        return "redirect:/";
    }
}
