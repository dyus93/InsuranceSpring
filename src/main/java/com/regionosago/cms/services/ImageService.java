package com.regionosago.cms.services;

import com.regionosago.cms.persistence.repositories.ImageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;

    private String getImageForCar(UUID id){
        return imageRepository.obtainImageNameByCar(id);
    }

    public BufferedImage loadFileAsResource(String id) throws IOException {
        try{
            String imageName = getImageForCar(UUID.fromString(id));
            Resource resource = new ClassPathResource("/static/images/" + imageName);
            if (resource.exists()){
                return ImageIO.read(resource.getFile());
            }else {
                log.info("Image not found");
                throw new FileNotFoundException("File " + imageName + " not found");

            }
        }catch (MalformedInputException | FileNotFoundException ex){
            return null;
        }
    }
}
