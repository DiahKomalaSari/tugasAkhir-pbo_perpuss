/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.6.16 : Database - db_perpus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_perpus` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_perpus`;

/*Table structure for table `tbl_anggota` */

DROP TABLE IF EXISTS `tbl_anggota`;

CREATE TABLE `tbl_anggota` (
  `id_anggota` int(11) NOT NULL AUTO_INCREMENT,
  `npm` int(20) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jurusan` varchar(30) DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `no_tlp` varchar(15) DEFAULT NULL,
  `umur` int(10) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_anggota` */

/*Table structure for table `tbl_kategori` */

DROP TABLE IF EXISTS `tbl_kategori`;

CREATE TABLE `tbl_kategori` (
  `id_kategori` char(5) NOT NULL,
  `nama_kategori` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_kategori` */

insert  into `tbl_kategori`(`id_kategori`,`nama_kategori`) values ('as','aa'),('B01','Umam ganteng'),('df','sf'),('sd','sd');

/*Table structure for table `tbl_login` */

DROP TABLE IF EXISTS `tbl_login`;

CREATE TABLE `tbl_login` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nama_lengkap` varchar(50) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_login` */

/*Table structure for table `tbl_peminjaman` */

DROP TABLE IF EXISTS `tbl_peminjaman`;

CREATE TABLE `tbl_peminjaman` (
  `no_transaksi` int(10) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `kode_buku` varchar(20) DEFAULT NULL,
  `judul_buku` varchar(50) DEFAULT NULL,
  `kategori_buku` varchar(30) DEFAULT NULL,
  `npm` int(15) DEFAULT NULL,
  `nama_pengarang` varchar(50) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  PRIMARY KEY (`no_transaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_peminjaman` */

/*Table structure for table `tbl_pengembalian` */

DROP TABLE IF EXISTS `tbl_pengembalian`;

CREATE TABLE `tbl_pengembalian` (
  `no_transaksi` int(10) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `npm` int(15) DEFAULT NULL,
  `kode_buku` varchar(20) DEFAULT NULL,
  `judul_buku` varchar(30) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `nama_pengarang` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`no_transaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pengembalian` */

/*Table structure for table `tbl_tambahbuku` */

DROP TABLE IF EXISTS `tbl_tambahbuku`;

CREATE TABLE `tbl_tambahbuku` (
  `judul_buku` varchar(50) DEFAULT NULL,
  `pengarang` varchar(30) DEFAULT NULL,
  `thn_terbit` int(10) DEFAULT NULL,
  `tgl_masukbuku` date DEFAULT NULL,
  `kode_buku` varchar(15) DEFAULT NULL,
  `kategori_buku` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_tambahbuku` */

/* Procedure structure for procedure `EditAnggota` */

/*!50003 DROP PROCEDURE IF EXISTS  `EditAnggota` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `EditAnggota`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `EditKategori` */

/*!50003 DROP PROCEDURE IF EXISTS  `EditKategori` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `EditKategori`(nama_kategori VARCHAR(50),id char(5))
BEGIN
UPDATE tbl_kategori SET nama_kategori=nama_kategori WHERE id_kategori=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `EditPeminjaman` */

/*!50003 DROP PROCEDURE IF EXISTS  `EditPeminjaman` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `EditPeminjaman`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `EditPengembalian` */

/*!50003 DROP PROCEDURE IF EXISTS  `EditPengembalian` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `EditPengembalian`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `EditTambahBuku` */

/*!50003 DROP PROCEDURE IF EXISTS  `EditTambahBuku` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `EditTambahBuku`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `HapusAnggota` */

/*!50003 DROP PROCEDURE IF EXISTS  `HapusAnggota` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HapusAnggota`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `HapusKategori` */

/*!50003 DROP PROCEDURE IF EXISTS  `HapusKategori` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HapusKategori`(id char (5))
BEGIN
DELETE FROM tbl_kategori WHERE id_kategori=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `HapusPeminjaman` */

/*!50003 DROP PROCEDURE IF EXISTS  `HapusPeminjaman` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HapusPeminjaman`(no_transaksi int (10))
BEGIN
DELETE FROM tbl_peminjaman WHERE no_transaksi=no_transaksi;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `HapusPengembalian` */

/*!50003 DROP PROCEDURE IF EXISTS  `HapusPengembalian` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HapusPengembalian`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `HapusTambahBuku` */

/*!50003 DROP PROCEDURE IF EXISTS  `HapusTambahBuku` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HapusTambahBuku`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `SimpanAnggota` */

/*!50003 DROP PROCEDURE IF EXISTS  `SimpanAnggota` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `SimpanAnggota`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `SimpanKategori` */

/*!50003 DROP PROCEDURE IF EXISTS  `SimpanKategori` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `SimpanKategori`(id_kategori char(5),nama_kategori varchar(50))
BEGIN
INSERT into tbl_kategori values	(id_kategori,nama_kategori);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `SimpanPeminjaman` */

/*!50003 DROP PROCEDURE IF EXISTS  `SimpanPeminjaman` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `SimpanPeminjaman`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `SimpanPengembalian` */

/*!50003 DROP PROCEDURE IF EXISTS  `SimpanPengembalian` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `SimpanPengembalian`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `SimpanTambahBuku` */

/*!50003 DROP PROCEDURE IF EXISTS  `SimpanTambahBuku` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `SimpanTambahBuku`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `TampilAnggota` */

/*!50003 DROP PROCEDURE IF EXISTS  `TampilAnggota` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `TampilAnggota`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `TampilKategori` */

/*!50003 DROP PROCEDURE IF EXISTS  `TampilKategori` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `TampilKategori`()
BEGIN
SELECT * from tbl_kategori;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `TampilPeminjaman` */

/*!50003 DROP PROCEDURE IF EXISTS  `TampilPeminjaman` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `TampilPeminjaman`()
BEGIN
SELECT * from tbl_peminjaman;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `TampilPengembalian` */

/*!50003 DROP PROCEDURE IF EXISTS  `TampilPengembalian` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `TampilPengembalian`()
BEGIN
    END */$$
DELIMITER ;

/* Procedure structure for procedure `TampilTambahBuku` */

/*!50003 DROP PROCEDURE IF EXISTS  `TampilTambahBuku` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `TampilTambahBuku`()
BEGIN
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
