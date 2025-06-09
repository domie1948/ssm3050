package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianpufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianpufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianpufenleiView;


/**
 * 店铺分类
 *
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
public interface DianpufenleiService extends IService<DianpufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianpufenleiVO> selectListVO(Wrapper<DianpufenleiEntity> wrapper);
   	
   	DianpufenleiVO selectVO(@Param("ew") Wrapper<DianpufenleiEntity> wrapper);
   	
   	List<DianpufenleiView> selectListView(Wrapper<DianpufenleiEntity> wrapper);
   	
   	DianpufenleiView selectView(@Param("ew") Wrapper<DianpufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianpufenleiEntity> wrapper);
   	
}

