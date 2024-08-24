package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HuowuchukuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuowuchukuView;


/**
 * 货物出库
 *
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface HuowuchukuService extends IService<HuowuchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowuchukuView> selectListView(Wrapper<HuowuchukuEntity> wrapper);
   	
   	HuowuchukuView selectView(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);



}

