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


import com.dao.MeishiDao;
import com.entity.MeishiEntity;
import com.service.MeishiService;
import com.entity.vo.MeishiVO;
import com.entity.view.MeishiView;

@Service("meishiService")
public class MeishiServiceImpl extends ServiceImpl<MeishiDao, MeishiEntity> implements MeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishiEntity> page = this.selectPage(
                new Query<MeishiEntity>(params).getPage(),
                new EntityWrapper<MeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishiEntity> wrapper) {
		  Page<MeishiView> page =new Query<MeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishiVO> selectListVO(Wrapper<MeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishiVO selectVO(Wrapper<MeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishiView> selectListView(Wrapper<MeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishiView selectView(Wrapper<MeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
