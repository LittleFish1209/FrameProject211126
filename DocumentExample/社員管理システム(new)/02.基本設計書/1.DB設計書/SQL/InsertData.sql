USE COMPANYDATA;


INSERT INTO loginuser (accountId,password,accountRole) VALUES('111@softusing.com','000001',1);
INSERT INTO loginuser (accountId,password,accountRole) VALUES('222@softusing.com','000002',1);
INSERT INTO loginuser (accountId,password,accountRole) VALUES('333@softusing.com','000003',1);

INSERT INTO country (countryCd,countryName) VALUES('001','���{');
INSERT INTO country (countryCd,countryName) VALUES('002','����');
INSERT INTO country (countryCd,countryName) VALUES('003','�A�����J');

INSERT INTO department (departmentCd,departmentName) VALUES('01','�o�c�Ǘ���');
INSERT INTO department (departmentCd,departmentName) VALUES('02','�c�Ɗ�敔');
INSERT INTO department (departmentCd,departmentName) VALUES('03','�\�����[�V�������ƕ�');
INSERT INTO department (departmentCd,departmentName) VALUES('04','�Z�p�Ǘ���');

INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('01','������','01');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('02','�l����','01');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('03','�o����','01');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('04','����','02');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('05','����','02');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('06','��O��','02');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('07','����','03');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('08','����','03');
INSERT INTO section (sectionCd,sectionName,departmentCd) VALUES('09','��O��','03');

INSERT INTO role( roleCd, roleName ) VALUES('01','��\�����');
INSERT INTO role( roleCd, roleName ) VALUES('02','����');
INSERT INTO role( roleCd, roleName ) VALUES('03','�ے�');

