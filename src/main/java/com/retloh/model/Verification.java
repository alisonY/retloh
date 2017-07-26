package com.retloh.model;

public class Verification {
    private Integer id;

    private String commonid;

    private String filename;

    private String md5sum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommonid() {
        return commonid;
    }

    public void setCommonid(String commonid) {
        this.commonid = commonid == null ? null : commonid.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum == null ? null : md5sum.trim();
    }
}