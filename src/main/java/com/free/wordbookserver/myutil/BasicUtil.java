package com.free.wordbookserver.myutil;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


    /**
     * 校验是否合法的11位手机号码
     *
     * @param phone 传入的手机号
     * @return 是否合法
     */
    public static boolean validatePhoneNumber(String phone) {
        String regex = "^[1]\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    /**
     * 校验传入是否为指定位数的数字
     *
     * @param number 数据
     * @param n      指定位数
     * @return 结果
     */
    public static boolean validateNumber(String number, int n) {
        String regex = String.format("^\\d{%d}$", n);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    /**
     * 生成指定位数的乱序字符
     *
     * @param n 指定位数
     * @return 返回乱序字符
     */
    public static String genOutOfOrder(int n) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            switch (genRandom(3)) {
                case 0:
                    builder.append(_ABC[genRandom(_ABC.length)]);
                    break;
                case 1:
                    builder.append(_abc[genRandom(_abc.length)]);
                    break;
                    case 2:
                    builder.append(_123[genRandom(_123.length)]);
                    break;
            }

        }

        return builder.toString();
    }
    //byte转化为16进制
    public static String byte2Hex(byte[] bytes) {
        StringBuilder stringBuilder = new StringBuilder();
        String temp = null;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuilder.append("0");
            }
            stringBuilder.append(temp);
        }
        return stringBuilder.toString();
    }


    //SHA256  安全散列算法加密
    //明文加密
    //SHA256  安全散列算法加密
    //明文加密
    public static String encryptBySHA256(String password) throws NoSuchAlgorithmException {
        String encodeStr;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes(StandardCharsets.UTF_8));
        encodeStr = byte2Hex(messageDigest.digest());
        return encodeStr;
    }

}
