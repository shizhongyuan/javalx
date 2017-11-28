package java_练习;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class java05 {
    public static void main(String[] args) {
        //8.分页显示练习：定义一个常量，设定数据总记录数为73条（随时可以变化），
        // 一页20条记录（随时可以变化），输入页码，打印记录总数，共几页，
        // 当前是第几页，当前记录从第n条到第n条
        final int rowcount = 73;//总记录数
        final int pagesize = 20;//一页多少条
        Scanner scan = new Scanner(System.in);
        int page = scan.nextInt();//输入页码
//得到总页数
        int pagecount = rowcount % page == 0 ? rowcount / page : rowcount / page + 1;
//起始记录
        int startrow = pagesize * (page - 1) + 1;
//终止记录
        int endrow = pagesize * page > rowcount ? rowcount : pagesize * page;
//打印输出
        System.out.println("总记录数：" + rowcount + "，每页" + pagesize + "条，共"
                + page + "页，当前是第" + page + "页，从"
                + startrow + "条到" + endrow + "条");
    }
}
