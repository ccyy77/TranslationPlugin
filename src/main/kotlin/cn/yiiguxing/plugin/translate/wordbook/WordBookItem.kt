package cn.yiiguxing.plugin.translate.wordbook

import cn.yiiguxing.plugin.translate.trans.Lang
import java.sql.Date

/**
 * WordBookItem
 *
 * Created by Yii.Guxing on 2019/08/06.
 */
data class WordBookItem(
    var id: Long?,
    val word: String,
    val sourceLanguage: Lang,
    val targetLanguage: Lang,
    val phonetic: String?,
    val explanation: String?,
    val tags: List<String> = emptyList(),
    val createdAt: Date = Date(System.currentTimeMillis())
)