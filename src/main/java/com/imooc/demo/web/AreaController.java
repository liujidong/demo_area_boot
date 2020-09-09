package com.imooc.demo.web;

import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ljd on 2020/9/9.
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value="/listarea",method= RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> modeMap = new HashMap<>();
        List<Area> list = areaService.queryArea();
        modeMap.put("list",list);
        return modeMap;
    }
    @RequestMapping(value="/areaid",method= RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer oid){
        Map<String,Object> modeMap = new HashMap<>();
        Area po = areaService.getAreaById(oid);
        modeMap.put("po",po);
        return modeMap;
    }
    @RequestMapping(value="/areaadd",method= RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modeMap = new HashMap<>();
        modeMap.put("success",areaService.addArea(area));
        return modeMap;
    }
    @RequestMapping(value="/areaedit",method= RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modeMap = new HashMap<>();
        modeMap.put("success",areaService.modifyArea(area));
        return modeMap;
    }
    @RequestMapping(value="/arearemove",method= RequestMethod.GET)
    private Map<String,Object> removeAreaById(Integer oid){
        Map<String,Object> modeMap = new HashMap<>();
        modeMap.put("success",areaService.deleteArea(oid));
        return modeMap;
    }
}
