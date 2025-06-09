package com.dao;

import com.entity.DianpufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianpufenleiVO;
import com.entity.view.DianpufenleiView;


/**
 * 店铺分类
 * 
 * @author 
 * @email 
 * @date 2021-04-18 17:59:56
 */
public interface DianpufenleiDao extends BaseMapper<DianpufenleiEntity> {
	
	List<DianpufenleiVO> selectListVO(@Param("ew") Wrapper<DianpufenleiEntity> wrapper);
	
	DianpufenleiVO selectVO(@Param("ew") Wrapper<DianpufenleiEntity> wrapper);
	
	List<DianpufenleiView> selectListView(@Param("ew") Wrapper<DianpufenleiEntity> wrapper);

	List<DianpufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<DianpufenleiEntity> wrapper);
	
	DianpufenleiView selectView(@Param("ew") Wrapper<DianpufenleiEntity> wrapper);
	
}
