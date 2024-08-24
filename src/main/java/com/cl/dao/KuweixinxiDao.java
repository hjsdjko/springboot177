package com.cl.dao;

import com.cl.entity.KuweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KuweixinxiView;


/**
 * 库位信息
 * 
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface KuweixinxiDao extends BaseMapper<KuweixinxiEntity> {
	
	List<KuweixinxiView> selectListView(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);

	List<KuweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
	
	KuweixinxiView selectView(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KuweixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KuweixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KuweixinxiEntity> wrapper);



}
