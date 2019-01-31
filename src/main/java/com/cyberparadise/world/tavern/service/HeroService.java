package com.cyberparadise.world.tavern.service;

import com.cyberparadise.world.tavern.entity.Hero;

/**
 * @author mingming.song
 */
public interface HeroService {
    /**
     * 根据用户Id 查找用户
     *
     * @param heroId 用户Id
     * @return 用户信息
     */
    Hero findHeroById(Long heroId);

    /**
     * 保存用户信息
     *
     * @param hero 用户信息
     * @return 用户信息
     */
    int saveHero(Hero hero);
}
