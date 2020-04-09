-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.28-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 parking.cn_region_info 结构
DROP TABLE IF EXISTS `cn_region_info`;
CREATE TABLE IF NOT EXISTS `cn_region_info` (
  `CRI_CODE` varchar(40) NOT NULL COMMENT '代码',
  `CRI_NAME` varchar(50) NOT NULL COMMENT '名称',
  `CRI_SHORT_NAME` varchar(50) NOT NULL COMMENT '简称',
  `CRI_SUPERIOR_CODE` varchar(40) DEFAULT NULL COMMENT '上级代码',
  `CRI_LNG` varchar(20) DEFAULT NULL COMMENT '经度',
  `CRI_LAT` varchar(20) DEFAULT NULL COMMENT '纬度',
  `CRI_SORT` int(6) DEFAULT NULL COMMENT '排序',
  `CRI_GMT_CREATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRI_GMT_MODIFIED` datetime DEFAULT NULL COMMENT '修改时间',
  `CRI_MEMO` varchar(250) DEFAULT NULL COMMENT '备注',
  `CRI_DATA_STATE` int(11) DEFAULT NULL COMMENT '状态',
  `CRI_LEVEL` varchar(11) DEFAULT NULL COMMENT '级别',
  PRIMARY KEY (`CRI_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='中国地区信息';

-- 数据导出被取消选择。

-- 导出  表 parking.parking_lot 结构
DROP TABLE IF EXISTS `parking_lot`;
CREATE TABLE IF NOT EXISTS `parking_lot` (
  `PL_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `PS_ID` int(11) unsigned NOT NULL COMMENT '所在停车场ID',
  `PL_NO` varchar(32) DEFAULT NULL COMMENT '车位在停车场内的编号',
  `STATUE` varchar(32) DEFAULT NULL COMMENT '车位状态',
  `LAST_UPDATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '车位状态最后更新时间',
  PRIMARY KEY (`PL_ID`),
  KEY `FK_parking_lot_parking_site` (`PS_ID`),
  CONSTRAINT `FK_parking_lot_parking_site` FOREIGN KEY (`PS_ID`) REFERENCES `parking_site` (`PS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='停车位信息表';

-- 数据导出被取消选择。

-- 导出  表 parking.parking_site 结构
DROP TABLE IF EXISTS `parking_site`;
CREATE TABLE IF NOT EXISTS `parking_site` (
  `PS_ID` int(10) unsigned NOT NULL DEFAULT '0',
  `NAME` varchar(40) CHARACTER SET utf8mb4 NOT NULL COMMENT '停车场名称',
  `REGION_CODE` varchar(40) NOT NULL COMMENT '区域代码',
  `MEMO` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '备注',
  `ADDRESS` varchar(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '停车场地址',
  `CONTACT` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '联系电话',
  `LNG` varchar(20) DEFAULT NULL COMMENT '经度',
  `LAT` varchar(20) DEFAULT NULL COMMENT '纬度',
  `PROVINCE` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '省',
  `CITY` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '市',
  `DISTRICT` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '区',
  `STREET` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '街道',
  KEY `索引 1` (`PS_ID`),
  KEY `FK_parking_site_cn_region_info` (`REGION_CODE`),
  CONSTRAINT `FK_parking_site_cn_region_info` FOREIGN KEY (`REGION_CODE`) REFERENCES `cn_region_info` (`CRI_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='停车场信息表';

-- 数据导出被取消选择。

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
