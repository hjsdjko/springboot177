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
 * 货物入库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
@TableName("huowuruku")
public class HuowurukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuowurukuEntity() {
		
	}
	
	public HuowurukuEntity(T t) {
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
	 * 入库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rukushijian;
	
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
	 * 仓库名称
	 */
					
	private String cangkumingcheng;
	
	/**
	 * 货架位置
	 */
					
	private String huojiaweizhi;
	
	/**
	 * 单位
	 */
					
	private String danwei;
	
	/**
	 * 单价
	 */
					
	private Double danjia;
	
	/**
	 * 入库数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 操作员
	 */
					
	private String caozuoyuan;
	
	
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
	 * 设置：入库时间
	 */
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
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
	public void setDanjia(Double danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public Double getDanjia() {
		return danjia;
	}
	/**
	 * 设置：入库数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：入库数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：操作员
	 */
	public void setCaozuoyuan(String caozuoyuan) {
		this.caozuoyuan = caozuoyuan;
	}
	/**
	 * 获取：操作员
	 */
	public String getCaozuoyuan() {
		return caozuoyuan;
	}

}
