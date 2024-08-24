package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 库位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
@TableName("kuweixinxi")
public class KuweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KuweixinxiEntity() {
		
	}
	
	public KuweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 仓库名称
	 */
					
	private String cangkumingcheng;
	
	/**
	 * 货架位置
	 */
					
	private String huojiaweizhi;
	
	/**
	 * 可摆放货物
	 */
					
	private String kebaifanghuowu;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 可容数量
	 */
					
	private Integer shuliang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：仓库名称
	 */
	public void setCangkumingcheng(String cangkumingcheng) {
		this.cangkumingcheng = cangkumingcheng;
	}
	/**
	 * 获取：仓库名称
	 */
	public String getCangkumingcheng() {
		return cangkumingcheng;
	}
	/**
	 * 设置：货架位置
	 */
	public void setHuojiaweizhi(String huojiaweizhi) {
		this.huojiaweizhi = huojiaweizhi;
	}
	/**
	 * 获取：货架位置
	 */
	public String getHuojiaweizhi() {
		return huojiaweizhi;
	}
	/**
	 * 设置：可摆放货物
	 */
	public void setKebaifanghuowu(String kebaifanghuowu) {
		this.kebaifanghuowu = kebaifanghuowu;
	}
	/**
	 * 获取：可摆放货物
	 */
	public String getKebaifanghuowu() {
		return kebaifanghuowu;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：可容数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：可容数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}

}
