package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianpufenleiDao;
import com.entity.DianpufenleiEntity;
import com.service.DianpufenleiService;
import com.entity.vo.DianpufenleiVO;
import com.entity.view.DianpufenleiView;

@Service("dianpufenleiService")
public class DianpufenleiServiceImpl extends ServiceImpl<DianpufenleiDao, DianpufenleiEntity> implements DianpufenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianpufenleiEntity> page = this.selectPage(
                new Query<DianpufenleiEntity>(params).getPage(),
                new EntityWrapper<DianpufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianpufenleiEntity> wrapper) {
		  Page<DianpufenleiView> page =new Query<DianpufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianpufenleiVO> selectListVO(Wrapper<DianpufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianpufenleiVO selectVO(Wrapper<DianpufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianpufenleiView> selectListView(Wrapper<DianpufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianpufenleiView selectView(Wrapper<DianpufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
