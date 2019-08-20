/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-08-20 23:02:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_dpt_info
-- ----------------------------
DROP TABLE IF EXISTS `t_dpt_info`;
CREATE TABLE `t_dpt_info` (
`dpt_id`  int(8) NOT NULL AUTO_INCREMENT COMMENT '部门编号' ,
`dpt_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称' ,
`dpt_tel`  int(11) NULL DEFAULT NULL COMMENT '部门电话' ,
PRIMARY KEY (`dpt_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3

;

-- ----------------------------
-- Records of t_dpt_info
-- ----------------------------
BEGIN;
INSERT INTO `t_dpt_info` VALUES ('1', '张三', '20190830'), ('2', '李四', '20190815');
COMMIT;

-- ----------------------------
-- Table structure for t_emp_info
-- ----------------------------
DROP TABLE IF EXISTS `t_emp_info`;
CREATE TABLE `t_emp_info` (
`emp_id`  int(8) NOT NULL AUTO_INCREMENT COMMENT '编号' ,
`emp_name`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工姓名' ,
`emp_gender`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工性别' ,
`emp_salary`  decimal(10,2) NULL DEFAULT NULL ,
`emp_birthday`  date NULL DEFAULT NULL ,
PRIMARY KEY (`emp_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3

;

-- ----------------------------
-- Records of t_emp_info
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Auto increment value for t_dpt_info
-- ----------------------------
ALTER TABLE `t_dpt_info` AUTO_INCREMENT=3;

-- ----------------------------
-- Auto increment value for t_emp_info
-- ----------------------------
ALTER TABLE `t_emp_info` AUTO_INCREMENT=3;
