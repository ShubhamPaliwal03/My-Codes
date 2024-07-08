-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2024 at 11:09 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quora_clone`
--

-- --------------------------------------------------------

--
-- Table structure for table `follow_records`
--

CREATE TABLE `follow_records` (
  `s_no` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `follower_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE `posts` (
  `pid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `post_title` varchar(100) NOT NULL,
  `post_content` varchar(1000) NOT NULL,
  `date_and_time` datetime NOT NULL,
  `post_image` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`pid`, `uid`, `post_title`, `post_content`, `date_and_time`, `post_image`) VALUES
(30, 1, 'First Post of this Quora website clone.', 'This is going to be the first post on this Quora website clone, this is for testing purposes.', '2024-06-29 14:37:51', 'none');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` int(11) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) NOT NULL,
  `security_question` varchar(100) NOT NULL,
  `security_answer` varchar(100) NOT NULL,
  `user_image` varchar(25) DEFAULT NULL,
  `user_title` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `username`, `password`, `security_question`, `security_answer`, `user_image`, `user_title`) VALUES
(1, 'Shubham Paliwal', 'sp@12345', 'What is the name of the city in which you were born?', 'Udaipur', 'default_user_image.webp', 'none'),
(2, 'Tarun Verma', 'tv@12345', 'What is the name of your pet?', 'duggu', 'default_user_image.webp', 'none'),
(3, 'Vishwajeet Negi', 'vj@12345', 'What is the name of the city in which you were born?', 'Bikaner', 'default_user_image.webp', 'none'),
(4, 'Shubhman', 'sh@12345', 'What do you like the most?', 'Cricket', 'default_user_image.webp', 'none'),
(5, 'Ujjwal Kunwar', 'uj@12345', 'What do you like the most?', 'Earning Money', 'default_user_image.webp', 'none'),
(6, 'Surender Singh Bhati', 'ssb@12345', 'What is the thing that you can\'t live without?', 'Anime', 'default_user_image.webp', 'none');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `follow_records`
--
ALTER TABLE `follow_records`
  ADD PRIMARY KEY (`s_no`);

--
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `follow_records`
--
ALTER TABLE `follow_records`
  MODIFY `s_no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
