-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2019 m. Spa 25 d. 12:53
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `leidiniai`
--

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `kalbos`
--

CREATE TABLE `kalbos` (
  `id` int(10) UNSIGNED NOT NULL,
  `kodas` varchar(32) COLLATE utf8_lithuanian_ci NOT NULL,
  `sutrumpinimas` varchar(32) COLLATE utf8_lithuanian_ci NOT NULL,
  `pavadinimas` varchar(256) COLLATE utf8_lithuanian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Sukurta duomenų kopija lentelei `kalbos`
--

INSERT INTO `kalbos` (`id`, `kodas`, `sutrumpinimas`, `pavadinimas`) VALUES
(1, 'lt', 'liet.', 'lietuvių kalba'),
(2, 'en', 'angl.', 'anglų kalba'),
(3, 'de', 'vok.', 'vokiečių kalba'),
(4, 'fr', 'pran.', 'prancūzų kalba'),
(5, 'ru', 'rus.', 'rusų kalba'),
(6, 'it', 'ital.', 'italų kalba'),
(7, 'prg', 'prūs.', 'prūsų kalba'),
(8, 'pl', 'lenk.', 'lenkų kalba'),
(9, 'es', 'isp.', 'ispanų kalba');

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `leidiniai`
--

CREATE TABLE `leidiniai` (
  `id` int(10) UNSIGNED NOT NULL,
  `pav` varchar(256) COLLATE utf8_lithuanian_ci NOT NULL,
  `data` date NOT NULL,
  `vieta` varchar(32) COLLATE utf8_lithuanian_ci NOT NULL,
  `leidykla` varchar(256) COLLATE utf8_lithuanian_ci NOT NULL,
  `kalba` varchar(32) COLLATE utf8_lithuanian_ci NOT NULL,
  `kodai` varchar(512) COLLATE utf8_lithuanian_ci NOT NULL,
  `apie` text COLLATE utf8_lithuanian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Sukurta duomenų kopija lentelei `leidiniai`
--

INSERT INTO `leidiniai` (`id`, `pav`, `data`, `vieta`, `leidykla`, `kalba`, `kodai`, `apie`) VALUES
(1, 'As', '2019-10-24', 'jmk', 'hjnf', 'lt', 'ionkj', 'dfd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kalbos`
--
ALTER TABLE `kalbos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kodas` (`kodas`);

--
-- Indexes for table `leidiniai`
--
ALTER TABLE `leidiniai`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kalba` (`kalba`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kalbos`
--
ALTER TABLE `kalbos`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `leidiniai`
--
ALTER TABLE `leidiniai`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Apribojimai eksportuotom lentelėm
--

--
-- Apribojimai lentelei `leidiniai`
--
ALTER TABLE `leidiniai`
  ADD CONSTRAINT `leidiniai_ibfk_1` FOREIGN KEY (`kalba`) REFERENCES `kalbos` (`kodas`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
