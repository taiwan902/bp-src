/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_40073
implements Class_1486 {
    private int[] Field_40074;
    private boolean Field_40075;
    private Class_6101[] Field_40076;
    private int[] Field_40077;

    public Class_40073(List list) {
        int n = list.size();
        this.Field_40077 = new int[n];
        this.Field_40074 = new int[n];
        this.Field_40076 = new Class_6101[n];
        this.Field_40075 = !((Class_17665)list.get((int)(508 & 5632))).Method_17708().Field_284.Method_18370() ? -30943 & 18501 : -24300 & 1537;
        for (int i = -27554 & 16512; i < n; ++i) {
            Class_17665 class_17665 = (Class_17665)list.get(i);
            Class_6101 class_6101 = Class_36853.Method_36859(class_17665, (-24571 & 17025) != 0, this.Field_40075, -1476198401 & 655359);
            this.Field_40077[i] = class_17665.Field_17666;
            this.Field_40074[i] = class_17665.Field_17668;
            this.Field_40076[i] = class_6101;
        }
    }

    public void Method_40078(Class_14856 class_14856) {
        class_14856.Method_14883(this);
    }

    public int Method_40079(int n) {
        return this.Field_40076[n].Field_6103;
    }

    private void Method_40080() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40081(Class_29900 class_29900) {
        int n;
        this.Field_40075 = class_29900.Method_29962();
        int n2 = class_29900.Method_30004();
        this.Field_40077 = new int[n2];
        this.Field_40074 = new int[n2];
        this.Field_40076 = new Class_6101[n2];
        for (n = -22525 & 4272; n < n2; ++n) {
            this.Field_40077[n] = class_29900.Method_29914();
            this.Field_40074[n] = class_29900.Method_29914();
            this.Field_40076[n] = new Class_6101();
            this.Field_40076[n].Field_6103 = class_29900.Method_30008() & (-1006436353 & 286326783);
            this.Field_40076[n].Field_6102 = new byte[Class_36853.Method_36864(Integer.bitCount(this.Field_40076[n].Field_6103), this.Field_40075, (5379 & 27297) != 0)];
        }
        for (n = 4276 & 10; n < n2; ++n) {
            class_29900.Method_29904(this.Field_40076[n].Field_6102);
        }
    }

    public void Method_40082(Class_29900 class_29900) {
        int n;
        class_29900.Method_29980(this.Field_40075);
        class_29900.Method_29982(this.Field_40076.length);
        for (n = 3140 & 8480; n < this.Field_40077.length; ++n) {
            class_29900.Method_30010(this.Field_40077[n]);
            class_29900.Method_30010(this.Field_40074[n]);
            class_29900.Method_29922((short)(this.Field_40076[n].Field_6103 & (84213759 & 1511587839)));
        }
        for (n = 1536 & -22360; n < this.Field_40077.length; ++n) {
            class_29900.Method_29903(this.Field_40076[n].Field_6102);
        }
    }

    public int Method_40083(int n) {
        return this.Field_40074[n];
    }

    public int Method_40084() {
        return this.Field_40077.length;
    }

    public int Method_40085(int n) {
        return this.Field_40077[n];
    }

    public byte[] Method_40086(int n) {
        return this.Field_40076[n].Field_6102;
    }

    public void Method_40087(Class_10954 class_10954) {
        this.Method_40078((Class_14856)class_10954);
    }

    public Class_40073() {
    }
}

