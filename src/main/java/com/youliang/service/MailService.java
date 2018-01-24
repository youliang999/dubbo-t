package com.youliang.service;

import com.youliang.model.EImail;
import com.youliang.model.SendResult;
import com.youliang.model.Sender;

/**
 * Created by youliang.cheng on 2018/1/22.
 */
public interface MailService {
    SendResult sendMail(Sender sender, EImail eImail);

    String testMsg(String msg);
}
