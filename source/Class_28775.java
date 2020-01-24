/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public abstract class Class_28775 {
    protected long Field_28776;
    private long Field_28777;
    protected Class_28775 Field_28778;
    private long Field_28779;

    protected static boolean Method_28780(int n) {
        return (n == Class_17281.Field_17303.Field_17343 || n == Class_17281.Field_17338.Field_17343 || n == Class_17281.Field_17304.Field_17343 ? 9073 & -12275 : 8197 & 16528) != 0;
    }

    public abstract int[] Method_28781(int var1, int var2, int var3, int var4);

    protected int Method_28782(int n) {
        int n2 = (int)((this.Field_28779 >> (11320 & -32615)) % (long)n);
        if (n2 < 0) {
            n2 += n;
        }
        this.Field_28779 *= this.Field_28779 * (-2670084282896777299L & 6364136224423509869L) + (1442695041023196511L & 1442695040889488207L);
        this.Field_28779 += this.Field_28777;
        return n2;
    }

    public Class_28775(long l) {
        this.Field_28776 = l;
        this.Field_28776 *= this.Field_28776 * (6700228143589720061L & 6364136224148913965L) + (-7609535258028441121L & 1442695040890020207L);
        this.Field_28776 += l;
        this.Field_28776 *= this.Field_28776 * (6798744113548984109L & 6364136223865798445L) + (1442695040897358159L & 1442695041023181151L);
        this.Field_28776 += l;
        this.Field_28776 *= this.Field_28776 * (6364136224383795183L & 6364136224115752749L) + (6329241923838522351L & -4886546882951151281L);
        this.Field_28776 += l;
    }

    protected int Method_28783(int n, int n2, int n3, int n4) {
        int n5;
        if (n2 == n3 && n3 == n4) {
            n5 = n2;
        } else if (n == n2 && n == n3) {
            n5 = n;
        } else if (n == n2 && n == n4) {
            n5 = n;
        } else if (n == n3 && n == n4) {
            n5 = n;
        } else if (n == n2 && n3 != n4) {
            n5 = n;
        } else if (n == n3 && n2 != n4) {
            n5 = n;
        } else if (n == n4 && n2 != n3) {
            n5 = n;
        } else if (n2 == n3 && n != n4) {
            n5 = n2;
        } else if (n2 == n4 && n != n3) {
            n5 = n2;
        } else if (n3 == n4 && n != n2) {
            n5 = n3;
        } else {
            int[] arrn = new int[-32761 & 4884];
            arrn[26900 & 1027] = n;
            arrn[-32767 & 16541] = n2;
            arrn[-26813 & 10298] = n3;
            arrn[13419 & 16403] = n4;
            n5 = this.Method_28787(arrn);
        }
        return n5;
    }

    private void Method_28784() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_28785(long l, long l2) {
        this.Field_28779 = this.Field_28777;
        this.Field_28779 *= this.Field_28779 * (6364136223880904685L & 6364136224402538287L) + (-2583518623504561841L & 4026213664384582015L);
        this.Field_28779 += l;
        this.Field_28779 *= this.Field_28779 * (-299499890141724691L & 6663636113450958639L) + (-5441056985251871889L & 6883752026006081871L);
        this.Field_28779 += l2;
        this.Field_28779 *= this.Field_28779 * (6364136224383663917L & -407579136505806931L) + (1442695040888969039L & 4411270882767905263L);
        this.Field_28779 += l;
        this.Field_28779 *= this.Field_28779 * (-225745955036200963L & 6589882178880241453L) + (1442695040890539871L & 9202402150954017231L);
        this.Field_28779 += l2;
    }

    public static Class_28775[] Method_28786(long l, Class_43755 class_43755, String string) {
        int n;
        Class_28775 class_28775 = new Class_35256(1082202113L & 843063357L);
        class_28775 = new Class_40210(-4893766244072151087L & 1621182424L, class_28775);
        Class_43288 class_43288 = new Class_43288(99211L & 356281346366130225L, class_28775);
        Class_30414 class_30414 = new Class_30414(727170764415436757L & -727170764631689223L, class_43288);
        Class_43288 class_432882 = new Class_43288(269031362L & -5685452625747607546L, class_30414);
        class_432882 = new Class_43288(3539444267908890678L & 1084242035L, class_432882);
        class_432882 = new Class_43288(-1279615887634886314L & 675807438L, class_432882);
        Class_33928 class_33928 = new Class_33928(19664963L & 809924654226476830L, class_432882);
        Class_34352 class_34352 = new Class_34352(-4709912525473086550L & 4709912523965465683L, class_33928);
        Class_43288 class_432883 = new Class_43288(1178603539L & -2818175673531486429L, class_34352);
        Class_39322 class_39322 = new Class_39322(1346896130L & -8579617666065381869L, class_432883, Class_24460.Field_24462);
        class_39322 = new Class_39322(-5757377789475872314L & 1476395019L, class_39322, Class_24460.Field_24461);
        class_39322 = new Class_39322(1115815947L & 5825241698083825379L, class_39322, Class_24460.Field_24464);
        Class_30414 class_304142 = new Class_30414(1210062810L & 4771830L, class_39322);
        class_304142 = new Class_30414(4221249004575000535L & -4221249004847900717L, class_304142);
        Class_43288 class_432884 = new Class_43288(759173892L & 1082704102L, class_304142);
        Class_28882 class_28882 = new Class_28882(278430727L & -6275979175003750387L, class_432884);
        Class_30480 class_30480 = new Class_30480(5896691270797247780L & -5896691271759521257L, class_28882);
        Class_28775 class_287752 = Class_30414.Method_30415(2014701546L & 8915945L, class_30480, 12 & -22976);
        Class_19225 class_19225 = null;
        int n2 = n = -16124 & 8278;
        if (class_43755 == Class_43755.Field_43760 && string.length() > 0) {
            class_19225 = Class_25402.Method_25487(string).Method_25488();
            n = class_19225.Field_19252;
            n2 = class_19225.Field_19277;
        }
        if (class_43755 == Class_43755.Field_43764) {
            n = 17134 & 4118;
        }
        Class_28775 class_287753 = Class_30414.Method_30415(1080034281L & -1505490224538418184L, class_287752, 133 & -24064);
        Class_46871 class_46871 = new Class_46871(-5758593075235994524L & 5758593074188059108L, class_287753);
        Class_33132 class_33132 = new Class_33132(3416298L & 1164313435333857224L, class_287752, class_43755, string);
        Class_28775 class_287754 = Class_30414.Method_30415(138544107L & 1085342712L, class_33132, 8714 & 20834);
        Class_29083 class_29083 = new Class_29083(-301028405337889814L & 301028403737529325L, class_287754);
        Class_28775 class_287755 = Class_30414.Method_30415(811926378311190505L & 546847720L, class_46871, 21187 & -22502);
        Class_28775 class_287756 = new Class_29089(7876153320216773608L & -7876153321956563990L, class_29083, class_287755);
        Class_28775 class_287757 = Class_30414.Method_30415(-2793983902218451976L & 203564013L, class_46871, 9803 & 2466);
        class_287757 = Class_30414.Method_30415(2695049435611809770L & -2695049436417190931L, class_287757, n2);
        Class_41937 class_41937 = new Class_41937(4852245L & 5797810102826250273L, class_287757);
        Class_32553 class_32553 = new Class_32553(1623032L & 19212264L, class_41937);
        class_287756 = new Class_44311(1342440425L & -7398210785125070871L, class_287756);
        for (int i = 969 & -26622; i < n; ++i) {
            class_287756 = new Class_30414((1018 & 25576) + i, class_287756);
            if (i == 0) {
                class_287756 = new Class_43288(444661763L & -6628811866330494969L, class_287756);
            }
            if (i != (797 & 18497) && n != (16773 & -24573)) continue;
            class_287756 = new Class_31179(5128448744757039084L & -5128448744840166424L, class_287756);
        }
        Class_32553 class_325532 = new Class_32553(2436732107513021436L & -2436732108031130646L, class_287756);
        Class_37475 class_37475 = new Class_37475(-1108456312967925019L & 131190L, class_325532, class_32553);
        Class_38630 class_38630 = new Class_38630(276308187L & -923461383746092790L, class_37475);
        class_37475.Method_37479(l);
        class_38630.Method_28789(l);
        Class_28775[] arrclass_28775 = new Class_28775[3075 & 3];
        arrclass_28775[16 & 21220] = class_37475;
        arrclass_28775[24719 & 1537] = class_38630;
        arrclass_28775[10243 & 1190] = class_37475;
        return arrclass_28775;
    }

    protected int Method_28787(int ... arrn) {
        return arrn[this.Method_28782(arrn.length)];
    }

    protected static boolean Method_28788(int n, int n2) {
        if (n == n2) {
            return (5123 & 27093) != 0;
        }
        if (n != Class_17281.Field_17362.Field_17343 && n != Class_17281.Field_17296.Field_17343) {
            Class_17281 class_17281 = Class_17281.Method_17396(n);
            Class_17281 class_172812 = Class_17281.Method_17396(n2);
            try {
                return class_17281 != null && class_172812 != null ? class_17281.Method_17432(class_172812) : 2120 & -27760;
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Comparing biomes");
                Class_13220 class_13220 = class_13268.Method_13280("Biomes being compared");
                class_13220.Method_13231("Biome A ID", n);
                class_13220.Method_13231("Biome B ID", n2);
                class_13220.Method_13232("Biome A", new Class_8580(class_17281));
                class_13220.Method_13232("Biome B", new Class_19653(class_172812));
                throw new Class_1809(class_13268);
            }
        }
        return (n2 == Class_17281.Field_17362.Field_17343 || n2 == Class_17281.Field_17296.Field_17343 ? 12293 & -31727 : 64 & 12562) != 0;
    }

    public void Method_28789(long l) {
        this.Field_28777 = l;
        if (this.Field_28778 != null) {
            this.Field_28778.Method_28789(l);
        }
        this.Field_28777 *= this.Field_28777 * (6364136224383663919L & -405888645949161619L) + (1442695040888973135L & 1601029667386524143L);
        this.Field_28777 += this.Field_28776;
        this.Field_28777 *= this.Field_28777 * (6364136224115228653L & -299490829910278353L) + (1442695040889487695L & 1442695040888979791L);
        this.Field_28777 += this.Field_28776;
        this.Field_28777 *= this.Field_28777 * (6364136223867764525L & 6364136224148782911L) + (6849833741681414623L & 1442695040888974159L);
        this.Field_28777 += this.Field_28776;
    }
}

