package site.laodengtou.imfileservice.service.impl;

import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import site.laodengtou.imfileservice.service.FastFileService;

@Service
public class FastFileServiceImpl implements FastFileService {

    @Autowired
    FastFileStorageClient storageClient;

    Logger logger = LoggerFactory.getLogger(FastFileService.class);
    @Override
    public String saveImages(MultipartFile img) {
        String fileTyle = img.getContentType();
        logger.info("文件类型:"+img.getContentType());
        if(fileTyle.equals("image/jpeg")||fileTyle.equals("image/png")){
            return "上传成功";
        }else{
            return "图片格式不正确";
        }
    }
}
