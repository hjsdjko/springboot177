package com.cl.dao;

import com.cl.entity.BumenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BumenxinxiView;


/**
 * 部门信息
 * 
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface BumenxinxiDao extends BaseMapper<BumenxinxiEntity> {
	
	List<BumenxinxiView> selectListView(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);

	List<BumenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
	
	BumenxinxiView selectView(@Param("ew") Wrapper<BumenxinxiEntity> wrapper);
	

}
