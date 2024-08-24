package com.cl.dao;

import com.cl.entity.CailiaozhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CailiaozhongleiView;


/**
 * 材料种类
 * 
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface CailiaozhongleiDao extends BaseMapper<CailiaozhongleiEntity> {
	
	List<CailiaozhongleiView> selectListView(@Param("ew") Wrapper<CailiaozhongleiEntity> wrapper);

	List<CailiaozhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<CailiaozhongleiEntity> wrapper);
	
	CailiaozhongleiView selectView(@Param("ew") Wrapper<CailiaozhongleiEntity> wrapper);
	

}
