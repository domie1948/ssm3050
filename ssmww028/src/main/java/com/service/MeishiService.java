package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishiView;


/**
 * 美食
 *
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
public interface MeishiService extends IService<MeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishiVO> selectListVO(Wrapper<MeishiEntity> wrapper);
   	
   	MeishiVO selectVO(@Param("ew") Wrapper<MeishiEntity> wrapper);
   	
   	List<MeishiView> selectListView(Wrapper<MeishiEntity> wrapper);
   	
   	MeishiView selectView(@Param("ew") Wrapper<MeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishiEntity> wrapper);
   	
}

