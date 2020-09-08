package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ljd on 2020/9/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @org.junit.Test
    public void testQueryArea() throws Exception {
        List<Area> list = areaDao.queryArea();
        assertEquals(2,list.size());
    }

    @org.junit.Test
    public void testQueryArea1() throws Exception {
        Area area = areaDao.queryArea(1);
        assertEquals("东苑",area.getAreaName());
    }

    @org.junit.Test
    public void testInsertArea() throws Exception {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1,effectedNum);
    }

    @org.junit.Test
    @Ignore
    public void testUpdateArea() throws Exception {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1,effectedNum);
    }

    @org.junit.Test
    @Ignore
    public void testDeleteArea() throws Exception {
        int effectedNum = areaDao.deleteArea(3);
        assertEquals(1,effectedNum);
    }
}