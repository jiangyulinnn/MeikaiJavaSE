package guessdemo;

/**
 * TODO
 *人类玩家
 * @Author: yulin
 * @Date: 2019/9/22 2:58 PM
 */
public class HumanPlayer {
    /**静态常量：出拳类型的信息*/
    public static final int MessageTypeFist = 1;
    /**静态常量：出拳赢的信息*/
    public static final int MessageTypeWin = 2;
    /**静态常量：出拳输的信息*/
    public static final int MessageTypeLose = 3;


    //属性：名称、分数、所出拳、（角色对应的音效）、角色的个性化台词
    private String name;
    private int score;
    private int fist;
    private String[] fistwords = {
            "我是动感超人，动感光波，Biubiubiu～",
            "你回来了，oh,是我回来了",
            "大象，大象你的鼻子怎么那么长?"
    };

    private String[] winWords = {
            "还有谁！",
            "猜拳，有点意思",
            "超神！",
            "全军出击",
            "吃着火锅唱着歌你就输了",
    };

    private String[] loseWords = {
            "通往成功的路总在施工中",
            "等到潮水退去，我连西北风都没有喝了",
            "夏天就是不好",
            "众人皆醉我独醒，举世皆浊我独清",
            "将来我死了，把QQ捐给希望工程，让孩子们一上来就能用上带太阳的QQ"
    };

    //方法：设置和得到名称、分数（播放音效）、说台词、出拳

    /**
     * 根据传入消息的类型，随机打印对应类型的信息
     * @param msgType 对应HumanPlayer类中定义的静态常量
     */
    public void sendMessage(int msgType){
        //生成一个0-4之间的随机数字
        int index = ((int)(Math.random()*1000)) % 5;
        String message = null;  //要打印的消息

        switch (msgType){
            case MessageTypeFist:
                message = fistwords[index];
                break;
            case MessageTypeLose:
                message = loseWords[index];
                break;
            case MessageTypeWin:
                message = winWords[index];
                break;
        }
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFist() {
        return fist;
    }

    public void setFist(int fist) {
        this.fist = fist;
    }
}
