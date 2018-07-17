package net.sajeesh.sort

/**
  * Insertion sort
  * Best case: O(N)
  * Average case: O(N*N)
  * Worst case: O(N*N)
  */
object InsertionSort {

  def main(args: Array[String]): Unit ={
     var a = Array(9,3,4,1,3,10,8,5,11,7)
     sort(a)
     a.foreach(println)
  }

  def sort(a:Array[Int]): Unit ={
    var i = 0
    for (i <- 1 until a.length ){
        insert(a, i, a(i))
    }
  }

  def insert(a:Array[Int], position: Int, value: Int): Unit ={
      var i = position - 1
      while(i >= 0 && a(i) > value){
        a(i+1) = a(i)
        i = i - 1
      }
      a(i+1) = value
  }

}
