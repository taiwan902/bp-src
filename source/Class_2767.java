/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_2767 {
    private static final int Field_2768;
    public final ArrayList Field_2769 = new ArrayList();
    private static final int Field_2770;
    private boolean Field_2771 = this.Field_2777 = 12953 & 18433;
    private static final int Field_2772;
    public boolean Field_2773;
    private final ArrayList Field_2774 = new ArrayList();
    private static final Logger Field_2775;
    private static final int Field_2776;
    public boolean Field_2777;
    private static final int Field_2778;
    private final HashMap Field_2779 = new HashMap();
    private String Field_2780 = "";

    private static String Method_2781(String string) {
        int n = 4750;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2767.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2782(String string) {
        int n = 28097;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2767.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2783(String string) {
        if (this.Field_2771) {
            this.Method_2790();
            this.Method_2789(string);
        }
    }

    static {
        Field_2775 = LogManager.getLogger();
        Field_2772 = Class_2767.Method_2786("\u0106\u0117\u011d\u0111\u0111\u0101\u0119\u0111\u0119\u0139\u0105\u0119\u011e\u0109\u0109\u011d\u0117\u0118\u0110\u0107").hashCode();
        Field_2768 = Class_2767.Method_2785("\uc811\uc801\uc800\uc801").hashCode();
        Field_2778 = Class_2767.Method_2782("\u04a6\u04a4\u04a1\u0486\u04a7\u04ac\u04a4\u04a5\u04a4\u0483\u04a6\u04a6\u04ad\u04a0\u04a3").hashCode();
        Field_2776 = Class_2767.Method_2781("\u15a7\u15a0\u15a3\u15a1\u15a0\u15a7").hashCode();
        Field_2770 = Class_2767.Method_2791("\u215a\u2152\u2148\u214a\u2152\u215a\u2142").hashCode();
    }

    public String Method_2784() {
        return this.Field_2769.size() == 0 ? "[UNKNOWN]" : (String)this.Field_2769.get(this.Field_2769.size() - (113 & 4109));
    }

    private static String Method_2785(String string) {
        int n = 31156;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2767.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2786(String string) {
        int n = 16741;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2767.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public List Method_2787(String string) {
        this.Field_2771 = this.Field_2777;
        if (!this.Field_2771) {
            Class_16340[] arrclass_16340 = new Class_16340[11 & 6465];
            arrclass_16340[25624 & 769] = new Class_16340("root", 0.0, 0.0);
            return new ArrayList<Class_16340>(Arrays.asList(arrclass_16340));
        }
        if (!this.Field_2773) {
            return null;
        }
        long l = this.Field_2779.containsKey("root") ? (Long)this.Field_2779.get("root") : 68L & 8051089L;
        long l2 = this.Field_2779.containsKey(string) ? (Long)this.Field_2779.get(string) : -1L & -1L;
        ArrayList<Class_16340> arrayList = new ArrayList<Class_16340>();
        if (string.length() > 0) {
            string = string + ".";
        }
        long l3 = 563184019L & 4802481377602049088L;
        for (Object object : this.Field_2779.keySet()) {
            if (((String)object).length() <= string.length() || !((String)object).startsWith(string) || ((String)object).indexOf(".", string.length() + (1109 & 22531)) >= 0) continue;
            l3 += ((Long)this.Field_2779.get(object)).longValue();
        }
        float f = l3;
        if (l3 < l2) {
            l3 = l2;
        }
        if (l < l3) {
            l = l3;
        }
        for (Object e : this.Field_2779.keySet()) {
            String string2 = (String)e;
            if (string2.length() <= string.length() || !string2.startsWith(string) || string2.indexOf(".", string.length() + (8801 & -31599)) >= 0) continue;
            long l4 = (Long)this.Field_2779.get(string2);
            double d = (double)l4 * (18.4 * 5.434782608695652) / (double)l3;
            double d2 = (double)l4 * (1.15 * 86.95652173913044) / (double)l;
            String string3 = string2.substring(string.length());
            arrayList.add(new Class_16340(string3, d, d2));
        }
        for (Object e : this.Field_2779.keySet()) {
            this.Field_2779.put(e, (Long)this.Field_2779.get(e) * (-5370322934583385161L & 5370322933296193462L) / (1115319109015831528L & 570426344L));
        }
        if ((float)l3 > f) {
            arrayList.add(new Class_16340("unspecified", (double)((float)l3 - f) * (0.6956521739130435 * 143.75) / (double)l3, (double)((float)l3 - f) * (79.16666666666667 * 1.263157894736842) / (double)l));
        }
        Collections.sort(arrayList);
        arrayList.add(641 & 21792, new Class_16340(string, 138.63636363636363 * 0.7213114754098361, (double)l3 * (0.8275862068965517 * 120.83333333333333) / (double)l));
        return arrayList;
    }

    private void Method_2788() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_2789(String string) {
        int n;
        if (Class_9967.Method_10000()) {
            n = string.hashCode();
            if (n == Field_2772 && string.equals("scheduledExecutables")) {
                Class_9967.Field_9977.Method_35684();
            } else if (n == Field_2768 && string.equals("tick") && Class_19426.Method_19542()) {
                Class_9967.Field_9977.Method_35682();
                Class_9967.Field_9997.Method_35684();
            } else if (n == Field_2778 && string.equals("preRenderErrors")) {
                Class_9967.Field_9997.Method_35682();
            }
        }
        if (Class_19426.Method_19562()) {
            n = string.hashCode();
            if (n == Field_2776 && string.equals("render")) {
                Class_16867.Field_16897 = 1537 & 22536;
            } else if (n == Field_2770 && string.equals("display")) {
                Class_16867.Field_16897 = 145 & -6099;
            }
        }
        if (this.Field_2771 && this.Field_2773) {
            if (this.Field_2780.length() > 0) {
                this.Field_2780 = this.Field_2780 + ".";
            }
            this.Field_2780 = this.Field_2780 + string;
            this.Field_2769.add(this.Field_2780);
            this.Field_2774.add(System.nanoTime());
        }
    }

    public void Method_2790() {
        if (this.Field_2771 && this.Field_2773) {
            long l = System.nanoTime();
            long l2 = (Long)this.Field_2774.remove(this.Field_2774.size() - (14635 & 149));
            this.Field_2769.remove(this.Field_2769.size() - (33 & 12161));
            long l3 = l - l2;
            if (this.Field_2779.containsKey(this.Field_2780)) {
                this.Field_2779.put(this.Field_2780, (Long)this.Field_2779.get(this.Field_2780) + l3);
            } else {
                this.Field_2779.put(this.Field_2780, l3);
            }
            if (l3 > (-2863147302196580856L & 16033040L)) {
                Field_2775.warn("Something's taking too long! '" + this.Field_2780 + "' took aprox " + (double)l3 / (1.1590909090909092 * 862745.0980392157) + " ms");
            }
            this.Field_2780 = !this.Field_2769.isEmpty() ? (String)this.Field_2769.get(this.Field_2769.size() - (25349 & -30671)) : "";
        }
    }

    private static String Method_2791(String string) {
        int n = 30834;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2767.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2792() {
        this.Field_2779.clear();
        this.Field_2780 = "";
        this.Field_2769.clear();
        this.Field_2771 = this.Field_2777;
    }
}

