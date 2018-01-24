package com.youliang.enums;

/**
 * Created by youliang.cheng on 2017/12/25.
 */
public enum FileTypeEnum {
    PIC(1, "PIC"),
    WORD(2, "WORD"),
    EXCEL(3, "EXCEL"),
    PDF(4, "PDF"),
    TXT(5, "TXT");

    private int code;
    private String desc;

    FileTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }

    public static FileTypeEnum parse(int code) {
        for(FileTypeEnum fileTypeEnum : FileTypeEnum.values()) {
            if(fileTypeEnum.getCode() == code) {
                return fileTypeEnum;
            }
        }
        return null;
    }
}