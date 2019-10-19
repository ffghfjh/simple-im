package site.laodengtou.imfileservice.service;

import org.springframework.web.multipart.MultipartFile;

public interface FastFileService {

    /**
     * 储存图片
     *
     * @param img
     * @return
     */
    String saveImages(MultipartFile img);

}
