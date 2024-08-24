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


import com.cl.dao.HuowuchukuDao;
import com.cl.entity.HuowuchukuEntity;
import com.cl.service.HuowuchukuService;
import com.cl.entity.view.HuowuchukuView;

@Service("huowuchukuService")
public class HuowuchukuServiceImpl extends ServiceImpl<HuowuchukuDao, HuowuchukuEntity> implements HuowuchukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowuchukuEntity> page = this.selectPage(
                new Query<HuowuchukuEntity>(params).getPage(),
                new EntityWrapper<HuowuchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowuchukuEntity> wrapper) {
		  Page<HuowuchukuView> page =new Query<HuowuchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuowuchukuView> selectListView(Wrapper<HuowuchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowuchukuView selectView(Wrapper<HuowuchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuowuchukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuowuchukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuowuchukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
