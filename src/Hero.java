/**
 * TODO
 *
 * @Author: yulin
 * @Date: 2019/9/22 10:34 AM
 */
public class Hero {
    /**
     * 玩家名称创建后不可更改
     * 级别在1-999级
     * 玩家升级经验
     */


    private long id;
    private String nickName;
    private int level;
    private long currexp;   //当前经验值
    private long exp;   //当前升级所需要经验值 --公式 固定值

    public long getCurrexp() {
        return currexp;
    }

    public void setCurrexp(long currexp) {
        this.currexp = currexp;
    }

    public Hero() {
        super();
    }

    public Hero(String nickName){
        this.nickName = nickName;
    }

    public Hero(long id, String nickName, int level, long exp) {
        super();
        this.id = id;
        this.nickName = nickName;
        this.level = level;
        this.exp = exp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0)id = 1;
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    private void setNickName(String nickName) {
        if (null == nickName){
            nickName = "未知英雄";
        }else{
        this.nickName = nickName;}
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1 || level > 999){
            this.level = 1;
        }else{
            this.level = level;
        }
    }

    public long getExp() {
        exp = ((long)Math.pow(level - 1, 3) + 60) / 5 * (level - 1) * 2 + 60;
        return exp;
    }

}
