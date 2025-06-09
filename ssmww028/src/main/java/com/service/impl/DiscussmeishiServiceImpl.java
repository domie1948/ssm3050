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


import com.dao.DiscussmeishiDao;
import com.entity.DiscussmeishiEntity;
import com.service.DiscussmeishiService;
import com.entity.vo.DiscussmeishiVO;
import com.entity.view.DiscussmeishiView;

@Service("discussmeishiService")
public class DiscussmeishiServiceImpl extends ServiceImpl<DiscussmeishiDao, DiscussmeishiEntity> implements DiscussmeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishiEntity> page = this.selectPage(
                new Query<DiscussmeishiEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishiEntity> wrapper) {
		  Page<DiscussmeishiView> page =new Query<DiscussmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishiVO> selectListVO(Wrapper<DiscussmeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishiVO selectVO(Wrapper<DiscussmeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishiView> selectListView(Wrapper<DiscussmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishiView selectView(Wrapper<DiscussmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
