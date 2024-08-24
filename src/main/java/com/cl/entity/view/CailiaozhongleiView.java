package com.cl.entity.view;

import com.cl.entity.CailiaozhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 材料种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 15:28:18
 */
@TableName("cailiaozhonglei")
public class CailiaozhongleiView  extends CailiaozhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CailiaozhongleiView(){
	}
 
 	public CailiaozhongleiView(CailiaozhongleiEntity cailiaozhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, cailiaozhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}