-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2026 at 05:27 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `academic`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `kode_dosen` varchar(20) NOT NULL,
  `nama_dosen` varchar(100) NOT NULL,
  `jabatan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`kode_dosen`, `nama_dosen`, `jabatan`) VALUES
('D001', 'Namjoon', 'Kepala Prodi'),
('D002', 'Seokjin', 'Dosen Wali'),
('D003', 'Yoongi', 'Dosen'),
('D004', 'Hoseok', 'Dosen'),
('D005', 'Jimin', 'Dosen');

-- --------------------------------------------------------

--
-- Table structure for table `krs`
--

CREATE TABLE `krs` (
  `id_krs` int(11) NOT NULL,
  `nim` varchar(20) NOT NULL,
  `kode_mk` varchar(10) NOT NULL,
  `mata_kuliah` varchar(100) NOT NULL,
  `sks` int(2) NOT NULL,
  `dosen` varchar(265) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `krs`
--

INSERT INTO `krs` (`id_krs`, `nim`, `kode_mk`, `mata_kuliah`, `sks`, `dosen`) VALUES
(5, '24552011002', 'MK001', 'Digital Preneurship', 3, 'Jimin'),
(6, '24552011003', 'MK005', 'Jaringan Komputer', 3, 'Seokjin'),
(7, '24552011004', 'MK002', 'Teknik Kompilasi', 3, 'Hoseok'),
(8, '24552011005', 'MK003', 'Pemrograman Berorientasi Objek', 3, 'Yoongi'),
(14, '24552011001', 'MK004', 'Pemrograman Mobile', 3, 'Namjoon');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(20) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `email`) VALUES
('24552011001', 'Tomioka Giyuu', 'giyuganteng@gmail.com'),
('24552011002', 'Simba', 'simbalucu@gmail.com'),
('24552011003', 'Molly', 'mollycantik@gmail.com'),
('24552011004', 'Tabby', 'tabbybaik@gmail.com'),
('24552011005', 'Satoru Gojo', 'gojomantap@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `mata_kuliah`
--

CREATE TABLE `mata_kuliah` (
  `kode_mk` varchar(10) NOT NULL,
  `nama_mk` varchar(100) NOT NULL,
  `sks` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mata_kuliah`
--

INSERT INTO `mata_kuliah` (`kode_mk`, `nama_mk`, `sks`) VALUES
('MK001', 'Digital Preneurship', 3),
('MK002', 'Teknik Kompilasi', 3),
('MK003', 'Pemrograman Berorientasi Objek', 3),
('MK004', 'Pemrograman Mobile', 3),
('MK005', 'Jaringan Komputer', 3);

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `id_nilai` int(11) NOT NULL,
  `nim` varchar(20) NOT NULL,
  `nama_mk` varchar(100) DEFAULT NULL,
  `uts` double DEFAULT NULL,
  `tugas` double DEFAULT NULL,
  `uas` double DEFAULT NULL,
  `absen` double DEFAULT NULL,
  `nilai_akhir` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id_nilai`, `nim`, `nama_mk`, `uts`, `tugas`, `uas`, `absen`, `nilai_akhir`) VALUES
(11, '24552011001', 'Pemrograman Mobile', 95, 85, 95, 100, 'A'),
(12, '24552011002', 'Digital Preneurship', 85, 78, 65, 75, 'C'),
(13, '24552011003', 'Jaringan Komputer', 78, 85, 90, 100, 'A'),
(14, '24552011004', 'Teknik Kompilasi', 78, 78, 90, 80, 'B'),
(17, '24552011005', 'Pemrograman Berorientasi Objek', 50, 56, 65, 50, 'D');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` varchar(10) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `level` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `username`, `password`, `level`) VALUES
('USR001', 'oasis', 'oasis123', 'Admin'),
('USR002', 'perunggu', 'perunggukeren', 'Operator'),
('USR003', 'seize', 'theday123', 'Admin'),
('USR004', 'beatles', 'heyjude123', 'Operator'),
('USR005', 'mocca', 'oneday123', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`kode_dosen`);

--
-- Indexes for table `krs`
--
ALTER TABLE `krs`
  ADD PRIMARY KEY (`id_krs`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `mata_kuliah`
--
ALTER TABLE `mata_kuliah`
  ADD PRIMARY KEY (`kode_mk`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`id_nilai`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `krs`
--
ALTER TABLE `krs`
  MODIFY `id_krs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `nilai`
--
ALTER TABLE `nilai`
  MODIFY `id_nilai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
