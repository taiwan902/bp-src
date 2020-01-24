/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ObjectUtils
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;

public class Class_32695 {
    private boolean Field_32696;
    private final Class_1061 Field_32697;
    private static int[] Field_32698;
    private static final Map Field_32699;
    private boolean Field_32700 = 10501 & 4729;
    private final Class_26668[] Field_32701 = new Class_26668[20580 & -32478];

    public static void Method_32702(List list, Class_29900 class_29900) {
        if (list != null) {
            for (Class_26668 class_26668 : list) {
                Class_32695.Method_32724(class_29900, class_26668);
            }
        }
        class_29900.Method_29949(26623 & -26497);
    }

    private Class_26668 Method_32703(int n) {
        Class_26668 class_26668 = this.Field_32701[n];
        return class_26668;
    }

    public void Method_32704(int n, Object object) {
        Class_26668 class_26668 = this.Method_32703(n);
        if (ObjectUtils.notEqual((Object)object, (Object)class_26668.Method_26676())) {
            class_26668.Method_26674(object);
            this.Field_32697.Method_1355(n);
            class_26668.Method_26673((10245 & 97) != 0);
            this.Field_32696 = 1057 & 193;
        }
    }

    public void Method_32705(List list) {
        for (Class_26668 class_26668 : list) {
            int n = class_26668.Method_26679();
            Class_26668 class_266682 = this.Field_32701[n];
            if (class_266682 == null) continue;
            class_266682.Method_26674(class_26668.Method_26676());
            this.Field_32697.Method_1355(class_26668.Method_26679());
        }
        this.Field_32696 = 25153 & 133;
    }

    private int Method_32706(Class class_) {
        int n = class_.hashCode();
        for (int i = 12320 & 16904; i < (12556 & -16280); ++i) {
            if (Field_32698[i] != n) continue;
            return i;
        }
        return -1 & -1;
    }

    public List Method_32707() {
        ArrayList arrayList = null;
        for (int i = 4514 & 11857; i < this.Field_32701.length; ++i) {
            Class_26668 class_26668 = this.Field_32701[i];
            if (class_26668 == null) continue;
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add(class_26668);
        }
        return arrayList;
    }

    public byte Method_32708(int n) {
        return (Byte)this.Method_32703(n).Method_26676();
    }

    public void Method_32709() {
        this.Field_32696 = 32 & 10768;
    }

    public Class_32695(Class_1061 class_1061) {
        this.Field_32697 = class_1061;
    }

    public int Method_32710(int n) {
        return (Integer)this.Method_32703(n).Method_26676();
    }

    public String Method_32711(int n) {
        return (String)this.Method_32703(n).Method_26676();
    }

    static void Method_32712(Class class_, int n) {
        Class_32695.Field_32698[n] = class_.hashCode();
    }

    public Class_13635 Method_32713(int n) {
        return (Class_13635)this.Method_32703(n).Method_26676();
    }

    public void Method_32714(int n) {
        Class_26668.Method_26678(this.Method_32703(n), (-24447 & 2129) != 0);
        this.Field_32696 = 257 & 4233;
    }

    public boolean Method_32715() {
        return this.Field_32696;
    }

    public void Method_32716(Class_29900 class_29900) {
        for (int i = 1152 & 6760; i < this.Field_32701.length; ++i) {
            Class_26668 class_26668 = this.Field_32701[i];
            if (class_26668 == null) continue;
            Class_32695.Method_32724(class_29900, class_26668);
        }
        class_29900.Method_29949(5503 & 2175);
    }

