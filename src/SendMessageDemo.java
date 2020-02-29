

public class SendMessageDemo {
    public static void main(String[] args) {
       // SendMessage("KK","斗地主一号包厢","快点吧，等着……",5,2);
        SendMessage("KK");
    }


    /**
     * 重载的喊话方式，只需用户提供昵称即可实现喊话
     * @param nickName
     */
    public static void SendMessage (String nickName){
        String[] contents = {"你吃了吗？", "早上好！"};
        SendMessage(nickName, "默认频道",contents[(int)Math.random() * 2],10,1);
    }


    /**
     * 实现游戏喊话功能
     * @param name 用户名
     * @param channelName 频道名
     * @param message 喊话信息
     * @param count 喊话次数
     * @param interval 喊话的间隔（单位：秒）
     */
    public static void SendMessage (String name, String channelName, String message, int count, int interval){
        if (interval < 5) interval = 5;


        //喊话逻辑：拼接每个字符段，打印出来
        String value = String.format("【%s】%s，%s",
                channelName, name, message);
        for(int i = 0; i < count; i++){
            System.out.println(value);
            try {
                Thread.sleep(interval * 1000);  //休眠多少秒  括号里面单位是 毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //金币-10
    }
}

