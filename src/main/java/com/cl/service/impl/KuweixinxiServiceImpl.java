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


import com.cl.dao.KuweixinxiDao;
import com.cl.entity.KuweixinxiEntity;
import com.cl.service.KuweixinxiService;
import com.cl.entity.view.KuweixinxiView;

@Service("kuweixinxiService")
public class KuweixinxiServiceImpl extends ServiceImpl<KuweixinxiDao, KuweixinxiEntity> implements KuweixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KuweixinxiEntity> page = this.selectPage(
                new Query<KuweixinxiEntity>(params).getPage(),
                new EntityWrapper<KuweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KuweixinxiEntity> wrapper) {
		  Page<KuweixinxiView> page =new Query<KuweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KuweixinxiView> selectListView(Wrapper<KuweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KuweixinxiView selectView(Wrapper<KuweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KuweixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KuweixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KuweixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
