/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : permission

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 12/04/2020 10:04:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_acl`;
CREATE TABLE `sys_acl`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '权限码',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '权限名称',
  `acl_module_id` int(11) NOT NULL DEFAULT 0 COMMENT '权限所在的权限模块id',
  `url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '请求的url, 可以填正则表达式',
  `type` int(11) NOT NULL DEFAULT 3 COMMENT '类型，1：菜单，2：按钮，3：其他',
  `status` int(11) NOT NULL DEFAULT 1 COMMENT '状态，1：正常，0：冻结',
  `seq` int(11) NOT NULL DEFAULT 0 COMMENT '权限在当前模块下的顺序，由小到大',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一个更新者的ip地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_acl
-- ----------------------------
INSERT INTO `sys_acl` VALUES (1, '20171015095130_26', '进入产品管理界面', 1, '/sys/product/product.page', 1, 1, 1, '', 'Admin', '2017-10-15 09:51:30', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (2, '20171015095322_14', '查询产品列表', 1, '/sys/product/page.json', 2, 1, 2, '', 'Admin', '2017-10-15 09:53:22', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (3, '20171015095350_69', '产品上架', 1, '/sys/product/online.json', 2, 1, 3, '', 'Admin', '2017-10-15 09:53:51', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (4, '20171015095420_7', '产品下架', 1, '/sys/product/offline.json', 2, 1, 4, '', 'Admin', '2017-10-15 10:11:28', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (5, '20171015212626_63', '进入订单页', 2, '/sys/order/order.page', 1, 1, 1, '', 'Admin', '2017-10-15 21:26:27', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (6, '20171015212657_12', '查询订单列表', 2, '/sys/order/list.json', 2, 1, 2, '', 'Admin', '2017-10-15 21:26:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (7, '20171015212907_36', '进入权限管理页', 7, '/sys/aclModule/acl.page', 1, 1, 1, '', 'Admin', '2017-10-15 21:29:07', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (8, '20171015212938_27', '进入角色管理页', 8, '/sys/role/role.page', 1, 1, 1, '', 'Admin', '2017-10-16 17:49:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (9, '20171015213009_0', '进入用户管理页', 9, '/sys/dept/dept.page', 1, 1, 1, '', 'Admin', '2017-10-15 21:30:09', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (10, '20171016230429_8', '进入权限更新记录页面', 11, '/sys/log/log.page', 1, 1, 1, '', 'Admin', '2017-10-16 23:04:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl` VALUES (11, '20200409154550_48', '产品降价', 4, '/sys/product/cutprice', 2, 1, 1, '', 'Admin', '2020-04-09 15:46:21', '127.0.0.1');

-- ----------------------------
-- Table structure for sys_acl_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_acl_module`;
CREATE TABLE `sys_acl_module`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限模块id',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '权限模块名称',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '上级权限模块id',
  `level` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '权限模块层级',
  `seq` int(11) NOT NULL DEFAULT 0 COMMENT '权限模块在当前层级下的顺序，由小到大',
  `status` int(11) NOT NULL DEFAULT 1 COMMENT '状态，1：正常，0：冻结',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_acl_module
-- ----------------------------
INSERT INTO `sys_acl_module` VALUES (1, '产品管理', 0, '0', 1, 1, 'product', 'Admin', '2017-10-14 21:13:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (2, '订单管理', 0, '0', 2, 1, '', 'Admin', '2017-10-14 20:17:11', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (3, '公告管理', 0, '0', 3, 1, '', 'Admin', '2017-10-14 20:17:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (4, '出售中产品管理', 1, '0.1', 1, 1, '', 'Admin', '2020-04-09 15:27:50', '127.0.0.1');
INSERT INTO `sys_acl_module` VALUES (5, '下架产品管理', 3, '0.1', 2, 1, '', 'Admin', '2020-04-09 15:27:39', '127.0.0.1');
INSERT INTO `sys_acl_module` VALUES (6, '权限管理', 0, '0', 4, 1, '', 'Admin', '2017-10-15 21:27:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (7, '权限管理', 6, '0.6', 1, 1, '', 'Admin', '2017-10-15 21:27:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (8, '角色管理', 6, '0.6', 2, 1, '', 'Admin', '2017-10-15 21:28:22', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (9, '用户管理', 6, '0.6', 2, 1, '', 'Admin', '2017-10-15 21:28:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (10, '运维管理', 0, '0', 6, 1, '', 'Admin', '2017-10-16 23:03:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_acl_module` VALUES (11, '权限更新记录管理', 6, '0.6', 4, 1, '', 'Admin', '2017-10-16 23:04:07', '0:0:0:0:0:0:0:1');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '部门名称',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '上级部门id',
  `level` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '部门层级',
  `seq` int(11) NOT NULL DEFAULT 0 COMMENT '部门在当前层级下的顺序，由小到大',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES (16, '技术部', 0, '0', 1, '技术部', 'Admin', '2020-04-09 15:34:13', '127.0.0.1');
INSERT INTO `sys_dept` VALUES (17, '产品部', 0, '0', 2, '产品部', 'Admin', '2020-04-09 15:40:33', '127.0.0.1');
INSERT INTO `sys_dept` VALUES (18, '运营部', 0, '0', 1, '运营部', 'Admin', '2020-04-09 15:34:38', '127.0.0.1');
INSERT INTO `sys_dept` VALUES (19, 'Java开发', 16, '0.16', 1, 'Java开发', 'Admin', '2020-04-09 15:34:52', '127.0.0.1');
INSERT INTO `sys_dept` VALUES (21, '前端开发', 16, '0.16', 2, '前端开发', 'Admin', '2020-04-09 15:40:49', '127.0.0.1');
INSERT INTO `sys_dept` VALUES (22, '产品助理', 17, '0.17', 1, '产品助理', 'lnzz', '2020-04-11 16:30:34', '127.0.0.1');
INSERT INTO `sys_dept` VALUES (24, '产品经理', 17, '0.17', 2, '', 'lnzz', '2020-04-11 16:29:54', '127.0.0.1');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL DEFAULT 0 COMMENT '权限更新的类型，1：部门，2：用户，3：权限模块，4：权限，5：角色，6：角色用户关系，7：角色权限关系',
  `target_id` int(11) NOT NULL COMMENT '基于type后指定的对象id，比如用户、权限、角色等表的主键',
  `old_value` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '旧值',
  `new_value` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '新值',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新的时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新者的ip地址',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '当前是否复原过，0：没有，1：复原过',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES (28, 1, 24, '', '{\"id\":24,\"name\":\"产品经理\",\"parentId\":17,\"level\":\"0.17\",\"seq\":2,\"operator\":\"lnzz\",\"operateTime\":1586593794438,\"operateIp\":\"127.0.0.1\"}', 'lnzz', '2020-04-11 16:29:55', '127.0.0.1', 1);
INSERT INTO `sys_log` VALUES (29, 1, 22, '{\"id\":22,\"name\":\"产品助理\",\"parentId\":17,\"level\":\"0.17\",\"seq\":1,\"remark\":\"产品助理\",\"operator\":\"lnzz\",\"operateTime\":1586593360000,\"operateIp\":\"127.0.0.1\"}', '{\"id\":22,\"name\":\"产品助理\",\"parentId\":17,\"level\":\"0.17\",\"seq\":1,\"remark\":\"产品助理1\",\"operator\":\"lnzz\",\"operateTime\":1586593813313,\"operateIp\":\"127.0.0.1\"}', 'lnzz', '2020-04-11 16:30:13', '127.0.0.1', 1);
INSERT INTO `sys_log` VALUES (30, 1, 22, '{\"id\":22,\"name\":\"产品助理\",\"parentId\":17,\"level\":\"0.17\",\"seq\":1,\"remark\":\"产品助理1\",\"operator\":\"lnzz\",\"operateTime\":1586593813000,\"operateIp\":\"127.0.0.1\"}', '{\"id\":22,\"name\":\"产品助理\",\"parentId\":17,\"level\":\"0.17\",\"seq\":1,\"remark\":\"产品助理\",\"operator\":\"lnzz\",\"operateTime\":1586593833886,\"operateIp\":\"127.0.0.1\"}', 'lnzz', '2020-04-11 16:30:34', '127.0.0.1', 1);
INSERT INTO `sys_log` VALUES (31, 2, 7, '', '{\"id\":7,\"username\":\"sleven\",\"telephone\":\"18866661111\",\"mail\":\"sleven@qq.com\",\"password\":\"25D55AD283AA400AF464C76D713C07AD\",\"deptId\":16,\"status\":1,\"operator\":\"lnzz\",\"operateTime\":1586593865496,\"operateIp\":\"127.0.0.1\"}', 'lnzz', '2020-04-11 16:31:06', '127.0.0.1', 1);
INSERT INTO `sys_log` VALUES (32, 2, 7, '{\"id\":7,\"username\":\"sleven\",\"telephone\":\"18866661111\",\"mail\":\"sleven@qq.com\",\"password\":\"25D55AD283AA400AF464C76D713C07AD\",\"deptId\":16,\"status\":1,\"operator\":\"lnzz\",\"operateTime\":1586593865000,\"operateIp\":\"127.0.0.1\"}', '{\"id\":7,\"username\":\"sleven\",\"telephone\":\"18866661111\",\"mail\":\"sleven@qq.com\",\"deptId\":21,\"status\":1,\"operator\":\"lnzz\",\"operateTime\":1586593875332,\"operateIp\":\"127.0.0.1\"}', 'lnzz', '2020-04-11 16:31:15', '127.0.0.1', 1);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `type` int(11) NOT NULL DEFAULT 1 COMMENT '角色的类型，1：管理员角色，2：其他',
  `status` int(11) NOT NULL DEFAULT 1 COMMENT '状态，1：可用，0：冻结',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新的时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新者的ip地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, '产品管理员', 1, 1, '', 'Admin', '2017-10-15 12:42:47', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_role` VALUES (2, '订单管理员', 1, 1, '', 'Admin', '2017-10-15 12:18:59', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_role` VALUES (3, '公告管理员', 1, 1, '', 'Admin', '2017-10-15 12:19:10', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_role` VALUES (4, '权限管理员', 1, 1, '', 'Admin', '2017-10-15 21:30:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_role` VALUES (5, '运维管理员', 1, 1, '运维', 'Admin', '2017-10-17 00:23:28', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_role` VALUES (6, '行政管理员', 1, 0, '', 'lnzz', '2020-04-09 16:01:14', '127.0.0.1');

-- ----------------------------
-- Table structure for sys_role_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_acl`;
CREATE TABLE `sys_role_acl`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `acl_id` int(11) NOT NULL COMMENT '权限id',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新的时间',
  `operate_ip` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新者的ip',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_acl
-- ----------------------------
INSERT INTO `sys_role_acl` VALUES (33, 4, 9, 'lnzz', '2020-04-11 15:38:56', '127.0.0.1');

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新的时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新者的ip地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES (2, 4, 6, 'lnzz', '2020-04-11 15:45:40', '127.0.0.1');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '用户名称',
  `telephone` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `mail` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '加密后的密码',
  `dept_id` int(11) NOT NULL DEFAULT 0 COMMENT '用户所在部门的id',
  `status` int(11) NOT NULL DEFAULT 1 COMMENT '状态，1：正常，0：冻结状态，2：删除',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
  `operator` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
  `operate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
  `operate_ip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新者的ip地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (6, 'lnzz', '18877771111', 'admin@qq.com', '25D55AD283AA400AF464C76D713C07AD', 19, 1, '', 'lnzz', '2020-04-09 16:00:05', '127.0.0.1');
INSERT INTO `sys_user` VALUES (7, 'sleven', '18866661111', 'sleven@qq.com', '25D55AD283AA400AF464C76D713C07AD', 21, 1, '', 'lnzz', '2020-04-11 16:31:15', '127.0.0.1');

SET FOREIGN_KEY_CHECKS = 1;
