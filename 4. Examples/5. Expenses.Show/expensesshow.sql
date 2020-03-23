-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 21, 2020 at 11:25 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `expensesshow`
--

-- --------------------------------------------------------

--
-- Table structure for table `expensecategories`
--

CREATE TABLE `expensecategories` (
  `id` int(11) NOT NULL,
  `text` varchar(20) NOT NULL,
  `description` varchar(100) NOT NULL,
  `budget` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expensecategories`
--

INSERT INTO `expensecategories` (`id`, `text`, `description`, `budget`) VALUES
(1, 'General Expenses', 'Any other expense', 2000),
(2, 'Misc', 'Miscellaneous Expenses', 1000),
(3, 'Shopping', 'Clothes, groceries', 3000),
(4, 'Travel', 'Train, bus, airlines', 1000),
(7, 'Utilities', 'Water and Electricity', 2500);

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

CREATE TABLE `expenses` (
  `id` int(11) NOT NULL,
  `expense_date` varchar(20) NOT NULL,
  `expense_category` int(11) NOT NULL,
  `expense_type` int(11) NOT NULL,
  `expense_description` varchar(100) NOT NULL,
  `expense_amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`id`, `expense_date`, `expense_category`, `expense_type`, `expense_description`, `expense_amount`) VALUES
(1, '2020-02-17', 1, 1, 'This is a cash payment for petrol', 50),
(2, '2020-02-19', 3, 4, 'Lunch', 40),
(4, '2020-01-09', 4, 3, '', 700),
(5, '2020-01-09', 7, 2, '', 900),
(6, '2020-01-09', 2, 4, '', 677),
(7, '2020-02-11', 2, 3, '', 400),
(9, '2020-02-18', 4, 2, '', 900),
(11, '2020-02-22', 1, 3, '', 300),
(13, '2020-03-31', 1, 3, '', 300);

-- --------------------------------------------------------

--
-- Table structure for table `expensetypes`
--

CREATE TABLE `expensetypes` (
  `id` int(11) NOT NULL,
  `text` varchar(20) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expensetypes`
--

INSERT INTO `expensetypes` (`id`, `text`, `description`) VALUES
(1, 'Cash', ''),
(2, 'Cheque', ''),
(3, 'Debit Card', ''),
(4, 'Credit Card', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `expensecategories`
--
ALTER TABLE `expensecategories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expensetypes`
--
ALTER TABLE `expensetypes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `expensecategories`
--
ALTER TABLE `expensecategories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `expenses`
--
ALTER TABLE `expenses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `expensetypes`
--
ALTER TABLE `expensetypes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
