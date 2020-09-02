package actions

import net.mamoe.mirai.message.GroupMessageEvent
import java.util.ArrayList

/**
 * 继承这个方法
 */
interface Action {

    val noArg: Boolean

    /**
     * 命令的前缀, 示例: `/help`
     */
    val prefix: List<String>

    /**
     * 触发时的回调, [event]是触发的回调, [params]是参数
     */
    suspend fun invoke(event: GroupMessageEvent, params: String)

    /**
     * 帮助命令的文本
     */
    fun helperText(): String {
        return prefix.joinToString(",")
    }
}