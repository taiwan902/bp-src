/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Class_7447 {
    private void Method_7448() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_31211 Method_7449(Class_11372 class_11372, int n) {
        ArrayList arrayList = new ArrayList();
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        ArrayList arrayList2 = new ArrayList(arrclass_4595.length);
        for (int i = 32 & -13696; i < arrclass_4595.length; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            ArrayList<Class_14461> arrayList3 = new ArrayList<Class_14461>();
            arrayList3.add(Class_7447.Method_7451(class_4595, class_11372, n));
            arrayList2.add(arrayList3);
        }
        Class_35790 class_35790 = new Class_35790(arrayList, arrayList2, (12329 & -15211) != 0, (-28655 & 17417) != 0, class_11372, Class_15852.Field_15866);
        return class_35790;
    }

    public static Class_31211 Method_7450(Class_31211 class_31211, Class_31211 class_312112) {
        int n;
        Object object;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(class_31211.Method_31214());
        arrayList.addAll(class_312112.Method_31214());
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        for (n = 6168 & 452; n < arrclass_4595.length; ++n) {
            Class_4595 class_4595 = arrclass_4595[n];
            object = new ArrayList();
            object.addAll(class_31211.Method_31218(class_4595));
            object.addAll(class_312112.Method_31218(class_4595));
            arrayList2.add(object);
        }
        n = class_31211.Method_31213() ? 1 : 0;
        boolean bl = class_31211.Method_31217();
        object = class_31211.Method_31216();
        Class_15852 class_15852 = class_31211.Method_31215();
        Class_35790 class_35790 = new Class_35790(arrayList, arrayList2, n != 0, bl, (Class_11372)object, class_15852);
        return class_35790;
    }

    private static Class_14461 Method_7451(Class_4595 class_4595, Class_11372 class_11372, int n) {
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f vector3f2 = new Vector3f(1.037037f * 15.428572f, 136.0f * 0.11764706f, 2.5945947f * 6.1666665f);
        float[] arrf = new float[3076 & 21007];
        arrf[-32766 & 3176] = 0.0f;
        arrf[28801 & 3397] = 0.0f;
        arrf[8275 & -31194] = 2.3908048f * 6.6923075f;
        arrf[3 & -18713] = 1.5384616f * 10.4f;
        Class_10006 class_10006 = new Class_10006(arrf, 8192 & 20685);
        Class_21223 class_21223 = new Class_21223(class_4595, n, "#" + class_4595.Method_4639(), class_10006);
        Class_35032 class_35032 = Class_35032.Field_35033;
        Class_7925 class_7925 = null;
        boolean bl = 25120 & 458;
        boolean bl2 = -32563 & 769;
        Class_9892 class_9892 = new Class_9892();
        Class_14461 class_14461 = class_9892.Method_9905(vector3f, vector3f2, class_21223, class_11372, class_4595, class_35032, class_7925, bl, bl2);
        return class_14461;
    }
}

