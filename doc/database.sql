drop database if exists `javaweb`;
create database `javaweb`;
use `javaweb`;

set foreign_key_checks = 0;

drop table if exists `sys_ad`;

create table `sys_ad`(
    `title` varchar(64),
    `sort_id` int(11),
    `cover` varchar(64),
    `type` int(11),
    `description` varchar(64),
    `content` varchar(64),
    `url` varchar(64),
    `width` int(11),
    `height` int(11),
    `start_time` timestamp,
    `end_time` timestamp,
    `view_num` int(11),
    `status` int(11),
    `sort` int(11)
);

drop table if exists `sys_admin`;

create table `sys_admin`(
    `id` int(11) primary key,
    `realname` varchar(64),
    `nickname` varchar(64),
    `gender` int(11),
    `avatar` varchar(64),
    `mobile` varchar(64),
    `email` varchar(64),
    `birthday` timestamp,
    `company_id` int(11),
    `dept_id` int(11),
    `level_id` int(11),
    `position_id` int(11),
    `province_id` int(11),
    `city_id` int(11),
    `district_id` int(11),
    `address` varchar(64),
    `username` varchar(64),
    `password` varchar(64),
    `salt` varchar(64),
    `tags` varchar(64),
    `intro` varchar(64),
    `status` int(11),
    `rules` varchar(64),
    `role_ids` varchar(64),
    `note` varchar(64),
    `sort` int(11),
    `login_num` int(11),
    `login_ip` varchar(64),
    `login_time` timestamp,
    `create_user` int(11),
    `create_time` timestamp,
    `update_user` int(11),
    `update_time` timestamp,
    `mark` int(11)
);

drop table if exists `sys_admin_role`;

create table `sys_admin_role`(
    `admin_id` int(11),
    `role_id` int(11)
);

drop table if exists `sys_ad_sort`;

create table `sys_ad_sort`(
    `name` varchar(64),
    `note` varchar(64),
    `item_id` int(11),
    `cate_id` int(11),
    `loc_id` int(11),
    `platform` int(11),
    `sort` int(11)
);

drop table if exists `sys_city`;

create table `sys_city`(
    `name` varchar(64),
    `level` int(11),
    `pid` int(11),
    `citycode` varchar(64),
    `p_Adcode` varchar(64),
    `adcode` varchar(64),
    `lng` int(11),
    `lat` int(11),
    `sort` int(11)
);

drop table if exists `sys_config`;

create table `sys_config`(
    `title` varchar(64),
    `tag` varchar(64),
    `value` varchar(64),
    `options` varchar(64),
    `group_id` int(11),
    `type` varchar(64),
    `status` int(11),
    `sort` int(11),
    `note` varchar(64)
);

drop table if exists `sys_config_group`;

create table `sys_config_group`(
    `name` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_crontab`;

create table `sys_crontab`(
    `title` varchar(64),
    `cron` varchar(64),
    `delay` int(11),
    `fixed` int(11),
    `execute` int(11),
    `status` int(11),
    `note` varchar(64)
);

drop table if exists `sys_dep`;

create table `sys_dep`(
    `name` varchar(64),
    `pid` int(11),
    `type` int(11),
    `has_child` int(11),
    `sort` int(11)
);

drop table if exists `sys_dic`;

create table `sys_dic`(
    `title` varchar(64),
    `tag` varchar(64),
    `value` varchar(64),
    `type_id` int(11),
    `status` int(11),
    `note` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_dic_type`;

create table `sys_dic_type`(
    `name` varchar(64),
    `tag` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_item`;

create table `sys_item`(
    `name` varchar(64),
    `type` int(11),
    `url` varchar(64),
    `image` varchar(64),
    `is_domain` int(11),
    `status` int(11),
    `note` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_item_cate`;

create table `sys_item_cate`(
    `name` varchar(64),
    `pid` int(11),
    `item_id` int(11),
    `pinyin` varchar(64),
    `code` varchar(64),
    `is_cover` int(11),
    `cover` varchar(64),
    `status` int(11),
    `note` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_layout`;

create table `sys_layout`(
    `item_id` int(11),
    `loc_id` int(11),
    `type` int(11),
    `type_id` int(11),
    `image` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_layout_desc`;

create table `sys_layout_desc`(
    `name` varchar(64),
    `item_id` int(11),
    `loc_id` int(11),
    `loc_desc` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_level`;

create table `sys_level`(
    `name` varchar(64),
    `status` int(11),
    `sort` int(11)
);

drop table if exists `sys_link`;

create table `sys_link`(
    `name` varchar(64),
    `type` int(11),
    `url` varchar(64),
    `item_id` int(11),
    `cate_id` int(11),
    `platform` int(11),
    `form` int(11),
    `image` varchar(64),
    `status` int(11),
    `sort` int(11)
);

drop table if exists `sys_login_log`;

create table `sys_login_log`(
    `title` varchar(64),
    `login_name` varchar(64),
    `login_time` timestamp,
    `login_ip` varchar(64),
    `login_location` varchar(64),
    `browser` varchar(64),
    `os` varchar(64),
    `status` int(11),
    `type` int(11),
    `msg` varchar(64)
);

drop table if exists `sys_menu`;

create table `sys_menu`(
    `name` varchar(64),
    `icon` varchar(64),
    `url` varchar(64),
    `param` varchar(64),
    `pid` int(11),
    `type` int(11),
    `permission` varchar(64),
    `status` int(11),
    `is_public` int(11),
    `note` varchar(64),
    `sort` int(11)
);

drop table if exists `sys_message`;

create table `sys_message`(
    `title` varchar(64),
    `content` varchar(64),
    `receiver` varchar(64),
    `type` int(11),
    `send_time` timestamp,
    `send_status` int(11),
    `send_num` int(11),
    `note` varchar(64)
);

drop table if exists `sys_message_template`;

create table `sys_message_template`(
    `code` varchar(64),
    `title` varchar(64),
    `type` int(11),
    `content` varchar(64),
    `status` int(11)
);

drop table if exists `sys_notice`;

create table `sys_notice`(
    `title` varchar(64),
    `content` varchar(64),
    `source` int(11),
    `is_top` int(11),
    `view_num` int(11),
    `status` int(11),
    `public_time` timestamp,
    `is_send` int(11),
    `send_time` timestamp
);

drop table if exists `sys_oper_log`;

create table `sys_oper_log`(
    `title` varchar(64),
    `business_type` int(11),
    `method` varchar(64),
    `request_method` varchar(64),
    `operator_type` int(11),
    `oper_num` varchar(64),
    `oper_url` varchar(64),
    `oper_ip` varchar(64),
    `oper_location` varchar(64),
    `oper_param` varchar(64),
    `json_result` varchar(64),
    `status` int(11),
    `error_msg` varchar(64)
);

drop table if exists `sys_position`;

create table `sys_position`(
    `name` varchar(64),
    `status` int(11),
    `sort` int(11)
);

drop table if exists `sys_role`;

create table `sys_role`(
    `name` varchar(64),
    `rules` varchar(64),
    `status` int(11),
    `sort` int(11)
);

drop table if exists `sys_role_dept`;

create table `sys_role_dept`(
    `role_id` int(11),
    `dept_id` int(11)
);

drop table if exists `sys_role_menu`;

create table `sys_role_menu`(
    `role_id` int(11),
    `menu_id` int(11)
);

set foreign_key_checks = 1;