package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.BumenxinxiDao;
import com.cl.entity.BumenxinxiEntity;
import com.cl.service.BumenxinxiService;
import com.cl.entity.view.BumenxinxiView;

@Service("bumenxinxiService")
public class BumenxinxiServiceImpl extends ServiceImpl<BumenxinxiDao, BumenxinxiEntity> implements BumenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenxinxiEntity> page = this.selectPage(
                new Query<BumenxinxiEntity>(params).getPage(),
                new EntityWrapper<BumenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenxinxiEntity> wrapper) {
		  Page<BumenxinxiView> page =new Query<BumenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BumenxinxiView> selectListView(Wrapper<BumenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenxinxiView selectView(Wrapper<BumenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
