package com.entity.view;

import com.entity.DiscussmeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
@TableName("discussmeishi")
public class DiscussmeishiView  extends DiscussmeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeishiView(){
	}
 
 	public DiscussmeishiView(DiscussmeishiEntity discussmeishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
