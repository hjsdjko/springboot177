package com.cl.dao;

import com.cl.entity.HuowurukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuowurukuView;


/**
 * 货物入库
 * 
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface HuowurukuDao extends BaseMapper<HuowurukuEntity> {
	
	List<HuowurukuView> selectListView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);

	List<HuowurukuView> selectListView(Pagination page,@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	HuowurukuView selectView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowurukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowurukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowurukuEntity> wrapper);



}
