CREATE TABLE `kyobo_user` (
  `MANAGE_NO` varchar(20) NOT NULL COMMENT '사용자 관리번호',
  `LOGIN_ID` varchar(20) NOT NULL COMMENT '로그인 아이디',
  `LOGIN_PW` varchar(20) NOT NULL COMMENT '로그인 패스워드',
  `NAME` varchar(50) DEFAULT NULL COMMENT '사용자 이름',
  `ADDRESS` varchar(100) DEFAULT NULL COMMENT '사용자 주소',
  `PHONE` varchar(100) DEFAULT NULL COMMENT '사용자 핸드폰 번호',
  PRIMARY KEY (`MANAGE_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

