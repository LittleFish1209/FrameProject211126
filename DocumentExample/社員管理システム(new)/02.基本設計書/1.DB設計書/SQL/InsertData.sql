USE COMPANYDATA;


INSERT INTO loginuser (accountId,password,accountRole) VALUES('111@softusing.com','000001',1);
INSERT INTO loginuser (accountId,password,accountRole) VALUES('222@softusing.com','000002',1);
INSERT INTO loginuser (accountId,password,accountRole) VALUES('333@softusing.com','000003',1);

INSERT INTO country (countryCd,countryName) VALUES('001','日本');
INSERT INTO country (countryCd,countryName) VALUES('002','中国');
INSERT INTO country (countryCd,countryName) VALUES('003','アメリカ');

INSERT INTO department (departmentCd,departmentName) VALUES('01','経営管理部');
INSERT INTO department (departmentCd,departmentName) VALUES('02','営業企画部');
INSERT INTO department (departmentCd,departmentName) VALUES('03','ソリューション事業部');
INSERT INTO department (departmentCd,departmentName) VALUES('04','技術管理部');

INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('01','総務課','01');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('02','人事課','01');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('03','経理課','01');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('04','第一課','02');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('05','第二課','02');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('06','第三課','02');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('07','第一課','03');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('08','第二課','03');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('09','第三課','03');

INSERT INTO role( roleCd, roleName ) VALUES('01','代表取締役');
INSERT INTO role( roleCd, roleName ) VALUES('02','部長');
INSERT INTO role( roleCd, roleName ) VALUES('03','課長');

