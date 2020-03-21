SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_forum
-- ----------------------------
DROP TABLE IF EXISTS `t_forum`;
CREATE TABLE `t_forum` (
    `forum_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    `forum_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '论坛名称',
    PRIMARY KEY (`forum_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC ;

-- ---------------------------
-- Table structure for t_post
-- ---------------------------
DROP TABLE IF EXISTS `t_post`;
CREATE TABLE `t_post` (
    `post_id` int(11) NOT NULL COMMENT '帖子自增主键',
    `forum_id` int(11) NOT NULL COMMENT '帖子所属论坛id',
    `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '帖子标题',
    `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '帖子内容',
    `thumbnail` longblob NULL COMMENT '帖子缩略图',
    `post_time` datetime(0) NULL DEFAULT NULL COMMENT '帖子发表时间',
    PRIMARY KEY (`post_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;