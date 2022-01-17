package local

import publish.mGroupId
import publish.util.getVersionIlike

/**
 * @作者 做就行了！
 * @时间 2022/1/17 10:56
 * @该类描述： -
 * @使用说明： -
 */
fun getLocalLib(id: String, version: String = getVersionIlike()): String {
  return "$mGroupId:lib-$id:$version"
}