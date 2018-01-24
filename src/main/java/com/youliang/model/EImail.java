package com.youliang.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by youliang.cheng on 2017/12/25.
 */
public class EImail implements Serializable {

    private String topic;
    private List<String> receiver;
    private List<String> copyTo;
    private String content;
    private List<MailFiles> files;
    private List<String> attachs;

    public EImail(String topic, List<String> receiver, String content) {
        this.topic = topic;
        this.receiver = receiver;
        this.content = content;
    }

    public EImail(String topic, List<String> receiver, String content, List<MailFiles> files) {
        this.topic = topic;
        this.receiver = receiver;
        this.content = content;
        this.files = files;
    }

    public EImail(String topic, List<String> receiver, String content, List<MailFiles> files, List<String> attachs) {
        this.topic = topic;
        this.receiver = receiver;
        this.content = content;
        this.files = files;
        this.attachs = attachs;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<String> getReceiver() {
        return receiver;
    }

    public void setReceiver(List<String> receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<MailFiles> getFiles() {
        return files;
    }

    public void setImages(List<MailFiles> files) {
        this.files = files;
    }

    public List<String> getAttachs() {
        return attachs;
    }

    public void setAttachs(List<String> attachs) {
        this.attachs = attachs;
    }

    public List<String> getCopyTo() {
        return copyTo;
    }

    public void setCopyTo(List<String> copyTo) {
        this.copyTo = copyTo;
    }

    @Override
    public String toString() {
        return "EImail{" +
                "topic='" + topic + '\'' +
                ", receiver=" + receiver +
                ", copyTo=" + copyTo +
                ", Content='" + content + '\'' +
                ", files=" + files +
                ", attachs=" + attachs +
                '}';
    }
}
