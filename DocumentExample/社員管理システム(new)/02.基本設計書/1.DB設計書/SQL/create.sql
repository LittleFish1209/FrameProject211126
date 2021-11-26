CREATE DATABASE companydata;
USE companydata;

CREATE TABLE loginUser(
        accountId VARCHAR(255) NOT NULL COMMENT 'アカウント',
        password CHAR(6) NOT NULL COMMENT 'パスワード',
        accountRole int(1) NOT NULL COMMENT 'アカウント権限',
        PRIMARY KEY (accountId) 
    );

CREATE TABLE country(
        countryCd CHAR(3) NOT NULL COMMENT '国籍コード',
        countryName CHAR(255) NOT NULL COMMENT '国籍',
        PRIMARY KEY (countryCd)
        
    );

CREATE TABLE department (
	departmentCd CHAR(2) NOT NULL COMMENT '所属部門コード(部)',
	departmentName VARCHAR(255) NOT NULL COMMENT '部門',
	PRIMARY KEY(departmentCd)
);

CREATE TABLE section(
	sectionCd CHAR(2) NOT NULL COMMENT '所属部門コード(課)',
	sectionName VARCHAR(255) NOT NULL COMMENT '課名',
	departmentCd CHAR(2) NOT NULL COMMENT '所属部門コード(部)',
	PRIMARY KEY(sectionCd),
	FOREIGN KEY( departmentCd ) references department( departmentCd )
);

CREATE TABLE role(
	roleCd char(2) not null comment '役割コード',
	roleName varchar(255) not null comment '役割名',
	PRIMARY KEY( roleCd )
);

CREATE TABLE empinfo(
	empCd char(6) not null comment '社員番号',
	email varchar(255) not null comment 'メールアドレス',
	lastNameKanji varchar(255) not null comment '姓(漢字)',
	firstNameKanji varchar(255) not null comment '名(漢字)',
	lastNameKana varchar(255) not null comment '姓(カナ)',
	firstNameKana varchar(255) not null comment '名(カナ)',
	InitialName varchar(255) not null comment 'イニシャル名',
	sexCd char(1) not null comment '性別コード',
	birthday date not null comment '生年月日',
	countryCd char(2) not null comment '国籍コード',
	school varchar(255) comment '卒業学校名',
	major varchar(255) comment '専攻',
	education char(2) not null comment '学歴',
	address varchar(255) comment '住所',
	postCd char(7) comment '郵便番号',
	station varchar(255) not null comment '最寄駅',
	Tel char(11) not null comment '電話番号',
	dateOfJapan date not null comment '来日年月',
	actualYears int(2) not null comment '実年数',
	JoiningDate date not null comment '入社日付',
	retirementDate date comment '退社日付',
	departmentCd char(2) not null comment '所属部門コード(部)',
	sectionCd char(2) comment '所属部門コード(課)',
	roleCd char(2) comment '役割コード',
	remarks varchar(255) comment '備考',
	PRIMARY KEY( empCd ),
	FOREIGN KEY( countryCd ) references country( countryCd ),
	FOREIGN KEY( departmentCd ) references department( departmentCd ),
	FOREIGN KEY( roleCd ) references role( roleCd )
); 