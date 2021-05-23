package com.chen.service;

import com.chen.pojo.Bgm;
import com.chen.pojo.Users;

import java.util.List;

public interface BgmService {

    /**
     * 查询背景音乐列表
     * @return
     */
    public List<Bgm> queryBgmList();


     public Bgm queryBgmById(String bgmId);
}
