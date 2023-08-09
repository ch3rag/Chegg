​
 SQL Script:

CREATE DATABASE COMPANY;

USE COMPANY;

CREATE TABLE DEPARTMENT (
  dno        INT          NOT NULL,
  dname      VARCHAR(20)  NOT NULL,
  dlocation  VARCHAR(20)  NOT NULL,
  
  PRIMARY KEY (dno)
);

CREATE TABLE EMPLOYEE (
  eno           INT          NOT NULL,
  ename         VARCHAR(20)  NOT NULL,
  ejob          VARCHAR(25)  NOT NULL,
  emgr          INT          NULL,
  ehiredate     DATE         NOT NULL,
  esalary       INT          NOT NULL,
  ecommission   INT          NULL,
  edno          INT          NOT NULL,
  
  PRIMARY KEY (eno),
  FOREIGN KEY (edno) REFERENCES DEPARTMENT(dno),
  FOREIGN KEY (emgr) REFERENCES EMPLOYEE(eno)
);



INSERT INTO DEPARTMENT VALUES (10, 'Accounting', 'New York'); 
INSERT INTO DEPARTMENT VALUES (20, 'Research', 'Dallas');
INSERT INTO DEPARTMENT VALUES (30, 'Sales', 'Chicago'); 
INSERT INTO DEPARTMENT VALUES (40, 'Operations', 'Boston');

INSERT INTO EMPLOYEE VALUES(7839, 'King', 'President', NULL, '2003-11-17', 6500, 0, 10);
INSERT INTO EMPLOYEE VALUES (7566, 'Jones', 'Manager', 7839, '2003-04-02', 3375, 0, 20);
INSERT INTO EMPLOYEE VALUES (7698, 'Blake', 'Manager', 7839, '2003-05-01', 3250, 0, 30);
INSERT INTO EMPLOYEE VALUES (7782, 'Clark', 'Manager', 7839, '2003-06-09', 2850, 0, 10);
INSERT INTO EMPLOYEE VALUES (7499, 'Allen', 'Salesman', 7698, '2003-02-20', 2000, 500, 30);
INSERT INTO EMPLOYEE VALUES (7521, 'Ward', 'Salesman', 7698, '2003-02-22', 1650, 800, 30);
INSERT INTO EMPLOYEE VALUES (7654, 'Martin', 'Salesman', 7698, '2003-09-28', 1650, 1400, 30);
INSERT INTO EMPLOYEE VALUES (7844, 'Turner', 'Salesman', 7698, '2003-09-08', 1900, 0, 30);
INSERT INTO EMPLOYEE VALUES (7900, 'James', 'Clerk', 7698, '2003-12-03', 1350, 0, 30);
INSERT INTO EMPLOYEE VALUES (7788, 'Scott', 'Analyst', 7566, '2002-06-27', 3500, 0, 20);
INSERT INTO EMPLOYEE VALUES (7902, 'Ford', 'Analyst', 7566, '2003-12-03', 3500, 0, 20);
INSERT INTO EMPLOYEE VALUES (7369, 'Smith', 'Clerk', 7902, '2002-12-17', 1200, 0, 20);
INSERT INTO EMPLOYEE VALUES (7876, 'Adams', 'Clerk', 7788, '2002-07-31', 1600, 0, 20);
INSERT INTO EMPLOYEE VALUES (7934, 'Miller', 'Clerk', 7782, '2003-01-23', 1700, 0, 10);

OUTPUT:

mysql> source ~/Query.sql
Query OK, 1 row affected (0.00 sec)

Database changed
Query OK, 0 rows affected (0.11 sec)

Query OK, 0 rows affected (0.09 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.00 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.00 sec)

Query OK, 1 row affected (0.02 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.01 sec)

Query OK, 1 row affected (0.00 sec)


mysql> use COMPANY;
Database changed

mysql> SELECT * FROM DEPARTMENT;
+-----+------------+-----------+
| dno | dname      | dlocation |
+-----+------------+-----------+
|  10 | Accounting | New York  |
|  20 | Research   | Dallas    |
|  30 | Sales      | Chicago   |
|  40 | Operations | Boston    |
+-----+------------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM EMPLOYEE;
+------+--------+-----------+------+------------+---------+-------------+------+
| eno  | ename  | ejob      | emgr | ehiredate  | esalary | ecommission | edno |
+------+--------+-----------+------+------------+---------+-------------+------+
| 7369 | Smith  | Clerk     | 7902 | 2002-12-17 |    1200 |           0 |   20 |
| 7499 | Allen  | Salesman  | 7698 | 2003-02-20 |    2000 |         500 |   30 |
| 7521 | Ward   | Salesman  | 7698 | 2003-02-22 |    1650 |         800 |   30 |
| 7566 | Jones  | Manager   | 7839 | 2003-04-02 |    3375 |           0 |   20 |
| 7654 | Martin | Salesman  | 7698 | 2003-09-28 |    1650 |        1400 |   30 |
| 7698 | Blake  | Manager   | 7839 | 2003-05-01 |    3250 |           0 |   30 |
| 7782 | Clark  | Manager   | 7839 | 2003-06-09 |    2850 |           0 |   10 |
| 7788 | Scott  | Analyst   | 7566 | 2002-06-27 |    3500 |           0 |   20 |
| 7839 | King   | President | NULL | 2003-11-17 |    6500 |           0 |   10 |
| 7844 | Turner | Salesman  | 7698 | 2003-09-08 |    1900 |           0 |   30 |
| 7876 | Adams  | Clerk     | 7788 | 2002-07-31 |    1600 |           0 |   20 |
| 7900 | James  | Clerk     | 7698 | 2003-12-03 |    1350 |           0 |   30 |
| 7902 | Ford   | Analyst   | 7566 | 2003-12-03 |    3500 |           0 |   20 |
| 7934 | Miller | Clerk     | 7782 | 2003-01-23 |    1700 |           0 |   10 |
+------+--------+-----------+------+------------+---------+-------------+------+
14 rows in set (0.00 sec)

 

​