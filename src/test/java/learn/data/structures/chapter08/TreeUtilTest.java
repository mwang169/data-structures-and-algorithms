package learn.data.structures.chapter08;

import learn.data.structures.chapter07.Position;

import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author Rogerio J. Gentil
 */
public class TreeUtilTest {

   @Test
   public void mustPrintIndent() {
      LinkedBinaryTree<String> tree = new LinkedBinaryTree();
      tree.addRoot("Book Title");
      Position<String> firstLevelLeft = tree.addLeft(tree.root(), "Title 1");
      tree.addLeft(firstLevelLeft, "Subtitle 1");
      tree.addRight(tree.root(), "Title 2");

      TreeUtil.printPreOrderIndent(tree, tree.root(), 0);
   }

   @Test
   public void mustPrintLabeled() {
      LinkedBinaryTree<String> tree = new LinkedBinaryTree();
      tree.addRoot("Book Title");
      Position<String> firstLevelLeft = tree.addLeft(tree.root(), "Title 1");
      tree.addLeft(firstLevelLeft, "Subtitle 1");
      tree.addRight(tree.root(), "Title 2");

      TreeUtil.printPreOrderLabeled(tree, tree.root(), new ArrayList<>());
   }

}
