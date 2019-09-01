# multi-project
综合项目
## sql
```mysql
create table lottery
(
    id                  bigint auto_increment
        primary key,
    gmt_create          datetime default CURRENT_TIMESTAMP null comment '创建时间',
    gmt_modified        datetime default CURRENT_TIMESTAMP null comment '修改时间',
    lottery_id          varchar(128)                       null comment '彩票ID',
    lottery_name        varchar(128)                       null comment '彩票名称',
    lottery_res         varchar(128)                       null comment '开奖结果',
    lottery_no          varchar(128)                       null comment '开奖期号',
    lottery_date        varchar(128)                       null comment '开奖日期',
    lottery_exdate      varchar(128)                       null comment '兑奖截止日期',
    lottery_sale_amount varchar(128)                       null comment '本期销售额，可能为空',
    lottery_pool_amount varchar(128)                       null comment '奖池滚存，可能为空',
    lottery_prize       varchar(128)                       null comment '开奖详情，可能为null',
    prize_name          varchar(128)                       null comment '奖项名称',
    prize_num           varchar(128)                       null comment '中奖数量，公布数据可能延时可能为空或--',
    prize_amount        varchar(128)                       null comment '中奖金额',
    prize_require       varchar(128)                       null comment '中奖条件'
)charset = utf8mb4;
```
## quartz
接入有Demo

## xxl-job
#####  控制台位置
    xxl/xxl-job-admin

## multi-login（单点登录)
```mysql

``` 
## multi-auto-generator（代码生成器）        

## multi-biz
    目前集成
        1.http
        2.xxl-job
        3.mybatis-plus