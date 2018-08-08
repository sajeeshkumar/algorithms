package net.sajeesh.search

object BinarySearch {

  def main(args:Array[String]): Unit={

     var a = Array(2,3,4,10,40)
     var n = a.length
     var x = 2

     var result = binarySearch(a, 0, n, x)

     if(result == -1)
       println("Element not found")
     else
       println("Element found at index: " + result)

  }

  def binarySearch(array: Array[Int], l: Int, r: Int, x :Int): Int = {
     if(r >= l){

         var mid = (l + r - 1)/2

         if (array(mid) == x)
           return mid

         if (array(mid) > x)
           return binarySearch(array, l, mid -1, x)

         return binarySearch(array, mid+1 , r , x)
     }

     return -1
  }

}
