use xsapi;
-- 接口信息
create table if not exists xsapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '接口名称',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text not null comment '请求参数',
    `method` varchar(256) not null comment '请求类型',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态 0 - 关闭 1 - 开启',
    `isDeleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `userId` bigint not null comment '创建人'
) comment '接口信息';

insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('黎梓晨', '尹健雄', 'www.dong-hessel.name', '严修洁', '赵建辉', '阎明杰', 0, 657345);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('戴健柏', '沈烨霖', 'www.christen-balistreri.name', '沈思聪', '程昊天', '段振家', 0, 756);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('谢子轩', '陆立诚', 'www.rosaria-johnston.co', '袁子骞', '顾彬', '蔡昊天', 0, 263934);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('曾驰', '李思聪', 'www.brooks-kunde.biz', '萧航', '徐靖琪', '武展鹏', 0, 66227468);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('傅越彬', '曾鸿煊', 'www.jeanene-cruickshank.io', '万驰', '万伟祺', '谢越彬', 0, 57730263);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('顾博涛', '黎哲瀚', 'www.zenobia-klocko.net', '罗思淼', '郑博涛', '尹健雄', 0, 4064430913);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('汪潇然', '段熠彤', 'www.laine-breitenberg.name', '余文轩', '贺钰轩', '徐修杰', 0, 35800905);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('孔文昊', '杨伟宸', 'www.pinkie-haag.name', '顾昊天', '何博涛', '覃擎苍', 0, 10);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('赖博超', '覃瑞霖', 'www.branden-thiel.co', '吴绍齐', '潘弘文', '金博文', 0, 99);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('薛明', '崔峻熙', 'www.everett-stanton.net', '薛建辉', '梁峻熙', '许文', 0, 16291);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('雷博文', '邹博涛', 'www.grayce-schowalter.net', '叶瑞霖', '蒋金鑫', '黎雨泽', 0, 9392);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('韦修杰', '姜昊天', 'www.larry-boyer.com', '田立轩', '郝烨磊', '陶晋鹏', 0, 948);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('覃哲瀚', '蒋嘉熙', 'www.arlene-little.net', '莫子默', '姜熠彤', '谢熠彤', 0, 185);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('黄雪松', '顾潇然', 'www.maggie-williamson.co', '严明辉', '陶瑞霖', '尹苑博', 0, 9904542);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('李越彬', '罗炫明', 'www.addie-kozey.io', '卢鹏飞', '金思源', '任峻熙', 0, 1176809);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('苏振家', '蒋绍辉', 'www.krystyna-turcotte.co', '蔡语堂', '顾苑博', '赵烨磊', 0, 4740357);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('赵熠彤', '陆鹭洋', 'www.antoine-schuppe.net', '刘智宸', '高嘉懿', '顾明', 0, 84244);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('周哲瀚', '吴鸿涛', 'www.trevor-kulas.org', '陈子轩', '崔修洁', '崔伟祺', 0, 6257);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('张思远', '邹明轩', 'www.bart-oconnell.biz', '白天宇', '韩文博', '高致远', 0, 7118);
insert into xsapi.`interface_info` (`name`, `description`, `url`, `method`, `requestHeader`, `responseHeader`, `status`, `userId`) values ('夏凯瑞', '董炎彬', 'www.elmira-oconner.net', '邹鸿煊', '刘凯瑞', '尹果', 0, 13417);

-- 用户调用接口关系表
create table if not exists xsapi.`user_interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `userId` bigint not null comment '调用用户 id',
    `interfaceInfoId` bigint not null comment '接口 id',
    `totalNum` int default 0 not null comment '总调用次数',
    `leftNum` int default 0 not null comment '剩余调用次数',
    `status` int default 0 not null comment '0-正常，1-禁用',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '用户调用接口关系';