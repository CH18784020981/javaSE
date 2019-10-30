# P01
1."23 9 -4 18 100 7"   中间是 空格
要求这串数字按照从小到大排序并生成一个数值有序的字符串
思路：将每个数字依次提取出来到一个数组中去，排序后变成一个新字符串，最后输出出来
# MyStringUtil工具
2. 定义一个MyStringUtil工具类，该类中定义三个方法，要求如下： (1)public static char[]
     * toCharArray(String str) :
     * 将给定的参数字符串转成对应的字符数组（不能直接调用jdk中的工具类及String类中的tocharArray方法） (2) public
     * static String getSingleString(String str) :
     * 去除给定的参数字符串中的重符字符（重复字符只保留一个），将新的字符串返回
     * 
     * (3)public static boolean isBalancedString(String str):
     * 如果左右两边字符相同则返回true，否则返回false， 例如：abccba是对称字符 例如：abcdecba不是对称字符