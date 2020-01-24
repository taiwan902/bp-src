/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_4266
extends Class_3598
implements Class_3594 {
    public static final Class_3957 Field_4267 = Class_3957.Method_3963(Class_4266.Method_4276("\uc403\uc403\uc403\uc413"), Class_4231.class);
    public static final Class_4394 Field_4268 = Class_4394.Method_4401(Class_4266.Method_4284("\u312a\u3129\u3128\u312b\u3128"), 20112 & 259, 16539 & -29119);

    private void Method_4269() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_4270(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_4231[] arrclass_4231 = Class_4231.Method_4250();
        int n = arrclass_4231.length;
        for (int i = 16384 & 4226; i < n; ++i) {
            Class_4231 class_4231 = arrclass_4231[i];
            list.add(new Class_23823(class_1956, 257 & -6079, class_4231.Method_4247()));
        }
    }

    protected Class_4266() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4267, (Comparable)((Object)Class_4231.Field_4238)).Method_3437(Field_4268, Integer.valueOf(193 & -26078)));
        float f = 0.84761906f * 0.47191012f;
        this.\u0000strictfp(1.825f * 0.2739726f - f, 0.0f, 1.1212121f * 0.44594595f - f, 1.661017f * 0.3010204f + f, f * 2.0f, 2.0f * 0.25f + f);
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    protected Class_3855 Method_4271() {
        Class_3538[] arrclass_3538 = new Class_3538[24711 & 1314];
        arrclass_3538[-21888 & 4180] = Field_4267;
        arrclass_3538[2121 & -31451] = Field_4268;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_4272(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        return (17161 & 14369) != 0;
    }

    private boolean Method_4273(Class_283 class_283, Class_4751 class_4751, int n, int n2, Class_4231 class_4231) {
        return (this.Method_4285(class_283, class_4751.Method_4791(n, 4128 & -22388, n2), class_4231) && this.Method_4285(class_283, class_4751.Method_4791(n + (16513 & 6985), 1092 & 25368, n2), class_4231) && this.Method_4285(class_283, class_4751.Method_4791(n, 67 & -12240, n2 + (-26347 & 17475)), class_4231) && this.Method_4285(class_283, class_4751.Method_4791(n + (-30709 & 4257), -28027 & 1120, n2 + (4385 & 16451)), class_4231) ? 77 & -22895 : 8194 & -28640) != 0;
    }

    public void Method_4274(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if ((Integer)class_3436.Method_3440(Field_4268) == 0) {
            class_283.Method_462(class_4751, class_3436.Method_3438(Field_4268), 132 & -24307);
        } else {
            this.Method_4278(class_283, class_4751, class_3436, random);
        }
    }

    public String Method_4275() {
        return Class_7594.Method_7602(this.\u0000strictfp() + "." + Class_4231.Field_4238.Method_4261() + ".name");
    }

    private static String Method_4276(String string) {
        int n = 24065;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4266.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_4277(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        return ((double)class_283.Field_307.nextFloat() < 0.5645454545454546 * 0.7971014492753623 ? 17409 & 105 : 0 & 1383) != 0;
    }

    public void Method_4278(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Class_3436 class_34362;
        Class_4286 class_4286 = random.nextInt(-3829 & 3226) == 0 ? new Class_4297((-29679 & 97) != 0) : new Class_4328((4809 & -16379) != 0);
        int n = -6134 & 1024;
        int n2 = -31744 & 4992;
        int n3 = 4104 & 9476;
        switch (Class_21306.Field_21307[((Class_4231)((Object)class_3436.Method_3440(Field_4267))).ordinal()]) {
            case 1: {
                block7 : for (n = -15802 & 8457; n >= (-1 & -1); --n) {
                    for (n2 = -32479 & 10242; n2 >= (-1 & -1); --n2) {
                        if (!this.Method_4273(class_283, class_4751, n, n2, Class_4231.Field_4236)) continue;
                        class_4286 = new Class_4340((41 & -14192) != 0, random.nextBoolean());
                        n3 = 16449 & 4511;
                        break block7;
                    }
                }
                if (n3 != 0) break;
                n2 = 2135 & 0;
                n = -30720 & 21256;
                class_4286 = new Class_4363((17411 & 4141) != 0);
                break;
            }
            case 2: {
                class_4286 = new Class_4368((-21885 & 21769) != 0, (3072 & 137) != 0);
                break;
            }
            case 3: {
                class_34362 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4235));
                Class_3436 class_34363 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4235)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((57 & 21568) != 0));
                block9 : for (n = -28280 & 1556; n >= (-1 & -1); --n) {
                    for (n2 = -32632 & 18688; n2 >= (-1 & -1); --n2) {
                        if (!this.Method_4273(class_283, class_4751, n, n2, Class_4231.Field_4235)) continue;
                        class_4286 = new Class_4374((12545 & -29547) != 0, -23538 & 20890, 31260 & 1300, class_34362, class_34363);
                        n3 = -14207 & 5639;
                        break block9;
                    }
                }
                if (n3 != 0) break;
                n2 = -32159 & 4106;
                n = 2596 & -32688;
                class_4286 = new Class_4328((12325 & -15871) != 0, (174 & -16124) + random.nextInt(-28617 & 1735), class_34362, class_34363, (8452 & 17032) != 0);
                break;
            }
            case 4: {
                class_4286 = new Class_4379((22537 & -31979) != 0);
                break;
            }
            case 5: {
                block11 : for (n = 18592 & 4379; n >= (-1 & -1); --n) {
                    for (n2 = -32703 & 8736; n2 >= (-1 & -1); --n2) {
                        if (!this.Method_4273(class_283, class_4751, n, n2, Class_4231.Field_4233)) continue;
                        class_4286 = new Class_4386((8449 & 16449) != 0);
                        n3 = 12385 & 2177;
                        break block11;
                    }
                }
                if (n3 != 0) break;
                return;
            }
        }
        class_34362 = Class_9265.Field_9351.Method_3293();
        if (n3 != 0) {
            class_283.Method_462(class_4751.Method_4791(n, 22032 & 9, n2), class_34362, 8260 & -32595);
            class_283.Method_462(class_4751.Method_4791(n + (65 & -31959), 25411 & 3072, n2), class_34362, 5508 & 16404);
            class_283.Method_462(class_4751.Method_4791(n, 10384 & -27072, n2 + (1161 & 1)), class_34362, 8262 & -29660);
            class_283.Method_462(class_4751.Method_4791(n + (527 & -24095), -30332 & 9234, n2 + (12357 & 3459)), class_34362, 16950 & 10244);
        } else {
            class_283.Method_462(class_4751, class_34362, 22276 & -32627);
        }
        if (!class_4286.Method_4296(class_283, random, class_4751.Method_4791(n, 29705 & 2080, n2))) {
            if (n3 != 0) {
                class_283.Method_462(class_4751.Method_4791(n, 24512 & 8203, n2), class_3436, 16396 & 5413);
                class_283.Method_462(class_4751.Method_4791(n + (22721 & 10003), 16464 & 4096, n2), class_3436, 9244 & 4484);
                class_283.Method_462(class_4751.Method_4791(n, 15908 & 320, n2 + (-32755 & 35)), class_3436, 18340 & 21);
                class_283.Method_462(class_4751.Method_4791(n + (-15287 & 12289), 72 & 24580, n2 + (-32705 & 25729)), class_3436, 4356 & -15340);
            } else {
                class_283.Method_462(class_4751, class_3436, 12036 & 20660);
            }
        }
    }

    public void Method_4279(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_4274(class_283, class_4751, class_3436, random);
    }

    public Class_3436 Method_4280(int n) {
        return this.\u0000strictfp().Method_3685(Field_4267, (Comparable)((Object)Class_4231.Method_4259(n & (1415 & -32745)))).Method_3437(Field_4268, Integer.valueOf((n & (18698 & -19876)) >> (-29753 & 24579)));
    }

    public int Method_4281(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_4267))).Method_4247();
    }

    public int Method_4282(Class_3436 class_3436) {
        int n = 705 & 32;
        n |= ((Class_4231)((Object)class_3436.Method_3440(Field_4267))).Method_4247();
        return n |= (Integer)class_3436.Method_3440(Field_4268) << (-16093 & 2187);
    }

    public void Method_4283(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306) {
            super.Method_3602(class_283, class_4751, class_3436, random);
            if (class_283.Method_451(class_4751.Method_4769()) >= (-22759 & 16393) && random.nextInt(9751 & 335) == 0) {
                this.Method_4274(class_283, class_4751, class_3436, random);
            }
        }
    }

    private static String Method_4284(String string) {
        int n = 29233;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4266.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_4285(Class_283 class_283, Class_4751 class_4751, Class_4231 class_4231) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        return (class_3436.Method_3442() == this && class_3436.Method_3440(Field_4267) == class_4231 ? 6803 & 16457 : -31072 & 20560) != 0;
    }
}

