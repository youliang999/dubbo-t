package com.youliang.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * Created by youliang.cheng on 2017/12/25.
 */
@ToString
public class SendResult implements Serializable {

    private boolean result = true;
    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

}
