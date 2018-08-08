package net.sajeesh.sort

object MergeSort {

  def main(args: Array[String]) : Unit = {
    val arr = Array(12, 11, 13, 5, 6, 7)

    arr.foreach(println)

    sort(arr, 0 , arr.length - 1)

    println("After sorting")

    arr.foreach(println)
  }

  def sort(array:Array[Int], l: Int, r: Int): Unit = {
     if(l < r){
        var m = (l+r)/2

       sort(array, l , m)
       sort(array, m+1 , r)

       merge(array, l, r, m)
     }
  }

  def merge(array:Array[Int], l:Int, r:Int, m:Int):Unit = {
      var n1 = m - l + 1
      var n2 = r - m

      var L = new Array[Int](n1)
      var R = new Array[Int](n2)

      var i = 0

      for (i <- 0 to n1 - 1)
        L(i) = array(l+i)


      var j = 0

      for (j <- 0 to n2 - 1)
        R(j) = array(m+1+j)

     i = 0
     j = 0

    // Initial index of merged subarry array
    var k = l;
    while (i < n1 && j < n2)
    {
      if (L(i) <= R(j))
      {
        array(k) = L(i);
        i = i + 1;
      }
      else
      {
        array(k) = R(j);
        j = j + 1;
      }
      k = k + 1;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1)
    {
      array(k) = L(i);
      i = i + 1;
      k = k + 1;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2)
    {
      array(k) = R(j);
      j = j + 1;
      k = k + 1;
    }

  }
}
