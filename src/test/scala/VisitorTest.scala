package visitabletree

import org.junit.Test

import org.junit.Assert.assertEquals

class VisitorTest {
  val leaf10 = LeafNode(1)
  val leaf20 = LeafNode(2)
  val leaf21 = LeafNode(3)
  val node11 = InternalNode(leaf20, leaf21)
  val rootNode = InternalNode(leaf10, node11)
  
  val visitor = new SumVisitor
  @Test
  def testSumVisitor = {
    visitor.apply(rootNode)
    assertEquals(6, visitor.result)
  }
}
