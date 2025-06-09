package com.entity.vo;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 美食
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
public class MeishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 店铺类别
	 */
	
	private String dianpuleibie;
		
	/**
	 * 美食名称
	 */
	
	private String meishimingcheng;
		
	/**
	 * 美食类别
	 */
	
	private String meishileibie;
		
	/**
	 * 美食原料
	 */
	
	private String meishiyuanliao;
		
	/**
	 * 美食特色
	 */
	
	private String meishitese;
		
	/**
	 * 店家账号
	 */
	
	private String dianjiazhanghao;
		
	/**
	 * 店家姓名
	 */
	
	private String dianjiaxingming;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 美食介绍
	 */
	
	private String meishijieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：店铺类别
	 */
	 
	public void setDianpuleibie(String dianpuleibie) {
		this.dianpuleibie = dianpuleibie;
	}
	
	/**
	 * 获取：店铺类别
	 */
	public String getDianpuleibie() {
		return dianpuleibie;
	}
				
	
	/**
	 * 设置：美食名称
	 */
	 
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
				
	
	/**
	 * 设置：美食类别
	 */
	 
	public void setMeishileibie(String meishileibie) {
		this.meishileibie = meishileibie;
	}
	
	/**
	 * 获取：美食类别
	 */
	public String getMeishileibie() {
		return meishileibie;
	}
				
	
	/**
	 * 设置：美食原料
	 */
	 
	public void setMeishiyuanliao(String meishiyuanliao) {
		this.meishiyuanliao = meishiyuanliao;
	}
	
	/**
	 * 获取：美食原料
	 */
	public String getMeishiyuanliao() {
		return meishiyuanliao;
	}
				
	
	/**
	 * 设置：美食特色
	 */
	 
	public void setMeishitese(String meishitese) {
		this.meishitese = meishitese;
	}
	
	/**
	 * 获取：美食特色
	 */
	public String getMeishitese() {
		return meishitese;
	}
				
	
	/**
	 * 设置：店家账号
	 */
	 
	public void setDianjiazhanghao(String dianjiazhanghao) {
		this.dianjiazhanghao = dianjiazhanghao;
	}
	
	/**
	 * 获取：店家账号
	 */
	public String getDianjiazhanghao() {
		return dianjiazhanghao;
	}
				
	
	/**
	 * 设置：店家姓名
	 */
	 
	public void setDianjiaxingming(String dianjiaxingming) {
		this.dianjiaxingming = dianjiaxingming;
	}
	
	/**
	 * 获取：店家姓名
	 */
	public String getDianjiaxingming() {
		return dianjiaxingming;
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
	 * 设置：美食介绍
	 */
	 
	public void setMeishijieshao(String meishijieshao) {
		this.meishijieshao = meishijieshao;
	}
	
	/**
	 * 获取：美食介绍
	 */
	public String getMeishijieshao() {
		return meishijieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
