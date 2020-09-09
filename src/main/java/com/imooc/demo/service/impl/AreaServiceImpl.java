package com.imooc.demo.service.impl;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by ljd on 2020/9/8.
 */
@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int oid) {
        return areaDao.queryAreaById(oid);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName() != null && !"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.insertArea(area);
                if(effectedNum > 0){
                    return  true;
                }else{
                    throw new RuntimeException("插入信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入信息失败:"+e.getMessage());
            }
        }else{
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaId() != null && area.getAreaId() > 0){
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.updateArea(area);
                if(effectedNum > 0){
                    return  true;
                }else{
                    throw new RuntimeException("更新信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("更新信息失败:"+e.getMessage());
            }
        }else{
            throw new RuntimeException("区域Id不能为空！");
        }
    }

    @Override
    public boolean deleteArea(int oid) {
        if(oid > 0){
            try {
                int effectedNum = areaDao.deleteArea(oid);
                if(effectedNum > 0){
                    return  true;
                }else{
                    throw new RuntimeException("删除信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除信息失败:"+e);
            }
        }else{
            throw new RuntimeException("区域Id不能为空！");
        }
    }
}
