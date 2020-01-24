/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  internal.org.lwjgl.util.vector.Vector3f
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import internal.org.lwjgl.util.vector.Vector3f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.renderer.block.model.ModelBlock;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_11777 {
    private static final Joiner Field_11778;
    private final Map Field_11779 = Maps.newHashMap();
    private final Class_279 Field_11780;
    protected static final Class_41302 Field_11781;
    private Map Field_11782 = Maps.newLinkedHashMap();
    private final Map Field_11783 = new HashMap();
    private final Map Field_11784 = Maps.newLinkedHashMap();
    private Class_2804 Field_11785 = new Class_2804();
    private final Class_9892 Field_11786 = new Class_9892();
    private final Class_24069 Field_11787;
    private final Class_7291 Field_11788 = new Class_7291();
    private static final ModelBlock Field_11789;
    private Map Field_11790 = Maps.newIdentityHashMap();
    private static final Set Field_11791;
    private final Map Field_11792 = Maps.newLinkedHashMap();
    private static final ModelBlock Field_11793;
    private final Class_36433 Field_11794;
    private static final ModelBlock Field_11795;
    private static final Logger Field_11796;
    private static final ModelBlock Field_11797;
    private static final Map Field_11798;

    private ModelBlock Method_11799(ModelBlock modelBlock) {
        return this.Field_11788.Method_7295(this.Field_11787, modelBlock);
    }

    private static String Method_11800(String string) {
        int n = 31442;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Object[] arrobject = new Class_2080[5170 & -24165];
        arrobject[-30696 & 18085] = new Class_2080(Class_11777.Method_11831("\u328c\u3281\u3280\u328d\u3284\u328d\u32c0\u3289\u3284\u3281\u3280\u3285\u3288\u3281\u3288\u3289\u3288"));
        arrobject[8545 & 3] = new Class_2080(Class_11777.Method_11841("\ua181\ua183\ua180\ua180\ua180\ua190\ua1c0\ua190\ua182\ua193\ua182\ua191\ua1b0\ua190\ua193\ua182\ua193\ua193"));
        arrobject[774 & -24550] = new Class_2080(Class_11777.Method_11820("\ua841\ua84c\ua84e\ua843\ua84c\ua845\ua80a\ua84a\ua848\ua84c\ua84a\ua867\ua849\ua840\ua842\ua84b"));
        arrobject[18719 & 35] = new Class_2080(Class_11777.Method_11818("\u0409\u0403\u0400\u0408\u0400\u0418\u0400\u0403\u040a\u0419\u040a\u0430\u0418\u041b\u0402\u0403\u0413"));
        arrobject[228 & 25605] = new Class_2080(Class_11777.Method_11814("abbcde&djiijloNoccbaD&"));
        arrobject[20565 & 901] = new Class_2080(Class_11777.Method_11854("\u202a\u2021\u2020\u2029\u2026\u202f\u2064\u202f\u2028\u202b\u202a\u2029\u2026\u2025\u2004\u202d\u2028\u2029\u2028\u202b\u2006\u206d"));
        arrobject[2078 & -16378] = new Class_2080(Class_11777.Method_11850("\u83a4\u83a0\u83a3\u83a7\u83a5\u83a5\u83a3\u83a2\u83a1\u83a5\u83a2\u83a6\u83a1\u83a5\u8383\u83a7\u83a0\u83a5\u83a3\u83a3\u8381\u83a4"));
        arrobject[8775 & 16399] = new Class_2080(Class_11777.Method_11828("\u284a\u2840\u2840\u2848\u2842\u285a\u2800\u284a\u2840\u2852\u2852\u2850\u284a\u2858\u2858\u2850\u2858\u2848\u2848\u284a\u2852\u281a"));
        arrobject[8728 & 16397] = new Class_2080(Class_11777.Method_11845("\u464e\u4641\u4640\u464d\u4646\u464f\u4600\u464b\u4648\u464f\u464a\u464d\u4642\u4645\u4660\u464d\u4648\u464d\u4648\u464b\u4662\u4609"));
        arrobject[-19891 & 2059] = new Class_2080(Class_11777.Method_11833("\u4051\u405a\u4058\u4051\u405c\u4045\u401c\u4056\u405a\u4049\u404b\u4048\u4054\u4047\u4044\u404d\u4043\u4053\u4050\u4053\u404c\u4007"));
        arrobject[538 & -31606] = new Class_2080(Class_11777.Method_11851("\u45a4\u45a1\u45a2\u45a7\u45a4\u45b5\u45a2\u45a3\u45a8\u45bd\u45ba\u45bf\u45a8\u45bd\u459a\u45bf\u45a0\u45b5\u45b2\u45b3\u4580\u45a1"));
        arrobject[795 & -32689] = new Class_2080(Class_11777.Method_11803("\u1802\u1800\u1800\u1800\u1802\u1802\u1840\u1802\u1808\u180a\u180a\u1808\u180a\u1808\u1808\u1808\u1810\u1810\u1810\u1812\u1812\u1852"));
        arrobject[1196 & 4684] = new Class_2080(Class_11777.Method_11840("\u0485\u048b\u048a\u0486\u048c\u0484\u04ca\u0481\u0482\u0484\u0481\u0487\u0488\u048e\u048a\u0486\u0483\u0486\u0482\u0480\u0488\u04cf"));
        arrobject[-25315 & 559] = new Class_2080(Class_11777.Method_11830("\u0350\u0350\u0352\u0352\u0354\u0344\u0316\u0356\u0350\u0340\u0342\u0342\u0354\u0344\u0366\u0346\u0350\u0340\u0342\u0342\u0374\u0314"));
        arrobject[9262 & -15857] = new Class_2080(Class_11777.Method_11825("\u8011\u8004\u8015\u8015\u8005\u8011\u8011\u8011\u8000\u8004\u8001\u8025\u8015\u8004\u8011\u8011\u8010\u8035\u8011\u8004\u8001\u8010\u8031\u8004\u8005\u8004\u8005\u8005\u8010"));
        arrobject[-31985 & 6223] = new Class_2080(Class_11777.Method_11812("\u8020\u8035\u8026\u8027\u8034\u8021\u8022\u8023\u8038\u803d\u803a\u801f\u802c\u803d\u802a\u802b\u8030\u8015\u8032\u8027\u8020\u8031\u8012\u8027\u8028\u802d\u803a\u803f\u803c\u8029\u802e\u803b\u8024"));
        arrobject[-15524 & 10288] = new Class_2080(Class_11777.Method_11816("\u090a\u0902\u0902\u090b\u0904\u090d\u0906\u090f\u090b\u090a\u0902\u0901\u090e\u090c\u0906\u0905\u0911\u0919\u0910\u091a\u091c\u0916\u091c\u091e\u091a\u0919\u0918\u0913\u0915\u091d\u091c"));
        arrobject[-32527 & 10261] = new Class_2080(Class_11777.Method_11823("\u0010\u0000\u0010\u0010\u0004\u0014\u0014\u0014\u0000\u0000\u0000\u0000\u0014\u0004\u0014\u0014\u0010\u0010\u0010\u0000\u0004\u0014\u0014\u0004\u0000\u0000\u0010\u0010"));
        Field_11791 = Sets.newHashSet((Object[])arrobject);
        Field_11796 = LogManager.getLogger();
        Field_11781 = new Class_41302(Class_11777.Method_11829("\u25d1\u25c4\u25da\u25df\u25c1\u25dc\u25db\u259a\u25dc\u25d8\u25c2\u25c2\u25dc\u25d9\u25d2"), Class_11777.Method_11853("\u2610\u2611\u2600\u2601\u2614\u2614\u2614"));
        Field_11798 = new HashMap();
        Field_11778 = Joiner.on((String)Class_11777.Method_11826("\u8b32\u8b36\u8b24\u8b33"));
        Field_11793 = ModelBlock.deserialize(Class_11777.Method_11856("\ub9a5\ub9e4\ub9a3\ub9a2\ub9a5\ub9a5\ub9a7\ub9a6\ub9a8\ub9ad\ub9ee\ub9ee\ub989\ub9a9\ub9ea\ub9ea\ub9f4\ub9b0\ub9b6\ub9b3\ub9b5\ub9f0\ub9f2\ub9f2\ub99d\ub9fc\ub9fa\ub9fe\ub9f8\ub9fc\ub9fa\ub9fa\ub981\ub9e0\ub9e6\ub9e6\ub9e0\ub9e0\ub9a6\ub9a7\ub9ec\ub9ec\ub9ee\ub98f\ub9e9\ub9ec\ub9ee\ub9ea\ub9f5\ub9f0\ub9f2\ub9f6\ub9f1\ub9f4\ub997\ub9f6\ub9fc\ub9fc\ub9fe\ub9fe\ub9bc\ub9b9\ub9bb\ub9bf\ub9a5\ub9e4\ub9e6\ub9e6\ub9a1\ub9e0\ub9e2\ub9e2\ub9ec\ub9ec\ub9ee\ub9ee\ub9e8\ub9ac\ub9af\ub9af\ub9b0\ub9f4\ub9f6\ub9f6\ub9b1\ub9f0\ub9b7\ub9b6\ub9fc\ub9fc\ub9fe\ub99f\ub9f8\ub9fc\ub9fa\ub9fa\ub9e0\ub9e4\ub9e7\ub9e2\ub9e4\ub9e0\ub9e3\ub9e6\ub989\ub9e8\ub9ee\ub9ee\ub9ac\ub9ad\ub9aa\ub9ae\ub9b1\ub9b4\ub9b3\ub9f6\ub9f0\ub9f0\ub9f2\ub9b7\ub9fc\ub9fc\ub9fe\ub9bb\ub9bd\ub99d\ub9bf"));
        Field_11795 = ModelBlock.deserialize(Class_11777.Method_11836("9!#+!(#+88*3\u00110*+ !2*)!:#\u00119\"+8!*;\u0019)\"# !2*(1*\u001299\"+11*#11\u001b+()*+((+*qazcyabchijkhiczhazcyasshqjRxaj{hasshassQajkxhr{qqccxabzhijrqPs"));
        Field_11797 = ModelBlock.deserialize(Class_11777.Method_11810("\u0200\u0241\u0204\u0205\u0204\u0205\u0204\u0205\u0204\u0201\u0240\u0241\u0220\u0201\u0240\u0241\u0250\u0215\u0210\u0215\u0214\u0251\u0250\u0251\u0230\u0251\u0254\u0251\u0250\u0255\u0250\u0251\u0204\u0265\u0260\u0261\u0260\u0261\u0224\u0225\u0260\u0261\u0260\u0201\u0260\u0265\u0264\u0261\u0270\u0275\u0274\u0271\u0270\u0275\u0214\u0275\u0270\u0271\u0270\u0271\u0234\u0231\u0230\u0235\u0200\u0241\u0240\u0241\u0200\u0241\u0240\u0241\u0240\u0241\u0240\u0241\u0240\u0205\u0204\u0205\u0214\u0251\u0250\u0251\u0210\u0251\u0214\u0215\u0250\u0251\u0250\u0231\u0250\u0255\u0250\u0251\u0264\u0261\u0260\u0265\u0264\u0261\u0260\u0265\u0204\u0265\u0260\u0261\u0224\u0225\u0220\u0225\u0234\u0231\u0234\u0271\u0270\u0271\u0270\u0235\u0270\u0271\u0270\u0235\u0234\u0215\u0234"));
        Field_11789 = ModelBlock.deserialize(Class_11777.Method_11808("\u0548\u0500\u0546\u054e\u0542\u054b\u0542\u0548\u0547\u0541\u0501\u0508\u054c\u054d\u0507\u0506\u0501\u0544\u0541\u054d\u054a\u0504\u050d\u0506\u0548\u0502\u050f\u0502\u0507\u050a\u0507\u0506\u054e\u050e\u0503\u0502\u0507\u0504\u0543\u0549\u0501\u0508\u0503\u0549\u0506\u0500\u050b\u0506\u0502\u0504\u050f\u0502\u0506\u0500\u054a\u050a\u0503\u0502\u0503\u0500\u0541\u0547\u0544\u0543\u0500\u0540\u0549\u0542\u050c\u0546\u0547\u0546\u0543\u0542\u0543\u0542\u0545\u0502\u0508\u0501\u050d\u0540\u0549\u0542\u050c\u0544\u0502\u0500\u0541\u0548\u0543\u0509\u0547\u054a\u0547\u0546\u054f\u0542\u0542\u0544\u054b\u0546\u0546\u0540\u050e\u054e\u0543\u0540\u0503\u0503\u050f\u0502\u0506\u0500\u0506\u0540\u054d\u0544\u0545\u050b\u0543\u0542\u0543\u050f\u050a\u050b\u050a"));
        Field_11798.put(Class_11777.Method_11842("\u2054\u2051\u2048\u2049\u2054\u2052\u2058"), Class_11777.Method_11846("\u8201\u8200\u8200\u8200\u8205\u8204\u8204\u8205\u8200\u8201\u8201\u8200\u8204\u8204\u8205\u8204\u8210\u8210\u8210\u8210\u8215\u8214\u8214\u8215\u8211\u8210\u8211\u8210\u8214\u8214\u8214\u8215\u8201\u8201\u8201\u8201\u8204\u8205\u8204\u8205\u8200\u8200\u8200\u8200\u8204\u8204\u8205\u8205\u8211\u8211\u8211\u8210\u8215\u8214\u8215\u8214\u8210\u8210\u8210\u8211\u8215\u8215\u8215\u8215\u8200\u8201\u8200\u8201\u8204\u8205\u8204\u8204\u8200\u8201\u8200\u8201\u8205\u8205\u8204\u8204\u8211\u8210\u8210\u8210\u8215\u8214\u8215\u8214\u8210\u8210\u8210\u8210\u8214\u8214\u8214\u8215\u8201\u8200\u8200\u8200\u8205\u8204\u8204\u8204\u8200\u8200\u8200\u8200\u8204\u8204\u8205\u8204\u8210\u8210\u8210\u8210\u8214\u8214\u8214\u8215\u8210\u8210\u8210\u8211\u8214\u8215\u8214\u8214\u8280\u8281\u8280\u8280\u8284\u8285\u8284\u8284\u8281\u8280\u8280\u8280\u8284\u8284\u8284\u8284\u8290\u8291\u8291\u8291\u8295\u8294\u8294\u8294\u8291\u8290\u8290\u8290\u8294\u8294\u8294\u8294\u8280\u8280\u8280\u8280\u8285\u8285\u8284\u8284\u8280\u8280\u8280\u8281\u8284\u8284\u8285\u8284\u8290\u8290\u8290\u8291\u8294\u8294\u8294\u8294\u8290\u8290\u8290\u8291\u8294\u8294\u8294\u8295\u8280\u8280\u8281\u8280\u8284\u8284\u8285\u8285\u8280\u8280\u8280\u8281\u8285\u8285\u8284\u8284\u8290\u8290\u8290\u8291\u8295\u8294\u8294\u8294\u8290\u8290\u8290\u8291\u8294\u8294\u8295\u8294\u8281\u8280\u8280\u8280\u8284\u8285\u8285\u8285\u8281\u8281\u8281\u8280\u8285\u8284\u8285\u8284\u8290\u8291\u8290\u8290\u8294\u8294\u8294\u8294\u8290\u8290\u8290\u8290\u8294\u8295\u8294\u8294\u8300\u8300\u8300\u8300\u8304\u8305\u8304\u8304\u8301\u8300\u8300\u8300\u8304\u8305\u8304\u8304\u8310\u8310\u8310\u8310\u8314\u8315\u8314\u8314\u8310\u8311\u8310\u8310\u8315\u8314\u8314\u8314\u8301\u8301\u8300\u8300\u8304\u8305\u8305\u8305\u8300\u8300\u8300\u8300\u8305\u8304\u8304\u8304\u8310\u8310\u8310\u8311\u8314\u8314\u8315\u8314\u8311\u8310\u8310\u8310\u8314\u8315\u8315\u8315\u8301\u8301\u8301\u8300\u8305\u8304\u8305\u8304\u8300\u8301\u8300\u8300\u8304\u8304\u8304\u8304\u8310\u8310\u8310\u8310\u8314\u8314\u8315\u8314\u8310\u8310\u8310\u8310\u8314\u8315\u8314\u8314\u8301\u8300\u8300\u8300\u8304\u8305\u8304\u8304\u8300\u8300\u8300\u8300\u8304\u8305\u8304\u8304\u8310\u8311\u8310\u8310\u8315\u8314\u8314\u8314\u8311\u8311\u8310\u8310\u8314\u8315\u8315\u8315\u8380\u8380\u8380\u8380\u8384\u8385\u8384\u8384\u8380\u8380\u8380\u8380\u8384\u8384\u8385\u8384\u8390\u8391\u8390\u8391\u8394\u8394\u8394\u8394\u8391\u8391\u8391\u8391\u8395\u8395\u8394\u8395\u8380\u8381\u8380\u8380\u8385\u8384\u8384\u8384\u8380\u8380\u8380\u8380\u8384\u8384\u8384\u8384\u8391\u8391\u8391\u8390\u8394\u8394\u8394\u8394\u8391\u8390\u8390\u8391\u8394\u8394\u8394\u8394\u8381\u8380\u8380\u8380\u8384\u8384\u8384\u8384\u8381\u8380\u8380\u8380\u8385\u8384\u8384\u8385\u8390\u8390\u8390\u8391\u8395\u8394\u8394\u8394\u8391\u8391\u8391\u8390\u8394\u8394\u8394\u8395\u8381\u8381\u8380\u8380\u8384\u8384\u8384\u8384\u8380\u8381\u8380\u8380\u8385\u8384\u8385\u8384\u8390\u8390\u8390\u8391\u8395\u8395\u8395\u8395\u8391\u8390\u8391\u8390\u8395\u8394\u8394\u8395\u8200\u8200\u8200\u8200\u8204\u8204\u8204\u8204\u8200\u8200\u8200\u8201\u8205\u8205\u8204\u8204\u8210\u8210\u8210\u8211\u8214\u8214\u8215\u8214\u8210\u8210\u8210\u8211\u8214\u8214\u8214\u8214\u8200\u8200\u8200\u8201\u8204\u8204\u8204\u8205\u8200\u8200\u8201\u8200\u8204\u8204\u8205\u8205\u8210\u8210\u8210\u8211\u8215\u8215\u8214\u8214\u8210\u8210\u8211\u8211\u8215\u8214\u8214\u8214\u8200\u8200\u8200\u8201\u8204\u8204\u8205\u8204\u8201\u8200\u8200\u8200\u8204\u8205\u8205\u8205\u8211\u8211\u8211\u8210\u8215\u8214\u8215\u8214\u8210\u8211\u8210\u8210\u8214\u8214\u8214\u8214\u8200\u8200\u8200\u8200\u8204\u8205\u8205\u8205\u8200\u8200\u8200\u8200\u8204\u8205\u8204\u8204\u8211\u8210\u8210\u8210\u8214\u8215\u8214\u8214\u8210\u8210\u8210\u8210\u8214\u8215\u8214\u8214\u8280\u8281\u8280\u8280\u8285\u8284\u8284\u8284\u8281\u8281\u8280\u8280\u8284\u8285\u8285\u8285\u8290\u8290\u8290\u8290\u8295\u8295\u8295\u8294\u8290\u8290\u8290\u8290\u8294\u8295\u8294\u8294\u8281\u8280\u8281\u8280\u8284\u8284\u8284\u8285\u8281\u8281\u8281\u8281\u8285\u8284\u8285\u8284\u8291\u8290\u8290\u8291\u8294\u8294\u8294\u8294\u8291\u8291\u8291\u8291"));
        Class_11777.Field_11793.name = Class_11777.Method_11811("\u92a1\u92a3\u92a2\u92a1\u92a4\u92a7\u92a4\u92a5\u92a1\u92a0\u92a0\u92a1\u92a7\u92a4\u92a7\u92a5\u92a0");
        Class_11777.Field_11795.name = Class_11777.Method_11800("\u0800\u0805\u0804\u0801\u0806\u0805\u0806\u0805\u080c\u080f\u080e\u080d\u080c\u080f\u0808\u080d\u0814\u0815\u0810\u0815\u0816\u0815\u0816\u0811\u0818");
        Class_11777.Field_11797.name = Class_11777.Method_11807("\u0504\u0502\u0506\u0514\u0514\u0546\u0500\u0502\u0508\u050a\u051c\u050e\u051a\u050e\u0508\u0508\u0556\u0512\u0516\u0504\u0514\u0512\u0504");
        Class_11777.Field_11789.name = Class_11777.Method_11804("DCBG@\u0003DGBG@E\u0002G@CDCF");
    }

    private void Method_11801() {
        Set set = this.Method_11859();
        set.addAll(this.Method_11834());
        set.remove(Class_24069.Field_24075);
        Class_27909 class_27909 = new Class_27909(this, set);
        this.Field_11787.Method_24122(this.Field_11780, class_27909);
        this.Field_11779.put(new Class_2080("missingno"), this.Field_11787.Method_24106());
    }

    private void Method_11802() {
        this.Method_11855();
        for (ModelBlock modelBlock : this.Field_11784.values()) {
            modelBlock.getParentFromMap(this.Field_11784);
        }
        ModelBlock.checkModelHierarchy(this.Field_11784);
    }

    private static String Method_11803(String string) {
        int n = 3208;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11804(String string) {
        int n = 24390;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11805() {
        Object object;
        for (Class_41302 object2 : this.Field_11792.keySet()) {
            object = new Class_23047();
            int class_41302 = 905 & 3190;
            for (Class_6963 class_6963 : ((Class_44698)this.Field_11792.get(object2)).Method_44704()) {
                ModelBlock modelBlock = (ModelBlock)this.Field_11784.get(class_6963.Method_6974());
                if (modelBlock != null && modelBlock.isResolved()) {
                    ++class_41302;
                    ((Class_23047)object).Method_23049(this.Method_11843(modelBlock, class_6963.Method_6968(), class_6963.Method_6971()), class_6963.Method_6973());
                    continue;
                }
                Field_11796.warn("Missing model for: " + object2);
            }
            if (class_41302 == 0) {
                Field_11796.warn("No weighted models for: " + object2);
                continue;
            }
            if (class_41302 == (545 & 1161)) {
                this.Field_11785.Method_2812(object2, ((Class_23047)object).Method_23051());
                continue;
            }
            this.Field_11785.Method_2812(object2, ((Class_23047)object).Method_23050());
        }
        for (Map.Entry entry : this.Field_11782.entrySet()) {
            object = (Class_2080)entry.getValue();
            Class_41302 class_41302 = new Class_41302((String)entry.getKey(), "inventory");
            ModelBlock modelBlock = (ModelBlock)this.Field_11784.get(object);
            if (modelBlock != null && modelBlock.isResolved()) {
                if (this.Method_11821(modelBlock)) {
                    this.Field_11785.Method_2812(class_41302, new Class_40793(modelBlock.func_181682_g()));
                    continue;
                }
                this.Field_11785.Method_2812(class_41302, this.Method_11843(modelBlock, Class_35032.Field_35033, (8288 & 3072) != 0));
                continue;
            }
            Field_11796.warn("Missing model for: " + object);
        }
    }

    private void Method_11806() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_11807(String string) {
        int n = 1381;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11808(String string) {
        int n = 13946;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11809() {
        Object[] arrobject = new String[28847 & 519];
        arrobject[-30702 & 4613] = "stone";
        arrobject[6401 & -7607] = "granite";
        arrobject[47 & -25214] = "granite_smooth";
        arrobject[-32729 & 20499] = "diorite";
        arrobject[8804 & 16406] = "diorite_smooth";
        arrobject[-32731 & 4757] = "andesite";
        arrobject[71 & -32466] = "andesite_smooth";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9446), Lists.newArrayList((Object[])arrobject));
        Object[] arrobject2 = new String[16643 & 5171];
        arrobject2[-29918 & 5] = "dirt";
        arrobject2[19201 & 5121] = "coarse_dirt";
        arrobject2[-7118 & 130] = "podzol";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9272), Lists.newArrayList((Object[])arrobject2));
        Object[] arrobject3 = new String[-11898 & 63];
        arrobject3[1536 & -20174] = "oak_planks";
        arrobject3[-15869 & 2213] = "spruce_planks";
        arrobject3[4642 & -24545] = "birch_planks";
        arrobject3[10563 & 4779] = "jungle_planks";
        arrobject3[1564 & -16378] = "acacia_planks";
        arrobject3[18725 & 4103] = "dark_oak_planks";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9379), Lists.newArrayList((Object[])arrobject3));
        Object[] arrobject4 = new String[12334 & 1943];
        arrobject4[2644 & 4128] = "oak_sapling";
        arrobject4[35 & -26535] = "spruce_sapling";
        arrobject4[10 & 2] = "birch_sapling";
        arrobject4[8715 & -31417] = "jungle_sapling";
        arrobject4[1028 & 12556] = "acacia_sapling";
        arrobject4[9477 & 615] = "dark_oak_sapling";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9389), Lists.newArrayList((Object[])arrobject4));
        Object[] arrobject5 = new String[8194 & -16058];
        arrobject5[22165 & 320] = "sand";
        arrobject5[-10207 & 525] = "red_sand";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9394), Lists.newArrayList((Object[])arrobject5));
        Object[] arrobject6 = new String[-24508 & 17452];
        arrobject6[4352 & -8105] = "oak_log";
        arrobject6[11 & 16433] = "spruce_log";
        arrobject6[50 & 29515] = "birch_log";
        arrobject6[4103 & 9283] = "jungle_log";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9383), Lists.newArrayList((Object[])arrobject6));
        Object[] arrobject7 = new String[-23482 & 772];
        arrobject7[20484 & 9408] = "oak_leaves";
        arrobject7[1 & 11481] = "spruce_leaves";
        arrobject7[-28030 & 3075] = "birch_leaves";
        arrobject7[17763 & 4235] = "jungle_leaves";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9421), Lists.newArrayList((Object[])arrobject7));
        Object[] arrobject8 = new String[21082 & 10243];
        arrobject8[16512 & 534] = "sponge";
        arrobject8[2049 & 1153] = "sponge_wet";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9453), Lists.newArrayList((Object[])arrobject8));
        Object[] arrobject9 = new String[9411 & 18435];
        arrobject9[21961 & 2] = "sandstone";
        arrobject9[-16335 & 5383] = "chiseled_sandstone";
        arrobject9[1090 & -25942] = "smooth_sandstone";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9366), Lists.newArrayList((Object[])arrobject9));
        Object[] arrobject10 = new String[11 & -11465];
        arrobject10[-12224 & 8] = "red_sandstone";
        arrobject10[8325 & -26869] = "chiseled_red_sandstone";
        arrobject10[16423 & 7882] = "smooth_red_sandstone";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9330), Lists.newArrayList((Object[])arrobject10));
        Object[] arrobject11 = new String[19 & 587];
        arrobject11[1295 & -26496] = "dead_bush";
        arrobject11[901 & 2067] = "tall_grass";
        arrobject11[2846 & 20547] = "fern";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9278), Lists.newArrayList((Object[])arrobject11));
        Object[] arrobject12 = new String[5523 & 24613];
        arrobject12[9280 & -25851] = "dead_bush";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9397), Lists.newArrayList((Object[])arrobject12));
        Object[] arrobject13 = new String[19252 & 1106];
        arrobject13[-16352 & 3612] = "black_wool";
        arrobject13[-32243 & 2049] = "red_wool";
        arrobject13[5154 & 17287] = "green_wool";
        arrobject13[14411 & -31709] = "brown_wool";
        arrobject13[8772 & 4228] = "blue_wool";
        arrobject13[-31739 & 4391] = "purple_wool";
        arrobject13[-29105 & 390] = "cyan_wool";
        arrobject13[7 & -22633] = "silver_wool";
        arrobject13[2057 & 44] = "gray_wool";
        arrobject13[-28659 & 267] = "pink_wool";
        arrobject13[8319 & -30838] = "lime_wool";
        arrobject13[-30705 & 139] = "yellow_wool";
        arrobject13[16396 & 4700] = "light_blue_wool";
        arrobject13[-32627 & 18701] = "magenta_wool";
        arrobject13[16431 & 8846] = "orange_wool";
        arrobject13[-32609 & 16655] = "white_wool";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9326), Lists.newArrayList((Object[])arrobject13));
        Object[] arrobject14 = new String[49 & 4941];
        arrobject14[40 & 22609] = "dandelion";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9353), Lists.newArrayList((Object[])arrobject14));
        Object[] arrobject15 = new String[2809 & -27633];
        arrobject15[-25591 & 16530] = "poppy";
        arrobject15[5 & -9631] = "blue_orchid";
        arrobject15[394 & 3111] = "allium";
        arrobject15[-7385 & 2051] = "houstonia";
        arrobject15[17876 & 4] = "red_tulip";
        arrobject15[-28603 & 16389] = "orange_tulip";
        arrobject15[5382 & -8185] = "white_tulip";
        arrobject15[8247 & 17159] = "pink_tulip";
        arrobject15[120 & -11124] = "oxeye_daisy";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9402), Lists.newArrayList((Object[])arrobject15));
        Object[] arrobject16 = new String[7 & -12265];
        arrobject16[5120 & -16304] = "stone_slab";
        arrobject16[2075 & 16389] = "sandstone_slab";
        arrobject16[22794 & 1539] = "cobblestone_slab";
        arrobject16[115 & 9219] = "brick_slab";
        arrobject16[8293 & -31740] = "stone_brick_slab";
        arrobject16[-16059 & 1029] = "nether_brick_slab";
        arrobject16[-20474 & 18542] = "quartz_slab";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9430), Lists.newArrayList((Object[])arrobject16));
        Object[] arrobject17 = new String[4353 & 577];
        arrobject17[-32696 & 17025] = "red_sandstone_slab";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9463), Lists.newArrayList((Object[])arrobject17));
        Object[] arrobject18 = new String[-15336 & 4434];
        arrobject18[4740 & 16418] = "black_stained_glass";
        arrobject18[-27903 & 1171] = "red_stained_glass";
        arrobject18[4435 & -32638] = "green_stained_glass";
        arrobject18[30799 & -32509] = "brown_stained_glass";
        arrobject18[16645 & 580] = "blue_stained_glass";
        arrobject18[8277 & -29177] = "purple_stained_glass";
        arrobject18[23558 & -24513] = "cyan_stained_glass";
        arrobject18[-22009 & 5135] = "silver_stained_glass";
        arrobject18[20508 & -32213] = "gray_stained_glass";
        arrobject18[4425 & -14199] = "pink_stained_glass";
        arrobject18[-32578 & 267] = "lime_stained_glass";
        arrobject18[11 & 4335] = "yellow_stained_glass";
        arrobject18[3852 & 8412] = "light_blue_stained_glass";
        arrobject18[13 & -28339] = "magenta_stained_glass";
        arrobject18[16798 & 1135] = "orange_stained_glass";
        arrobject18[143 & 8303] = "white_stained_glass";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9344), Lists.newArrayList((Object[])arrobject18));
        Object[] arrobject19 = new String[3079 & 4742];
        arrobject19[-29696 & 8242] = "stone_monster_egg";
        arrobject19[-27133 & 29] = "cobblestone_monster_egg";
        arrobject19[290 & -30198] = "stone_brick_monster_egg";
        arrobject19[-8189 & 1547] = "mossy_brick_monster_egg";
        arrobject19[26660 & 1164] = "cracked_brick_monster_egg";
        arrobject19[16501 & -32761] = "chiseled_brick_monster_egg";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9384), Lists.newArrayList((Object[])arrobject19));
        Object[] arrobject20 = new String[-11132 & 628];
        arrobject20[-16095 & 8706] = "stonebrick";
        arrobject20[-30647 & 16385] = "mossy_stonebrick";
        arrobject20[-32766 & 4807] = "cracked_stonebrick";
        arrobject20[6187 & 17667] = "chiseled_stonebrick";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9300), Lists.newArrayList((Object[])arrobject20));
        Object[] arrobject21 = new String[2726 & 9479];
        arrobject21[18690 & 1161] = "oak_slab";
        arrobject21[1027 & -23935] = "spruce_slab";
        arrobject21[-22510 & 1574] = "birch_slab";
        arrobject21[243 & 2051] = "jungle_slab";
        arrobject21[8204 & 4420] = "acacia_slab";
        arrobject21[4237 & 1125] = "dark_oak_slab";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9460), Lists.newArrayList((Object[])arrobject21));
        Object[] arrobject22 = new String[28898 & -32754];
        arrobject22[-16368 & 9316] = "cobblestone_wall";
        arrobject22[2839 & 20481] = "mossy_cobblestone_wall";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9320), Lists.newArrayList((Object[])arrobject22));
        Object[] arrobject23 = new String[4131 & 8591];
        arrobject23[4752 & 8194] = "anvil_intact";
        arrobject23[-28647 & 27237] = "anvil_slightly_damaged";
        arrobject23[5378 & 2122] = "anvil_very_damaged";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9376), Lists.newArrayList((Object[])arrobject23));
        Object[] arrobject24 = new String[35 & -27001];
        arrobject24[8448 & 163] = "quartz_block";
        arrobject24[25345 & -32663] = "chiseled_quartz_block";
        arrobject24[12303 & 3154] = "quartz_column";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9290), Lists.newArrayList((Object[])arrobject24));
        Object[] arrobject25 = new String[2192 & 12304];
        arrobject25[-14846 & 8640] = "black_stained_hardened_clay";
        arrobject25[2089 & -15931] = "red_stained_hardened_clay";
        arrobject25[19714 & 518] = "green_stained_hardened_clay";
        arrobject25[16771 & 8195] = "brown_stained_hardened_clay";
        arrobject25[24863 & -30684] = "blue_stained_hardened_clay";
        arrobject25[16517 & -27577] = "purple_stained_hardened_clay";
        arrobject25[518 & 6] = "cyan_stained_hardened_clay";
        arrobject25[-32761 & 12551] = "silver_stained_hardened_clay";
        arrobject25[-31480 & 24586] = "gray_stained_hardened_clay";
        arrobject25[4489 & -30707] = "pink_stained_hardened_clay";
        arrobject25[5643 & 42] = "lime_stained_hardened_clay";
        arrobject25[-9621 & 1051] = "yellow_stained_hardened_clay";
        arrobject25[21660 & 2574] = "light_blue_stained_hardened_clay";
        arrobject25[-32243 & 4223] = "magenta_stained_hardened_clay";
        arrobject25[-30706 & 12910] = "orange_stained_hardened_clay";
        arrobject25[-13937 & 12383] = "white_stained_hardened_clay";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9274), Lists.newArrayList((Object[])arrobject25));
        Object[] arrobject26 = new String[4113 & 1488];
        arrobject26[16389 & 1032] = "black_stained_glass_pane";
        arrobject26[2723 & 17753] = "red_stained_glass_pane";
        arrobject26[5666 & 8267] = "green_stained_glass_pane";
        arrobject26[20683 & -32749] = "brown_stained_glass_pane";
        arrobject26[12 & 14900] = "blue_stained_glass_pane";
        arrobject26[17413 & -32755] = "purple_stained_glass_pane";
        arrobject26[-27609 & 518] = "cyan_stained_glass_pane";
        arrobject26[22023 & -30449] = "silver_stained_glass_pane";
        arrobject26[-27992 & 27] = "gray_stained_glass_pane";
        arrobject26[-30067 & 4153] = "pink_stained_glass_pane";
        arrobject26[2122 & 17163] = "lime_stained_glass_pane";
        arrobject26[2075 & 14191] = "yellow_stained_glass_pane";
        arrobject26[29007 & 652] = "light_blue_stained_glass_pane";
        arrobject26[2125 & -15347] = "magenta_stained_glass_pane";
        arrobject26[14 & -20466] = "orange_stained_glass_pane";
        arrobject26[16527 & -32737] = "white_stained_glass_pane";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9309), Lists.newArrayList((Object[])arrobject26));
        Object[] arrobject27 = new String[66 & -15821];
        arrobject27[18 & -8128] = "acacia_leaves";
        arrobject27[2147 & 8201] = "dark_oak_leaves";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9440), Lists.newArrayList((Object[])arrobject27));
        Object[] arrobject28 = new String[8835 & 16402];
        arrobject28[150 & -24575] = "acacia_log";
        arrobject28[5 & 8739] = "dark_oak_log";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9447), Lists.newArrayList((Object[])arrobject28));
        Object[] arrobject29 = new String[339 & 16419];
        arrobject29[-16337 & 208] = "prismarine";
        arrobject29[2595 & 4497] = "prismarine_bricks";
        arrobject29[-16381 & 2054] = "dark_prismarine";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9424), Lists.newArrayList((Object[])arrobject29));
        Object[] arrobject30 = new String[23064 & 369];
        arrobject30[73 & 4658] = "black_carpet";
        arrobject30[657 & -30429] = "red_carpet";
        arrobject30[2 & -21498] = "green_carpet";
        arrobject30[10243 & 17479] = "brown_carpet";
        arrobject30[3052 & 21] = "blue_carpet";
        arrobject30[-31611 & 8463] = "purple_carpet";
        arrobject30[247 & -32506] = "cyan_carpet";
        arrobject30[-16345 & 3599] = "silver_carpet";
        arrobject30[2312 & 17608] = "gray_carpet";
        arrobject30[137 & 15181] = "pink_carpet";
        arrobject30[2331 & -28438] = "lime_carpet";
        arrobject30[25647 & 2059] = "yellow_carpet";
        arrobject30[16397 & -32292] = "light_blue_carpet";
        arrobject30[18701 & -31729] = "magenta_carpet";
        arrobject30[8270 & 23070] = "orange_carpet";
        arrobject30[3599 & -8161] = "white_carpet";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9357), Lists.newArrayList((Object[])arrobject30));
        Object[] arrobject31 = new String[134 & 7175];
        arrobject31[27905 & 20] = "sunflower";
        arrobject31[-23805 & 22737] = "syringa";
        arrobject31[-29418 & 34] = "double_grass";
        arrobject31[-30449 & 9251] = "double_fern";
        arrobject31[2053 & -32476] = "double_rose";
        arrobject31[8349 & 3367] = "paeonia";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9399), Lists.newArrayList((Object[])arrobject31));
        Object[] arrobject32 = new String[16412 & -30586];
        arrobject32[276 & 680] = "bow";
        arrobject32[1539 & 10369] = "bow_pulling_0";
        arrobject32[-16118 & 14482] = "bow_pulling_1";
        arrobject32[539 & 1251] = "bow_pulling_2";
        this.Field_11790.put(Class_10527.Field_10690, Lists.newArrayList((Object[])arrobject32));
        Object[] arrobject33 = new String[17994 & 54];
        arrobject33[28 & 162] = "coal";
        arrobject33[8193 & -32703] = "charcoal";
        this.Field_11790.put(Class_10527.Field_10698, Lists.newArrayList((Object[])arrobject33));
        Object[] arrobject34 = new String[25290 & 2342];
        arrobject34[-30708 & 354] = "fishing_rod";
        arrobject34[6937 & -24479] = "fishing_rod_cast";
        this.Field_11790.put(Class_10527.Field_10609, Lists.newArrayList((Object[])arrobject34));
        Object[] arrobject35 = new String[-32041 & 19460];
        arrobject35[8202 & 384] = "cod";
        arrobject35[20753 & 8713] = "salmon";
        arrobject35[8194 & 1550] = "clownfish";
        arrobject35[1803 & 22531] = "pufferfish";
        this.Field_11790.put(Class_10527.Field_10689, Lists.newArrayList((Object[])arrobject35));
        Object[] arrobject36 = new String[19522 & 8194];
        arrobject36[1059 & -16108] = "cooked_cod";
        arrobject36[14373 & 16385] = "cooked_salmon";
        this.Field_11790.put(Class_10527.Field_10614, Lists.newArrayList((Object[])arrobject36));
        Object[] arrobject37 = new String[1083 & 8212];
        arrobject37[8456 & 1026] = "dye_black";
        arrobject37[25201 & 6157] = "dye_red";
        arrobject37[16966 & 2202] = "dye_green";
        arrobject37[-18425 & 179] = "dye_brown";
        arrobject37[-28388 & 516] = "dye_blue";
        arrobject37[8197 & 21157] = "dye_purple";
        arrobject37[598 & 12551] = "dye_cyan";
        arrobject37[-8185 & 7] = "dye_silver";
        arrobject37[-32408 & 17432] = "dye_gray";
        arrobject37[-16375 & 11273] = "dye_pink";
        arrobject37[-6086 & 4106] = "dye_lime";
        arrobject37[19483 & 8463] = "dye_yellow";
        arrobject37[524 & 16396] = "dye_light_blue";
        arrobject37[5391 & 18477] = "dye_magenta";
        arrobject37[142 & 5390] = "dye_orange";
        arrobject37[8479 & -15793] = "dye_white";
        this.Field_11790.put(Class_10527.Field_10623, Lists.newArrayList((Object[])arrobject37));
        Object[] arrobject38 = new String[22018 & 2114];
        arrobject38[37 & 21440] = "bottle_drinkable";
        arrobject38[10671 & 17473] = "bottle_splash";
        this.Field_11790.put(Class_10527.Field_10687, Lists.newArrayList((Object[])arrobject38));
        Object[] arrobject39 = new String[13 & 7301];
        arrobject39[-12288 & 499] = "skull_skeleton";
        arrobject39[2129 & 521] = "skull_wither";
        arrobject39[1027 & 8194] = "skull_zombie";
        arrobject39[4243 & 8515] = "skull_char";
        arrobject39[22 & -31739] = "skull_creeper";
        this.Field_11790.put(Class_10527.Field_10702, Lists.newArrayList((Object[])arrobject39));
        Object[] arrobject40 = new String[-28665 & 10241];
        arrobject40[2052 & 9824] = "oak_fence_gate";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9426), Lists.newArrayList((Object[])arrobject40));
        Object[] arrobject41 = new String[-26299 & 16929];
        arrobject41[8 & -31468] = "oak_fence";
        this.Field_11790.put(Class_1956.Method_1981(Class_9265.Field_9437), Lists.newArrayList((Object[])arrobject41));
        Object[] arrobject42 = new String[9233 & 6337];
        arrobject42[15104 & 14] = "oak_door";
        this.Field_11790.put(Class_10527.Field_10670, Lists.newArrayList((Object[])arrobject42));
    }

    private static String Method_11810(String string) {
        int n = 7542;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11811(String string) {
        int n = 8571;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11812(String string) {
        int n = 15640;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11813(Class_7944 class_7944, Class_41302 class_41302) {
        this.Field_11792.put(class_41302, class_7944.Method_7948(class_41302.Method_41304()));
    }

    private static String Method_11814(String string) {
        int n = 6621;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_14461 Method_11815(Class_5986 class_5986, Class_21223 class_21223, Class_11372 class_11372, Class_4595 class_4595, Class_35032 class_35032, boolean bl) {
        return this.Field_11786.Method_9905(class_5986.Field_5990, class_5986.Field_5989, class_21223, class_11372, class_4595, class_35032, class_5986.Field_5987, bl, class_5986.Field_5988);
    }

    private static String Method_11816(String string) {
        int n = 15853;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11817() {
        this.Method_11838(this.Field_11794.Method_36440().Method_8706().values());
        Object[] arrobject = new Class_6963[10269 & -15039];
        arrobject[14454 & 0] = new Class_6963(new Class_2080(Field_11781.\u0000= final()), Class_35032.Field_35033, (-26480 & 8458) != 0, 16401 & 11819);
        this.Field_11792.put(Field_11781, new Class_44698(Field_11781.Method_41304(), Lists.newArrayList((Object[])arrobject)));
        Class_2080 class_2080 = new Class_2080("item_frame");
        Class_7944 class_7944 = this.Method_11847(class_2080);
        this.Method_11813(class_7944, new Class_41302(class_2080, "normal"));
        this.Method_11813(class_7944, new Class_41302(class_2080, "map"));
        this.Method_11848();
        this.Method_11849();
    }

    private static String Method_11818(String string) {
        int n = 20904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_2080 Method_11819(Class_2080 class_2080) {
        return new Class_2080(class_2080.Method_2085(), "models/" + class_2080.Method_2084() + ".json");
    }

    private static String Method_11820(String string) {
        int n = 24579;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private boolean Method_11821(ModelBlock modelBlock) {
        if (modelBlock == null) {
            return (0 & 3745) != 0;
        }
        ModelBlock modelBlock2 = modelBlock.getRootModel();
        return (modelBlock2 == Field_11789 ? 20873 & -21967 : 5952 & -14304) != 0;
    }

    private List Method_11822(Class_2080 class_2080) {
        Object[] arrobject = new Class_2080[3081 & -20219];
        arrobject[16384 & 2835] = class_2080;
        ArrayList arrayList = Lists.newArrayList((Object[])arrobject);
        Class_2080 class_20802 = class_2080;
        while ((class_20802 = this.Method_11837(class_20802)) != null) {
            arrayList.add(7177 & 528, class_20802);
        }
        return arrayList;
    }

    private static String Method_11823(String string) {
        int n = 13301;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Set Method_11824(ModelBlock modelBlock) {
        HashSet hashSet = Sets.newHashSet();
        for (Class_5986 class_5986 : modelBlock.getElements()) {
            for (Class_21223 class_21223 : class_5986.Field_5991.values()) {
                Class_2080 class_2080 = new Class_2080(modelBlock.resolveTextureName(class_21223.Field_21226));
                hashSet.add(class_2080);
            }
        }
        hashSet.add(new Class_2080(modelBlock.resolveTextureName("particle")));
        return hashSet;
    }

    private static String Method_11825(String string) {
        int n = 2106;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11826(String string) {
        int n = 4253;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11827() {
        for (Object object : this.Field_11782.values()) {
            ModelBlock modelBlock = (ModelBlock)this.Field_11784.get(object);
            if (this.Method_11858(modelBlock)) {
                ModelBlock modelBlock2 = this.Method_11799(modelBlock);
                if (modelBlock2 != null) {
                    modelBlock2.name = ((Class_2080)object).Method_2086();
                }
                this.Field_11784.put(object, modelBlock2);
                continue;
            }
            if (!this.Method_11821(modelBlock)) continue;
            this.Field_11784.put(object, modelBlock);
        }
        for (Object object : this.Field_11779.values()) {
            if (((Class_11372)object).Method_11419()) continue;
            ((Class_11372)object).Method_11405();
        }
    }

    private static String Method_11828(String string) {
        int n = 18785;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11829(String string) {
        int n = 2182;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11830(String string) {
        int n = 23598;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11831(String string) {
        int n = 31366;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_2801 Method_11832() {
        this.Method_11817();
        this.Method_11802();
        this.Method_11801();
        this.Method_11827();
        this.Method_11805();
        return this.Field_11785;
    }

    private static String Method_11833(String string) {
        int n = 9231;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Set Method_11834() {
        HashSet hashSet = Sets.newHashSet();
        for (Class_2080 class_2080 : this.Field_11782.values()) {
            ModelBlock modelBlock = (ModelBlock)this.Field_11784.get(class_2080);
            if (modelBlock == null) continue;
            hashSet.add(new Class_2080(modelBlock.resolveTextureName("particle")));
            if (this.Method_11858(modelBlock)) {
                for (Object object : Class_7291.Field_7292) {
                    Class_2080 class_20802 = new Class_2080(modelBlock.resolveTextureName((String)object));
                    if (modelBlock.getRootModel() == Field_11795 && !Class_24069.Field_24075.Method_2087(class_20802)) {
                        Class_11372.Method_11433(class_20802.Method_2086());
                    } else if (modelBlock.getRootModel() == Field_11797 && !Class_24069.Field_24075.Method_2087(class_20802)) {
                        Class_11372.Method_11412(class_20802.Method_2086());
                    }
                    hashSet.add(class_20802);
                }
                continue;
            }
            if (this.Method_11821(modelBlock)) continue;
            for (Object object : modelBlock.getElements()) {
                for (Class_21223 class_21223 : ((Class_5986)object).Field_5991.values()) {
                    Class_2080 class_20803 = new Class_2080(modelBlock.resolveTextureName(class_21223.Field_21226));
                    hashSet.add(class_20803);
                }
            }
        }
        return hashSet;
    }

    private Class_2080 Method_11835(String string) {
        Class_2080 class_2080 = new Class_2080(string);
        return new Class_2080(class_2080.Method_2085(), "item/" + class_2080.Method_2084());
    }

    private static String Method_11836(String string) {
        int n = 16155;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_2080 Method_11837(Class_2080 class_2080) {
        for (Map.Entry entry : this.Field_11784.entrySet()) {
            ModelBlock modelBlock = (ModelBlock)entry.getValue();
            if (modelBlock == null || !class_2080.Method_2087(modelBlock.getParentLocation())) continue;
            return (Class_2080)entry.getKey();
        }
        return null;
    }

    private void Method_11838(Collection collection) {
        for (Class_41302 class_41302 : collection) {
            try {
                Class_7944 class_7944 = this.Method_11847(class_41302);
                try {
                    this.Method_11813(class_7944, class_41302);
                }
                catch (Exception exception) {
                    Field_11796.warn("Unable to load variant: " + class_41302.Method_41304() + " from " + class_41302);
                }
            }
            catch (Exception exception) {
                Field_11796.warn("Unable to load definition " + class_41302, (Throwable)exception);
            }
        }
    }

    private List Method_11839(Class_1956 class_1956) {
        List<String> list = (List<String>)this.Field_11790.get(class_1956);
        if (list == null) {
            list = Collections.singletonList(((Class_2080)Class_1956.Field_1961.Method_3648(class_1956)).Method_2086());
        }
        return list;
    }

    private static String Method_11840(String string) {
        int n = 8153;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11841(String string) {
        int n = 10871;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11842(String string) {
        int n = 6447;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_31211 Method_11843(ModelBlock modelBlock, Class_35032 class_35032, boolean bl) {
        Class_11372 class_11372 = (Class_11372)this.Field_11779.get(new Class_2080(modelBlock.resolveTextureName("particle")));
        Class_12350 class_12350 = new Class_12350(modelBlock).Method_12363(class_11372);
        for (Class_5986 class_5986 : modelBlock.getElements()) {
            for (Class_4595 class_4595 : class_5986.Field_5991.keySet()) {
                Class_21223 class_21223 = (Class_21223)class_5986.Field_5991.get(class_4595);
                Class_11372 class_113722 = (Class_11372)this.Field_11779.get(new Class_2080(modelBlock.resolveTextureName(class_21223.Field_21226)));
                if (class_21223.Field_21228 == null) {
                    class_12350.Method_12359(this.Method_11815(class_5986, class_21223, class_113722, class_4595, class_35032, bl));
                    continue;
                }
                class_12350.Method_12362(class_35032.Method_35073(class_21223.Field_21228), this.Method_11815(class_5986, class_21223, class_113722, class_4595, class_35032, bl));
            }
        }
        return class_12350.Method_12361();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ModelBlock Method_11844(Class_2080 class_2080) {
        Object object;
        Reader reader;
        Object object2;
        String string = class_2080.Method_2084();
        if ("builtin/generated".equals(string)) {
            return Field_11793;
        }
        if ("builtin/compass".equals(string)) {
            return Field_11795;
        }
        if ("builtin/clock".equals(string)) {
            return Field_11797;
        }
        if ("builtin/entity".equals(string)) {
            return Field_11789;
        }
        if (string.startsWith("builtin/")) {
            object = string.substring("builtin/".length());
            object2 = (String)Field_11798.get(object);
            if (object2 == null) {
                throw new FileNotFoundException(class_2080.Method_2086());
            }
            reader = new StringReader((String)object2);
        } else {
            object = this.Field_11780.Method_282(this.Method_11819(class_2080));
            reader = new InputStreamReader(object.Method_9958(), Charsets.UTF_8);
        }
        try {
            object2 = ModelBlock.deserialize(reader);
            ((ModelBlock)object2).name = class_2080.Method_2086();
            object = object2;
        }
        finally {
            reader.close();
        }
        return object;
    }

    public Class_11777(Class_279 class_279, Class_24069 class_24069, Class_36433 class_36433) {
        this.Field_11780 = class_279;
        this.Field_11787 = class_24069;
        this.Field_11794 = class_36433;
    }

    private static String Method_11845(String string) {
        int n = 22969;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11846(String string) {
        int n = 11233;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_7944 Method_11847(Class_2080 class_2080) {
        Class_2080 class_20802 = this.Method_11857(class_2080);
        Class_7944 class_7944 = (Class_7944)this.Field_11783.get(class_20802);
        if (class_7944 == null) {
            ArrayList arrayList = Lists.newArrayList();
            try {
                for (Class_9953 class_9953 : this.Field_11780.Method_280(class_20802)) {
                    InputStream inputStream = null;
                    try {
                        inputStream = class_9953.Method_9958();
                        Class_7944 class_79442 = Class_7944.Method_7947(new InputStreamReader(inputStream, Charsets.UTF_8));
                        arrayList.add(class_79442);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Encountered an exception when loading model definition of '" + class_2080 + "' from: '" + class_9953.Method_9955() + "' in resourcepack: '" + class_9953.Method_9954() + "'", exception);
                    }
                    finally {
                        IOUtils.closeQuietly((InputStream)inputStream);
                    }
                }
            }
            catch (IOException iOException) {
                throw new RuntimeException("Encountered an exception when loading model definition of model " + class_20802.Method_2086(), iOException);
            }
            class_7944 = new Class_7944(arrayList);
            this.Field_11783.put(class_20802, class_7944);
        }
        return class_7944;
    }

    private void Method_11848() {
        for (Class_41302 class_41302 : this.Field_11792.keySet()) {
            for (Class_6963 class_6963 : ((Class_44698)this.Field_11792.get(class_41302)).Method_44704()) {
                Class_2080 class_2080 = class_6963.Method_6974();
                if (this.Field_11784.get(class_2080) != null) continue;
                try {
                    ModelBlock modelBlock = this.Method_11844(class_2080);
                    this.Field_11784.put(class_2080, modelBlock);
                }
                catch (Exception exception) {
                    Field_11796.warn("Unable to load block model: '" + class_2080 + "' for variant: '" + class_41302 + "'", (Throwable)exception);
                }
            }
        }
    }

    private void Method_11849() {
        this.Method_11809();
        Iterator iterator = Class_1956.Field_1961.Method_3651();
        while (iterator.hasNext()) {
            Class_1956 class_1956 = (Class_1956)iterator.next();
            for (String string : this.Method_11839(class_1956)) {
                Class_2080 class_2080 = this.Method_11835(string);
                this.Field_11782.put(string, class_2080);
                if (this.Field_11784.get(class_2080) != null) continue;
                try {
                    ModelBlock modelBlock = this.Method_11844(class_2080);
                    this.Field_11784.put(class_2080, modelBlock);
                }
                catch (Exception exception) {
                    Field_11796.warn("Unable to load item model: '" + class_2080 + "' for item: '" + Class_1956.Field_1961.Method_3648(class_1956) + "'", (Throwable)exception);
                }
            }
        }
    }

    private static String Method_11850(String string) {
        int n = 30080;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11851(String string) {
        int n = 20881;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Map Method_11852(Class_11777 class_11777) {
        return class_11777.Field_11779;
    }

    private static String Method_11853(String string) {
        int n = 13273;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11854(String string) {
        int n = 5570;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11855() {
        Class_2080 class_2080;
        ArrayDeque arrayDeque = Queues.newArrayDeque();
        HashSet hashSet = Sets.newHashSet();
        for (Object object : this.Field_11784.keySet()) {
            hashSet.add(object);
            class_2080 = ((ModelBlock)this.Field_11784.get(object)).getParentLocation();
            if (class_2080 == null) continue;
            arrayDeque.add(class_2080);
        }
        while (!arrayDeque.isEmpty()) {
            Class_2080 class_20802 = (Class_2080)arrayDeque.pop();
            try {
                Object object;
                if (this.Field_11784.get(class_20802) != null) continue;
                object = this.Method_11844(class_20802);
                this.Field_11784.put(class_20802, object);
                class_2080 = ((ModelBlock)object).getParentLocation();
                if (class_2080 != null && !hashSet.contains(class_2080)) {
                    arrayDeque.add(class_2080);
                }
            }
            catch (Exception exception) {
                Field_11796.warn("In parent chain: " + Field_11778.join((Iterable)this.Method_11822(class_20802)) + "; unable to load model: '" + class_20802 + "'", (Throwable)exception);
            }
            hashSet.add(class_20802);
        }
    }

    private static String Method_11856(String string) {
        int n = 30860;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11777.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_2080 Method_11857(Class_2080 class_2080) {
        return new Class_2080(class_2080.Method_2085(), "blockstates/" + class_2080.Method_2084() + ".json");
    }

    private boolean Method_11858(ModelBlock modelBlock) {
        if (modelBlock == null) {
            return (896 & 18529) != 0;
        }
        ModelBlock modelBlock2 = modelBlock.getRootModel();
        return (modelBlock2 == Field_11793 || modelBlock2 == Field_11795 || modelBlock2 == Field_11797 ? 24593 & 199 : 18456 & -24064) != 0;
    }

    private Set Method_11859() {
        HashSet hashSet = Sets.newHashSet();
        ArrayList arrayList = Lists.newArrayList(this.Field_11792.keySet());
        Collections.sort(arrayList, new Class_30861(this));
        for (Class_41302 class_41302 : arrayList) {
            Class_44698 class_44698 = (Class_44698)this.Field_11792.get(class_41302);
            for (Class_6963 class_6963 : class_44698.Method_44704()) {
                ModelBlock modelBlock = (ModelBlock)this.Field_11784.get(class_6963.Method_6974());
                if (modelBlock == null) {
                    Field_11796.warn("Missing model for: " + class_41302);
                    continue;
                }
                hashSet.addAll(this.Method_11824(modelBlock));
            }
        }
        hashSet.addAll(Field_11791);
        return hashSet;
    }
}

