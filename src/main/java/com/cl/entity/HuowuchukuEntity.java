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
 * 货物出库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
@TableName("huowuchuku")
public class HuowuchukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuowuchukuEntity() {
		
	}
	
	public HuowuchukuEntity(T t) {
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
	 * 出库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chukushijian;
	
	/**
	 * 料单号
	 */
					
	private String liaodanhao;
	
	/**
	 * 材料编号
	 */
					
	private String cailiaobianhao;
	
	/**
	 * 材料种类
	 */
					
	private String cailiaozhonglei;
	
	/**
	 * 材料名称
	 */
					
	private String cailiaomingcheng;
	
	/**
	 * 型号规格
	 */
					
	private String xinghaoguige;
	
	/**
	 * 单位
	 */
					
	private String danwei;
	
	/**
	 * 单价
	 */
					
	private String danjia;
	
	/**
	 * 出库数量数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 实际金额
	 */
					
	private Double chukujine;
	
	/**
	 * 仓库名称
	 */
					
	private String cangkumingcheng;
	
	/**
	 * 货架位置
	 */
					
	private String huojiaweizhi;
	
	/**
	 * 领用单位
	 */
					
	private String lingyongdanwei;
	
	/**
	 * 领料人
	 */
					
	private String lingliaoren;
	
	
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
	 * 设置：出库时间
	 */
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
	/**
	 * 设置：料单号
	 */
	public void setLiaodanhao(String liaodanhao) {
		this.liaodanhao = liaodanhao;
	}
	/**
	 * 获取：料单号
	 */
	public String getLiaodanhao() {
		return liaodanhao;
	}
	/**
	 * 设置：材料编号
	 */
	public void setCailiaobianhao(String cailiaobianhao) {
		this.cailiaobianhao = cailiaobianhao;
	}
	/**
	 * 获取：材料编号
	 */
	public String getCailiaobianhao() {
		return cailiaobianhao;
	}
	/**
	 * 设置：材料种类
	 */
	public void setCailiaozhonglei(String cailiaozhonglei) {
		this.cailiaozhonglei = cailiaozhonglei;
	}
	/**
	 * 获取：材料种类
	 */
	public String getCailiaozhonglei() {
		return cailiaozhonglei;
	}
	/**
	 * 设置：材料名称
	 */
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
	/**
	 * 设置：型号规格
	 */
	public void setXinghaoguige(String xinghaoguige) {
		this.xinghaoguige = xinghaoguige;
	}
	/**
	 * 获取：型号规格
	 */
	public String getXinghaoguige() {
		return xinghaoguige;
	}
	/**
	 * 设置：单位
	 */
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	/**
	 * 获取：单位
	 */
	public String getDanwei() {
		return danwei;
	}
	/**
	 * 设置：单价
	 */
	public void setDanjia(String danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public String getDanjia() {
		return danjia;
	}
	/**
	 * 设置：出库数量数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：出库数量数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：实际金额
	 */
	public void setChukujine(Double chukujine) {
		this.chukujine = chukujine;
	}
	/**
	 * 获取：实际金额
	 */
	public Double getChukujine() {
		return chukujine;
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
	 * 设置：领用单位
	 */
	public void setLingyongdanwei(String lingyongdanwei) {
		this.lingyongdanwei = lingyongdanwei;
	}
	/**
	 * 获取：领用单位
	 */
	public String getLingyongdanwei() {
		return lingyongdanwei;
	}
	/**
	 * 设置：领料人
	 */
	public void setLingliaoren(String lingliaoren) {
		this.lingliaoren = lingliaoren;
	}
	/**
	 * 获取：领料人
	 */
	public String getLingliaoren() {
		return lingliaoren;
	}

}
