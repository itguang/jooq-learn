/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : study

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 03/04/2019 16:59:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `id` int(11) NOT NULL,
  `first_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `last_name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `year_of_birth` int(11) DEFAULT NULL,
  `address` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of author
-- ----------------------------
BEGIN;
INSERT INTO `author` VALUES (1, '李', '杏仁', '2019-04-03', 2012, '上海');
COMMIT;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `author_id` int(11) NOT NULL,
  `co_author_id` int(11) DEFAULT NULL,
  `details_id` int(11) DEFAULT NULL,
  `title` varchar(400) COLLATE utf8mb4_bin NOT NULL,
  `published_in` int(11) DEFAULT NULL,
  `language_id` int(11) DEFAULT NULL,
  `content_text` varchar(2000) COLLATE utf8mb4_bin DEFAULT NULL,
  `content_pdf` blob,
  `rec_version` int(11) DEFAULT NULL,
  `rec_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for book_store
-- ----------------------------
DROP TABLE IF EXISTS `book_store`;
CREATE TABLE `book_store` (
  `name` varchar(400) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for book_to_book_store
-- ----------------------------
DROP TABLE IF EXISTS `book_to_book_store`;
CREATE TABLE `book_to_book_store` (
  `book_store_name` varchar(400) COLLATE utf8mb4_bin NOT NULL,
  `book_id` int(11) NOT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`book_store_name`,`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL COMMENT '订单编号',
  `uid` int(11) DEFAULT NULL COMMENT '用户Id',
  `amout` bigint(20) NOT NULL COMMENT '订单金额(单位为分)',
  `status` tinyint(2) DEFAULT NULL COMMENT '订单状态',
  `order_time` datetime DEFAULT NULL COMMENT '订单时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
BEGIN;
INSERT INTO `order` VALUES (101, 110, 666, 1, '2019-04-03 10:10:10');
INSERT INTO `order` VALUES (200, 100, 5899, 0, '2016-03-30 17:54:20');
INSERT INTO `order` VALUES (201, 100, 6799, 0, '2016-03-30 17:54:38');
INSERT INTO `order` VALUES (202, 101, 12699, 0, '2016-03-30 17:55:01');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `age` tinyint(2) DEFAULT NULL COMMENT '年龄',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `register_time` datetime NOT NULL COMMENT '注册时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `index_mobile` (`mobile`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (100, '张三', 1, 28, '13547521456', 'ASDAWQ@!#SDF@#$%XCF', '2016-03-30 17:47:51');
INSERT INTO `user` VALUES (101, '李四', 2, 35, '17025856329', '234ASD@#$@#$AFSDFRT', '2016-03-30 17:48:34');
INSERT INTO `user` VALUES (102, '王五', 1, 48, '15925874536', '#$%SDFSDR@#$%@#$#@', '2016-03-30 17:53:49');
INSERT INTO `user` VALUES (110, '李白', 1, 25, '17638166573', 'admin', '2019-04-02 16:06:38');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
