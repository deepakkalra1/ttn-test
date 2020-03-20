-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: employee
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `employee`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `employee` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `employee`;

--
-- Table structure for table `cheque_joined_strategy`
--

DROP TABLE IF EXISTS `cheque_joined_strategy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheque_joined_strategy` (
  `id` int(11) DEFAULT NULL,
  `cheque_number` varchar(30) DEFAULT NULL,
  KEY `id` (`id`),
  CONSTRAINT `cheque_joined_strategy_ibfk_1` FOREIGN KEY (`id`) REFERENCES `parent_joined_strategy` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheque_joined_strategy`
--

LOCK TABLES `cheque_joined_strategy` WRITE;
/*!40000 ALTER TABLE `cheque_joined_strategy` DISABLE KEYS */;
/*!40000 ALTER TABLE `cheque_joined_strategy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheque_table_per_class_strategy`
--

DROP TABLE IF EXISTS `cheque_table_per_class_strategy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheque_table_per_class_strategy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  `cheque_number` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheque_table_per_class_strategy`
--

LOCK TABLES `cheque_table_per_class_strategy` WRITE;
/*!40000 ALTER TABLE `cheque_table_per_class_strategy` DISABLE KEYS */;
/*!40000 ALTER TABLE `cheque_table_per_class_strategy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credit_card_joined_strategy`
--

DROP TABLE IF EXISTS `credit_card_joined_strategy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credit_card_joined_strategy` (
  `id` int(11) DEFAULT NULL,
  `card_number` varchar(30) DEFAULT NULL,
  KEY `id` (`id`),
  CONSTRAINT `credit_card_joined_strategy_ibfk_1` FOREIGN KEY (`id`) REFERENCES `parent_joined_strategy` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_card_joined_strategy`
--

LOCK TABLES `credit_card_joined_strategy` WRITE;
/*!40000 ALTER TABLE `credit_card_joined_strategy` DISABLE KEYS */;
INSERT INTO `credit_card_joined_strategy` VALUES (1,'12345');
/*!40000 ALTER TABLE `credit_card_joined_strategy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credit_card_table_per_class_strategy`
--

DROP TABLE IF EXISTS `credit_card_table_per_class_strategy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credit_card_table_per_class_strategy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  `card_number` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_card_table_per_class_strategy`
--

LOCK TABLES `credit_card_table_per_class_strategy` WRITE;
/*!40000 ALTER TABLE `credit_card_table_per_class_strategy` DISABLE KEYS */;
INSERT INTO `credit_card_table_per_class_strategy` VALUES (1,1000,'12345');
/*!40000 ALTER TABLE `credit_card_table_per_class_strategy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_table`
--

DROP TABLE IF EXISTS `employee_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_table` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `emp_first_name` varchar(30) DEFAULT NULL,
  `emp_last_name` varchar(30) DEFAULT NULL,
  `emp_salary` int(11) DEFAULT NULL,
  `emp_age` int(11) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_table`
--

LOCK TABLES `employee_table` WRITE;
/*!40000 ALTER TABLE `employee_table` DISABLE KEYS */;
INSERT INTO `employee_table` VALUES (1,'deepak','kalra',200000,24),(2,'rahul','kalra',200000,24),(3,'ankur','kalra',200000,24),(4,'ankit','sharma',70000,24),(5,'mayank','sharma',80000,24),(6,'amit','singh',90000,21),(7,'pankaj','kumar',65000,48),(9,'faizal','khan',95000,56);
/*!40000 ALTER TABLE `employee_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `location` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'ankur','Delhi',20),(2,'yash','Delhi',20),(3,'anish','Delhi',20),(4,'anish','Delhi',20);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parent_joined_strategy`
--

DROP TABLE IF EXISTS `parent_joined_strategy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parent_joined_strategy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parent_joined_strategy`
--

LOCK TABLES `parent_joined_strategy` WRITE;
/*!40000 ALTER TABLE `parent_joined_strategy` DISABLE KEYS */;
INSERT INTO `parent_joined_strategy` VALUES (1,1000);
/*!40000 ALTER TABLE `parent_joined_strategy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parent_single_strategy`
--

DROP TABLE IF EXISTS `parent_single_strategy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parent_single_strategy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  `pmode` varchar(5) DEFAULT NULL,
  `card_number` varchar(30) DEFAULT NULL,
  `cheque_number` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parent_single_strategy`
--

LOCK TABLES `parent_single_strategy` WRITE;
/*!40000 ALTER TABLE `parent_single_strategy` DISABLE KEYS */;
INSERT INTO `parent_single_strategy` VALUES (1,1000,'cc','12345',NULL);
/*!40000 ALTER TABLE `parent_single_strategy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `testTable`
--

DROP TABLE IF EXISTS `testTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `testTable` (
  `empFirstName` varchar(30) DEFAULT NULL,
  `empAge` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testTable`
--

LOCK TABLES `testTable` WRITE;
/*!40000 ALTER TABLE `testTable` DISABLE KEYS */;
INSERT INTO `testTable` VALUES ('deepak',24),('akshita',23),('ananya',23);
/*!40000 ALTER TABLE `testTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-20 15:43:18
