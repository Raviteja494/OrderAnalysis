
!echo  CREATING THE TABLE;


create table if not exists data1(userid int,producid int,action string)
row format delimited
fields terminated by ","
lines terminated by "\n"
stored as TEXTFILE;


!echo  LOADING DATA STARTS HERE;


load data local inpath "file:///home/teja/Desktop/Data.csv" overwrite into table data1;


!echo  SHOW THE DATA INSIDE THE TABLE

select * from data1;


!echo  DESCRIBE THE TABLE SCHEMA;

describe data1;


!echo  FETCH THE REQUIRED DATA
!echo (ONLY ADDTOCART BUT NOT PURCHASED);


select userid,producid from data1 d1 where d1.action = 'AddToCart' AND NOT EXISTS (select 1 from data1 d2 where d2.action = 'Purchase' AND d2.userid = d1.userid);


