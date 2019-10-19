package site.laodengtou.imfileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import site.laodengtou.imfileservice.service.FastFileService;

@RestController
public class FileController {

    @Autowired
    FastFileService fileService;

    @PostMapping("/sendImg")
    public String sendImg(MultipartFile file) {
        if (file != null) {
            return fileService.saveImages(file);
        }
        return null;
    }
}
