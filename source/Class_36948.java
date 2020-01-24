/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class_36948
extends Class_26535 {
    private int Field_36949;
    private int Field_36950;
    private Class_23823 Field_36951;

    public static void Method_36952(Random random, List list, Class_4961 class_4961, int n) {
        for (int i = 1 & 27082; i < n; ++i) {
            Class_36948 class_36948 = (Class_36948)Class_27139.Method_27144(random, list);
            int n2 = class_36948.Field_36950 + random.nextInt(class_36948.Field_36949 - class_36948.Field_36950 + (5 & 9041));
            if (class_36948.Field_36951.Method_23837() >= n2) {
                Class_23823 class_23823 = class_36948.Field_36951.Method_23850();
                class_23823.Field_23826 = n2;
                class_4961.Method_4963(random.nextInt(class_4961.Method_4968()), class_23823);
                continue;
            }
            for (int j = 521 & 5314; j < n2; ++j) {
                Class_23823 class_23823 = class_36948.Field_36951.Method_23850();
                class_23823.Field_23826 = 641 & -24521;
                class_4961.Method_4963(random.nextInt(class_4961.Method_4968()), class_23823);
            }
        }
    }

    private void Method_36953() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_36948(Class_1956 class_1956, int n, int n2, int n3, int n4) {
        super(n4);
        this.Field_36951 = new Class_23823(class_1956, 4107 & 25137, n);
        this.Field_36950 = n2;
        this.Field_36949 = n3;
    }

    public static void Method_36954(Random random, List list, Class_4933 class_4933, int n) {
        for (int i = -32744 & 8704; i < n; ++i) {
            Class_36948 class_36948 = (Class_36948)Class_27139.Method_27144(random, list);
            int n2 = class_36948.Field_36950 + random.nextInt(class_36948.Field_36949 - class_36948.Field_36950 + (8225 & 3285));
            if (class_36948.Field_36951.Method_23837() >= n2) {
                Class_23823 class_23823 = class_36948.Field_36951.Method_23850();
                class_23823.Field_23826 = n2;
                class_4933.Method_4956(random.nextInt(class_4933.Method_4955()), class_23823);
                continue;
            }
            for (int j = 356 & 27656; j < n2; ++j) {
                Class_23823 class_23823 = class_36948.Field_36951.Method_23850();
                class_23823.Field_23826 = 7 & 4305;
                class_4933.Method_4956(random.nextInt(class_4933.Method_4955()), class_23823);
            }
        }
    }

    public Class_36948(Class_23823 class_23823, int n, int n2, int n3) {
        super(n3);
        this.Field_36951 = class_23823;
        this.Field_36950 = n;
        this.Field_36949 = n2;
    }

    public static List Method_36955(List list, Class_36948 ... arrclass_36948) {
        ArrayList arrayList = Lists.newArrayList((Iterable)list);
        Collections.addAll(arrayList, arrclass_36948);
        return arrayList;
    }
}

