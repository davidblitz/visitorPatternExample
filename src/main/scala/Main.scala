package visitabletree 

object TreeSum {
  def main(args: Array[String]) = {
	  println("Building tree...")

    val leaf10 = LeafNode(1)
    val leaf20 = LeafNode(2)
    val leaf21 = LeafNode(3)
    val node11 = InternalNode(leaf20, leaf21)
    val rootNode = InternalNode(leaf10, node11)

    val visitor = new SumVisitor

    println("Evaluating sum...")

    visitor.apply(rootNode)

    println("Sum of leaf nodes is " + visitor.result)
  }
}
