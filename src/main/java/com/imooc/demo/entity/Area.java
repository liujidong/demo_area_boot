package com.imooc.demo.entity;

import java.util.Date;

/**
 * Created by ljd on 2020/9/5.
 */
public class Area {
    // 主键ID
    private Integer areaId;
    //  名称
    private String areaName;
    // 权重，越大越排在前面
    private Integer priority;
    // 创建时间
    private Date createTime;//alt+enter导包
    // 更新时间
    private Date lastEditTime;

    //alt+insert 自动生成

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
