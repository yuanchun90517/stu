/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : stu

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-11-27 22:35:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for taa_class_team
-- ----------------------------
DROP TABLE IF EXISTS `taa_class_team`;
CREATE TABLE `taa_class_team` (
  `ct_id` int(11) NOT NULL AUTO_INCREMENT,
  `ct_name` varchar(50) DEFAULT NULL,
  `ct_begin_date` datetime DEFAULT NULL,
  `ct_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`ct_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of taa_class_team
-- ----------------------------
INSERT INTO `taa_class_team` VALUES ('1', '科技班', '2012-09-12 08:00:00', '13');
INSERT INTO `taa_class_team` VALUES ('2', '魔法班', '2019-02-13 19:08:36', '20');
INSERT INTO `taa_class_team` VALUES ('3', '武术班', '2014-06-11 19:08:07', '24');
INSERT INTO `taa_class_team` VALUES ('5', '新世界', '2019-10-31 11:00:00', '2');
INSERT INTO `taa_class_team` VALUES ('6', '测试班', '2019-11-26 00:00:00', '30');

-- ----------------------------
-- Table structure for tab_student
-- ----------------------------
DROP TABLE IF EXISTS `tab_student`;
CREATE TABLE `tab_student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(50) DEFAULT NULL,
  `stu_in_age` int(11) DEFAULT NULL,
  `stu_birth` date DEFAULT NULL,
  `stu_weight` double DEFAULT NULL,
  `stu_sn` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `stu_sex` char(1) DEFAULT NULL,
  `ct_id` int(11) DEFAULT NULL,
  `stu_in_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`stu_id`),
  KEY `fk_ct_stu` (`ct_id`),
  CONSTRAINT `fk_ct_stu` FOREIGN KEY (`ct_id`) REFERENCES `taa_class_team` (`ct_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_student
-- ----------------------------
INSERT INTO `tab_student` VALUES ('1', '李小三', '14', '2012-11-23', '58.4705', '13000000000', '0', '1', '2019-11-27 21:56:28');
INSERT INTO `tab_student` VALUES ('2', '赵静子', '18', '1992-06-01', '53.993', '13000000001', '0', '1', '2019-11-27 21:56:38');
INSERT INTO `tab_student` VALUES ('3', '赵小四', '17', '1976-09-16', '801.9828', '13000000002', '1', '1', '2019-11-27 21:56:53');
INSERT INTO `tab_student` VALUES ('4', '刘小翠', '23', '2007-05-04', '55.403', '13000000003', '0', '2', '2019-11-27 21:57:07');
INSERT INTO `tab_student` VALUES ('5', '马小花', '123', '1993-08-02', '435.2564', '13000000004', '0', '2', '2019-11-27 21:57:10');
INSERT INTO `tab_student` VALUES ('6', '武小奎', '45', '1993-11-30', '912.907', '13000000005', '1', '2', '2019-11-27 21:57:12');
INSERT INTO `tab_student` VALUES ('7', '张不开', '31', '1968-08-15', '88.658', '13000000006', '1', '2', '2019-11-27 21:57:18');
INSERT INTO `tab_student` VALUES ('8', '孙悟空', '519', '1984-02-18', '48.4648', '13000000007', '1', '1', '2019-11-27 21:57:21');
INSERT INTO `tab_student` VALUES ('9', '白素贞', '1001', '1961-11-20', '63.9998', '13000000008', '0', '2', '2019-11-27 21:57:24');
INSERT INTO `tab_student` VALUES ('10', '柳生静云', '35', '2005-02-07', '56.0321', '13000000009', '1', '3', '2019-11-27 21:57:29');
INSERT INTO `tab_student` VALUES ('11', '哪吒', '8', '1963-12-13', '83.6424', '13000000010', '1', '3', '2019-11-27 21:57:41');
INSERT INTO `tab_student` VALUES ('15', '测试628', '3', '2019-11-01', '1.03', '13000000011', '1', '1', '2019-11-27 22:34:29');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) DEFAULT NULL COMMENT '唯一标示',
  `code` varchar(20) DEFAULT NULL COMMENT '编码',
  `name` varchar(64) DEFAULT NULL COMMENT '名称',
  `status` char(1) DEFAULT '1' COMMENT '状态 1启用 0 停用',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
