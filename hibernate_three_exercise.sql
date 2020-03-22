-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: hibernate_three_exercise
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
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `street_no` int(11) DEFAULT NULL,
  `location` varchar(40) DEFAULT NULL,
  `state` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'deepak','kalra',21,'rohini','delhi'),(2,'ankur','pathak',51,'vikaspuri','delhi'),(4,'vijay','thakur',51,'vikaspuri','delhi'),(5,'arun','kumar',51,'vikaspuri','delhi'),(6,'harbajan','singh',51,'vikaspuri','delhi'),(11,'bhajji','singh',51,'vikaspuri','delhi'),(12,'pawan','sharma',51,'vikaspuri','delhi'),(13,'pawan','sharma',51,'vikaspuri','delhi'),(16,'pawan','sharma',51,'vikaspuri','delhi'),(17,'pawan','sharma',51,'vikaspuri','delhi'),(18,'Munish','Abbatt',201,'patiala','punjab'),(19,'Jassi','gill',201,'patiala','punjab'),(20,'chunky','sharma',51,'vikaspuri','delhi'),(21,'Anurag','nain',1,'janakpuri','delhi'),(22,'Anurag','nain',1,'janakpuri','delhi');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author_book_mapping`
--

DROP TABLE IF EXISTS `author_book_mapping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author_book_mapping` (
  `au_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  KEY `au_id` (`au_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `author_book_mapping_ibfk_1` FOREIGN KEY (`au_id`) REFERENCES `author` (`id`),
  CONSTRAINT `author_book_mapping_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author_book_mapping`
--

LOCK TABLES `author_book_mapping` WRITE;
/*!40000 ALTER TABLE `author_book_mapping` DISABLE KEYS */;
INSERT INTO `author_book_mapping` VALUES (22,9),(22,10),(22,11);
/*!40000 ALTER TABLE `author_book_mapping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author_subject`
--

DROP TABLE IF EXISTS `author_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author_subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `au_id` int(11) DEFAULT NULL,
  `sub_name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `au_id` (`au_id`),
  CONSTRAINT `author_subject_ibfk_1` FOREIGN KEY (`au_id`) REFERENCES `author` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author_subject`
--

LOCK TABLES `author_subject` WRITE;
/*!40000 ALTER TABLE `author_subject` DISABLE KEYS */;
INSERT INTO `author_subject` VALUES (1,NULL,'Physics'),(2,NULL,NULL),(3,NULL,NULL),(4,NULL,'English'),(5,NULL,'Maths'),(6,NULL,'Physics'),(7,6,'English'),(8,6,'Maths'),(9,6,'Physics'),(16,11,'English'),(17,11,'Maths'),(18,11,'Physics'),(19,NULL,'English'),(20,NULL,'Geography'),(21,NULL,'History'),(22,13,'English'),(23,13,'Geography'),(24,13,'History'),(31,16,'English'),(32,16,'Geography'),(33,16,'History'),(34,17,'English'),(35,17,'Geography'),(36,17,'History'),(37,18,'Punjabi'),(38,18,'Polity'),(39,18,'History'),(40,20,'English'),(41,20,'Geography'),(42,20,'History');
/*!40000 ALTER TABLE `author_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `au_id` int(11) DEFAULT NULL,
  `book_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `au_id` (`au_id`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`au_id`) REFERENCES `author` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,18,'Learn to speak in punjabi'),(3,19,'Let us C'),(4,19,'Let us C++'),(5,19,'Java programming'),(6,21,'wings of fire'),(7,21,'SSB crack'),(8,21,'power of subconcious mind'),(9,NULL,'wings of fire'),(10,NULL,'SSB crack'),(11,NULL,'power of subconcious mind');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-22 16:50:10
