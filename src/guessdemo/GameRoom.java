package guessdemo;

import java.util.Scanner;

/**
 * TODO 游戏房间
 *
 * @Author: yulin
 * @Date: 2019/9/23 1:57 PM
 */
public class GameRoom {
    //属性：计分牌、道具、参与游戏的玩家、房间号、房间名称、房间密码
    private HumanPlayer player1 = null;
    private ComPlayer player2 = null;
    private long roomId;
    private String roomName;
    private String roomPass;

    public GameRoom(){
        initGame();
        startGame();
        endGame();
    }

    //方法：开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以定义在裁判类）
    public void initGame(){
        //1.实例化玩家对象
        player1 = new HumanPlayer();
        player2 = new ComPlayer();
        //2.初始化游戏其他属性，如：环境
        for(int i = 0; i < 30; i++){
            System.out.print("*");
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("游戏加载成功！");
    }

    public void startGame(){
        showMenu();
        choiceRole();
        //双方出拳
        System.out.println("请出拳：");
        player1.setFist(new Scanner(System.in).nextInt());
        int fist1 = player1.getFist();
        player2.getFist();
        int fist2 = player2.getFist();
        //判断输赢
        int result = judge(fist1,fist2);    //调用方法判读结果
        //如果返回-1，玩家1胜利；返回0，平手；返回1，玩家2胜利。
        if(result == 1){
            player1.sendMessage(HumanPlayer.MessageTypeWin);
            player2.sendMessage(ComPlayer.MessageTypeLose);
        }else if(result == 0){
            player1.sendMessage(HumanPlayer.MessageTypeFist);
            player2.sendMessage(ComPlayer.MessageTypeFist);
        }else{
            player1.sendMessage(HumanPlayer.MessageTypeLose);
            player2.sendMessage(ComPlayer.MessageTypeWin);
        }
        //打印结果
    }

    public void showMenu(){
        System.out.println("欢迎进入《" + roomName + "》游戏房间");
        System.out.println("出拳规则：1-剪刀；2-布；3-石头");

    }

    public void choiceRole(){
        System.out.println("对方角色：1-风间；2-妮妮；3-正南；4-阿呆");
        System.out.println("请选择：");
        int choice = new Scanner(System.in).nextInt();
        String[] nameArray = {"风间","妮妮","正南","阿呆"};
        //还需要验证操作
        player2.setName(nameArray[choice - 1]);
        player1.setName("野原新之助");
        System.out.println(player1.getName() + " vs." + player2.getName());
    }

    /**
     * 如果返回-1，玩家1胜利；如果返回0，平手；如果返回1，玩家2胜利；
     * @param fist1
     * @param fist2
     * @return
     */
    public int judge(int fist1, int fist2){
        if(fist1 == fist2) return 0;
        if(fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 == 1 ||fist1 == 3 && fist2 == 2 ){
            //玩家1的分数+1；玩家2分数-1
            player1.setScore(player1.getScore() + 1);
            player2.setScore(player2.getScore() - 1);
            return -1;  //玩家1胜利
        }
            player2.setScore(player2.getScore() + 1);
            player1.setScore(player1.getScore() - 1);
            return 1;   //玩家2胜利

    }

    public void endGame(){
        System.out.println("游戏结束，欢迎下次再来！");

    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPass() {
        return roomPass;
    }

    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass;
    }




}
