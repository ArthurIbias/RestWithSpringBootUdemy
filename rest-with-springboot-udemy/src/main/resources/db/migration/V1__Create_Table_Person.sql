CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `first_name` varchar(80) COLLATE latin1_spanish_ci NOT NULL,
  `gender` varchar(6) COLLATE latin1_spanish_ci NOT NULL,
  `last_name` varchar(80) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`id`)
)