CREATE TABLE user (
    `id` int(11) PRIMARY KEY comment '用户id',
    `name` varchar(255) NOT NULL UNIQUE comment '用户名',
    `sex` int(11) NOT NULL comment '性别',
    `role` int(11) NOT NULL comment '角色',
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '用户表';

CREATE TABLE course (
    `id` int(11) PRIMARY KEY comment '课程id',
    `number` varchar(255) NOT NULL UNIQUE comment '课程编号',
    `time` varchar(255) comment '上课时间',
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '课程表';

CREATE TABLE user_course (
    -- 在业务代码中保证外键约束
    `id` int(11) NOT NULL comment '用户id',
    `number` varchar(255) NOT NULL comment '课程编号',
    PRIMARY KEY (`id`, `number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '用户课程关系表';