-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2020 at 03:39 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewa_ps`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `kd_member` varchar(10) NOT NULL,
  `nama_member` varchar(30) NOT NULL,
  `jenis_member` varchar(30) NOT NULL,
  `potongan` int(30) NOT NULL,
  `biaya` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`kd_member`, `nama_member`, `jenis_member`, `potongan`, `biaya`) VALUES
('M001', 'COPED', 'GOLD', 60000, 120000),
('M002', 'SUTONO', 'PLATINUM', 40000, 100000),
('M003', 'SUTINI', 'SILVER', 30000, 80000);

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `kdrental` varchar(10) NOT NULL,
  `nm_pelanggan` varchar(30) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `biaya` int(30) NOT NULL,
  `lama` int(30) NOT NULL,
  `total` int(30) NOT NULL,
  `jaminan` varchar(30) NOT NULL,
  `nohp` varchar(15) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`kdrental`, `nm_pelanggan`, `jenis`, `biaya`, `lama`, `total`, `jaminan`, `nohp`, `alamat`) VALUES
('R001', 'BOSPED', 'Playstation 2', 100000, 5, 500000, 'KTP', '0878278177', 'JOHO'),
('R002', 'SUTONO', 'Playstation 4', 300000, 5, 1500000, 'KTP', '085888999225', 'NGUTEROK'),
('R003', 'SUTINI', 'Playstation 2', 100000, 3, 300000, 'KARTU PELAJAR', '082672727272', 'SKH');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_transaksi` varchar(10) NOT NULL,
  `kd_rental` varchar(10) NOT NULL,
  `nm_pelanggan` varchar(30) NOT NULL,
  `total_rental` int(30) NOT NULL,
  `id_member` varchar(10) NOT NULL,
  `potongan` int(30) NOT NULL,
  `total` int(30) NOT NULL,
  `bayar` int(30) NOT NULL,
  `kembali` int(30) NOT NULL,
  `keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kd_transaksi`, `kd_rental`, `nm_pelanggan`, `total_rental`, `id_member`, `potongan`, `total`, `bayar`, `kembali`, `keterangan`) VALUES
('TR001', 'R002', 'SUTONO', 1500000, 'M001', 60000, 1440000, 1500000, 60000, 'SELESAI'),
('TR002', 'R002', 'SUTONO', 1500000, 'M002', 40000, 1460000, 1500000, 40000, 'SELESAI'),
('TR003', 'R003', 'SUTINI', 300000, 'M003', 30000, 270000, 300000, 30000, 'BELUM KEMBALI');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`kd_member`);

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`kdrental`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kd_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
