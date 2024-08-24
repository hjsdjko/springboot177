package com.cl.dao;

import com.cl.entity.HuowuchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuowuchukuView;


/**
 * 货物出库
 * 
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface HuowuchukuDao extends BaseMapper<HuowuchukuEntity> {
	
	List<HuowuchukuView> selectListView(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);

	List<HuowuchukuView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
	
	HuowuchukuView selectView(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);



}
