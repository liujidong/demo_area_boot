package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * Created by ljd on 2020/9/7.
 */
public interface AreaDao {
    List<Area> queryArea();
    Area queryArea(int oid);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int oid);
}
