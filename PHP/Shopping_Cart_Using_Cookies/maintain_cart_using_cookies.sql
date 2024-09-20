-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2024 at 10:18 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
use amazon_cart_php_clone;
--
-- Database: `if0_36143583_amazon_mart`
--

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `s_no` int(11) NOT NULL,
  `product_name` varchar(200) NOT NULL,
  `product_price` varchar(200) DEFAULT NULL,
  `product_img_link` varchar(200) DEFAULT NULL,
  `quantity_in_stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`s_no`, `product_name`, `product_price`, `product_img_link`, `quantity_in_stock`) VALUES
(1, 'Dell Wireless Keyboard And Mouse Combo', '1,349', 'Product_Images/415yl0HeDQL.jpg', 5),
(2, 'RTS Universal Travel Adapter', '587', 'Product_Images/41uGjvXbeBL._AC_SR400,600_.jpg', 5),
(3, 'MI Power Bank 3i 20000mAh', '2,199', 'Product_Images/71lVwl3q-kL._SX679_.jpg', 5),
(4, 'Logitech MX Master 3S - Wireless Mouse', '12,495 ', 'Product_Images/61ni3t1ryQL._SL1500_.jpg', 5),
(5, 'OOP with C++ - 8E E.Balagurusamy', '630', 'Product_Images/61ynRHlKuML._SY425_.jpg', 0),
(6, 'TCL 32 inches FHD Smart Android LED TV', '13,450', 'Product_Images/71rxXZK-XJL._SX679_.jpg', 5),
(7, 'Safari Pentagon Hardside Suitcase Trolley Bag 55cm', '7,775', 'Product_Images/31nwBmQQRFL._AC_SR400,600_.jpg', 10),
(8, 'American Tourister Valex 28 Ltrs Large Laptop Bag', '2,500', 'Product_Images/913C9PlkyfL._SX679_.jpg', 15),
(9, 'American Tourister Fizz 32L Black Backpack', '2,300', 'Product_Images/91FvDEE9sCL._SY741_.jpg', 15),
(10, 'Safari Thorium Neo 8 Wheels 55 Cm Trolley Bag', '7,800', 'Product_Images/71NPAmyGzgL._SX679_.jpg', 5),
(11, 'Apple iPhone 15 (128 GB, Black)', '70,999', 'Product_Images/71657TiFeHL._SX679_.jpg', 0),
(12, 'Apple iPhone 15 Pro (128 GB, Natural Titanium)', '1,27,990', 'Product_Images/81CgtwSII3L._SX679_.jpg', 5),
(13, 'Samsung Galaxy S24 Ultra 5G (512 GB, Titanium Gray)\r\n', '1,29,930', 'Product_Images/81njZjDqc6L._SX679_.jpg', 5),
(14, 'Samsung Galaxy S24 5G (256 GB, Cobalt Violet)', '79,999', 'Product_Images/710Y-NFojSL._SX679_.jpg', 10),
(15, 'Puma Unisex-Adult Robust Knit Running Shoe', '4,999', 'Product_Images/61eqXv9zrmL._SY695_.jpg', 15),
(16, 'Puma Mens Enzo Mesh Running Shoes', '5,499', 'Product_Images/712pG7CsyHL._SY695_.jpg', 10),
(17, 'Apple AirPods Pro (2nd Generation) ​​​​​​​', '26,900', 'Product_Images/2110TEYPKnL._SX300_SY300_QL70_FMwebp_.webp', 5),
(18, 'Samsung Galaxy Buds2 Pro (Bora Purple)', '16,490', 'Product_Images/61KVX-MbIUL._SX679_.jpg', 0),
(19, 'Samsung Galaxy Watch6 LTE (44mm, Graphite)', '36,999', 'Product_Images/716k1yOpslL._SX679_.jpg', 5),
(20, 'Apple Watch Ultra [GPS + Cellular 49 mm]', '89,900', 'Product_Images/91z5KuonXrL._SX679_.jpg', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`s_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `s_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
