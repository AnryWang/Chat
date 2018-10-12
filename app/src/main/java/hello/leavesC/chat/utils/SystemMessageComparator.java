package hello.leavesC.chat.utils;

import java.util.Comparator;

import hello.leavesC.chat.model.BaseMessage;

/**
 * 作者：叶应是叶
 * 时间：2018/1/27 21:57
 * 说明：系统消息按时间排序
 */
public class SystemMessageComparator implements Comparator<BaseMessage> {

    @Override
    public int compare(BaseMessage o1, BaseMessage o2) {
        long time1 = o1.getMessageTime();
        long time2 = o2.getMessageTime();
        return Long.compare(time2, time1);
    }

}
