package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * Created by ljd on 2020/9/8.
 */
public interface AreaService {
    List<Area> queryArea();
    Area getAreaById(int oid);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int oid);
}
