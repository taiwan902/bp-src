/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Class_14775 {
    private List Field_14776;
    private Class_1782 Field_14777;
    private Class_1782 Field_14778;
    private long Field_14779;
    public static Class_14775 Field_14780 = new Class_14775();
    private boolean Field_14781;

    private static String Method_14782(String string) {
        int n = 12405;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14783(String string) {
        int n = 28524;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_14775(String string) {
        this.Field_14781 = 20996 & -32744;
        Pattern[] arrpattern = new Pattern[20498 & -23533];
        arrpattern[30082 & 616] = Class_14775.Method_14816(Class_14775.Method_14795("\u0098\u0099\u0098\u0091\u008c"));
        arrpattern[6145 & 529] = Class_14775.Method_14816(Class_14775.Method_14800("\u2248\u224b\u224a\u2241\u224c\u2245"));
        arrpattern[29511 & 3242] = Class_14775.Method_14816(Class_14775.Method_14783("\u8144\u8145\u8147\u8141\u8140\u8143\u8144"));
        arrpattern[16387 & 8775] = Class_14775.Method_14816(Class_14775.Method_14792("\u118e\u118f\u118a\u1185\u1180\u1183\u118e"));
        arrpattern[-16252 & 326] = Class_14775.Method_14816(Class_14775.Method_14811("\u4140\u4144\u4144\u4142\u4140\u4142"));
        arrpattern[-30323 & 16901] = Class_14775.Method_14816(Class_14775.Method_14797("\u0401\u0404\u0406\u0405\u0402\u0405\u0403\u0406"));
        arrpattern[-32697 & 9014] = Class_14775.Method_14816(Class_14775.Method_14790("\u2448\u2449\u2448\u2409\u2448\u2449\u2448\u2449\u2448\u2449"));
        arrpattern[3335 & -32665] = Class_14775.Method_14816(Class_14775.Method_14829("\u10de\u10d8"));
        arrpattern[-32696 & 1710] = Class_14775.Method_14816(Class_14775.Method_14782("\u1440\u1440\u1440\u1440\u1440\u1440\u1440\u1440\u1448\u1448"));
        arrpattern[8585 & -14279] = Class_14775.Method_14816(Class_14775.Method_14827("\u90e0\u90e1\u90e0\u90e1\u90e0\u90e1\u90e0\u90e1\u90e8"));
        arrpattern[5807 & -14326] = Class_14775.Method_14816(Class_14775.Method_14822("\u8682\u8683\u8682\u8685\u8684\u8681\u8684\u8685"));
        arrpattern[25371 & 3087] = Class_14775.Method_14816(Class_14775.Method_14796("\u1048\u1058\u1048\u104a\u105f"));
        arrpattern[5740 & -32500] = Class_14775.Method_14816(Class_14775.Method_14802("\uc800\uc804"));
        arrpattern[9549 & -28627] = Class_14775.Method_14816(Class_14775.Method_14830("\u104c\u1048\u1040\u104c\u104c\u1048"));
        arrpattern[15 & 16606] = Class_14775.Method_14816(Class_14775.Method_14789("\u02b2\u02a3\u02a1\u02b0"));
        arrpattern[16431 & 8991] = Class_14775.Method_14816(Class_14775.Method_14814("\u4260\u4271\u4276\u4227\u4264\u4267\u4264\u4263\u4274\u4271"));
        arrpattern[-24484 & 530] = Class_14775.Method_14816(Class_14775.Method_14784("\ud01e\ud00e\ud008\ud018\ud01c\ud01c\ud018\ud00c\ud006"));
        arrpattern[2417 & -11247] = Class_14775.Method_14816(Class_14775.Method_14823("\u0382\u0399"));
        this.Field_14776 = Arrays.asList(arrpattern);
        this.Field_14778 = new Class_2840(Class_14775.Method_14809("\u0988\u0909\u0902\u090b\u0900\u0909\u0902\u0903\u0908\u0901\u0902\u0903\u0900\u0909\u090a\u090b\u0910\u0919\u0912\u0913\u0910\u0999\u091a\u091b\u0910\u0911\u091a\u0913\u0910\u0919\u091a\u0913\u0908\u0901\u090a\u090b\u0908\u0909\u0902\u090b\u0900\u0909\u090a\u090b\u0908\u0901\u0902\u090b\u0910\u0919\u0912\u091b\u0918\u0919\u0912\u0913\u0910\u0911\u0912\u0913\u0910\u0911\u0912\u091b\u0948\u0949"));
        this.Field_14779 = 4673189235547795216L & -4673189237098010671L;
        this.Field_14777 = new Class_2840(Class_14775.Method_14799("\u02a0\u0265\u0244\u0245\u0242\u0247\u0244\u0247\u0240\u0241\u0246\u0247\u0244\u0245\u0240\u0247\u0240\u0241\u0240\u0243\u0224\u02a1\u0220\u0227\u0244\u0263\u0260\u0261\u0226\u0263\u0260\u0261\u0260\u0227\u0226\u0247\u0260\u0263\u0226\u0265\u0266\u0261\u0226\u0263\u0264\u0263\u0226\u0261\u0260\u0263\u0266\u0227\u0260\u0261\u0262\u0227\u0264\u0267\u0260\u0263\u0226\u0263\u0260\u0263\u0224\u0227\u0266\u0267\u0266\u0267\u0224\u0223\u0224\u0221\u0220\u0223\u0224\u0261\u0266\u0205\u0220\u0221\u0222\u0221\u0226\u0225\u0266\u0267\u0202\u0221\u0222\u0223\u0224\u0225\u0266\u0223\u0222\u0227\u0240\u0267\u0224\u0227\u0220\u0223\u0226\u0267\u0224\u0227\u0224\u0267\u0220\u0227\u0266\u0267\u0266\u0267\u0224\u0223\u0224\u0223\u0220\u0223\u0260"));
        this.Field_14781 = 20673 & 9991;
        Pattern[] arrpattern2 = new Pattern[-9183 & 669];
        arrpattern2[768 & 24594] = Pattern.compile(string);
        this.Field_14776 = Arrays.asList(arrpattern2);
    }

    private static String Method_14784(String string) {
        int n = 17081;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_14775() {
        this.Field_14781 = 2697 & 96;
        Pattern[] arrpattern = new Pattern[21746 & 790];
        arrpattern[65 & -17640] = Class_14775.Method_14816(Class_14775.Method_14825("\u5902\u5900\u5902\u590d\u5917"));
        arrpattern[-15741 & 8481] = Class_14775.Method_14816(Class_14775.Method_14786("\u4004\u4004\u4006\u4003\u4001\u4005"));
        arrpattern[2199 & -24566] = Class_14775.Method_14816(Class_14775.Method_14819("\u4828\u4828\u4820\u4820\u482c\u482c\u4824"));
        arrpattern[27 & -14205] = Class_14775.Method_14816(Class_14775.Method_14807("\ue920\ue921\ue936\ue92b\ue938\ue939\ue936"));
        arrpattern[8356 & 4109] = Class_14775.Method_14816(Class_14775.Method_14793("\u6096\u6082\u6083\u6085\u6087\u6085"));
        arrpattern[12005 & 4109] = Class_14775.Method_14816(Class_14775.Method_14817("\u15a9\u15a9\u15ba\u15ba\u15b8\u15b8\u15ab\u15ab"));
        arrpattern[1030 & 24727] = Class_14775.Method_14816(Class_14775.Method_14818("\u0d24\u0d21\u0d21\u0d61\u0d25\u0d26\u0d27\u0d20\u0d28\u0d2d"));
        arrpattern[6407 & 1151] = Class_14775.Method_14816(Class_14775.Method_14831("\u1044\u1043"));
        arrpattern[25609 & -28294] = Class_14775.Method_14816(Class_14775.Method_14824("\u9880\u9881\u9881\u9880\u9881\u9880\u9881\u9880\u9880\u9881"));
        arrpattern[19723 & 4265] = Class_14775.Method_14816(Class_14775.Method_14805("\u0007\u000f\u0000\t\u0002\u0005\f\u0001\b"));
        arrpattern[778 & 1067] = Class_14775.Method_14816(Class_14775.Method_14803("\u00a4\u00a5\u00a4\u00a1\u00a4\u00a1\u00a4\u00a5"));
        arrpattern[-28561 & 1563] = Class_14775.Method_14816(Class_14775.Method_14812("\u050c\u050d\u050e\u0509\u050e"));
        arrpattern[652 & 16396] = Class_14775.Method_14816(Class_14775.Method_14785("\u4029\u402c"));
        arrpattern[8909 & -32467] = Class_14775.Method_14816(Class_14775.Method_14791("\u2124\u2120\u2130\u2135\u2122\u2135"));
        arrpattern[16990 & -20209] = Class_14775.Method_14816(Class_14775.Method_14788("\ub000\ub000\ub001\ub001"));
        arrpattern[-16369 & 10463] = Class_14775.Method_14816(Class_14775.Method_14808("\u1044\u1044\u1043\u1002\u1044\u1047\u1044\u1043\u1041\u1044"));
        arrpattern[18448 & 16] = Class_14775.Method_14816(Class_14775.Method_14810("\u1002\u1012\u1014\u1004\u1000\u1000\u1004\u1010\u101a"));
        arrpattern[2193 & -8169] = Class_14775.Method_14816(Class_14775.Method_14801("\u0402\u0400"));
        this.Field_14776 = Arrays.asList(arrpattern);
        this.Field_14778 = new Class_2840(Class_14775.Method_14806("\u0e04\u0e40\u0e48\u0e40\u0e4c\u0e40\u0e48\u0e48\u0e4c\u0e44\u0e40\u0e40\u0e40\u0e48\u0e4c\u0e48\u0e5c\u0e54\u0e5c\u0e5c\u0e18\u0e14\u0e14\u0e10\u0e54\u0e54\u0e5c\u0e10\u0e50\u0e58\u0e5c\u0e54\u0e00\u0e48\u0e44\u0e40\u0e44\u0e00\u0e48\u0e40\u0e40\u0e4c\u0e4c\u0e48\u0e4c\u0e44\u0e40\u0e4c\u0e58\u0e10\u0e5c\u0e50\u0e10\u0e54\u0e58\u0e5c\u0e10\u0e50\u0e54\u0e50\u0e54\u0e54\u0e50\u0e58\u0e04\u0e40"));
        this.Field_14779 = 9105163025416988596L & 324069201L;
        this.Field_14777 = new Class_2840(Class_14775.Method_14794("\u0106\u0102\u012a\u0123\u0129\u0124\u012f\u012c\u0127\u012e\u0129\u0128\u012e\u0126\u0122\u0124\u012f\u0127\u012e\u012c\u010f\u0102\u0103\u0105\u012a\u0105\u0106\u010e\u010d\u0109\u0102\u010a\u012f\u0120\u0121\u0108\u012a\u0120\u0125\u0126\u0128\u0127\u0129\u012c\u012e\u0128\u012d\u0122\u012f\u012d\u0128\u0121\u012a\u012b\u0120\u0125\u012b\u0120\u0127\u012d\u012d\u0128\u012b\u0128\u0143\u0148\u0141\u0140\u0145\u0145\u0146\u0140\u014a\u0146\u0147\u014d\u014e\u0143\u014d\u0167\u0146\u014e\u014d\u014f\u014c\u014f\u0144\u0145\u0164\u0146E\u014c\u014e\u0147\u014d\u0148m\u0168F\u0161\u0167\u016c\u016b\u0161\u0168\u0169\u016b\u0168\u0167\u016d\u0163\u016c\u0161\u0160\u0161\u0161\u0166\u0160\u016e\u0160\u0167\u016d\u0167"));
    }

    private static String Method_14785(String string) {
        int n = 30207;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14786(String string) {
        int n = 11193;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_14787(String string) {
        if (this.Method_14815(string)) {
            return this.Field_14781;
        }
        return (!this.Field_14781 ? -24543 & 6165 : 21 & -32126) != 0;
    }

    private static String Method_14788(String string) {
        int n = 9496;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14789(String string) {
        int n = 27208;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14790(String string) {
        int n = 17563;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14791(String string) {
        int n = 6313;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14792(String string) {
        int n = 6843;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14793(String string) {
        int n = 31501;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14794(String string) {
        int n = 15579;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14795(String string) {
        int n = 20684;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14796(String string) {
        int n = 27489;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14797(String string) {
        int n = 11836;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1782 Method_14798() {
        return this.Field_14778;
    }

    private static String Method_14799(String string) {
        int n = 4572;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14800(String string) {
        int n = 31537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14801(String string) {
        int n = 15135;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14802(String string) {
        int n = 16773;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14803(String string) {
        int n = 29893;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1782 Method_14804() {
        return this.Field_14777;
    }

    private static String Method_14805(String string) {
        int n = 24251;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14806(String string) {
        int n = 9038;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14807(String string) {
        int n = 12094;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14808(String string) {
        int n = 25955;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14809(String string) {
        int n = 26284;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14810(String string) {
        int n = 26226;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14811(String string) {
        int n = 23374;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14812(String string) {
        int n = 29466;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_14813() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_14775.Method_14828("\u8462\u846c\u8453\u846d\u8447\u844a\u8451\u8442\u8441\u8448\u847f\u844e\u8448\u8440"));
    }

    private static String Method_14814(String string) {
        int n = 9651;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_14815(String string) {
        for (Pattern pattern : this.Field_14776) {
            if (!pattern.matcher(string).matches()) continue;
            return (25249 & -28343) != 0;
        }
        return (6 & 128) != 0;
    }

    private static final Pattern Method_14816(String string) {
        Object[] arrobject = new Object[865 & 22667];
        arrobject[16644 & -27517] = string;
        return Pattern.compile(String.format(Class_14775.Method_14820("\u0881\u08c0\u08c0\u0880\u08c1\u08c0\u08c1\u08c1\u08c1\u08c1\u0881\u08c0"), arrobject), -27134 & 16779);
    }

    private static String Method_14817(String string) {
        int n = 20849;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14818(String string) {
        int n = 27549;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14819(String string) {
        int n = 28096;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14820(String string) {
        int n = 30400;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_14821(Class_29900 class_29900) {
        this.Field_14781 = class_29900.Method_29962();
        this.Field_14778 = class_29900.Method_30020();
        this.Field_14779 = class_29900.Method_30019();
        this.Field_14777 = class_29900.Method_30020();
        int n = class_29900.Method_30004();
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        for (int i = -20348 & 1024; i < n; ++i) {
            try {
                arrayList.add(Pattern.compile(class_29900.Method_29991(32767 & 32767), class_29900.Method_30004()));
                continue;
            }
            catch (PatternSyntaxException patternSyntaxException) {
                // empty catch block
            }
        }
        this.Field_14776 = arrayList;
    }

    private static String Method_14822(String string) {
        int n = 7308;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14823(String string) {
        int n = 14957;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14824(String string) {
        int n = 10403;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14825(String string) {
        int n = 31060;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public long Method_14826() {
        return this.Field_14779;
    }

    private static String Method_14827(String string) {
        int n = 570;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14828(String string) {
        int n = 29257;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14829(String string) {
        int n = 1424;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14830(String string) {
        int n = 14553;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14831(String string) {
        int n = 13192;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14775.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

