package com.spark.scala

import org.apache.spark.sql.SparkSession;

object ProductSalesWithScala {
  def main(args: Array[String]) {
    if (args.length < 2) {
      System.err.println("Usage: JavaWordCount <Input-File> <Output-File>");
      System.exit(1);
    }

    val spark = SparkSession.builder.appName("Product sales").getOrCreate()

    val data = spark.read.textFile(args(0)).rdd

    val result = data.map { line =>
      {
        val tokens = line.split("\t")
        (tokens(3), tokens(4).toFloat)
      }
    }
      //sum sales value
      .reduceByKey(_ + _)
    result.saveAsTextFile(args(1))

    spark.stop
  }
}