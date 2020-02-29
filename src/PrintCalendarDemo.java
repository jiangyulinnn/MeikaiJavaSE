import java.util.Scanner;

/**
 * TODO 使用方法实现月历的打印
 *
 * @Author: yulin
 * @Date: 2019/9/10 10:41 AM
 */
public class PrintCalendarDemo {

    public static int year = Integer.MIN_VALUE;
    public static int month = Integer.MIN_VALUE;

    public static void main(String[] args) {
        PrintCalendar();
    }




    /**
     * 打印月历的核心方法
     */
    public static void PrintCalendar(){

        //1.让用户输入年份和月份
        //2.计算1900-1-1到用户输入时间的总天数（year=2017，month=7 2017-1-1）
        //  2-1 计算各年的天数
        //  2-2 计算各月天数之和
        int sum = getSumDayOfYears();
        sum += getSumDayOfMonth();
        sum++;  //总天数+1才到当前月的1号
        System.out.println(sum);

        //3.打印月份和年份（英文）
     //   PrintMonthTitle();

        //4.打印月份的标题（星期一到星期日）

        //5.根据某月1日星期几，打印月历内容
      //  PrintCalendarContent(sum % 7);
    }

    /**
     * 根据当月1号是周几来打印月历
     * @param dayOfWeek 当月1号是周几
     */
    private static void PrintCalendarContent(int dayOfWeek){
        //注意：dayOfWeek取值范围是0-6
        int sepCount = dayOfWeek - 1;   // \t的数量
        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (dayOfWeek == 0){
            sepCount = 6;
        }else{
            sepCount = dayOfWeek - 1;
        }
        for (int i = 0; i < sepCount; i++){
            System.out.print("\t");
        }
        for (int i = 1;i < dayOfMonth[month - 1]; i++){
            System.out.print(i + 1);
            if((dayOfWeek + i) % 7 == 0){
                //周日
                System.out.println();
            }else{
                System.out.println("\t");
            }
        }

    }

    private static void PrintMonthTitle(){
        String[] monthName = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println("\t\t" + year + "\t" + monthName[month - 1]);
        String[] weekdays = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        for (int i = 0; i < weekdays.length; i++)
            {
                System.out.print(weekdays[i] + "\t");
            }
        System.out.println();   //打印换行
    }




    /**
     * 获得1900-year年的总天数
     * @return
     */
    private static int getSumDayOfYears(){
        //需要判断用户是否已经输入了年份
        if(year == Integer.MIN_VALUE){
            System.out.println("年份错误，请重新输入年份和月份！");
            InputYearAndMonth();
        }
        int sum = 0;
        for (int i = 1900; i < year; i++){
            sum += 365; //每一年累加365
            if (isLeapYear(year))
                sum++;  //如果是闰年的话，需要多+1天
        }

        return sum;

    }

    /**
     * 得到year年1月1号到year年month-1月最后一天的总天数
     * @return
     */
    private static int getSumDayOfMonth(){
        int sum = 0;
        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < (month); i++){
            sum += dayOfMonth[i];
            }
        //year年是闰年，并且month>=3
        if (isLeapYear(year) && month >= 3){
            sum++;
        }
       return sum;

    }

    /**
     * 用来判断读入的变量是不是闰年
     * @param year
     * @return 是闰年，返回ture
     */
    private static boolean isLeapYear(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    /**
     * 接收用户输入的年份和月份，不要返回值
     */
    private static void InputYearAndMonth(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        input.close();  //释放空间节约资源
        input = null;

    }

}
