package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KuweixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KuweixinxiView;


/**
 * 库位信息
 *
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
public interface KuweixinxiService extends IService<KuweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KuweixinxiView> selectListView(Wrapper<KuweixinxiEntity> wrapper);
   	
   	KuweixinxiView selectView(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KuweixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KuweixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KuweixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KuweixinxiEntity> wrapper);



}

