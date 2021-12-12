Create Table Registration_Forms (Registration_Id char(5) Primary Key check(Registration_Id Like '[0-9][0-9][0-9][0-9][0-9]'),
First_Name varchar(40)NOT NULL ,Last_Name varchar(40), Candidate_Address varchar(40) ,DOB smalldatetime, Course_Name varchar(40) Not Null,
Contact_No char (10) check (Contact_No Like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'),
initial_amount int default (1000), Total_Fees int default (808000) , Registration_Date datetime NOT NULL default getdate() )

drop table Registration_Forms


select* from Registration_Forms


insert into Registration_Forms (Registration_Id,First_Name,Last_Name,Candidate_Address,DOB,Course_Name,Contact_No)values('12346','abhinav','kumar','24- sector 12 noida','10-Oct-1999','Btech','8989898898')


Create Table Login (User_Name varchar(40) NOT NULL Primary Key, Passwords varchar(40)NOT NULL)
select * from Login
insert into Login values ('abkumar12','tiger34')