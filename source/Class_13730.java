/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Class_13730 {
    private String[] Field_13731 = new String[8810 & -31723];
    private long Field_13732 = -8954803692411793915L & 8954803690440098194L;
    public ArrayList Field_13733 = new ArrayList();
    private Class_11220 Field_13734;

    private void Method_13735() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_13730.Method_13737("\ue400\ue40a\ue420\ue40a\ue420\ue428\ue422\ue420\ue422\ue42a\ue408\ue428\ue42a\ue422"));
    }

    private void Method_13736(Class_1378 class_1378, String string) {
        Class_14775 class_14775 = Class_14775.Field_14780;
        if (!class_14775.Method_14787(string)) {
            class_1378.Field_1387.Field_105.Method_45458().Method_41172(class_14775.Method_14798(), 109 & 24581);
            return;
        }
        long l = System.currentTimeMillis();
        if (l - this.Field_13732 < class_14775.Method_14826()) {
            class_1378.Field_1387.Field_105.Method_45458().Method_41172(class_14775.Method_14804(), -30716 & 1285);
            return;
        }
        this.Field_13732 = l;
        class_1378.Method_1414(string);
    }

    private static String Method_13737(String string) {
        int n = 7754;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13730.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_13738() {
        Class_18 class_18 = Class_18.Field_89;
        if (class_18 == null) {
            return;
        }
        Class_1378 class_1378 = class_18.Field_48;
        if (class_1378 == null) {
            return;
        }
        for (int i = 8452 & 4136; i < this.Field_13733.size(); ++i) {
            if (!((Class_8264)this.Field_13733.get(i)).Method_8288()) continue;
            this.Method_13736(class_1378, this.Field_13731[i]);
        }
    }

    private static String Method_13739(String string) {
        int n = 25643;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13730.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_13730(Class_11220 class_11220) {
        this.Field_13734 = class_11220;
    }

    public void Method_13740() {
        Class_8264.Field_8269.removeAll(this.Field_13733);
        this.Field_13733.clear();
        ArrayList arrayList = (ArrayList)this.Field_13734.Method_11230();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.Field_13731 = new String[arrayList.size() / (9218 & 66)];
        for (int i = 18816 & -32736; i < arrayList.size() / (-25837 & 16546); ++i) {
            this.Field_13731[i] = (String)arrayList.get(i * (18690 & 4626));
            String string = (String)arrayList.get(i * (12291 & 19674) + (-15359 & 13217));
            int n = string.isEmpty() ? 26945 & -31180 : Integer.parseInt(string);
            this.Field_13733.add(new Class_8264(Class_13730.Method_13739("\u08a4\u08a9\u08a6\u08a3\u08a8\u08a9\u08a6") + i, n, null));
        }
        Class_8264.Method_8281();
    }
}

