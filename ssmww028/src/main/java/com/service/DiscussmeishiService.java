package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishiView;


/**
 * 美食评论表
 *
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
public interface DiscussmeishiService extends IService<DiscussmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishiVO> selectListVO(Wrapper<DiscussmeishiEntity> wrapper);
   	
   	DiscussmeishiVO selectVO(@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);
   	
   	List<DiscussmeishiView> selectListView(Wrapper<DiscussmeishiEntity> wrapper);
   	
   	DiscussmeishiView selectView(@Param("ew") Wrapper<DiscussmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishiEntity> wrapper);
   	
}

