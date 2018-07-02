-- 이용자
CREATE TABLE PUSH_USERS (
	TOKEN        VARCHAR(255) NOT NULL COMMENT '토큰', -- 토큰
	APP_NO       INT          NOT NULL COMMENT '앱일련번호', -- 앱일련번호
	PHONE        VARCHAR(11)  NOT NULL COMMENT '전화번호', -- 전화번호
	REG_DATETIME VARCHAR(14)  NULL     COMMENT '등록일시' -- 등록일시
)
COMMENT '이용자';

-- 이용자
ALTER TABLE PUSH_USERS
	ADD CONSTRAINT PK_PUSH_USERS -- 이용자 기본키
		PRIMARY KEY (
			TOKEN -- 토큰
		);

-- 발송상세
CREATE TABLE PUSH_SEND_DETAIL (
	NO           INT          NOT NULL COMMENT '일련번호', -- 일련번호
	TOKEN        VARCHAR(255) NOT NULL COMMENT '토큰', -- 토큰
	MASTER_NO    INT          NOT NULL COMMENT '발송일련번호', -- 발송일련번호
	STATUS       CHAR         NOT NULL COMMENT '상태', -- 상태
	REG_DATETIME VARCHAR(14)  NULL     COMMENT '등록일시' -- 등록일시
)
COMMENT '발송상세';

-- 발송상세
ALTER TABLE PUSH_SEND_DETAIL
	ADD CONSTRAINT PK_PUSH_SEND_DETAIL -- 발송상세 기본키
		PRIMARY KEY (
			NO -- 일련번호
		);

ALTER TABLE PUSH_SEND_DETAIL
	MODIFY COLUMN NO INT NOT NULL AUTO_INCREMENT COMMENT '일련번호';

-- 발송마스터
CREATE TABLE PUSH_SEND_MASTER (
	MASTER_NO            INT          NOT NULL COMMENT '발송일련번호', -- 발송일련번호
	APP_NO               INT          NOT NULL COMMENT '앱일련번호', -- 앱일련번호
	SENDER               VARCHAR(255) NOT NULL COMMENT '발신자', -- 발신자
	TITLE                VARCHAR(255) NOT NULL COMMENT '제목', -- 제목
	BODY                 VARCHAR(255) NOT NULL COMMENT '본문', -- 본문
	SOUND                VARCHAR(255) NULL     COMMENT '알림음', -- 알림음
	BADGE                VARCHAR(255) NULL     COMMENT '배지', -- 배지
	ICON                 VARCHAR(255) NULL     COMMENT '알림아이콘', -- 알림아이콘
	RESERVATION_YN       CHAR         NOT NULL COMMENT '예약여부', -- 예약여부
	RESERVATION_DATETIME VARCHAR(14)  NULL     COMMENT '예약일시', -- 예약일시
	REG_DATETIME         VARCHAR(14)  NULL     COMMENT '등록일시' -- 등록일시
)
COMMENT '발송마스터';

-- 발송마스터
ALTER TABLE PUSH_SEND_MASTER
	ADD CONSTRAINT PK_PUSH_SEND_MASTER -- 발송마스터 기본키
		PRIMARY KEY (
			MASTER_NO -- 발송일련번호
		);

ALTER TABLE PUSH_SEND_MASTER
	MODIFY COLUMN MASTER_NO INT NOT NULL AUTO_INCREMENT COMMENT '발송일련번호';

-- 앱정보
CREATE TABLE PUSH_APP_INFO (
	APP_NO       INT          NOT NULL COMMENT '앱일련번호', -- 앱일련번호
	API_KEY      VARCHAR(255) NOT NULL COMMENT 'API키', -- API키
	NAME         VARCHAR(255) NULL     COMMENT '이름', -- 이름
	REG_DATETIME VARCHAR(14)  NULL     COMMENT '등록일시' -- 등록일시
)
COMMENT '앱정보';

-- 앱정보
ALTER TABLE PUSH_APP_INFO
	ADD CONSTRAINT PK_PUSH_APP_INFO -- 앱정보 기본키
		PRIMARY KEY (
			APP_NO -- 앱일련번호
		);

ALTER TABLE PUSH_APP_INFO
	MODIFY COLUMN APP_NO INT NOT NULL AUTO_INCREMENT COMMENT '앱일련번호';

-- 발송로그
CREATE TABLE PUSH_SEND_LOG (
	NO           INT          NOT NULL COMMENT '일련번호', -- 일련번호
	TOKEN        VARCHAR(255) NULL     COMMENT '토큰', -- 토큰
	MASTER_NO    INT          NULL     COMMENT '발송일련번호', -- 발송일련번호
	STATUS       CHAR         NULL     COMMENT '상태', -- 상태
	REG_DATETIME VARCHAR(14)  NULL     COMMENT '등록일시' -- 등록일시
)
COMMENT '발송로그';

-- 발송로그
ALTER TABLE PUSH_SEND_LOG
	ADD CONSTRAINT PK_PUSH_SEND_LOG -- 발송로그 기본키
		PRIMARY KEY (
			NO -- 일련번호
		);

ALTER TABLE PUSH_SEND_LOG
	MODIFY COLUMN NO INT NOT NULL AUTO_INCREMENT COMMENT '일련번호';

-- 이용자
ALTER TABLE PUSH_USERS
	ADD CONSTRAINT FK_PUSH_APP_INFO_TO_PUSH_USERS -- 앱정보 -> 이용자
		FOREIGN KEY (
			APP_NO -- 앱일련번호
		)
		REFERENCES PUSH_APP_INFO ( -- 앱정보
			APP_NO -- 앱일련번호
		);

-- 발송상세
ALTER TABLE PUSH_SEND_DETAIL
	ADD CONSTRAINT FK_PUSH_USERS_TO_PUSH_SEND_DETAIL -- 이용자 -> 발송상세
		FOREIGN KEY (
			TOKEN -- 토큰
		)
		REFERENCES PUSH_USERS ( -- 이용자
			TOKEN -- 토큰
		);

-- 발송상세
ALTER TABLE PUSH_SEND_DETAIL
	ADD CONSTRAINT FK_PUSH_SEND_MASTER_TO_PUSH_SEND_DETAIL -- 발송마스터 -> 발송상세
		FOREIGN KEY (
			MASTER_NO -- 발송일련번호
		)
		REFERENCES PUSH_SEND_MASTER ( -- 발송마스터
			MASTER_NO -- 발송일련번호
		);

-- 발송마스터
ALTER TABLE PUSH_SEND_MASTER
	ADD CONSTRAINT FK_PUSH_APP_INFO_TO_PUSH_SEND_MASTER -- 앱정보 -> 발송마스터
		FOREIGN KEY (
			APP_NO -- 앱일련번호
		)
		REFERENCES PUSH_APP_INFO ( -- 앱정보
			APP_NO -- 앱일련번호
		);