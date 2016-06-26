package visitabletree

class SumVisitor extends Visitor {
  var result: Int = _

  def apply(node: Node): Int = {
    node.accept(this)
    result
  }

  def visit(node: InternalNode): Unit = 
    result = apply(node.leftChild) + apply(node.rightChild)

  def visit(node: LeafNode): Unit = 
    result = node.leafValue
}
