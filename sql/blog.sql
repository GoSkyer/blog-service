/*
Navicat MySQL Data Transfer

Source Server         : develper
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-03-06 22:14:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` varchar(64) NOT NULL,
  `author_name` varchar(64) NOT NULL,
  `author_id` varchar(64) NOT NULL,
  `title` varchar(64) NOT NULL,
  `content_id` varchar(64) NOT NULL,
  `create_time` date NOT NULL,
  `view_count` int(11) DEFAULT '0',
  `comment_count` int(11) DEFAULT '0',
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_comment
-- ----------------------------
DROP TABLE IF EXISTS `blog_comment`;
CREATE TABLE `blog_comment` (
  `blog_id` varchar(64) NOT NULL,
  `comment_id` varchar(64) NOT NULL,
  `comment_author` varchar(64) NOT NULL,
  `comment_time` date NOT NULL,
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_copy
-- ----------------------------
DROP TABLE IF EXISTS `blog_copy`;
CREATE TABLE `blog_copy` (
  `id` varchar(64) NOT NULL,
  `author_name` varchar(64) NOT NULL,
  `author_id` varchar(64) NOT NULL,
  `title` varchar(64) NOT NULL,
  `content_id` varchar(64) NOT NULL,
  `create_time` date NOT NULL,
  `view_count` int(11) DEFAULT '0',
  `comment_count` int(11) DEFAULT '0',
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for guest
-- ----------------------------
DROP TABLE IF EXISTS `guest`;
CREATE TABLE `guest` (
  `id` varchar(64) NOT NULL,
  `u` varchar(64) NOT NULL,
  `p` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `authority` int(11) DEFAULT '0',
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` varchar(64) NOT NULL,
  `logo` varchar(128) DEFAULT NULL,
  `name` varchar(64) NOT NULL,
  `skill` varchar(64) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for member_validate
-- ----------------------------
DROP TABLE IF EXISTS `member_validate`;
CREATE TABLE `member_validate` (
  `id` varchar(64) NOT NULL,
  `u` varchar(64) NOT NULL,
  `s` varchar(64) NOT NULL,
  `create_time` date NOT NULL,
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `u` (`u`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `id` varchar(64) NOT NULL,
  `logo` varchar(128) DEFAULT NULL,
  `name` varchar(64) NOT NULL,
  `createTime` date DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `link` varchar(128) DEFAULT NULL,
  `state` int(11) DEFAULT '0',
  `leader_id` varchar(64) DEFAULT NULL,
  `leader_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
