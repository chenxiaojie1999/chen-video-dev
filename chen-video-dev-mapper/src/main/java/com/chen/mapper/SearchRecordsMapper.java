package com.chen.mapper;

import com.chen.pojo.SearchRecords;
import com.chen.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
    public List<String> getHotwords();
}