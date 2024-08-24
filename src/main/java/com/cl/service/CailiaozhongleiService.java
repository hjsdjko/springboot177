package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CailiaozhongleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CailiaozhongleiView;


/**
 * 材料种类
 *
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface CailiaozhongleiService extends IService<CailiaozhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CailiaozhongleiView> selectListView(Wrapper<CailiaozhongleiEntity> wrapper);
   	
   	CailiaozhongleiView selectView(@Param("ew") Wrapper<CailiaozhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CailiaozhongleiEntity> wrapper);
   	

}

