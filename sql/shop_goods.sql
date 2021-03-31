drop table if exists `brand` ;
CREATE TABLE `brand` (
`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌id',
`name` varchar(100) NOT NULL COMMENT '品牌名称',
`image` varchar(1000) DEFAULT '' COMMENT '品牌图片地址',
`initial` varchar(1) DEFAULT '' COMMENT '品牌的首字母',
`sort` int(11) DEFAULT NULL COMMENT '排序',
`version` bigint NOT NULL COMMENT '乐观锁',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='品牌表';