package BASICS.day07.Person;

import java.util.Scanner;

/**
 * 需求：《主持人大赛》有n位评委给选手评价，分数范围在0到100之内的浮点数
 * <p>   选手的最终得分为：去掉最高分和最低分之后的n-2位评委的平均分
 * <p>训练目标：方法设计
 */
public class CalTotaAvg {
    public static void main(String[] args) {
        double[] scores = inputData(6);//输入评委的评分
        double avg = calAvg(scores);//计算平均分
        System.out.println("平均分为：" + avg);
    }

    /**
     * 录入n位评委的评分
     */
    public static double[] inputData(int count) {
        double[] scores = new double[count];
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < scores.length; i += 1) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数");
            scores[i] = a.nextDouble();
        }
        return scores;
    }

    public static double calAvg(double[] scores) {
        double total = 0.0;//总分
        double max = scores[0];//假设第一个元素为最高分
        double min = scores[0];//假设第一个元素为最低分
        for (int i = 0; i < scores.length; i += 1) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            total += scores[i];
        }


        /**
         * <p>平均分-- (总分数 - max - min) / (scores.length -2 )
         */
        double avg = (total - max - min) / (scores.length - 2);//平均分

        return avg;
    }
}
