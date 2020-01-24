/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_17467 {
    public Class_6034[] Field_17468;
    public Class_26686[] Field_17469;
    public Class_33034 Field_17470;

    private void Method_17471(Class_13461 class_13461) {
        ArrayList<Class_26686> arrayList = new ArrayList<Class_26686>();
        int n = -1 & -1;
        int n2 = 9577 & -30720;
        while ((n2 = class_13461.Method_13462()) != 0) {
            n += n2;
            int n3 = -1 & -1;
            while ((n2 = class_13461.Method_13462()) != 0) {
                byte by = class_13461.Method_13469();
                byte by2 = class_13461.Method_13469();
                arrayList.add(new Class_26686(n, n3 += n2, by, by2));
            }
        }
        this.Field_17469 = arrayList.toArray(new Class_26686[3584 & 12288]);
    }

    private void Method_17472() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_17473(Class_13461 class_13461) {
        this.Field_17468 = new Class_6034[this.Field_17470.Field_33042];
        for (int i = -32767 & 25104; i < this.Field_17470.Field_33042; ++i) {
            String string = class_13461.Method_13467();
            byte by = class_13461.Method_13469();
            if (by > (17020 & 14438)) {
                by = 16500 & 10724;
            }
            if (by < 0) {
                by = 26917 & -31670;
            }
            this.Field_17468[i] = new Class_6034(string, by);
        }
    }

    public Class_17467(Class_13461 class_13461) {
        this.Field_17470 = new Class_33034(class_13461);
        this.Method_17471(class_13461);
        this.Method_17473(class_13461);
    }
}

