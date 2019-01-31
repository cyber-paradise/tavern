-- 创建数据库
CREATE SCHEMA `tavern` DEFAULT CHARACTER SET utf8mb4 ;

CREATE TABLE `tavern`.`hero` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(128) NOT NULL COMMENT '名字',
  `alias` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '名号',
  `password` VARCHAR(128) NOT NULL COMMENT '密码',
  `create_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `uidx_hero` (`name` ASC)
) ENGINE=InnoDB COMMENT='用户表';