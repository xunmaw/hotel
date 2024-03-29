package com.xunmaw.hotel.entity;

import java.util.Date;

public class RoomType {
    private Integer typeId;

    private String roomType;

    private String remark;

    private String cover;

    private Double price;

    private Double discount;

    private Integer area;

    private Integer bedNum;

    private String bedSize;

    private Integer windows;

    private Integer rest;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    private Date createTime;

    private Date updateTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getBedNum() {
        return bedNum;
    }

    public void setBedNum(Integer bedNum) {
        this.bedNum = bedNum;
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize == null ? null : bedSize.trim();
    }

    public Integer getWindows() {
        return windows;
    }

    public void setWindows(Integer windows) {
        this.windows = windows;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public RoomType() {
        this.rest = 0;
    }

    public RoomType(String roomType, String remark, Double price, Double discount, Integer area, Integer bedNum, String bedSize, Integer window, String cover) {
        this.roomType = roomType;
        this.remark = remark;
        this.price = price;
        this.discount = discount;
        this.area = area;
        this.bedNum = bedNum;
        this.bedSize = bedSize;
        this.windows = window;
        this.cover=cover;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "typeId=" + typeId +
                ", roomType='" + roomType + '\'' +
                ", remark='" + remark + '\'' +
                ", cover='" + cover + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", area=" + area +
                ", bedNum=" + bedNum +
                ", bedSize='" + bedSize + '\'' +
                ", windows=" + windows +
                ", rest=" + rest +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
