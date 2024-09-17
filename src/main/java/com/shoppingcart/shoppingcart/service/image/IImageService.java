package com.shoppingcart.shoppingcart.service.image;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.shoppingcart.shoppingcart.dto.ImageDto;
import com.shoppingcart.shoppingcart.model.Image;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImage(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
