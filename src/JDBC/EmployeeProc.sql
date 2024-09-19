CREATE DEFINER=`root`@`localhost` PROCEDURE `EmployeeProc`()
BEGIN

CREATE TABLE IF NOT EXISTS EMPLOYEE (
    id INT PRIMARY KEY,
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    Salary INT
);  
END