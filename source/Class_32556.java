/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_32556
implements Class_1486 {
    private byte Field_32557;
    private int Field_32558;
    private int Field_32559;
    private int Field_32560;
    private int Field_32561;
    private Class_33699[] Field_32562;
    private int Field_32563;
    private byte[] Field_32564;

    public Class_32556(int n, byte by, Collection collection, byte[] arrby, int n2, int n3, int n4, int n5) {
        this.Field_32561 = n;
        this.Field_32557 = by;
        this.Field_32562 = collection.toArray(new Class_33699[collection.size()]);
        this.Field_32559 = n2;
        this.Field_32563 = n3;
        this.Field_32560 = n4;
        this.Field_32558 = n5;
        this.Field_32564 = new byte[n4 * n5];
        for (int i = 18464 & -24499; i < n4; ++i) {
            for (int j = 4096 & 16388; j < n5; ++j) {
                this.Field_32564[i + j * n4] = arrby[n2 + i + (n3 + j) * (24734 & 6529)];
            }
        }
    }

    private void Method_32565() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32566(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_32561);
        class_29900.Method_29949(this.Field_32557);
        class_29900.Method_29982(this.Field_32562.length);
        Class_33699[] arrclass_33699 = this.Field_32562;
        int n = arrclass_33699.length;
        for (int i = -27831 & 130; i < n; ++i) {
            Class_33699 class_33699 = arrclass_33699[i];
            class_29900.Method_29949((class_33699.Method_33704() & (-32049 & 4111)) << (7205 & 270) | class_33699.Method_33705() & (815 & 17567));
            class_29900.Method_29949(class_33699.Method_33709());
            class_29900.Method_29949(class_33699.Method_33706());
        }
        class_29900.Method_29949(this.Field_32560);
        if (this.Field_32560 > 0) {
            class_29900.Method_29949(this.Field_32558);
            class_29900.Method_29949(this.Field_32559);
            class_29900.Method_29949(this.Field_32563);
            class_29900.Method_29946(this.Field_32564);
        }
    }

    public void Method_32567(Class_33760 class_33760) {
        int n;
        class_33760.Field_33767 = this.Field_32557;
        class_33760.Field_33768.clear();
        for (n = 3844 & 8392; n < this.Field_32562.length; ++n) {
            Class_33699 class_33699 = this.Field_32562[n];
            class_33760.Field_33768.put("icon-" + n, class_33699);
        }
        for (n = 272 & 3296; n < this.Field_32560; ++n) {
            for (int i = 1794 & 16400; i < this.Field_32558; ++i) {
                class_33760.Field_33761[this.Field_32559 + n + (this.Field_32563 + i) * (1198 & 18561)] = this.Field_32564[n + i * this.Field_32560];
            }
        }
    }

    public void Method_32568(Class_14856 class_14856) {
        class_14856.Method_14888(this);
    }

    public void Method_32569(Class_10954 class_10954) {
        this.Method_32568((Class_14856)class_10954);
    }

    public Class_32556() {
    }

    public int Method_32570() {
        return this.Field_32561;
    }

    public void Method_32571(Class_29900 class_29900) {
        this.Field_32561 = class_29900.Method_30004();
        this.Field_32557 = class_29900.Method_29944();
        this.Field_32562 = new Class_33699[class_29900.Method_30004()];
        for (int i = 18 & -11483; i < this.Field_32562.length; ++i) {
            short s = class_29900.Method_29944();
            this.Field_32562[i] = new Class_33699((byte)(s >> (16388 & -31460) & (863 & 143)), class_29900.Method_29944(), class_29900.Method_29944(), (byte)(s & (543 & 9423)));
        }
        this.Field_32560 = class_29900.Method_30016();
        if (this.Field_32560 > 0) {
            this.Field_32558 = class_29900.Method_30016();
            this.Field_32559 = class_29900.Method_30016();
            this.Field_32563 = class_29900.Method_30016();
            this.Field_32564 = class_29900.Method_29950();
        }
    }
}

