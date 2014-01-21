package nz.co.bigdavenz.ei.item.tools

import nz.co.bigdavenz.ei.item.EiItemTool
import nz.co.bigdavenz.ei.EnchantInsanity
import nz.co.bigdavenz.ei.core.chat.Communicate
import nz.co.bigdavenz.ei.lib.Reference

/**
 * Created by David J. Dudson on 21/01/14.
 *
 * Enchanted Pickaxe class
 */
class EnchantedPickaxe extends EiItemTool {

  def EnchantedPickaxe {
    this.setCreativeTab(EnchantInsanity.tabEi)
  }

  override def onCreate {
    Communicate.withPlayer(getOwner, "Congratulations! You created an Enchanted Pickaxe with the same stats as a: " + consumedToolStack.getDisplayName)
  }

  val itemType: String = "Enchanted Pickaxe"
}