    public static List Method_32717(Class_29900 class_29900) {
        ArrayList arrayList = null;
        byte by = class_29900.Method_29944();
        while (by != (18303 & 14591)) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            int n = (by & (-23327 & 2546)) >> (-32475 & 12309);
            int n2 = by & (1855 & -32673);
            Class_26668 class_26668 = null;
            switch (n) {
                case 0: {
                    class_26668 = new Class_26668(n, n2, class_29900.Method_29944());
                    break;
                }
                case 1: {
                    class_26668 = new Class_26668(n, n2, class_29900.Method_30008());
                    break;
                }
                case 2: {
                    class_26668 = new Class_26668(n, n2, class_29900.Method_29914());
                    break;
                }
                case 3: {
                    class_26668 = new Class_26668(n, n2, Float.valueOf(class_29900.Method_29966()));
                    break;
                }
                case 4: {
                    class_26668 = new Class_26668(n, n2, class_29900.Method_29991(32767 & 32767));
                    break;
                }
                case 5: {
                    class_26668 = new Class_26668(n, n2, class_29900.Method_30002());
                    break;
                }
                case 6: {
                    int n3 = class_29900.Method_29914();
                    int n4 = class_29900.Method_29914();
                    int n5 = class_29900.Method_29914();
                    class_26668 = new Class_26668(n, n2, new Class_4751(n3, n4, n5));
                    break;
                }
                case 7: {
                    float f = class_29900.Method_29966();
                    float f2 = class_29900.Method_29966();
                    float f3 = class_29900.Method_29966();
                    class_26668 = new Class_26668(n, n2, new Class_13635(f, f2, f3));
                }
            }
            arrayList.add(class_26668);
            by = class_29900.Method_29944();
        }
        return arrayList;
    }

    public Class_23823 Method_32718(int n) {
        return (Class_23823)this.Method_32703(n).Method_26676();
    }

    public void Method_32719(int n, Object object) {
        Class_26668 class_26668;
        int n2 = this.Method_32706(object.getClass());
        if (n2 == (-1 & -1)) {
            throw new IllegalArgumentException("Unknown data type: " + object.getClass());
        }
        if (n > (17503 & 4127)) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + (-15745 & 5535) + ")");
        }
        if (this.Field_32701[n] != null) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        this.Field_32701[n] = class_26668 = new Class_26668(n2, n, object);
        this.Field_32700 = 2098 & -27388;
    }

    public boolean Method_32720() {
        return this.Field_32700;
    }

    public void Method_32721(int n, Object object) {
        Class_26668 class_26668;
        int n2 = this.Method_32706(object.getClass());
        if (n2 == (-1 & -1)) {
            throw new IllegalArgumentException("Unknown data type: " + object.getClass());
        }
        if (n > (95 & -21473)) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + (8223 & 2175) + ")");
        }
        if (this.Field_32701[n] != null) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        this.Field_32701[n] = class_26668 = new Class_26668(n2, n, object);
        this.Field_32700 = 2337 & 5632;
    }

    static {
        Field_32699 = Maps.newHashMap();
        Field_32698 = new int[652 & 24600];
        Class_32695.Method_32712(Byte.class, 17424 & -32344);
        Class_32695.Method_32712(Short.class, 21697 & -32473);
        Class_32695.Method_32712(Integer.class, -20413 & 1026);
        Class_32695.Method_32712(Float.class, -21941 & 4103);
        Class_32695.Method_32712(String.class, 2124 & 5127);
        Class_32695.Method_32712(Class_23823.class, 6149 & -32107);
        Class_32695.Method_32712(Class_4751.class, -28570 & 16398);
        Class_32695.Method_32712(Class_13635.class, 7 & 22119);
        Field_32699.put(Byte.class, 460 & -26624);
        Field_32699.put(Short.class, 13 & 6147);
        Field_32699.put(Integer.class, 7939 & 130);
        Field_32699.put(Float.class, -32245 & 8243);
        Field_32699.put(String.class, 12484 & 16647);
        Field_32699.put(Class_23823.class, 3781 & 8221);
        Field_32699.put(Class_4751.class, 1198 & -32505);
        Field_32699.put(Class_13635.class, 559 & 8343);
    }

    public float Method_32722(int n) {
        return ((Float)this.Method_32703(n).Method_26676()).floatValue();
    }

    public short Method_32723(int n) {
        return (Short)this.Method_32703(n).Method_26676();
    }

    private static void Method_32724(Class_29900 class_29900, Class_26668 class_26668) {
        int n = (class_26668.Method_26680() << (-16379 & 8199) | class_26668.Method_26679() & (95 & -6881)) & (-32001 & 14591);
        class_29900.Method_29949(n);
        switch (class_26668.Method_26680()) {
            case 0: {
                class_29900.Method_29949(((Byte)class_26668.Method_26676()).byteValue());
                break;
            }
            case 1: {
                class_29900.Method_29922(((Short)class_26668.Method_26676()).shortValue());
                break;
            }
            case 2: {
                class_29900.Method_30010((Integer)class_26668.Method_26676());
                break;
            }
            case 3: {
                class_29900.Method_29939(((Float)class_26668.Method_26676()).floatValue());
                break;
            }
            case 4: {
                class_29900.Method_29960((String)class_26668.Method_26676());
                break;
            }
            case 5: {
                Class_23823 class_23823 = (Class_23823)class_26668.Method_26676();
                class_29900.Method_29984(class_23823);
                break;
            }
            case 6: {
                Class_4751 class_4751 = (Class_4751)class_26668.Method_26676();
                class_29900.Method_30010(class_4751.\u0000= final());
                class_29900.Method_30010(class_4751.\u0000, `());
                class_29900.Method_30010(class_4751.\u0000strictfp());
                break;
            }
            case 7: {
                Class_13635 class_13635 = (Class_13635)class_26668.Method_26676();
                class_29900.Method_29939(class_13635.Method_13644());
                class_29900.Method_29939(class_13635.Method_13643());
                class_29900.Method_29939(class_13635.Method_13640());
            }
        }
    }

    private void Method_32725() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_32726() {
        ArrayList arrayList = null;
        if (this.Field_32696) {
            for (int i = 5120 & 19052; i < this.Field_32701.length; ++i) {
                Class_26668 class_26668 = this.Field_32701[i];
                if (class_26668 == null || !class_26668.Method_26675()) continue;
                class_26668.Method_26673((3224 & -32191) != 0);
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(class_26668);
            }
        }
        this.Field_32696 = 16804 & 8712;
        return arrayList;
    }

    public void Method_32727(int n, int n2) {
        Class_26668 class_26668;
        this.Field_32701[n] = class_26668 = new Class_26668(n2, n, null);
        this.Field_32700 = 4929 & 1192;
    }
}

