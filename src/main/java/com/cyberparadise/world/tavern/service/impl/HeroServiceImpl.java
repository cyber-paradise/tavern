package com.cyberparadise.world.tavern.service.impl;

import com.cyberparadise.world.tavern.dao.mybatis.HeroDao;
import com.cyberparadise.world.tavern.entity.Hero;
import com.cyberparadise.world.tavern.service.HeroService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author mingming.song
 */
@Service
public class HeroServiceImpl implements HeroService {

    @Resource
    private HeroDao heroDao;

    @Override
    public Hero findHeroById(Long heroId) {
        return heroDao.selectByPrimaryKey(heroId);
    }

    @Override
    public int saveHero(Hero hero) {
        return heroDao.insertSelective(hero);
    }
}
