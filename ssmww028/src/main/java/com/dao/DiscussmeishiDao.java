package com.dao;

import com.entity.DiscussmeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishiVO;
import com.entity.view.DiscussmeishiView;


/**
 * 美食评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
public interface DiscussmeishiDao extends BaseMapper<DiscussmeishiEntity> {
	
	List<DiscussmeishiVO> selectListVO(@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);
	
	DiscussmeishiVO selectVO(@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);
	
	List<DiscussmeishiView> selectListView(@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);

	List<DiscussmeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);
	
	DiscussmeishiView selectView(@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);
	
}
