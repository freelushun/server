package com.free.wordbookserver.myutil;


/**
 * 基础工具包  不涉及业务逻辑
 */
public class BasicUtil {
    private static final String[] _ABC = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] _abc = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static final String[] _123 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


    /**
     * 生成指定位数的字符串验证码
     *
     * @param num 指定位数
     * @return 返回验证码
     */
    public static String genShortString(int num, String type) {
        StringBuilder builder = new StringBuilder();
        switch (type) {
            case "A":
                for (int i = 0; i < num; i++)
                    builder.append(_ABC[genRandom(_ABC.length)]);


                break;
            case "a":
                for (int i = 0; i < num; i++)
                    builder.append(_abc[genRandom(_abc.length)]);

                break;
            case "1":
            default:
                for (int i = 0; i < num; i++)
                    builder.append(_123[genRandom(_123.length)]);

                break;
        }


        return builder.toString();

    }


    /**
     * 生成最大值不超过maxValue的随机数
     *
     * @param maxValue 不能大于或等于的最大值
     * @return 返回随机数字
     */
    public static int genRandom(int maxValue) {

        return (int) (Math.random() * maxValue);
    }


}
