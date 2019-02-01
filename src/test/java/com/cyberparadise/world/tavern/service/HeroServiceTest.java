package com.cyberparadise.world.tavern.service;

import com.cyberparadise.world.tavern.AbstractTest;
import com.cyberparadise.world.tavern.entity.Hero;
import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
@Transactional
public class HeroServiceTest extends AbstractTest {

    @Resource
    private HeroService heroService;

    @Test
    @Sql("classpath:sql/hero.sql")
    public void findHeroById() {
        Hero hero = heroService.findHeroById(1L);

        assertNotNull("获取用户失败", hero.getId());
        assertEquals("test name", hero.getName());
    }

    @Test
    public void saveHero() {
        Hero hero = new Hero();

        hero.setAlias("test alias");
        hero.setName("test name");
        hero.setPassword("test password");

        heroService.saveHero(hero);

        assertNotNull("保存用户,获取回显id失败", hero.getId());
    }
}