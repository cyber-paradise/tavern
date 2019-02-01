package com.cyberparadise.world.tavern.dao.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author mingming.song
 */
public interface GenericDao<T> extends Mapper<T>, MySqlMapper<T> {
}
