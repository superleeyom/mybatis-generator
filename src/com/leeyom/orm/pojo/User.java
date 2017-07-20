package com.leeyom.orm.pojo;

public class User {
    private Long id;

    private String name;

    private String status;

    private String sign;

    private String avatar;

    private Integer initpanelid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getInitpanelid() {
        return initpanelid;
    }

    public void setInitpanelid(Integer initpanelid) {
        this.initpanelid = initpanelid;
    }
}