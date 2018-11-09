object demo1 {
  import scala.Array._

  def main(args: Array[String]): Unit = {
/*    //数组:数组平坦的
    var z:Array[String] = new Array[String](3)
    z(0)="Zara"
    z(1)="lucy"
    z(2)="jum"
    println(z(1))
    var y = new Array[String](3)
    y(0)="Zara"
    y(1)="lucy"
    y(2)="jum"
    println(y(1))
    var x = Array("zara","lucy","tom")
    println(x(2))

    var h = concat(z,x)
//数组遍历
    for (i<-0 to (h.length - 1)){
      println(h(i))
    }
//迭代器模式
    for (i <- y){
      println(i)
    }
//使用range
    var myList1 = range(10,20,2)
    for(x<-myList1){
      println(""+ x)
    }*/

    /*//列表:不可变的 列表表示一个链表
    var fruit : List[String] =List("Apple","orange","pear")
    var fruit2 :List[String] = "Apple"::("orange"::("pear"::Nil))
    println(fruit.head)
    print(fruit.tail)
    print(fruit.isEmpty)
    //合并列表
    var fruit3 = fruit:::fruit2
    var fruit4 = fruit.:::(fruit2)
    var fruit5 = List.concat(fruit,fruit2)
    //List.fill()元素拷贝
    var fruit1 = List.fill(4)("apples")
    println(fruit1)*/

/*    //Map 默认不可变的对象
    var A:Map[Char,Int] = Map()
    A +=('l'->1)
    A +=('m'->2)
    A +=('n'->3)
    println(A.keys)
    println(A.values)
    var colors = Map("red"->"#FF0000","peru"->"#CD853F")
    println(colors.keys)
    println(colors.values)
    println(colors.isEmpty)

    //++()连接
    val colors1 = Map("red"->"#FF0000","blue"->"dfer","yellow"->"hgdu")
    val colors2 = colors .++ (colors1)
    val colors3 = colors ++ colors1
    //foreach
    println(colors1("red"))
    colors.keys.foreach{i =>
      print(i)
      println(colors(i))
    }
    println(colors.contains("red"))//检查Map里面是否存在*/

/*
    //元组:不同类型对象 不可改变的
    val t = (1,"hello",Console)
    val t1 = new Tuple2(99,"dwef")
    println(t)
    println(t1)
    println(t._2)
    t.productIterator.foreach{
      i=>println(i)
    }
    println( t.toString())//转换为字符串
    println(t1.swap)//交换两个值
*/

    //迭代器:两种基本操作 next和hasNext  迭代器只能使用一次
    val it = Iterator("a","number","of","words")
    while(it.hasNext){
      println(it.next())
    }
    val it1 = Iterator(1,4,6,77,44,22)
    val it2 = Iterator(1,4,6,77,44,22)
    println(it1.max)
    println(it2.min)
    val it3 = Iterator(1,4,6,77,44,22)
    val it4 = Iterator(1,4,6,77,44,22)
    println(it3.size)
    println(it4.length)
  }
}
