package com.dooioo.dyOnline.model;

import com.dooioo.dyOnline.base.model.Page;

/**
 * Created with IntelliJ IDEA.
 * Author: Jerry.hu
 * Create: Jerry.hu (14-4-14 17:50)
 * Description:房源实体
 */
public class Propery extends Page{
    private static final long serialVersionUID = -7622476957865983220L;

    private String id;              //房源主键
    private String title;           //房源标题
    private Double totalPrice;      //房源总价
    private int room;               //户型 室
    private int hall;               //户型 厅
    private int guard;              //户型 卫
    private int    floor;           //楼层
    private String face;            //朝向
    private String decoration;      //装修
    private String desc;            //描述
    private float  longitude;     //楼盘地图坐标 经度
    private float  latitude;     //楼盘地图坐标 纬度

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getHall() {
        return hall;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public int getGuard() {
        return guard;
    }

    public void setGuard(int guard) {
        this.guard = guard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
