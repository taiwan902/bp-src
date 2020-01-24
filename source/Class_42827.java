/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class Class_42827
extends Class_35837 {
    private final Map Field_42828 = new LinkedHashMap();
    private final Map Field_42829 = new LinkedHashMap();
    private Class_18163 Field_42830;
    private static final Class_6113 Field_42831 = Class_10201.Method_10203(Class_42827.class);
    private Class_31885 Field_42832;

    public Object Method_42833() {
        return this.Method_42838();
    }

    public Class_35837 Method_42834(Class_18163 class_18163) {
        return this.Method_42843(class_18163);
    }

    private static Map.Entry[] Method_42835(int n) {
        return new Map.Entry[n];
    }

    private void Method_42836() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Map.Entry[] Method_42837(int n) {
        return new Map.Entry[n];
    }

    public Class_42827 Method_42838() {
        return new Class_42827(this);
    }

    public Class_42827() {
    }

    public Class_42827 Method_42839(Class_18163 class_18163, Class_18163 class_181632) {
        super.Method_35854(class_18163);
        if (class_181632 == null) {
            throw new NullPointerException("childGroup");
        }
        if (this.Field_42830 != null) {
            throw new IllegalStateException("childGroup set already");
        }
        this.Field_42830 = class_181632;
        return this;
    }

    public Class_35837 Method_42840() {
        return this.Method_42838();
    }

    public Class_35837 Method_42841() {
        return this.Method_42844();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method_42842() {
        StringBuilder stringBuilder = new StringBuilder(super.Method_35861());
        stringBuilder.setLength(stringBuilder.length() - (4165 & 8225));
        stringBuilder.append(", ");
        if (this.Field_42830 != null) {
            stringBuilder.append("childGroup: ");
            stringBuilder.append(Class_22304.Method_22312(this.Field_42830));
            stringBuilder.append(", ");
        }
        Map map = this.Field_42828;
        synchronized (map) {
            if (!this.Field_42828.isEmpty()) {
                stringBuilder.append("childOptions: ");
                stringBuilder.append(this.Field_42828);
                stringBuilder.append(", ");
            }
        }
        map = this.Field_42829;
        synchronized (map) {
            if (!this.Field_42829.isEmpty()) {
                stringBuilder.append("childAttrs: ");
                stringBuilder.append(this.Field_42829);
                stringBuilder.append(", ");
            }
        }
        if (this.Field_42832 != null) {
            stringBuilder.append("childHandler: ");
            stringBuilder.append(this.Field_42832);
            stringBuilder.append(", ");
        }
        if (stringBuilder.charAt(stringBuilder.length() - (8705 & 9)) == (8744 & 21544)) {
            stringBuilder.append((char)(8233 & -26563));
        } else {
            stringBuilder.setCharAt(stringBuilder.length() - (10246 & 16410), (char)(8745 & -26247));
            stringBuilder.setLength(stringBuilder.length() - (6145 & -31465));
        }
        return stringBuilder.toString();
    }

    public Class_42827 Method_42843(Class_18163 class_18163) {
        return this.Method_42839(class_18163, class_18163);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Class_42827(Class_42827 class_42827) {
        super(class_42827);
        this.Field_42830 = class_42827.Field_42830;
        this.Field_42832 = class_42827.Field_42832;
        Map map = class_42827.Field_42828;
        synchronized (map) {
            this.Field_42828.putAll(class_42827.Field_42828);
        }
        map = class_42827.Field_42829;
        synchronized (map) {
            this.Field_42829.putAll(class_42827.Field_42829);
        }
    }

    public Class_42827 Method_42844() {
        super.Method_35844();
        if (this.Field_42832 == null) {
            throw new IllegalStateException("childHandler not set");
        }
        if (this.Field_42830 == null) {
            Field_42831.Method_6132("childGroup is not set. Using parentGroup instead.");
            this.Field_42830 = this.group();
        }
        return this;
    }

    static Class_6113 Method_42845() {
        return Field_42831;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void Method_42846(Class_26095 class_26095) {
        Map.Entry[] arrentry;
        Map.Entry[] arrentry2;
        Map map;
        Map map2 = map = this.options();
        synchronized (map2) {
            class_26095.Method_26110().Method_19089(map);
        }
        map2 = this.attrs();
        Object object2 = map2;
        synchronized (object2) {
            for (Map.Entry object3 : map2.entrySet()) {
                arrentry = (Map.Entry[])object3.getKey();
                class_26095.attr((Class_28213)arrentry).Method_34811(object3.getValue());
            }
        }
        object2 = class_26095.Method_26106();
        if (this.handler() != null) {
            Class_31885[] arrclass_31885 = new Class_31885[6165 & -24093];
            arrclass_31885[16532 & 16128] = this.handler();
            object2.Method_6275(arrclass_31885);
        }
        Class_18163 class_18163 = this.Field_42830;
        Class_31885 class_31885 = this.Field_42832;
        Map map3 = this.Field_42828;
        synchronized (map3) {
            arrentry = this.Field_42828.entrySet().toArray(Class_42827.Method_42835(this.Field_42828.size()));
        }
        map3 = this.Field_42829;
        synchronized (map3) {
            arrentry2 = this.Field_42829.entrySet().toArray(Class_42827.Method_42837(this.Field_42829.size()));
        }
        Class_31885[] arrclass_31885 = new Class_31885[513 & -12271];
        arrclass_31885[30800 & 169] = new Class_43794(this, class_18163, class_31885, arrentry, arrentry2);
        object2.Method_6275(arrclass_31885);
    }

    public Class_42827 Method_42847(Class_31885 class_31885) {
        if (class_31885 == null) {
            throw new NullPointerException("childHandler");
        }
        this.Field_42832 = class_31885;
        return this;
    }
}

