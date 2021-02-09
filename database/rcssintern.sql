-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2021 at 04:18 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rcssintern`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand_category_table`
--

DROP TABLE IF EXISTS `brand_category_table`;
CREATE TABLE IF NOT EXISTS `brand_category_table` (
  `brand_category_id` varchar(255) NOT NULL,
  `brand_category` varchar(255) NOT NULL,
  PRIMARY KEY (`brand_category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `brand_table`
--

DROP TABLE IF EXISTS `brand_table`;
CREATE TABLE IF NOT EXISTS `brand_table` (
  `brand_id` varchar(255) NOT NULL,
  `brand_name` varchar(255) NOT NULL,
  `brand_items` text NOT NULL,
  `brand_category_id` varchar(255) NOT NULL,
  PRIMARY KEY (`brand_id`),
  KEY `brand_category_id` (`brand_category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand_table`
--

INSERT INTO `brand_table` (`brand_id`, `brand_name`, `brand_items`, `brand_category_id`) VALUES
('1', 'sdshbaj', 'asdas', ''),
('2', 'sad', 'asdsa', '');

-- --------------------------------------------------------

--
-- Table structure for table `holiday_table`
--

DROP TABLE IF EXISTS `holiday_table`;
CREATE TABLE IF NOT EXISTS `holiday_table` (
  `holiday_id` varchar(255) NOT NULL,
  `holiday_name` varchar(255) DEFAULT NULL,
  `holiday_description` varchar(255) DEFAULT NULL,
  `holiday_date` varchar(255) DEFAULT NULL,
  `holiday_season` varchar(255) DEFAULT NULL,
  `holiday_deleted` int(11) DEFAULT NULL,
  `holiday_updated` int(11) DEFAULT NULL,
  PRIMARY KEY (`holiday_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `inventory_product_category_table`
--

DROP TABLE IF EXISTS `inventory_product_category_table`;
CREATE TABLE IF NOT EXISTS `inventory_product_category_table` (
  `inventory_product_category_id` varchar(255) NOT NULL,
  `inventory_product_category_name` varchar(255) DEFAULT NULL,
  `inventory_product_category_description` varchar(255) DEFAULT NULL,
  `inventory_product_category_deleted` int(11) DEFAULT NULL,
  `inventory_product_category_updated` int(11) DEFAULT NULL,
  PRIMARY KEY (`inventory_product_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `inventory_product_table`
--

DROP TABLE IF EXISTS `inventory_product_table`;
CREATE TABLE IF NOT EXISTS `inventory_product_table` (
  `inventory_product_id` varchar(255) NOT NULL,
  `inventory_product_name` varchar(255) DEFAULT NULL,
  `inventory_product_description` varchar(255) DEFAULT NULL,
  `inventory_product_price` varchar(255) DEFAULT NULL,
  `inventory_product_size` varchar(255) DEFAULT NULL,
  `inventory_product_color` varchar(255) DEFAULT NULL,
  `inventory_product_holiday_id` varchar(255) DEFAULT NULL,
  `inventory_product_category_id` varchar(255) DEFAULT NULL,
  `inventory_product_brand_id` varchar(255) DEFAULT NULL,
  `inventory_product_quantity` varchar(255) DEFAULT NULL,
  `inventory_product_keyword_id` varchar(255) DEFAULT NULL,
  `inventory_product_deleted` int(11) DEFAULT NULL,
  `inventory_product_updated` int(11) DEFAULT NULL,
  PRIMARY KEY (`inventory_product_id`),
  KEY `inventory_product_holiday_id` (`inventory_product_holiday_id`),
  KEY `inventory_product_category_id` (`inventory_product_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_product_table`
--

INSERT INTO `inventory_product_table` (`inventory_product_id`, `inventory_product_name`, `inventory_product_description`, `inventory_product_price`, `inventory_product_size`, `inventory_product_color`, `inventory_product_holiday_id`, `inventory_product_category_id`, `inventory_product_brand_id`, `inventory_product_quantity`, `inventory_product_keyword_id`, `inventory_product_deleted`, `inventory_product_updated`) VALUES
('In001', 'addidas neo', 'addidas new shoe', '2000', '7', 'black', 'InH001', 'InC001', 'Inb001', '5', 'InK001', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `keyword_category_table`
--

DROP TABLE IF EXISTS `keyword_category_table`;
CREATE TABLE IF NOT EXISTS `keyword_category_table` (
  `keyword_category_id` varchar(255) NOT NULL,
  `keyword_category_name` varchar(255) NOT NULL,
  `keyword_category_description` varchar(255) NOT NULL,
  PRIMARY KEY (`keyword_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyword_category_table`
--

INSERT INTO `keyword_category_table` (`keyword_category_id`, `keyword_category_name`, `keyword_category_description`) VALUES
('k001', 'shoe', 'all type of shoes'),
('k002', 'smart phones', 'all type of smart phones');

-- --------------------------------------------------------

--
-- Table structure for table `keyword_table`
--

DROP TABLE IF EXISTS `keyword_table`;
CREATE TABLE IF NOT EXISTS `keyword_table` (
  `keyword_id` varchar(255) NOT NULL,
  `keywords` text NOT NULL,
  `keyword_category_id` varchar(255) NOT NULL,
  `keyword_tag` varchar(255) NOT NULL,
  PRIMARY KEY (`keyword_id`),
  KEY `keyword_table_ibfk_1` (`keyword_category_id`),
  KEY `keyword_tag` (`keyword_tag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyword_table`
--

INSERT INTO `keyword_table` (`keyword_id`, `keywords`, `keyword_category_id`, `keyword_tag`) VALUES
('k01', 'casual shoes', 'k001', 'kt001');

-- --------------------------------------------------------

--
-- Table structure for table `keyword_tag_table`
--

DROP TABLE IF EXISTS `keyword_tag_table`;
CREATE TABLE IF NOT EXISTS `keyword_tag_table` (
  `keyword_tag_id` varchar(255) NOT NULL,
  `keyword_tag_name` varchar(255) NOT NULL,
  PRIMARY KEY (`keyword_tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyword_tag_table`
--

INSERT INTO `keyword_tag_table` (`keyword_tag_id`, `keyword_tag_name`) VALUES
('kt001', 'shoes');

-- --------------------------------------------------------

--
-- Table structure for table `product_information_table`
--

DROP TABLE IF EXISTS `product_information_table`;
CREATE TABLE IF NOT EXISTS `product_information_table` (
  `product_information_id` varchar(255) NOT NULL,
  `inventory_product_id` varchar(255) NOT NULL,
  `product_information_image1` varchar(255) NOT NULL,
  `product_information_image2` varchar(255) NOT NULL,
  `product_information_image3` varchar(255) NOT NULL,
  `product_information_image4` varchar(255) NOT NULL,
  `product_seller_mrp` varchar(255) NOT NULL,
  `promotion_brand_id` varchar(255) NOT NULL,
  `keyword_tag` varchar(255) NOT NULL,
  PRIMARY KEY (`product_information_id`),
  KEY `inventory_product_id` (`inventory_product_id`),
  KEY `keyword_tag` (`keyword_tag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `promotion_basedon_brand_table`
--

DROP TABLE IF EXISTS `promotion_basedon_brand_table`;
CREATE TABLE IF NOT EXISTS `promotion_basedon_brand_table` (
  `promotion_basedon_brand_id` varchar(255) NOT NULL,
  `promotion_basedon_brand_name` varchar(255) NOT NULL,
  `promotion_basedon_brand_start_date` varchar(255) NOT NULL,
  `promotion_basedon_brand_end_date` varchar(255) NOT NULL,
  `promotion_basedon_brand_details` varchar(255) NOT NULL,
  `promotion_basedon_brand_amount` varchar(255) NOT NULL,
  `brand_id` varchar(255) NOT NULL,
  PRIMARY KEY (`promotion_basedon_brand_id`),
  KEY `promotion_basedon_brand_ibfk_1` (`brand_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `promotion_basedon_brand_table`
--

INSERT INTO `promotion_basedon_brand_table` (`promotion_basedon_brand_id`, `promotion_basedon_brand_name`, `promotion_basedon_brand_start_date`, `promotion_basedon_brand_end_date`, `promotion_basedon_brand_details`, `promotion_basedon_brand_amount`, `brand_id`) VALUES
('1', 'sdfsdf', 'fsdjhjfsd', 'dsfjs', 'adhfjhjs', 'asd', '2'),
('2', 'er', 'wr', 'ewr', 'erw', 'wer', 'ewr'),
('a', 'jehwurth', 'njtrh', 'ertjhehj', 'rterh', 'rejhwjhjrerter', 'dsfsf');

-- --------------------------------------------------------

--
-- Table structure for table `promotion_basedon_holiday_table`
--

DROP TABLE IF EXISTS `promotion_basedon_holiday_table`;
CREATE TABLE IF NOT EXISTS `promotion_basedon_holiday_table` (
  `promotion_basedon_holiday_id` varchar(255) NOT NULL,
  `promotion_basedon_holiday_name` varchar(255) NOT NULL,
  `promotion_basedon_holiday_start_date` varchar(255) NOT NULL,
  `promotion_basedon_holiday_end_date` varchar(255) NOT NULL,
  `promotion_basedon_holiday_details` varchar(255) NOT NULL,
  `promotion_basedon_holiday_amount` varchar(255) NOT NULL,
  `holiday_id` varchar(255) NOT NULL,
  PRIMARY KEY (`promotion_basedon_holiday_id`),
  KEY `promotion_basedon_holiday_ibfk_1` (`holiday_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `promotion_by_user_table`
--

DROP TABLE IF EXISTS `promotion_by_user_table`;
CREATE TABLE IF NOT EXISTS `promotion_by_user_table` (
  `promotion_by_user_id` varchar(255) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  `promotion_id` varchar(255) NOT NULL,
  PRIMARY KEY (`promotion_by_user_id`),
  KEY `promotion_by_user_table_ibfk_1` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `promotion_by_user_table`
--

INSERT INTO `promotion_by_user_table` (`promotion_by_user_id`, `user_id`, `promotion_id`) VALUES
('aaa', '1', '1'),
('bb', '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `stock_table`
--

DROP TABLE IF EXISTS `stock_table`;
CREATE TABLE IF NOT EXISTS `stock_table` (
  `stock_id` varchar(255) NOT NULL,
  `inventory_product_id` varchar(255) NOT NULL,
  `stock_product_quantity` varchar(255) NOT NULL,
  `stock_total_amount` varchar(255) NOT NULL,
  PRIMARY KEY (`stock_id`),
  KEY `inventory_product_id` (`inventory_product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_behavior_table`
--

DROP TABLE IF EXISTS `user_behavior_table`;
CREATE TABLE IF NOT EXISTS `user_behavior_table` (
  `user_behavior_id` varchar(255) NOT NULL,
  `user_behavior_description` varchar(255) NOT NULL,
  `user_behavior_keyword` varchar(255) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  PRIMARY KEY (`user_behavior_id`),
  KEY `user_behavior_table_ibfk_1` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_behavior_table`
--

INSERT INTO `user_behavior_table` (`user_behavior_id`, `user_behavior_description`, `user_behavior_keyword`, `user_id`) VALUES
('aaa', 'aaaaaaaa', 'aaa', '2'),
('bbb', 'bbbbbbbbbbbbbb', 'dd', '3');

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

DROP TABLE IF EXISTS `user_table`;
CREATE TABLE IF NOT EXISTS `user_table` (
  `user_id` varchar(255) NOT NULL,
  `user_first_name` varchar(255) NOT NULL,
  `user_middle_name` varchar(255) NOT NULL,
  `user_last_name` varchar(255) NOT NULL,
  `user_email_id` varchar(255) NOT NULL,
  `user_phone_no` varchar(255) NOT NULL,
  `user_gender` varchar(255) NOT NULL,
  `user_updated` varchar(255) NOT NULL,
  `user_deleted` varchar(255) NOT NULL,
  `user_username` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`user_id`, `user_first_name`, `user_middle_name`, `user_last_name`, `user_email_id`, `user_phone_no`, `user_gender`, `user_updated`, `user_deleted`, `user_username`, `user_password`) VALUES
('qq', 'e', 'ew', 'hsfj\r\n', 'essf', 'dsf', 'dsdfdsfd', 'df', 'dd', 'd', 'sd');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `keyword_table`
--
ALTER TABLE `keyword_table`
  ADD CONSTRAINT `keyword_table_ibfk_1` FOREIGN KEY (`keyword_category_id`) REFERENCES `keyword_category_table` (`keyword_category_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `keyword_table_ibfk_2` FOREIGN KEY (`keyword_tag`) REFERENCES `keyword_tag_table` (`keyword_tag_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `stock_table`
--
ALTER TABLE `stock_table`
  ADD CONSTRAINT `stock_table_ibfk_1` FOREIGN KEY (`inventory_product_id`) REFERENCES `inventory_product_table` (`inventory_product_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
