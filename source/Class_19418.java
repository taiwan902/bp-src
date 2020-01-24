/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19418
implements Class_19219 {
    public Class_23823 Method_19419(Class_43010 class_43010) {
        Class_29153 class_29153;
        Class_23823 class_23823 = null;
        for (int i = 16640 & -31092; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null || class_238232.Method_23844() != Class_10527.Field_10711) continue;
            class_23823 = class_238232.Method_23850();
            class_23823.Field_23826 = 11667 & -28631;
            break;
        }
        if ((class_29153 = this.Method_19420(class_43010)) != null) {
            Object object;
            int n = 18532 & 1297;
            for (int i = 4305 & 1536; i < class_43010.Method_43028(); ++i) {
                object = class_43010.Method_43032(i);
                if (object == null || ((Class_23823)object).Method_23844() != Class_10527.Field_10623) continue;
                n = ((Class_23823)object).Method_23843();
                break;
            }
            Class_1699 class_1699 = class_23823.Method_23854("BlockEntityTag", (3093 & 8321) != 0);
            object = null;
            if (class_1699.Method_1715("Patterns", -28467 & 18441)) {
                object = class_1699.Method_1735("Patterns", 4763 & 42);
            } else {
                object = new Class_1758();
                class_1699.Method_1744("Patterns", (Class_1674)object);
            }
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1702("Pattern", class_29153.Method_29275());
            class_16992.Method_1739("Color", n);
            ((Class_1758)object).Method_1781(class_16992);
        }
        return class_23823;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Class_29153 Method_19420(Class_43010 class_43010) {
        Class_29153[] arrclass_29153 = Class_29153.Method_29358();
        int n = arrclass_29153.length;
        int n2 = 16976 & 3488;
        do {
            block12 : {
                Class_29153 class_29153;
                int n3;
                block17 : {
                    int n4;
                    int n5;
                    int n6;
                    block16 : {
                        block14 : {
                            block15 : {
                                block13 : {
                                    if (n2 >= n) {
                                        return null;
                                    }
                                    class_29153 = arrclass_29153[n2];
                                    if (!class_29153.Method_29404()) break block12;
                                    n3 = 2437 & 8193;
                                    if (!class_29153.Method_29345()) break block13;
                                    n6 = 17664 & -32640;
                                    n4 = 16512 & -28144;
                                    break block14;
                                }
                                if (class_43010.Method_43028() != class_29153.Method_29372().length * class_29153.Method_29372()[258 & 2209].length()) break block15;
                                n6 = -1 & -1;
                                break block16;
                            }
                            n3 = 4864 & 16578;
                            break block17;
                        }
                        for (n5 = 21443 & 9256; n5 < class_43010.Method_43028() && n3 != 0; ++n5) {
                            Class_23823 class_23823 = class_43010.Method_43032(n5);
                            if (class_23823 == null || class_23823.Method_23844() == Class_10527.Field_10711) continue;
                            if (class_23823.Method_23844() == Class_10527.Field_10623) {
                                if (n4 != 0) {
                                    n3 = 8 & 85;
                                    break;
                                }
                                n4 = 4231 & 1041;
                                continue;
                            }
                            if (n6 != 0 || !class_23823.Method_23865(class_29153.Method_29200())) {
                                n3 = 40 & -32046;
                                break;
                            }
                            n6 = 17473 & 8331;
                        }
                        if (n6 != 0) break block17;
                        n3 = 1 & -11514;
                        break block17;
                    }
                    for (n4 = -32764 & 17352; n4 < class_43010.Method_43028() && n3 != 0; ++n4) {
                        n5 = n4 / (23 & 7331);
                        int n7 = n4 % (391 & -13821);
                        Class_23823 class_23823 = class_43010.Method_43032(n4);
                        if (class_23823 != null && class_23823.Method_23844() != Class_10527.Field_10711) {
                            if (class_23823.Method_23844() != Class_10527.Field_10623) {
                                n3 = 8832 & 23586;
                                break;
                            }
                            if (n6 != (-1 & -1) && n6 != class_23823.Method_23843()) {
                                n3 = 817 & 16460;
                                break;
                            }
                            if (class_29153.Method_29372()[n5].charAt(n7) == (1701 & 2082)) {
                                n3 = 3146 & -15999;
                                break;
                            }
                            n6 = class_23823.Method_23843();
                            continue;
                        }
                        if (class_29153.Method_29372()[n5].charAt(n7) == (40 & 17440)) continue;
                        n3 = 140 & 4448;
                        break;
                    }
                }
                if (n3 != 0) {
                    return class_29153;
                }
            }
            ++n2;
        } while (true);
    }

    private void Method_19421() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_19422() {
        return null;
    }

    Class_19418(Class_6082 class_6082) {
        this();
    }

    private Class_19418() {
    }

    public Class_23823[] Method_19423(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = -19133 & 2084; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }

    public boolean Method_19424(Class_43010 class_43010, Class_283 class_283) {
        int n = -7831 & 2562;
        for (int i = 2569 & 1424; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || class_23823.Method_23844() != Class_10527.Field_10711) continue;
            if (n != 0) {
                return (-12000 & 3139) != 0;
            }
            if (Class_39935.Method_39953(class_23823) >= (10438 & -32737)) {
                return (12 & 5298) != 0;
            }
            n = 20631 & -32767;
        }
        if (n == 0) {
            return (4622 & -32543) != 0;
        }
        return (this.Method_19420(class_43010) != null ? 7193 & -32571 : -22664 & 16384) != 0;
    }

    public int Method_19425() {
        return 2314 & 538;
    }
}

