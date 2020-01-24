/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_8585 {
    public Class_6975 Field_8586;
    public boolean Field_8587 = 19841 & 4165;
    public String Field_8588 = "";

    public void Method_8589(byte[] arrby) {
        try {
            this.Field_8586 = Class_8534.Method_8539(arrby);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void Method_8590(byte[] arrby) {
        if (arrby.length == (1 & 27233)) {
            this.Field_8587 = arrby[16384 & 416] != 0 ? -30463 & 4695 : 25601 & 4100;
        } else if (arrby.length > 0) {
            this.Field_8587 = arrby[384 & 21088] == (-15115 & 12406) || arrby[16483 & 10248] == (4180 & -13996) ? 401 & 7203 : -16054 & 0;
        }
    }

    private void Method_8591() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_8592(int n, int n2, int n3, boolean bl) {
        Class_36637 class_36637;
        if (this.Field_8586 != null && (class_36637 = Class_6975.Method_6984(this.Field_8586, new Class_36054(n, n3), bl)) != null) {
            String string = class_36637.Method_36645();
            this.Method_8598(string);
            return (1224 & 2086) != 0;
        }
        if (!this.Field_8587) {
            this.Method_8598(this.Field_8588);
        }
        return this.Field_8587;
    }

    public void Method_8593(byte[] arrby) {
        try {
            List list = Class_8534.Method_8542(arrby);
            if (this.Field_8586 != null) {
                ArrayList arrayList = new ArrayList();
                this.Field_8586.Method_6988(arrayList);
                ArrayList<Class_36637> arrayList2 = new ArrayList<Class_36637>();
                for (Class_36637 class_36637 : arrayList) {
                    int n = 16450 & 8997;
                    for (Class_36637 class_366372 : list) {
                        if (!class_36637.Method_36644(class_366372)) continue;
                        n = 17429 & 299;
                        break;
                    }
                    if (n != 0) continue;
                    arrayList2.add(class_36637);
                }
                this.Field_8586 = new Class_6975(10248 & 20993, this.Field_8586.Method_6986());
                for (Class_36637 class_36637 : arrayList2) {
                    this.Field_8586.Method_6983(class_36637);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String Method_8594(Class_4751 class_4751, boolean bl) {
        return this.Method_8600(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), bl);
    }

    public boolean Method_8595(Class_4751 class_4751, boolean bl) {
        return this.Method_8592(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), bl);
    }

    public void Method_8596() {
        this.Field_8588 = "";
        this.Field_8586 = null;
        this.Field_8587 = 10241 & -32095;
    }

    public void Method_8597(String string) {
        this.Field_8588 = string;
    }

    public void Method_8598(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        Class_41159 class_41159 = Class_18.Field_89.Field_105.Method_45458();
        if (!class_41159.Field_41162.isEmpty() && ((Class_15106)class_41159.Field_41162.get(8704 & -16316)).Method_15112() != (-32765 & 2051)) {
            try {
                Class_18.Field_89.Field_105.Method_45458().Method_41172(Class_2814.Method_2819(string), 26627 & 1411);
            }
            catch (Exception exception) {
                Class_18.Field_89.Field_105.Method_45458().Method_41172(new Class_2840(string), -20477 & 2379);
            }
        }
    }

    public void Method_8599(byte[] arrby) {
        try {
            List list = Class_8534.Method_8542(arrby);
            if (this.Field_8586 != null) {
                for (Class_36637 class_36637 : list) {
                    this.Field_8586.Method_6983(class_36637);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String Method_8600(int n, int n2, int n3, boolean bl) {
        Class_36637 class_36637;
        if (this.Field_8586 != null && (class_36637 = Class_6975.Method_6984(this.Field_8586, new Class_36054(n, n3), bl)) != null) {
            return class_36637.Method_36645();
        }
        return this.Field_8588;
    }
}

