package com.chen.mapper;

import com.chen.pojo.Comments;
import com.chen.pojo.vo.CommentsVO;
import com.chen.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}