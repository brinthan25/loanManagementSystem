-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2023 at 10:46 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `loan`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `Times` time(6) NOT NULL,
  `Cus_Name` varchar(255) NOT NULL,
  `Item_Type` varchar(255) NOT NULL,
  `Item_Price` float NOT NULL,
  `Down_Payment` float NOT NULL,
  `Loan_Balance` float NOT NULL,
  `Payment` float NOT NULL,
  `Due_Amount` float NOT NULL,
  `Datee` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`Times`, `Cus_Name`, `Item_Type`, `Item_Price`, `Down_Payment`, `Loan_Balance`, `Payment`, `Due_Amount`, `Datee`) VALUES
('02:35:48.000000', 'Piyashkaraa', 'laptopp', 300000, 50000, 250000, 50000, 200000, '2023-04-04'),
('02:44:00.000000', 'Karthik', 'pc', 60000, 10000, 540000, 10800, 529200, '2023-04-04'),
('02:47:32.000000', 'vikaram', 'Tab', 120000, 30000, 98100, 24512, 73588, '2023-04-04'),
('02:47:50.000000', 'vikaram', 'Tab', 140000, 30000, 98100, 24512, 73588, '2023-04-04'),
('02:48:25.000000', 'lokesh', 'pc', 145000, 30000, 98100, 24512, 73588, '2023-04-04'),
('02:49:48.000000', 'farzil', 'phone', 250000, 50000, 224000, 112000, 112000, '2023-04-04'),
('02:50:07.000000', 'kumar', 'iphone', 250000, 50000, 224000, 112000, 112000, '2023-04-04'),
('02:51:08.000000', 'nithiya', 'a/c', 150000, 50000, 112000, 56000, 56000, '2023-04-04'),
('02:51:38.000000', 'surya', 'tv', 150000, 50000, 112000, 56000, 56000, '2023-04-04'),
('01:30:26.000000', 'Piyashkara', 'Laptop', 300000, 100000, 224000, 74666, 149334, '2023-04-06');

-- --------------------------------------------------------

--
-- Table structure for table `the_app_users`
--

CREATE TABLE `the_app_users` (
  `u_id` int(11) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_uname` varchar(50) NOT NULL,
  `u_pass` varchar(20) NOT NULL,
  `u_bdate` date NOT NULL,
  `u_address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `the_app_users`
--

INSERT INTO `the_app_users` (`u_id`, `u_fname`, `u_lname`, `u_uname`, `u_pass`, `u_bdate`, `u_address`) VALUES
(1, 'brin', 'brin', 'brin98', '1234', '2023-04-06', 'ddd'),
(2, 'piyash', 'piyash', 'brinthan98', '1234', '2023-04-13', 'ddd'),
(3, 'piyash', 'piyash', 'brinthan98', '1234', '2023-04-13', 'ddd'),
(4, 'Nesan', 'Nesan', 'Sulaks98', '1234', '2023-04-13', 'jaffna'),
(5, 'Sivaparan', 'Sivaparan', 'piyas98', 'piyas98', '2023-04-25', 'Jaffna,Urumpirai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `the_app_users`
--
ALTER TABLE `the_app_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `the_app_users`
--
ALTER TABLE `the_app_users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
