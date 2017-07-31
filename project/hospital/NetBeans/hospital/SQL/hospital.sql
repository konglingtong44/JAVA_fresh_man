/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.40 : Database - hospital
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hospital` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hospital`;

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `departmentNo` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`departmentNo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`departmentNo`,`departmentName`) values (1,'骨科'),(2,'普外科'),(3,'儿科'),(4,'妇科'),(5,'内科');

/*Table structure for table `doctor` */

DROP TABLE IF EXISTS `doctor`;

CREATE TABLE `doctor` (
  `doctorNo` int(11) NOT NULL AUTO_INCREMENT,
  `doctorName` varchar(30) DEFAULT NULL,
  `doctorSex` varchar(10) DEFAULT NULL,
  `doctorAge` int(11) DEFAULT NULL,
  `departmentNo` int(11) DEFAULT NULL,
  `doctorSalary` int(11) DEFAULT NULL,
  PRIMARY KEY (`doctorNo`),
  KEY `fk_department_doctor` (`departmentNo`),
  CONSTRAINT `fk_department_doctor` FOREIGN KEY (`departmentNo`) REFERENCES `department` (`departmentNo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `doctor` */

insert  into `doctor`(`doctorNo`,`doctorName`,`doctorSex`,`doctorAge`,`departmentNo`,`doctorSalary`) values (1,'赵一','男',21,1,1000),(2,'钱二','女',22,2,2000),(3,'孙三','男',23,3,3000),(4,'李四','女',24,4,4000),(5,'周五','男',25,5,5000);

/*Table structure for table `drug` */

DROP TABLE IF EXISTS `drug`;

CREATE TABLE `drug` (
  `drugNo` int(11) NOT NULL AUTO_INCREMENT,
  `drugName` varchar(30) DEFAULT NULL,
  `drugPrice` int(11) DEFAULT NULL,
  PRIMARY KEY (`drugNo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `drug` */

insert  into `drug`(`drugNo`,`drugName`,`drugPrice`) values (1,'骨科神器',100),(2,'普外科神器',200),(3,'儿科神器',300),(4,'妇科神器',400),(5,'内科神器',500);

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `patientNo` int(11) NOT NULL AUTO_INCREMENT,
  `patientName` varchar(30) DEFAULT NULL,
  `patienSex` varchar(10) DEFAULT NULL,
  `patienAge` int(11) DEFAULT NULL,
  `departmentNo` int(11) DEFAULT NULL,
  `drugNo` int(11) DEFAULT NULL,
  `bill` int(11) DEFAULT NULL,
  `doctorNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`patientNo`),
  KEY `fk_drug_patient` (`drugNo`),
  KEY `fk_department_patient` (`departmentNo`),
  KEY `fk_doctor_patient` (`doctorNo`),
  CONSTRAINT `fk_drug_patient` FOREIGN KEY (`drugNo`) REFERENCES `drug` (`drugNo`),
  CONSTRAINT `fk_department_patient` FOREIGN KEY (`departmentNo`) REFERENCES `department` (`departmentNo`),
  CONSTRAINT `fk_doctor_patient` FOREIGN KEY (`doctorNo`) REFERENCES `doctor` (`doctorNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `patient` */

/*Table structure for table `systemuser` */

DROP TABLE IF EXISTS `systemuser`;

CREATE TABLE `systemuser` (
  `systemUserNo` int(11) NOT NULL AUTO_INCREMENT,
  `systemUserId` varchar(30) DEFAULT NULL,
  `systemUserPassword` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`systemUserNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `systemuser` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
