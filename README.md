# OrderAnalysis
//Order Analysis inorder to fetch the data which is only added to the cart but not added to cart and purchase using hive and spark scala

Used Versions
--------------
Hive 1.2.1
Spark Versopn 2.3.3
Scala 2.10.4

Execution Sequence for HIVE
-----------------------------------

Hive Version 1.2.1
//inorder to execute hive file
Once the u clone the project change the directory to the current project(OrderAnalysis1)

Inside the final project you can find the data1.hql file
Open the data1.hql file and change the input file path.
Follow the given path to get the input file: "OrderAnalysis1/src/main/resources/Inputfile.csv"
Now copy the input file path and paste the location of the file in the data1.hql file.

now execute the hive.hql file using the below command in the Command Line Interface
"hive -f data1.hql"

Execution Sequence for Spark
--------------------------------------

Environment: IntelliJ Idea Community 2019.1
API Scala 2.10.4

Consider the data1.scala file inside the location "OrderAnalysis1/src/main/scala/data1.scala"

If you are using the IntelliJ idea then open the data1.scala file ,right click and then run the file

if you are using the CLI then execute the data1.scala file

To compile use command
----------------------

scalac data1.scala

To run use command 
------------------
scala data1











