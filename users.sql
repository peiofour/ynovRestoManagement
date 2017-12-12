-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 12 déc. 2017 à 11:30
-- Version du serveur :  5.7.19
-- Version de PHP :  5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `users`
--

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Product_name` varchar(100) DEFAULT NULL,
  `Quantité` varchar(100) DEFAULT NULL,
  `Prix` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id`, `Product_name`, `Quantité`, `Prix`) VALUES
(1, 'Tomates', '2000', 3),
(2, 'Ananas', '2000', 12);

-- --------------------------------------------------------

--
-- Structure de la table `restaurants`
--

DROP TABLE IF EXISTS `restaurants`;
CREATE TABLE IF NOT EXISTS `restaurants` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nom_resto` varchar(20) NOT NULL,
  `addresse_resto` varchar(50) NOT NULL,
  `manager_resto` varchar(20) NOT NULL,
  `num_resto` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `restaurants`
--

INSERT INTO `restaurants` (`id`, `nom_resto`, `addresse_resto`, `manager_resto`, `num_resto`) VALUES
(1, 'BurgerKing', '1 rue des fleurs 31200 Toulouse', 'Marie', '0102030405'),
(2, 'Mcdo', '2 rue des fleurs 31200 Toulouse', 'Julie', '0202030405'),
(3, 'Qwik', '3 rue des fleurs 31200 Toulouse', 'Carine', '0302030405'),
(4, 'Kebab', '4 rue des fleurs 31200 Toulouse', 'Sophie', '0902030405'),
(5, 'Tacos', '5 rue des fleurs 31200 Toulouse', 'Lelou', '0704030405');

-- --------------------------------------------------------

--
-- Structure de la table `users_t`
--

DROP TABLE IF EXISTS `users_t`;
CREATE TABLE IF NOT EXISTS `users_t` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `email` varchar(30) NOT NULL,
  `mot_de_passe` varchar(30) NOT NULL,
  `Role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `users_t`
--

INSERT INTO `users_t` (`id`, `nom`, `prenom`, `email`, `mot_de_passe`, `Role`) VALUES
(1, 'Durand', 'Marie', 'test_marie@gmail.com', 'test_marie', 'Admin'),
(2, 'Alesi', 'Julie', 'test_julie@gmail.com', 'test_julie', 'Utilisateu'),
(3, 'Martini', 'Carine', 'test_carine@gmail.com', 'test_carine', 'Admin'),
(4, 'Varola', 'Sophie', 'test_sophie@gmail.com', 'test_sophie', 'Gerant'),
(5, 'Labiche', 'Lelou', 'test_lelou@gmail.com', 'test_lelou', 'Utilisteur');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
