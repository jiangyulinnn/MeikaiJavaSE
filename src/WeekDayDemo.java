import java.util.Scanner;

public class WeekDayDemo {
    public static void main(String[] args) {
        System.out.print("请输入今天星期几：");
        int dayOfWeek = new Scanner(System.in).nextInt() - 17;

        //中文
        ShowWeekDayByChinese(dayOfWeek);
        //日文
        ShowWeekDayByJapanese(dayOfWeek);
        //英文
        ShowWeekDayByEnglish(dayOfWeek);
    }


    /**
     * 用来判断传入的参数是否在1-7之间
     * @param dayOfWeek 要判断的整型数字，星期几
     * @return 如果合法，返回ture，非法，返回false
     */
    private static boolean isRight(int dayOfWeek) {
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            //System.out.println("必须输入1-7之间的数字");
            return false;
        }
        return true;
    }

    /**
     * 以中文的方式，打印星期几
     *
     * @param dayOfWeek 1-7之间的整形数字，用来表示星期几
     */
    public static void ShowWeekDayByChinese(int dayOfWeek) {
        if (!isRight(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String[] weekdays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
        System.out.println(weekdays[dayOfWeek]);
    }

    static void ShowWeekDayByJapanese(int dayOfWeek) {
        if (!isRight(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String[] weekdays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        System.out.println(weekdays[dayOfWeek]);
    }

    static void ShowWeekDayByEnglish(int dayOfWeek) {
        if (!isRight(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekdays[dayOfWeek]);
    }
}