package visitabletree

abstract class Node {
  def accept(v: Visitor): Unit
}

case class InternalNode(left: Node, right: Node) extends Node {
  def leftChild = left
  def rightChild = right
  def accept(v: Visitor): Unit = v.visit(this)
}

case class LeafNode(value: Int) extends Node {
  def leafValue: Int = this.value
  def accept(v: Visitor): Unit = v.visit(this)
}

trait Visitor {
  def visit(node: InternalNode): Unit
  def visit(node: LeafNode): Unit
}
