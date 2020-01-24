/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.List;

public abstract class Class_44949
extends Class_42212 {
    private static final byte[] Field_44950;
    private static final byte[] Field_44951;
    private static final byte[] Field_44952;
    private int Field_44953 = 577 & -29532;
    private static final Class_22553 Field_44954;
    private static final Class_22553 Field_44955;

    private void Method_44956(Class_39158 class_39158, Object object, long l, List list) {
        Class_22553 class_22553;
        Object object2;
        if (l > (3044054250870081051L & -3044054252775514112L)) {
            object2 = Long.toHexString(l).getBytes(Class_7203.Field_7204);
            class_22553 = class_39158.Method_39170().Method_22841(((byte[])object2).length + (10251 & -28046));
            class_22553.Method_22610((byte[])object2);
            class_22553.Method_22610(Field_44951);
            list.add(class_22553);
            list.add(Class_44949.Method_44958(object));
            list.add(Field_44954.Method_22598());
        }
        if (object instanceof Class_44416) {
            object2 = ((Class_44416)object).Method_44422();
            if (((Class_17103)object2).Method_17149()) {
                list.add(Field_44955.Method_22598());
            } else {
                class_22553 = class_39158.Method_39170().Method_22844();
                class_22553.Method_22610(Field_44952);
                Class_17103.Method_17123((Class_17103)object2, class_22553);
                class_22553.Method_22610(Field_44951);
                list.add(class_22553);
            }
            this.Field_44953 = 2065 & 28736;
        } else if (l == (20647L & 1578985555721792272L)) {
            list.add(Class_16620.Field_16622);
        }
    }

    private static long Method_44957(Object object) {
        if (object instanceof Class_41723) {
            return ((Class_41723)object).content().Method_22564();
        }
        if (object instanceof Class_22553) {
            return ((Class_22553)object).Method_22564();
        }
        if (object instanceof Class_23060) {
            return ((Class_23060)object).Method_23063();
        }
        throw new IllegalStateException("unexpected message type: " + Class_22304.Method_22312(object));
    }

    static {
        byte[] arrby = new byte[175 & -15550];
        arrby[-7588 & 384] = -31699 & 16527;
        arrby[281 & 8803] = -32758 & 17803;
        Field_44951 = arrby;
        byte[] arrby2 = new byte[4367 & -8189];
        arrby2[104 & -10096] = -32582 & 9008;
        arrby2[-31549 & 22557] = 2589 & 16623;
        arrby2[25858 & 2170] = 538 & -6070;
        Field_44952 = arrby2;
        byte[] arrby3 = new byte[1671 & -4091];
        arrby3[66 & 17024] = 816 & 2101;
        arrby3[-29951 & 8401] = 16557 & -24307;
        arrby3[2 & -13501] = 4282 & 8202;
        arrby3[8483 & -29153] = 18607 & 4189;
        arrby3[212 & 21252] = 574 & -20341;
        Field_44950 = arrby3;
        Field_44954 = Class_16620.Method_16626(Class_16620.Method_16630(Field_44951.length).Method_22610(Field_44951));
        Field_44955 = Class_16620.Method_16626(Class_16620.Method_16630(Field_44950.length).Method_22610(Field_44950));
    }

    private static Object Method_44958(Object object) {
        if (object instanceof Class_22553) {
            return ((Class_22553)object).Method_22637();
        }
        if (object instanceof Class_41723) {
            return ((Class_41723)object).content().Method_22637();
        }
        if (object instanceof Class_23060) {
            return ((Class_23060)object).retain();
        }
        throw new IllegalStateException("unexpected message type: " + Class_22304.Method_22312(object));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void Method_44959(Class_39158 class_39158, Object object, List list) {
        Class_22553 class_22553 = null;
        if (object instanceof Class_32692) {
            if (this.Field_44953 != 0) {
                throw new IllegalStateException("unexpected message type: " + Class_22304.Method_22312(object));
            }
            Class_32692 class_32692 = (Class_32692)object;
            class_22553 = class_39158.Method_39170().Method_22844();
            this.Method_44961(class_22553, class_32692);
            Class_17103.Method_17123(class_32692.Method_32694(), class_22553);
            class_22553.Method_22610(Field_44951);
            int n = this.Field_44953 = Class_17103.Method_17122(class_32692) ? 5318 & 18442 : 4097 & -32733;
        }
        if (object instanceof Class_41723 || object instanceof Class_22553 || object instanceof Class_23060) {
            if (this.Field_44953 == 0) {
                throw new IllegalStateException("unexpected message type: " + Class_22304.Method_22312(object));
            }
            long l = Class_44949.Method_44957(object);
            if (this.Field_44953 == (1249 & -28157)) {
                if (l > (606077216L & 6828112457882704960L)) {
                    if (class_22553 != null && (long)class_22553.Method_22574() >= l && object instanceof Class_41723) {
                        class_22553.Method_22631(((Class_41723)object).content());
                        list.add(class_22553);
                    } else {
                        if (class_22553 != null) {
                            list.add(class_22553);
                        }
                        list.add(Class_44949.Method_44958(object));
                    }
                } else if (class_22553 != null) {
                    list.add(class_22553);
                } else {
                    list.add(Class_16620.Field_16622);
                }
                if (!(object instanceof Class_44416)) return;
                this.Field_44953 = -19936 & 3082;
                return;
            } else {
                if (this.Field_44953 != (2658 & 24586)) throw new Error();
                if (class_22553 != null) {
                    list.add(class_22553);
                }
                this.Method_44956(class_39158, object, l, list);
            }
            return;
        } else {
            if (class_22553 == null) return;
            list.add(class_22553);
        }
    }

    private void Method_44960() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract void Method_44961(Class_22553 var1, Class_32692 var2);

    public boolean Method_44962(Object object) {
        return (object instanceof Class_11915 || object instanceof Class_22553 || object instanceof Class_23060 ? -15343 & 8297 : 1089 & 22546) != 0;
    }
}

