package com.sunseng.pushserver.push.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunseng.pushserver.push.model.PushSendDetailModel;

/**
 * Push DAO Impl
 * @author sjpaik
 */
@Repository
public class PushDAOImpl implements PushDAO {
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public List<PushSendDetailModel> selectSendPushList() {
		return template.selectList("push.selectSendPushList");
	}
	
}
