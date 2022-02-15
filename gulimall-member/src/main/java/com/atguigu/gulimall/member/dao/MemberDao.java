package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-15 16:07:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
