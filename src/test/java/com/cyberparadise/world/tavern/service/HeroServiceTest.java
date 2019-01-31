package com.cyberparadise.world.tavern.service;

import com.cyberparadise.world.tavern.AbstractTest;
import com.cyberparadise.world.tavern.entity.Hero;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class HeroServiceTest extends AbstractTest {

    @Resource
    private HeroService heroService;

    @Test
    public void findHeroById() {
    }

    @Test
    public void saveHero() {
        Hero hero = new Hero();

        hero.setAlias("test alias");
        hero.setName("test name");
        hero.setPassword("test password");

        heroService.saveHero(hero);
    }
}