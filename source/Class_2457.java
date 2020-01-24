/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.util.Vec3;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class_2457
implements Class_1367,
Class_272,
Class_276,
Runnable {
    private final Class_15008 Field_2458;
    private final Class_2047 Field_2459;
    private static final Logger Field_2460 = LogManager.getLogger();
    private String Field_2461;
    private String Field_2462;
    public Class_2651[] Field_2463;
    private int Field_2464 = -1 & -1;
    private int Field_2465;
    private KeyPair Field_2466;
    private String Field_2467;
    private String Field_2468;
    private final Class_3166 Field_2469 = new Class_3166();
    private boolean Field_2470;
    private static Class_2457 Field_2471;
    private boolean Field_2472;
    protected final Class_2754 Field_2473;
    public long[][] Field_2474;
    public double Field_2475;
    private final GameProfileRepository Field_2476;
    private final Class_2423 Field_2477 = new Class_2423("server", this, Class_2457.Method_2513());
    private boolean Field_2478;
    private boolean Field_2479;
    public String Field_2480;
    private long Field_2481;
    private int Field_2482;
    private long Field_2483;
    private final Class_3180 Field_2484;
    private boolean Field_2485;
    private boolean Field_2486;
    private final List Field_2487 = Lists.newArrayList();
    private Thread Field_2488;
    private boolean Field_2489;
    private Class_3069 Field_2490;
    private boolean Field_2491;
    private boolean Field_2492;
    private String Field_2493;
    private boolean Field_2494;
    private boolean Field_2495;
    private boolean Field_2496;
    protected final Queue Field_2497;
    public final long[] Field_2498;
    private long Field_2499;
    public final Class_2767 Field_2500 = new Class_2767();
    private final YggdrasilAuthenticationService Field_2501;
    private int Field_2502;
    private boolean Field_2503;
    private final MinecraftSessionService Field_2504;
    private final File Field_2505;
    private String Field_2506;
    public static final File Field_2507;
    private String Field_2508;
    protected final Proxy Field_2509;
    private final Random Field_2510 = new Random();

    public boolean Method_2511() {
        return this.Field_2486;
    }

    public Class_2457(Proxy proxy, File file) {
        this.Field_2485 = -16165 & 9729;
        this.Field_2502 = -14208 & 4705;
        this.Field_2498 = new long[25317 & 1142];
        this.Field_2461 = "";
        this.Field_2506 = "";
        this.Field_2481 = -4858252121006144328L & 1410877443L;
        this.Field_2497 = Queues.newArrayDeque();
        this.Field_2499 = Class_2457.Method_2513();
        this.Field_2509 = proxy;
        Field_2471 = this;
        this.Field_2505 = null;
        this.Field_2458 = null;
        this.Field_2484 = new Class_3180(this, file);
        this.Field_2473 = null;
        this.Field_2459 = null;
        this.Field_2501 = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.Field_2504 = this.Field_2501.createMinecraftSessionService();
        this.Field_2476 = this.Field_2501.createProfileRepository();
    }

    public String Method_2512() {
        return this.Field_2506;
    }

    public static long Method_2513() {
        return System.currentTimeMillis();
    }

    public boolean Method_2514() {
        return (6929 & 1027) != 0;
    }

    public void Method_2515(boolean bl) {
        this.Field_2494 = bl;
    }

    public String Method_2516() {
        return this.Field_2508;
    }

    public boolean Method_2517() {
        return this.Field_2492;
    }

    public Class_283 Method_2518() {
        return this.Field_2463[-5376 & 5233];
    }

    public void Method_2519(boolean bl) {
        this.Field_2470 = bl;
    }

    public void Method_2520() {
        this.Field_2485 = -14230 & 4100;
    }

    public void Method_2521(String string, String string2) {
        this.Field_2461 = string;
        this.Field_2506 = string2;
    }

    public Class_2457(File file, Proxy proxy, File file2) {
        this.Field_2485 = 4657 & 2051;
        this.Field_2502 = -28640 & 3346;
        this.Field_2498 = new long[29174 & 1636];
        this.Field_2461 = "";
        this.Field_2506 = "";
        this.Field_2481 = 1375869473L & -3608008667484625718L;
        this.Field_2497 = Queues.newArrayDeque();
        this.Field_2499 = Class_2457.Method_2513();
        this.Field_2509 = proxy;
        Field_2471 = this;
        this.Field_2505 = file;
        this.Field_2458 = new Class_15008(this);
        this.Field_2484 = new Class_3180(this, file2);
        this.Field_2473 = this.Method_2569();
        this.Field_2459 = new Class_31083(file);
        this.Field_2501 = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.Field_2504 = this.Field_2501.createMinecraftSessionService();
        this.Field_2476 = this.Field_2501.createProfileRepository();
    }

    public void Method_2522(String string) {
        this.Field_2508 = string;
    }

    public boolean Method_2523() {
        return (16531 & -26583) != 0;
    }

    public boolean Method_2524() {
        return Class_2457.Method_2530().Field_2463[14633 & -32750].\u0000strictfp().Method_7529("sendCommandFeedback");
    }

    protected void Method_2525(String string, Class_26655 class_26655) {
        File file = new File(class_26655.Method_26663(), "resources.zip");
        if (file.isFile()) {
            this.Method_2521("level://" + string + "/" + file.getName(), "");
        }
    }

    public ListenableFuture Method_2526(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.Method_2556(Executors.callable(runnable));
    }

    public void Method_2527(boolean bl) {
        this.Field_2478 = bl;
    }

    public File Method_2528() {
        return new File(".");
    }

    public int Method_2529() {
        return 4124 & 2513;
    }

    public static Class_2457 Method_2530() {
        return Field_2471;
    }

    public String Method_2531() {
        return this.Field_2461;
    }

    public void Method_2532() {
        if (!this.Field_2491) {
            Field_2460.info("Stopping server");
            if (this.Method_2558() != null) {
                this.Method_2558().Method_15021();
            }
            if (this.Field_2490 != null) {
                Field_2460.info("Saving players");
                this.Field_2490.Method_3095();
                this.Field_2490.Method_3105();
            }
            if (this.Field_2463 != null) {
                Field_2460.info("Saving worlds");
                this.Method_2622((10496 & 4800) != 0);
                for (int i = 4657 & 4; i < this.Field_2463.length; ++i) {
                    Class_2651 class_2651 = this.Field_2463[i];
                    class_2651.Method_2717();
                }
            }
            if (this.Field_2477.Method_2441()) {
                this.Field_2477.Method_2442();
            }
        }
    }

    public void Method_2533(int n) {
        this.Field_2482 = n;
    }

    protected void Method_2534() {
        int n = 2132 & 12345;
        int n2 = 12807 & -32756;
        int n3 = 225 & 1730;
        int n4 = 631 & -22791;
        int n5 = 2 & 10328;
        this.Method_2559("menu.generatingTerrain");
        int n6 = 9357 & 2850;
        Field_2460.info("Preparing start region for level " + n6);
        Class_2651 class_2651 = this.Field_2463[n6];
        Class_4751 class_4751 = class_2651.\u0000strictfp();
        long l = Class_2457.Method_2513();
        for (int i = -152 & -176; i <= (-32030 & 18633) && this.Method_2565(); i += 16) {
            for (int j = -190 & -24; j <= (-15676 & 1233) && this.Method_2565(); j += 16) {
                long l2 = Class_2457.Method_2513();
                if (l2 - l > (-1543904613227166620L & 4456805L)) {
                    this.Method_2571("Preparing spawn area", (double)n5 * (370.0 * 0.2702702702702703) / (0.2 * 3125.0));
                    l = l2;
                }
                ++n5;
                class_2651.Field_2661.Method_18666(class_4751.\u0000= final() + i >> (4612 & 17486), class_4751.\u0000strictfp() + j >> (6 & 1172));
            }
        }
        this.Method_2635();
    }

    public File Method_2535(String string) {
        return new File(this.Method_2528(), string);
    }

    public Vec3 Method_2536() {
        return new Vec3(0.0, 0.0, 0.0);
    }

    public void Method_2537(Class_26261 class_26261, int n) {
    }

    public boolean Method_2538() {
        return (this.Field_2468 != null ? 161 & 79 : 2120 & -31482) != 0;
    }

    public int Method_2539() {
        return this.Field_2490.Method_3114();
    }

    public Proxy Method_2540() {
        return this.Field_2509;
    }

    public abstract Class_26801 Method_2541();

    public Class_4751 Method_2542() {
        return Class_4751.Field_4760;
    }

    public void Method_2543(Class_2423 class_2423) {
        class_2423.Method_2434("whitelist_enabled", (-32136 & 22529) != 0);
        class_2423.Method_2434("whitelist_count", 16388 & 2512);
        if (this.Field_2490 != null) {
            class_2423.Method_2434("players_current", this.Method_2608());
            class_2423.Method_2434("players_max", this.Method_2539());
            class_2423.Method_2434("players_seen", this.Field_2490.Method_3146().length);
        }
        class_2423.Method_2434("uses_auth", this.Field_2496);
        class_2423.Method_2434("gui_state", this.Method_2594() ? "enabled" : "disabled");
        class_2423.Method_2434("run_time", (Class_2457.Method_2513() - class_2423.Method_2448()) / (4907715804336104508L & -4907715805475438530L) * (-2143726019230039042L & 1342518249L));
        class_2423.Method_2434("avg_tick_ms", (int)(Class_13337.Method_13376(this.Field_2498) * (5.764705882352941E-6 * 0.17346938775510204)));
        int n = 200 & 23809;
        if (this.Field_2463 != null) {
            for (int i = 262 & 144; i < this.Field_2463.length; ++i) {
                if (this.Field_2463[i] == null) continue;
                Class_2651 class_2651 = this.Field_2463[i];
                Class_31717 class_31717 = class_2651.\u0000strictfp();
                class_2423.Method_2434("world[" + n + "][dimension]", class_2651.\u0000strictfp.Method_18379());
                class_2423.Method_2434("world[" + n + "][mode]", (Object)((Object)class_31717.Method_31777()));
                class_2423.Method_2434("world[" + n + "][difficulty]", (Object)((Object)class_2651.\u0000strictfp()));
                class_2423.Method_2434("world[" + n + "][hardcore]", class_31717.Method_31839());
                class_2423.Method_2434("world[" + n + "][generator_name]", class_31717.Method_31833().Method_43785());
                class_2423.Method_2434("world[" + n + "][generator_version]", class_31717.Method_31833().Method_43786());
                class_2423.Method_2434("world[" + n + "][height]", this.Field_2482);
                class_2423.Method_2434("world[" + n + "][chunks_loaded]", class_2651.\u0000, `().Method_12168());
                ++n;
            }
        }
        class_2423.Method_2434("worlds", n);
    }

    static Logger Method_2544() {
        return Field_2460;
    }

    public boolean Method_2545() {
        return this.Field_2472;
    }

    public GameProfile[] Method_2546() {
        return this.Field_2490.Method_3098();
    }

    public Class_1782 Method_2547() {
        return new Class_2840(this.Method_2588());
    }

    public abstract String Method_2548(Class_35650 var1, boolean var2);

    public void Method_2549(Class_3069 class_3069) {
        this.Field_2490 = class_3069;
    }

    public Class_2651 Method_2550(int n) {
        return n == (-1 & -1) ? this.Field_2463[-14573 & 4097] : (n == (7449 & 69) ? this.Field_2463[2722 & -32434] : this.Field_2463[5448 & 176]);
    }

    protected void Method_2551(String string, String string2, long l, Class_43755 class_43755, String string3) {
        Class_9780 class_9780;
        this.Method_2633(string);
        this.Method_2559("menu.loadingLevel");
        this.Field_2463 = new Class_2651[24707 & 2307];
        this.Field_2474 = new long[this.Field_2463.length][7269 & -7308];
        Class_26655 class_26655 = this.Field_2459.Method_2048(string, (421 & 3097) != 0);
        this.Method_2525(this.Method_2590(), class_26655);
        Class_31717 class_31717 = class_26655.Method_26657();
        if (class_31717 == null) {
            if (this.Method_2575()) {
                class_9780 = Class_29849.Field_29850;
            } else {
                class_9780 = new Class_9780(l, this.Method_2585(), this.Method_2563(), this.Method_2613(), class_43755);
                class_9780.Method_9789(string3);
                if (this.Field_2495) {
                    class_9780.Method_9796();
                }
            }
            class_31717 = new Class_31717(class_9780, string2);
        } else {
            class_31717.Method_31776(string2);
            class_9780 = new Class_9780(class_31717);
        }
        for (int i = 17160 & 2288; i < this.Field_2463.length; ++i) {
            int n = 8 & 10273;
            if (i == (1281 & 4225)) {
                n = -1 & -1;
            }
            if (i == (10754 & 82)) {
                n = 9233 & 4483;
            }
            if (i == 0) {
                this.Field_2463[i] = this.Method_2575() ? (Class_2651)new Class_29849(this, class_26655, class_31717, n, this.Field_2500).\u0000strictfp() : (Class_2651)new Class_2651(this, class_26655, class_31717, n, this.Field_2500).Method_2673();
                this.Field_2463[i].Method_2682(class_9780);
            } else {
                this.Field_2463[i] = (Class_2651)new Class_29684(this, class_26655, n, this.Field_2463[1 & 26652], this.Field_2500).Method_29686();
            }
            this.Field_2463[i].\u0000strictfp((Class_2638)new Class_31896(this, this.Field_2463[i]));
            if (this.Method_2538()) continue;
            this.Field_2463[i].\u0000strictfp().Method_31757(this.Method_2585());
        }
        this.Field_2490.Method_3106(this.Field_2463);
        this.Method_2576(this.Method_2541());
        this.Method_2534();
    }

    public boolean Method_2552() {
        return this.Field_2494;
    }

    public Class_2754 Method_2553() {
        return this.Field_2473;
    }

    public String[] Method_2554() {
        return this.Field_2490.Method_3093();
    }

    public Class_1061 Method_2555(UUID uUID) {
        Class_2651[] arrclass_2651 = this.Field_2463;
        int n = arrclass_2651.length;
        for (int i = 4618 & 1024; i < n; ++i) {
            Class_1061 class_1061;
            Class_2651 class_2651 = arrclass_2651[i];
            if (class_2651 == null || (class_1061 = class_2651.Method_2675(uUID)) == null) continue;
            return class_1061;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture Method_2556(Callable callable) {
        Validate.notNull((Object)callable);
        if (!this.Method_2564() && !this.Method_2517()) {
            ListenableFutureTask listenableFutureTask = ListenableFutureTask.create((Callable)callable);
            Queue queue = this.Field_2497;
            synchronized (queue) {
                this.Field_2497.add(listenableFutureTask);
                return listenableFutureTask;
            }
        }
        try {
            return Futures.immediateFuture(callable.call());
        }
        catch (Exception exception) {
            return Futures.immediateFailedCheckedFuture((Exception)exception);
        }
    }

    public void Method_2557(String string) {
        this.Field_2493 = string;
    }

    public Class_15008 Method_2558() {
        return this.Field_2458;
    }

    protected synchronized void Method_2559(String string) {
        this.Field_2462 = string;
    }

    public MinecraftSessionService Method_2560() {
        return this.Field_2504;
    }

    public abstract boolean Method_2561();

    public void Method_2562(boolean bl) {
        this.Field_2496 = bl;
    }

    public abstract boolean Method_2563();

    public boolean Method_2564() {
        return (Thread.currentThread() == this.Field_2488 ? -24365 & 517 : -32766 & 1796) != 0;
    }

    public boolean Method_2565() {
        return this.Field_2485;
    }

    public boolean Method_2566() {
        return this.Field_2479;
    }

    public int Method_2567() {
        return 298439540 & -2081832080;
    }

    public int Method_2568() {
        return this.Field_2502;
    }

    protected Class_3049 Method_2569() {
        return new Class_3049();
    }

    public Class_1061 Method_2570() {
        return null;
    }

    protected void Method_2571(String string, double d) {
        this.Field_2480 = string;
        this.Field_2475 = d;
        Object[] arrobject = new Object[27714 & 259];
        arrobject[-24028 & 2192] = string;
        arrobject[4201 & 11139] = d;
        Field_2460.info(String.format("%s: %.2f%%", arrobject));
    }

    public String Method_2572() {
        return this.Field_2493;
    }

    public boolean Method_2573() {
        return this.Field_2503;
    }

    public void Method_2574(String string) {
        this.Field_2468 = string;
    }

    public boolean Method_2575() {
        return this.Field_2470;
    }

    public void Method_2576(Class_26801 class_26801) {
        for (int i = 14405 & 1080; i < this.Field_2463.length; ++i) {
            Class_2651 class_2651 = this.Field_2463[i];
            if (class_2651 == null) continue;
            if (class_2651.Method_386().Method_31839()) {
                class_2651.Method_386().Method_31801(Class_26801.Field_26804);
                class_2651.Method_367((-28415 & 8339) != 0, (6149 & 8995) != 0);
                continue;
            }
            if (this.Method_2538()) {
                class_2651.Method_386().Method_31801(class_26801);
                class_2651.Method_367((class_2651.Method_487() != Class_26801.Field_26803 ? 2437 & -24567 : 96 & 28165) != 0, (-28639 & 2241) != 0);
                continue;
            }
            class_2651.Method_386().Method_31801(class_26801);
            class_2651.Method_367(this.Method_2581(), this.Field_2478);
        }
    }

    public void Method_2577(KeyPair keyPair) {
        this.Field_2466 = keyPair;
    }

    public void Method_2578() {
        long l = System.nanoTime();
        this.Field_2465 += 6711 & -15999;
        if (this.Field_2489) {
            this.Field_2489 = 188 & 23811;
            this.Field_2500.Field_2773 = 449 & 11;
            this.Field_2500.Method_2792();
        }
        this.Field_2500.Method_2789("root");
        this.Method_2627();
        if (l - this.Field_2481 >= (5000000000L & 7219464119008621192L)) {
            this.Field_2481 = l;
            this.Field_2469.Method_3179(new Class_21330(this.Method_2539(), this.Method_2608()));
            GameProfile[] arrgameProfile = new GameProfile[Math.min(this.Method_2608(), 556 & -15348)];
            int n = Class_13337.Method_13379(this.Field_2510, -32736 & 25872, this.Method_2608() - arrgameProfile.length);
            for (int i = 516 & 24961; i < arrgameProfile.length; ++i) {
                arrgameProfile[i] = ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)this.Field_2490.Method_3124().get(n + i)).\u0000strictfp();
            }
            Collections.shuffle(Arrays.asList(arrgameProfile));
            this.Field_2469.Method_3174().Method_21335(arrgameProfile);
        }
        if (this.Field_2465 % (9124 & 916) == 0) {
            this.Field_2500.Method_2789("save");
            this.Field_2490.Method_3095();
            this.Method_2622((53 & 20611) != 0);
            this.Field_2500.Method_2790();
        }
        this.Field_2500.Method_2789("tallying");
        this.Field_2498[this.Field_2465 % (-7307 & 1124)] = System.nanoTime() - l;
        this.Field_2500.Method_2790();
        this.Field_2500.Method_2789("snooper");
        if (!this.Field_2477.Method_2441() && this.Field_2465 > (4468 & 236)) {
            this.Field_2477.Method_2443();
        }
        if (this.Field_2465 % (-26768 & 6008) == 0) {
            this.Field_2477.Method_2438();
        }
        this.Field_2500.Method_2790();
        this.Field_2500.Method_2790();
    }

    public abstract int Method_2579();

    public int Method_2580() {
        return 8600 & 2308;
    }

    protected boolean Method_2581() {
        return (-30655 & 1033) != 0;
    }

    public void Method_2582() {
        this.Field_2489 = 16505 & -29945;
    }

    public void Method_2583(Class_35650 class_35650) {
        for (int i = 20996 & 144; i < this.Field_2463.length; ++i) {
            Class_2457.Method_2530().Field_2463[i].\u0000strictfp().Method_31757(class_35650);
        }
    }

    public void Method_2584(Class_1782 class_1782) {
        Field_2460.info(class_1782.Method_1788());
    }

    public abstract Class_35650 Method_2585();

    protected void Method_2586() {
    }

    public void Method_2587(String string) {
        this.Field_2467 = string;
    }

    public String Method_2588() {
        return "Server";
    }

    public void Method_2589(String string) {
        Field_2460.warn(string);
    }

    public String Method_2590() {
        return this.Field_2467;
    }

    public void Method_2591(boolean bl) {
        this.Field_2472 = bl;
    }

    public void Method_2592(boolean bl) {
        this.Field_2503 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Method_2593() {
        block29 : {
            long l;
            block28 : {
                try {
                    if (this.Method_2621()) {
                        this.Field_2499 = Class_2457.Method_2513();
                        l = 135414291L & 8021233600329187360L;
                        this.Field_2469.Method_3177(new Class_2840(this.Field_2508));
                        this.Field_2469.Method_3171(new Class_13307("1.8.8", 2799 & 20527));
                        this.Method_2599(this.Field_2469);
                        break block28;
                    }
                    this.Method_2604(null);
                    break block29;
                }
                catch (Throwable throwable) {
                    try {
                        Field_2460.error("Encountered an unexpected exception", throwable);
                        Class_13268 class_13268 = null;
                        class_13268 = throwable instanceof Class_1809 ? this.Method_2612(((Class_1809)throwable).Method_1812()) : this.Method_2612(new Class_13268("Exception in server tick loop", throwable));
                        UUID uUID = Class_6093.Method_6098(throwable, class_13268.Method_13282());
                        class_13268.Method_13281().Method_13231("UUID", uUID == null ? "(null)" : uUID);
                        File file = new File(new File(this.Method_2528(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
                        if (class_13268.Method_13286(file)) {
                            Field_2460.error("This crash report has been saved to: " + file.getAbsolutePath());
                        } else {
                            Field_2460.error("We were unable to save this crash report to disk.");
                        }
                        this.Method_2604(class_13268);
                    }
                    catch (Throwable throwable2) {
                        try {
                            this.Field_2492 = 9793 & 20489;
                            this.Method_2532();
                            throw throwable2;
                        }
                        catch (Throwable throwable3) {
                            Field_2460.error("Exception stopping the server", throwable3);
                            Class_6093.Method_6098(throwable3, "Exception stopping the server");
                            throw throwable2;
                        }
                        finally {
                            this.Method_2586();
                        }
                    }
                    try {
                        this.Field_2492 = 257 & -32695;
                        this.Method_2532();
                        return;
                    }
                    catch (Throwable throwable4) {
                        Field_2460.error("Exception stopping the server", throwable4);
                        Class_6093.Method_6098(throwable4, "Exception stopping the server");
                        return;
                    }
                    finally {
                        this.Method_2586();
                    }
                }
            }
            while (this.Field_2485) {
                long l2 = Class_2457.Method_2513();
                long l3 = l2 - this.Field_2499;
                if (l3 > (-5141215459064936496L & 1145513944L) && this.Field_2499 - this.Field_2483 >= (537737977L & -8036180455566852456L)) {
                    Object[] arrobject = new Object[-3646 & 2058];
                    arrobject[11305 & 16642] = l3;
                    arrobject[-26593 & 16705] = l3 / (2622879406785581750L & -2622879408620175310L);
                    Field_2460.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", arrobject);
                    l3 = 6358992L & 1871466456L;
                    this.Field_2483 = this.Field_2499;
                }
                if (l3 < (853637048467216457L & -853637048681856480L)) {
                    Field_2460.warn("Time ran backwards! Did the system time change?");
                    l3 = 5844243138177467008L & 1088454711L;
                }
                l += l3;
                this.Field_2499 = l2;
                if (this.Field_2463[27030 & 1065].Method_2701()) {
                    this.Method_2578();
                    l = 1094726824L & 5912219278614218752L;
                } else {
                    while (l > (104925494L & 1216537992860401778L)) {
                        l -= 22898L & -2758000152684748238L;
                        this.Method_2578();
                    }
                }
                Thread.sleep(Math.max(-5145520059982737399L & 5145520059055104133L, (5195674666529786934L & 4743346L) - l));
                this.Field_2479 = 16909 & -26495;
            }
        }
        try {
            this.Field_2492 = 14893 & 129;
            this.Method_2532();
            return;
        }
        catch (Throwable throwable) {
            Field_2460.error("Exception stopping the server", throwable);
            Class_6093.Method_6098(throwable, "Exception stopping the server");
            return;
        }
        finally {
            this.Method_2586();
        }
    }

    public boolean Method_2594() {
        return (1328 & 4107) != 0;
    }

    public Class_3166 Method_2595() {
        return this.Field_2469;
    }

    public boolean Method_2596() {
        return (this.Field_2505 != null ? 27877 & -28671 : 10328 & 256) != 0;
    }

    public String Method_2597() {
        return "1.8.8";
    }

    public KeyPair Method_2598() {
        return this.Field_2466;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_2599(Class_3166 class_3166) {
        File file = this.Method_2535("server-icon.png");
        if (file.isFile()) {
            Class_22553 class_22553 = Class_16620.Method_16633();
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Validate.validState((bufferedImage.getWidth() == (-9767 & 9316) ? -16211 & 2065 : 1472 & 22) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[-8128 & 4398]);
                Validate.validState((bufferedImage.getHeight() == (-31640 & 83) ? 21 & 201 : 1031 & 17216) != 0, (String)"Must be 64 pixels high", (Object[])new Object[276 & 2794]);
                ImageIO.write((RenderedImage)bufferedImage, "PNG", new Class_2727(class_22553));
                Class_22553 class_225532 = Class_37686.Method_37689(class_22553);
                class_3166.Method_3178("data:image/png;base64," + class_225532.Method_22554(Charsets.UTF_8));
            }
            catch (Exception exception) {
                Field_2460.error("Couldn't load server icon", (Throwable)exception);
            }
            finally {
                class_22553.release();
            }
        }
    }

    public boolean Method_2600() {
        return this.Field_2496;
    }

    public List Method_2601(Class_1367 class_1367, String string, Class_4751 class_4751) {
        ArrayList arrayList = Lists.newArrayList();
        if (string.startsWith("/")) {
            int n = !(string = string.substring(-32703 & 27929)).contains(" ") ? -32237 & 8453 : -7612 & 1032;
            List list = this.Field_2473.Method_2755(class_1367, string, class_4751);
            if (list != null) {
                for (String string2 : list) {
                    if (n != 0) {
                        arrayList.add("/" + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            return arrayList;
        }
        String[] arrstring = string.split(" ", -1 & -1);
        String string3 = arrstring[arrstring.length - (553 & 16453)];
        String[] arrstring2 = this.Field_2490.Method_3093();
        int n = arrstring2.length;
        for (int i = -13180 & 4360; i < n; ++i) {
            String string4 = arrstring2[i];
            if (!Class_36787.Method_36813(string3, string4)) continue;
            arrayList.add(string4);
        }
        return arrayList;
    }

    public abstract boolean Method_2602();

    public GameProfileRepository Method_2603() {
        return this.Field_2476;
    }

    protected void Method_2604(Class_13268 class_13268) {
    }

    public abstract boolean Method_2605();

    public void Method_2606(Class_2423 class_2423) {
        class_2423.Method_2437("singleplayer", this.Method_2538());
        class_2423.Method_2437("server_brand", this.Method_2614());
        class_2423.Method_2437("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        class_2423.Method_2437("dedicated", this.Method_2602());
    }

    public void Method_2607(boolean bl) {
        this.Field_2495 = bl;
    }

    public int Method_2608() {
        return this.Field_2490.Method_3092();
    }

    public Class_2047 Method_2609() {
        return this.Field_2459;
    }

    public void Method_2610() {
        this.Field_2481 = 1077944912L & 554796033L;
    }

    public synchronized String Method_2611() {
        return this.Field_2462;
    }

    public Class_13268 Method_2612(Class_13268 class_13268) {
        class_13268.Method_13281().Method_13232("Profiler Position", new Class_18690(this));
        if (this.Field_2490 != null) {
            class_13268.Method_13281().Method_13232("Player Count", new Class_25232(this));
        }
        return class_13268;
    }

    public abstract boolean Method_2613();

    public String Method_2614() {
        return "vanilla";
    }

    protected void Method_2615() {
        Field_2471 = this;
    }

    public Class_3069 Method_2616() {
        return this.Field_2490;
    }

    public int Method_2617() {
        return this.Field_2482;
    }

    private static String Method_2618(String string) {
        int n = 7035;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2457.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_2619() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_2620() {
        return this.Field_2465;
    }

    static {
        Field_2507 = new File(Class_2457.Method_2618("\u8c86\u8c81\u8c84\u8c83\u8c84\u8c87\u8c86\u8c8d\u8c86\u8c8d\u8c8a\u8c83\u8c88\u8c89"));
    }

    protected abstract boolean Method_2621();

    protected void Method_2622(boolean bl) {
        if (!this.Field_2491) {
            Class_2651[] arrclass_2651 = this.Field_2463;
            int n = arrclass_2651.length;
            for (int i = 32 & -26493; i < n; ++i) {
                Class_2651 class_2651 = arrclass_2651[i];
                if (class_2651 == null) continue;
                if (!bl) {
                    Field_2460.info("Saving chunks for level '" + class_2651.\u0000strictfp().Method_31831() + "'/" + class_2651.\u0000strictfp.Method_18380());
                }
                try {
                    class_2651.Method_2683((19457 & 8743) != 0, null);
                    continue;
                }
                catch (Class_2746 class_2746) {
                    Field_2460.warn(class_2746.getMessage());
                }
            }
        }
    }

    public void Method_2623() {
        this.Field_2491 = -8191 & 2333;
        this.Method_2609().Method_2053();
        for (int i = -32768 & 4112; i < this.Field_2463.length; ++i) {
            Class_2651 class_2651 = this.Field_2463[i];
            if (class_2651 == null) continue;
            class_2651.Method_2717();
        }
        this.Method_2609().Method_2055(this.Field_2463[-32240 & 19744].\u0000strictfp().Method_26660());
        this.Method_2520();
    }

    public void Method_2624(int n) {
        this.Field_2502 = n;
    }

    public abstract boolean Method_2625();

    public Class_3180 Method_2626() {
        return this.Field_2484;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_2627() {
        int n;
        this.Field_2500.Method_2789("jobs");
        Queue queue = this.Field_2497;
        synchronized (queue) {
            while (!this.Field_2497.isEmpty()) {
                Class_2090.Method_2093((FutureTask)this.Field_2497.poll(), Field_2460);
            }
        }
        this.Field_2500.Method_2783("levels");
        for (n = 1043 & -15836; n < this.Field_2463.length; ++n) {
            long l = System.nanoTime();
            if (n == 0 || this.Method_2523()) {
                Class_2651 class_2651 = this.Field_2463[n];
                this.Field_2500.Method_2789(class_2651.\u0000strictfp().Method_31831());
                if (this.Field_2465 % (20 & -2859) == 0) {
                    this.Field_2500.Method_2789("timeSync");
                    this.Field_2490.Method_3108(new Class_44788(class_2651.\u0000, `(), class_2651.\u0000= final(), class_2651.\u0000strictfp().Method_7529("doDaylightCycle")), class_2651.\u0000strictfp.Method_18379());
                    this.Field_2500.Method_2790();
                }
                this.Field_2500.Method_2789("tick");
                try {
                    class_2651.Method_2691();
                }
                catch (Throwable throwable) {
                    Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception ticking world");
                    class_2651.\u0000strictfp(class_13268);
                    throw new Class_1809(class_13268);
                }
                try {
                    class_2651.Method_2696();
                }
                catch (Throwable throwable) {
                    Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception ticking world entities");
                    class_2651.\u0000strictfp(class_13268);
                    throw new Class_1809(class_13268);
                }
                this.Field_2500.Method_2790();
                this.Field_2500.Method_2789("tracker");
                class_2651.Method_2711().Method_7973();
                this.Field_2500.Method_2790();
                this.Field_2500.Method_2790();
            }
            this.Field_2474[n][this.Field_2465 % (-22172 & 1637)] = System.nanoTime() - l;
        }
        this.Field_2500.Method_2783("connection");
        this.Method_2558().Method_15020();
        this.Field_2500.Method_2783("players");
        this.Field_2490.Method_3130();
        this.Field_2500.Method_2783("tickables");
        for (n = 576 & 7308; n < this.Field_2487.size(); ++n) {
            ((Class_5591)this.Field_2487.get(n)).Method_5592();
        }
        this.Field_2500.Method_2790();
    }

    public boolean Method_2628(int n, String string) {
        return (-32063 & 9477) != 0;
    }

    public String Method_2629() {
        return this.Field_2468;
    }

    static Class_3069 Method_2630(Class_2457 class_2457) {
        return class_2457.Field_2490;
    }

    public boolean Method_2631() {
        return (18533 & -32511) != 0;
    }

    public void Method_2632() {
        this.Field_2488 = new Thread((Runnable)this, "Server thread");
        this.Field_2488.start();
    }

    protected void Method_2633(String string) {
        if (this.Method_2609().Method_2056(string)) {
            Field_2460.info("Converting map!");
            this.Method_2559("menu.convertingLevel");
            this.Method_2609().Method_2050(string, new Class_10391(this));
        }
    }

    public Class_2423 Method_2634() {
        return this.Field_2477;
    }

    protected void Method_2635() {
        this.Field_2480 = null;
        this.Field_2475 = 0.0;
    }

    public boolean Method_2636(Class_283 class_283, Class_4751 class_4751, Class_626 class_626) {
        return (4710 & 272) != 0;
    }

    public boolean Method_2637() {
        return this.Field_2478;
    }
}

