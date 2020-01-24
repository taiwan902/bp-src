/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_38589
extends Class_36787 {
    public static final Pattern Field_38590 = Pattern.compile(Class_38589.Method_38599("\u8218\u820b\u821a\u8211\u8216\u821f\u821e\u821d\u820a\u8213\u8208\u8213\u8216\u821d\u8216\u821d\u821a\u8203\u8208\u8209\u8216\u820f\u8206\u8205\u8200\u820b\u8210\u8209\u8206\u8217\u8204\u8217\u822a\u8239\u8230\u8231\u823e\u823d\u823c\u8225\u8232\u822b\u8232\u8231\u823c\u8235\u823c\u8225\u8222\u822b\u8228\u8231\u822e\u8225\u8224\u822f\u822a\u8233\u8228\u8221\u8236\u8227\u8236\u8235\u8218\u8213\u8210\u8219\u821c\u821f\u8204\u821d\u820a\u8211\u8210\u821b\u8214\u821f\u8204\u821d\u820a\u820b\u8210\u8209\u8204\u8207\u820e\u8205\u8212\u820b\u8200\u8211\u8206\u8215\u8214\u8207\u8232\u8233\u8238\u823b\u823e\u8227\u823c\u8225\u8230\u8233\u823a\u8233\u823e\u8227\u823c\u8235\u822a\u8233\u8228\u8223\u8226\u822d\u8224\u823d\u822a\u8223\u8230\u8239"));

    public boolean Method_38591(Class_1367 class_1367) {
        return (Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp() && super.Method_36796(class_1367) ? 16391 & 2441 : 6146 & 9248) != 0;
    }

    public void Method_38592(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length >= (2627 & -31439) && arrstring[385 & 2564].length() > (309 & -28087)) {
            Class_1782 class_1782 = arrstring.length >= (-32638 & 13378) ? Class_38589.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(3107 & 1)) : null;
            Matcher matcher = Field_38590.matcher(arrstring[16739 & -23040]);
            if (matcher.matches()) {
                this.Method_38595(class_1367, arrstring[5700 & 2192], class_1782 == null ? null : class_1782.Method_1788());
            } else {
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_2457.Method_2530().Method_2616().Method_3155(arrstring[4122 & 544]);
                if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 == null) {
                    throw new Class_31939("commands.banip.invalid", new Object[4424 & 1538]);
                }
                this.Method_38595(class_1367, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp(), class_1782 == null ? null : class_1782.Method_1788());
            }
        } else {
            throw new Class_34974("commands.banip.usage", new Object[-32760 & 4309]);
        }
    }

    public String Method_38593() {
        return "ban-ip";
    }

    public int Method_38594() {
        return 6531 & -32149;
    }

    protected void Method_38595(Class_1367 class_1367, String string, String string2) {
        Class_27129 class_27129 = new Class_27129(string, null, class_1367.Method_1368(), null, string2);
        Class_2457.Method_2530().Method_2616().Method_3119().\u0000strictfp((Class_9848)class_27129);
        List list = Class_2457.Method_2530().Method_2616().Method_3141(string);
        Object[] arrobject = new String[list.size()];
        int n = 8256 & -28100;
        for (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 : list) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20817("You have been IP banned.");
            arrobject[n++] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `();
        }
        if (list.isEmpty()) {
            Object[] arrobject2 = new Object[20353 & 8197];
            arrobject2[4568 & -31231] = string;
            Class_38589.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.banip.success", (Object[])arrobject2);
        } else {
            Object[] arrobject3 = new Object[-31726 & 29255];
            arrobject3[4303 & -22240] = string;
            arrobject3[81 & -23381] = Class_38589.\u0000strictfp((Object[])arrobject);
            Class_38589.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.banip.success.players", (Object[])arrobject3);
        }
    }

    private void Method_38596() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_38597(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (16657 & 4705) ? Class_38589.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : null;
    }

    public String Method_38598(Class_1367 class_1367) {
        return "commands.banip.usage";
    }

    private static String Method_38599(String string) {
        int n = 18955;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38589.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

