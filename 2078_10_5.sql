-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 19, 2022 at 05:18 PM
-- Server version: 10.3.25-MariaDB
-- PHP Version: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `noblesch_noble`
--

-- --------------------------------------------------------

--
-- Table structure for table `class_subject`
--

CREATE TABLE `class_subject` (
  `ClassName` varchar(50) NOT NULL,
  `sub_1` varchar(50) DEFAULT NULL,
  `sub_2` varchar(50) DEFAULT NULL,
  `sub_3` varchar(50) DEFAULT NULL,
  `sub_4` varchar(50) DEFAULT NULL,
  `sub_5` varchar(50) DEFAULT NULL,
  `sub_6` varchar(50) DEFAULT NULL,
  `sub_7` varchar(50) DEFAULT NULL,
  `sub_8` varchar(50) DEFAULT NULL,
  `sub_9` varchar(50) DEFAULT NULL,
  `sub_10` varchar(50) DEFAULT NULL,
  `sub_11` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class_subject`
--

INSERT INTO `class_subject` (`ClassName`, `sub_1`, `sub_2`, `sub_3`, `sub_4`, `sub_5`, `sub_6`, `sub_7`, `sub_8`, `sub_9`, `sub_10`, `sub_11`) VALUES
('8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9', 'English', 'Math', 'Science', 'Social', 'computer', NULL, NULL, NULL, NULL, NULL, NULL),
('3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('34', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('35', 'nepali', 'english', '', '', '', '', '', '', '', '', NULL),
('65', '', '', '', '', '', '', 'nopol', '', '', '', NULL),
('', '', '', '', '', '', '', '', '', '', '', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `Exam`
--

CREATE TABLE `Exam` (
  `exam_id` int(20) NOT NULL,
  `year` year(4) NOT NULL,
  `Terminal` int(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Exam`
--

INSERT INTO `Exam` (`exam_id`, `year`, `Terminal`) VALUES
(1, 2078, 2),
(2, 2078, 1),
(3, 2078, 3),
(4, 2078, 4),
(5, 2079, 4),
(6, 2080, 5),
(7, 2083, 7),
(8, 2077, 9),
(9, 2088, 99),
(10, 2088, 99),
(11, 2088, 99);

-- --------------------------------------------------------

--
-- Table structure for table `full_marks`
--

CREATE TABLE `full_marks` (
  `full_mark_id` int(8) NOT NULL,
  `year` varchar(20) NOT NULL,
  `Terminal` varchar(50) NOT NULL,
  `ClassName` varchar(50) NOT NULL,
  `sub_1` varchar(50) DEFAULT NULL,
  `sub_1_fm` int(8) DEFAULT NULL,
  `sub_2` varchar(50) DEFAULT NULL,
  `sub_2_fm` int(8) DEFAULT NULL,
  `sub_3` varchar(50) DEFAULT NULL,
  `sub_3_fm` int(8) DEFAULT NULL,
  `sub_4` varchar(50) DEFAULT NULL,
  `sub_4_fm` int(8) DEFAULT NULL,
  `sub_5` varchar(50) DEFAULT NULL,
  `sub_5_fm` int(8) DEFAULT NULL,
  `sub_6` varchar(50) DEFAULT NULL,
  `sub_6_fm` int(8) DEFAULT NULL,
  `sub_7` varchar(50) DEFAULT NULL,
  `sub_7_fm` int(8) DEFAULT NULL,
  `sub_8` varchar(50) DEFAULT NULL,
  `sub_8_fm` int(8) DEFAULT NULL,
  `sub_9` varchar(50) DEFAULT NULL,
  `sub_9_fm` int(8) DEFAULT NULL,
  `sub_10` varchar(50) DEFAULT NULL,
  `sub_10_fm` int(8) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `full_marks`
--

INSERT INTO `full_marks` (`full_mark_id`, `year`, `Terminal`, `ClassName`, `sub_1`, `sub_1_fm`, `sub_2`, `sub_2_fm`, `sub_3`, `sub_3_fm`, `sub_4`, `sub_4_fm`, `sub_5`, `sub_5_fm`, `sub_6`, `sub_6_fm`, `sub_7`, `sub_7_fm`, `sub_8`, `sub_8_fm`, `sub_9`, `sub_9_fm`, `sub_10`, `sub_10_fm`) VALUES
(15, '2078', 'second', 'EIGHT', 'lolu', 7, 'fily', 76, 'polu', 6, 'uiui', 87, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(16, '2078', 'second', 'NINE', 'English', 70, 'Nepali', 54, 'Math', 60, 'Science', 43, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `Students`
--

CREATE TABLE `Students` (
  `Student_id` int(20) NOT NULL,
  `Student_Name` varchar(50) NOT NULL,
  `Student_Class` int(4) NOT NULL,
  `Student_Roll` int(4) NOT NULL,
  `Student_Mobile` bigint(50) DEFAULT NULL,
  `Student_Parents` varchar(50) DEFAULT NULL,
  `Student_Occupation` varchar(50) DEFAULT NULL,
  `Student_Dob` date DEFAULT NULL,
  `Student_Place` varchar(50) DEFAULT NULL,
  `Register_Date` timestamp NOT NULL DEFAULT current_timestamp(),
  `Student_profile` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Students`
--

INSERT INTO `Students` (`Student_id`, `Student_Name`, `Student_Class`, `Student_Roll`, `Student_Mobile`, `Student_Parents`, `Student_Occupation`, `Student_Dob`, `Student_Place`, `Register_Date`, `Student_profile`) VALUES
(1, 'Manoj das', 9, 12, NULL, NULL, NULL, '2055-06-03', NULL, '2022-01-03 18:15:00', NULL),
(2, 'Md das', 93, 12, 98080591563236786, 'fg', NULL, '2077-06-03', NULL, '2022-01-01 14:41:43', NULL),
(3, 'Lolu', 18, 23, 9823, NULL, NULL, NULL, NULL, '2022-01-08 09:31:18', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `Student_Result`
--

CREATE TABLE `Student_Result` (
  `student_result_id` int(8) NOT NULL,
  `year` varchar(20) DEFAULT NULL,
  `Terminal` varchar(30) DEFAULT NULL,
  `Student_class` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Roll` int(5) NOT NULL,
  `sub_1` varchar(50) DEFAULT NULL,
  `sub_1_fm` int(8) DEFAULT NULL,
  `sub_2` varchar(50) DEFAULT NULL,
  `sub_2_fm` int(8) DEFAULT NULL,
  `sub_3` varchar(50) DEFAULT NULL,
  `sub_3_fm` int(8) DEFAULT NULL,
  `sub_4` varchar(50) DEFAULT NULL,
  `sub_4_fm` int(8) DEFAULT NULL,
  `sub_5` varchar(50) DEFAULT NULL,
  `sub_5_fm` int(8) DEFAULT NULL,
  `sub_6` varchar(50) DEFAULT NULL,
  `sub_6_fm` int(8) DEFAULT NULL,
  `sub_7` varchar(50) DEFAULT NULL,
  `sub_7_fm` int(8) DEFAULT NULL,
  `sub_8` varchar(50) DEFAULT NULL,
  `sub_8_fm` int(8) DEFAULT NULL,
  `sub_9` varchar(50) DEFAULT NULL,
  `sub_9_fm` int(8) DEFAULT NULL,
  `sub_10` varchar(50) DEFAULT NULL,
  `sub_10_fm` int(8) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Student_Result`
--

INSERT INTO `Student_Result` (`student_result_id`, `year`, `Terminal`, `Student_class`, `Name`, `Roll`, `sub_1`, `sub_1_fm`, `sub_2`, `sub_2_fm`, `sub_3`, `sub_3_fm`, `sub_4`, `sub_4_fm`, `sub_5`, `sub_5_fm`, `sub_6`, `sub_6_fm`, `sub_7`, `sub_7_fm`, `sub_8`, `sub_8_fm`, `sub_9`, `sub_9_fm`, `sub_10`, `sub_10_fm`) VALUES
(1, NULL, NULL, '9', 'lok', 7, 'kjk', 8, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(2, NULL, NULL, 'EIGHT', 'iuiulkj', 76, 'lolu', 87, 'fily', 0, 'polu', 0, 'uiui', 0, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(3, NULL, NULL, 'NINE', 'MOKu', 65, 'English', 65, 'Nepali', 34, 'Math', 43, 'Science', 76, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(4, NULL, NULL, 'NINE', 'Lokhg', 76, 'English', 65, 'Nepali', 32, 'Math', 34, 'Science', 89, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(5, '2078', 'second', 'NINE', 'Moku', 54, 'English', 54, 'Nepali', 76, 'Math', 23, 'Science', 43, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(6, '2078', 'second', 'NINE', 'Moku', 23, 'English', 54, 'Nepali', 76, 'Math', 23, 'Science', 43, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0),
(7, '2078', 'second', 'EIGHT', 'ljklkjoi', 43, 'lolu', 3, 'fily', 78, 'polu', 65, 'uiui', 55, '', 0, '', 0, '', 0, '', 0, '', 0, '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `Subjects`
--

CREATE TABLE `Subjects` (
  `subject_id` int(30) NOT NULL,
  `subject_name` varchar(100) NOT NULL,
  `subject_FM` int(5) DEFAULT NULL,
  `subject_PM` int(5) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class_subject`
--
ALTER TABLE `class_subject`
  ADD PRIMARY KEY (`ClassName`);

--
-- Indexes for table `Exam`
--
ALTER TABLE `Exam`
  ADD PRIMARY KEY (`exam_id`);

--
-- Indexes for table `full_marks`
--
ALTER TABLE `full_marks`
  ADD PRIMARY KEY (`full_mark_id`),
  ADD UNIQUE KEY `year` (`year`,`Terminal`,`ClassName`) USING BTREE;

--
-- Indexes for table `Students`
--
ALTER TABLE `Students`
  ADD PRIMARY KEY (`Student_id`);

--
-- Indexes for table `Student_Result`
--
ALTER TABLE `Student_Result`
  ADD PRIMARY KEY (`student_result_id`),
  ADD UNIQUE KEY `year` (`year`,`Terminal`,`Student_class`,`Roll`);

--
-- Indexes for table `Subjects`
--
ALTER TABLE `Subjects`
  ADD PRIMARY KEY (`subject_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Exam`
--
ALTER TABLE `Exam`
  MODIFY `exam_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `full_marks`
--
ALTER TABLE `full_marks`
  MODIFY `full_mark_id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `Students`
--
ALTER TABLE `Students`
  MODIFY `Student_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `Student_Result`
--
ALTER TABLE `Student_Result`
  MODIFY `student_result_id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `Subjects`
--
ALTER TABLE `Subjects`
  MODIFY `subject_id` int(30) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
