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


import com.cl.dao.CailiaozhongleiDao;
import com.cl.entity.CailiaozhongleiEntity;
import com.cl.service.CailiaozhongleiService;
import com.cl.entity.view.CailiaozhongleiView;

@Service("cailiaozhongleiService")
public class CailiaozhongleiServiceImpl extends ServiceImpl<CailiaozhongleiDao, CailiaozhongleiEntity> implements CailiaozhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CailiaozhongleiEntity> page = this.selectPage(
                new Query<CailiaozhongleiEntity>(params).getPage(),
                new EntityWrapper<CailiaozhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CailiaozhongleiEntity> wrapper) {
		  Page<CailiaozhongleiView> page =new Query<CailiaozhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CailiaozhongleiView> selectListView(Wrapper<CailiaozhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CailiaozhongleiView selectView(Wrapper<CailiaozhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
