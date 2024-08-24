package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.CailiaozhongleiEntity;
import com.cl.entity.view.CailiaozhongleiView;

import com.cl.service.CailiaozhongleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 材料种类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
@RestController
@RequestMapping("/cailiaozhonglei")
public class CailiaozhongleiController {
    @Autowired
    private CailiaozhongleiService cailiaozhongleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CailiaozhongleiEntity cailiaozhonglei,
		HttpServletRequest request){
        EntityWrapper<CailiaozhongleiEntity> ew = new EntityWrapper<CailiaozhongleiEntity>();

		PageUtils page = cailiaozhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaozhonglei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CailiaozhongleiEntity cailiaozhonglei, 
		HttpServletRequest request){
        EntityWrapper<CailiaozhongleiEntity> ew = new EntityWrapper<CailiaozhongleiEntity>();

		PageUtils page = cailiaozhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaozhonglei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CailiaozhongleiEntity cailiaozhonglei){
       	EntityWrapper<CailiaozhongleiEntity> ew = new EntityWrapper<CailiaozhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cailiaozhonglei, "cailiaozhonglei")); 
        return R.ok().put("data", cailiaozhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CailiaozhongleiEntity cailiaozhonglei){
        EntityWrapper< CailiaozhongleiEntity> ew = new EntityWrapper< CailiaozhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cailiaozhonglei, "cailiaozhonglei")); 
		CailiaozhongleiView cailiaozhongleiView =  cailiaozhongleiService.selectView(ew);
		return R.ok("查询材料种类成功").put("data", cailiaozhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CailiaozhongleiEntity cailiaozhonglei = cailiaozhongleiService.selectById(id);
		cailiaozhonglei = cailiaozhongleiService.selectView(new EntityWrapper<CailiaozhongleiEntity>().eq("id", id));
        return R.ok().put("data", cailiaozhonglei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CailiaozhongleiEntity cailiaozhonglei = cailiaozhongleiService.selectById(id);
		cailiaozhonglei = cailiaozhongleiService.selectView(new EntityWrapper<CailiaozhongleiEntity>().eq("id", id));
        return R.ok().put("data", cailiaozhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CailiaozhongleiEntity cailiaozhonglei, HttpServletRequest request){
    	cailiaozhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cailiaozhonglei);
        cailiaozhongleiService.insert(cailiaozhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CailiaozhongleiEntity cailiaozhonglei, HttpServletRequest request){
    	cailiaozhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cailiaozhonglei);
        cailiaozhongleiService.insert(cailiaozhonglei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CailiaozhongleiEntity cailiaozhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cailiaozhonglei);
        cailiaozhongleiService.updateById(cailiaozhonglei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cailiaozhongleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
