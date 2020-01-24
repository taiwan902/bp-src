/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ 
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ $ native private ` final ] 2 extends float ? boolean
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import java.util.List;

public class Class_29859 {
    private Class_3436 Field_29860;
    private int Field_29861 = -1 & -1;
    private Class_39702 Field_29862;
    private boolean[] Field_29863 = null;
    private BitSet Field_29864 = new BitSet(-15549 & 147);
    private int Field_29865 = -1 & -1;
    private \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean Field_29866 = null;
    private static ThreadLocal Field_29867 = new ThreadLocal();
    private float[] Field_29868 = new float[Class_4595.Field_4600.length * (18 & 78)];
    private Class_18559 Field_29869 = new Class_18559();
    private Class_561 Field_29870;
    private \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean Field_29871 = null;
    private Class_4751 Field_29872;
    private int Field_29873 = -1 & -1;

    public int Method_29874() {
        if (this.Field_29861 < 0) {
            this.Field_29861 = Class_3238.Method_3435(this.Field_29860.Method_3442());
        }
        return this.Field_29861;
    }

    public boolean Method_29875() {
        return (this.Field_29865 == (2649 & 8451) ? 8581 & 1 : 16466 & 3616) != 0;
    }

    public \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean Method_29876() {
        if (this.Field_29871 == null) {
            this.Field_29871 = new \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean(6 & -22248, 1024 & 708, 640 & -24512);
        }
        return this.Field_29871;
    }

    public float[] Method_29877() {
        return this.Field_29868;
    }

    public Class_3436 Method_29878() {
        return this.Field_29860;
    }

    public boolean Method_29879(List list) {
        if (this.Field_29865 < 0 && list.size() > 0) {
            this.Field_29865 = list.get(1123 & -22504) instanceof Class_39435 ? 9473 & 6147 : 16432 & -19322;
        }
        return (this.Field_29865 == (541 & -32607) ? 21539 & -23847 : 4650 & 11328) != 0;
    }

    public BitSet Method_29880() {
        return this.Field_29864;
    }

    private Class_29859(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751) {
        this.Field_29870 = class_561;
        this.Field_29860 = class_3436;
        this.Field_29872 = class_4751;
        this.Field_29862 = Class_19426.Method_19571();
    }

    public Class_18559 Method_29881() {
        return this.Field_29869;
    }

    private void Method_29882() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_29859 Method_29883(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751) {
        Class_29859 class_29859 = (Class_29859)Field_29867.get();
        if (class_29859 == null) {
            class_29859 = new Class_29859(class_561, class_3436, class_4751);
            Field_29867.set(class_29859);
            return class_29859;
        }
        class_29859.Method_29886(class_561, class_3436, class_4751);
        return class_29859;
    }

    public boolean[] Method_29884() {
        if (this.Field_29863 == null) {
            this.Field_29863 = new boolean[6 & 1572];
        }
        return this.Field_29863;
    }

    public int Method_29885() {
        if (this.Field_29873 < 0) {
            this.Field_29873 = this.Field_29860.Method_3442().Method_3434(this.Field_29860);
        }
        return this.Field_29873;
    }

    private void Method_29886(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751) {
        this.Field_29870 = class_561;
        this.Field_29860 = class_3436;
        this.Field_29872 = class_4751;
        this.Field_29861 = -1 & -1;
        this.Field_29873 = -1 & -1;
        this.Field_29865 = -1 & -1;
        this.Field_29864.clear();
    }
}

