

import org.apache.spark.sql.SparkSession

object data1 {

    def main(args: Array[String]): Unit = {
      val spark: SparkSession = SparkSession.builder()
        .master("local[1]")
        .appName("SparkByExample")
        .getOrCreate()

      //Chaining multiple options
      val df1 = spark.read.format("csv").option("header","true").option("InferSchema","true").load("/home/teja/Desktop/final/src/main/resources/Inputfile.csv")
      df1.show(false)
      df1.printSchema()
      df1.createTempView("Data")
      val df2 = spark.sql("select userid,producid from data d1 where d1.action = 'AddToCart' AND NOT EXISTS (select 1 from data d2 where d2.action = 'Purchase' AND d2.userid = d1.userid)")
      df2.coalesce(1).write.format("csv").option("header","true").mode("overwrite")save("/home/teja/Desktop/final/src/main/resources/Outputfile.csv")


  }

}
