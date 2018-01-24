package com.youliang.model;


import com.youliang.enums.FileTypeEnum;
import org.apache.commons.lang3.Validate;

import java.io.Serializable;

/**
 * Created by youliang.cheng on 2017/12/25.
 */
public class MailFiles implements Serializable {

    private String filePath;
    private String fileName;
    private FileTypeEnum fileType;
    private boolean isShow = false;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileTypeEnum getFileType() {
        return fileType;
    }

    public void setFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    @Override
    public String toString() {
        Validate.isTrue(isShow(), "1231");
        return "MailFiles{" +
                "filePath='" + filePath + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType=" + fileType +
                ", isShow=" + isShow +
                '}';

    }

}
