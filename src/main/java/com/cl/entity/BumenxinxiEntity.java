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
 * 部门信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
@TableName("bumenxinxi")
public class BumenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BumenxinxiEntity() {
		
	}
	
	public BumenxinxiEntity(T t) {
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
	 * 部门名称
	 */
					
	private String bumenmingcheng;
	
	/**
	 * 部门负责人
	 */
					
	private String bumenfuzeren;
	
	/**
	 * 部门职责
	 */
					
	private String bumenzhize;
	
	/**
	 * 部门制度
	 */
					
	private String bumenzhidu;
	
	
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
	 * 设置：部门名称
	 */
	public void setBumenmingcheng(String bumenmingcheng) {
		this.bumenmingcheng = bumenmingcheng;
	}
	/**
	 * 获取：部门名称
	 */
	public String getBumenmingcheng() {
		return bumenmingcheng;
	}
	/**
	 * 设置：部门负责人
	 */
	public void setBumenfuzeren(String bumenfuzeren) {
		this.bumenfuzeren = bumenfuzeren;
	}
	/**
	 * 获取：部门负责人
	 */
	public String getBumenfuzeren() {
		return bumenfuzeren;
	}
	/**
	 * 设置：部门职责
	 */
	public void setBumenzhize(String bumenzhize) {
		this.bumenzhize = bumenzhize;
	}
	/**
	 * 获取：部门职责
	 */
	public String getBumenzhize() {
		return bumenzhize;
	}
	/**
	 * 设置：部门制度
	 */
	public void setBumenzhidu(String bumenzhidu) {
		this.bumenzhidu = bumenzhidu;
	}
	/**
	 * 获取：部门制度
	 */
	public String getBumenzhidu() {
		return bumenzhidu;
	}

}
