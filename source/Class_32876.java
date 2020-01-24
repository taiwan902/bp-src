/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.ARBFramebufferObject
 *  internal.org.lwjgl.opengl.ARBMultitexture
 *  internal.org.lwjgl.opengl.ARBShaderObjects
 *  internal.org.lwjgl.opengl.ARBVertexBufferObject
 *  internal.org.lwjgl.opengl.ARBVertexShader
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.EXTBlendFuncSeparate
 *  internal.org.lwjgl.opengl.EXTFramebufferObject
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GL13
 *  internal.org.lwjgl.opengl.GL14
 *  internal.org.lwjgl.opengl.GL15
 *  internal.org.lwjgl.opengl.GL20
 *  internal.org.lwjgl.opengl.GL30
 *  internal.org.lwjgl.opengl.GLContext
 *  oshi.SystemInfo
 *  oshi.hardware.HardwareAbstractionLayer
 *  oshi.hardware.Processor
 */
import internal.org.lwjgl.opengl.ARBFramebufferObject;
import internal.org.lwjgl.opengl.ARBMultitexture;
import internal.org.lwjgl.opengl.ARBShaderObjects;
import internal.org.lwjgl.opengl.ARBVertexBufferObject;
import internal.org.lwjgl.opengl.ARBVertexShader;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.EXTBlendFuncSeparate;
import internal.org.lwjgl.opengl.EXTFramebufferObject;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GL13;
import internal.org.lwjgl.opengl.GL14;
import internal.org.lwjgl.opengl.GL15;
import internal.org.lwjgl.opengl.GL20;
import internal.org.lwjgl.opengl.GL30;
import internal.org.lwjgl.opengl.GLContext;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Processor;

public class Class_32876 {
    public static int Field_32877;
    public static boolean Field_32878;
    public static boolean Field_32879;
    private static int Field_32880;
    public static int Field_32881;
    public static int Field_32882;
    public static boolean Field_32883;
    public static int Field_32884;
    private static boolean Field_32885;
    public static int Field_32886;
    public static int Field_32887;
    private static boolean Field_32888;
    public static int Field_32889;
    private static boolean Field_32890;
    private static String Field_32891;
    public static boolean Field_32892;
    public static int Field_32893;
    public static boolean Field_32894;
    public static int Field_32895;
    public static int Field_32896;
    public static int Field_32897;
    public static float Field_32898;
    public static int Field_32899;
    public static int Field_32900;
    public static int Field_32901;
    public static boolean Field_32902;
    public static int Field_32903;
    public static int Field_32904;
    public static int Field_32905;
    public static boolean Field_32906;
    public static int Field_32907;
    public static int Field_32908;
    public static int Field_32909;
    public static int Field_32910;
    public static int Field_32911;
    public static int Field_32912;
    public static float Field_32913;
    public static int Field_32914;
    private static boolean Field_32915;
    public static int Field_32916;
    private static String Field_32917;
    public static int Field_32918;
    public static int Field_32919;
    public static int Field_32920;
    public static int Field_32921;
    public static int Field_32922;
    private static boolean Field_32923;
    public static int Field_32924;
    public static int Field_32925;
    public static int Field_32926;
    public static int Field_32927;
    public static boolean Field_32928;
    public static int Field_32929;
    public static boolean Field_32930;
    public static int Field_32931;
    public static int Field_32932;

    public static int Method_32933() {
        return Field_32923 ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
    }

    public static int Method_32934(int n) {
        return Field_32923 ? ARBShaderObjects.glCreateShaderObjectARB((int)n) : GL20.glCreateShader((int)n);
    }

    public static void Method_32935(int n, int n2) {
        if (Field_32923) {
            ARBShaderObjects.glUniform1iARB((int)n, (int)n2);
        } else {
            GL20.glUniform1i((int)n, (int)n2);
        }
    }

    public static void Method_32936(int n, ByteBuffer byteBuffer, int n2) {
        if (Field_32883) {
            ARBVertexBufferObject.glBufferDataARB((int)n, (ByteBuffer)byteBuffer, (int)n2);
        } else {
            GL15.glBufferData((int)n, (ByteBuffer)byteBuffer, (int)n2);
        }
    }

    public static void Method_32937(int n) {
        if (Field_32923) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
        } else {
            GL20.glDeleteShader((int)n);
        }
    }

    public static int Method_32938(int n, int n2) {
        return Field_32923 ? ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2) : GL20.glGetProgrami((int)n, (int)n2);
    }

    public static boolean Method_32939() {
        return (Class_19426.Method_19579() ? 8348 & 1088 : (Field_32878 && Class_18.Field_89.Field_84.Field_39706 ? 1293 & 2721 : 1634 & 24729)) != 0;
    }

    public static void Method_32940(int n, boolean bl, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniformMatrix3ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix3((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static int Method_32941() {
        if (!Field_32879) {
            return -1 & -1;
        }
        switch (Field_32880) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return -1 & -1;
    }

    public static String Method_32942() {
        return Field_32891 == null ? "<unknown>" : Field_32891;
    }

    public static void Method_32943(int n, float f, float f2) {
        if (Field_32890) {
            ARBMultitexture.glMultiTexCoord2fARB((int)n, (float)f, (float)f2);
        } else {
            GL13.glMultiTexCoord2f((int)n, (float)f, (float)f2);
        }
        if (n == Field_32911) {
            Field_32898 = f;
            Field_32913 = f2;
        }
    }

    public static void Method_32944(int n, boolean bl, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniformMatrix2ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix2((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static int Method_32945(int n) {
        if (!Field_32879) {
            return -1 & -1;
        }
        switch (Field_32880) {
            case 0: {
                return GL30.glCheckFramebufferStatus((int)n);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n);
            }
        }
        return -1 & -1;
    }

    public static void Method_32946(int n, IntBuffer intBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform4ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform4((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void Method_32947(int n, int n2, int n3, int n4) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)n, (int)n2, (int)n3, (int)n4);
                }
            }
        }
    }

    public static boolean Method_32948() {
        return (Class_19426.Method_19562() ? 2057 & 18016 : (Class_19426.Method_19481() > 0 ? 8224 & 5320 : (Field_32879 && Class_18.Field_89.Field_84.Field_39708 ? -30713 & 8505 : 8448 & 2066))) != 0;
    }

    public static int Method_32949(int n, CharSequence charSequence) {
        return Field_32923 ? ARBVertexShader.glGetAttribLocationARB((int)n, (CharSequence)charSequence) : GL20.glGetAttribLocation((int)n, (CharSequence)charSequence);
    }

    public static void Method_32950(int n) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glDeleteFramebuffers((int)n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteFramebuffers((int)n);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteFramebuffersEXT((int)n);
                }
            }
        }
    }

    public static int Method_32951() {
        return Field_32883 ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
    }

    public static void Method_32952(int n) {
        if (Field_32923) {
            ARBShaderObjects.glUseProgramObjectARB((int)n);
        } else {
            GL20.glUseProgram((int)n);
        }
    }

    public static String Method_32953(int n, int n2) {
        return Field_32923 ? ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2) : GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static void Method_32954() {
        Class_19426.Method_19585();
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        Field_32890 = contextCapabilities.GL_ARB_multitexture && !contextCapabilities.OpenGL13 ? -24575 & 37 : 16652 & -30592;
        Field_32915 = contextCapabilities.GL_ARB_texture_env_combine && !contextCapabilities.OpenGL13 ? 41 & 25365 : 1024 & 8857;
        int n = Field_32915 ? 1 : 0;
        if (Field_32890) {
            Field_32917 = Field_32917 + "Using ARB_multitexture.\n";
            Field_32931 = -2009824049 & 1107862720;
            Field_32911 = 275023083 & 537955525;
            Field_32922 = 295996619 & -2145725230;
        } else {
            Field_32917 = Field_32917 + "Using GL 1.3 multitexturing.\n";
            Field_32931 = 2137802 & -2004712223;
            Field_32911 = -1845441339 & 156870625;
            Field_32922 = -1060795190 & 941806834;
        }
        if (Field_32915) {
            Field_32917 = Field_32917 + "Using ARB_texture_env_combine.\n";
            Field_32919 = -1610439304 & 1086429044;
            Field_32921 = 1940030837 & -2146851331;
            Field_32884 = 296311 & 1111551871;
            Field_32908 = -1072122506 & 661097847;
            Field_32903 = -1843624580 & 142652795;
            Field_32897 = 1075895667 & -2137684615;
            Field_32905 = 296338 & 630760845;
            Field_32929 = 740865441 & 1079168385;
            Field_32927 = 1480623490 & 33861566;
            Field_32924 = -1976914541 & 9471408;
            Field_32882 = 34297 & 1234015635;
            Field_32900 = 822128090 & 1280886195;
            Field_32916 = -2075621513 & 1074906482;
            Field_32932 = -2130455160 & 1107592682;
            Field_32899 = 29333403 & 541101513;
            Field_32926 = 1233315290 & 571049354;
            Field_32920 = 537511354 & -1836018276;
            Field_32904 = 84905369 & 674273179;
            Field_32918 = 689626 & 1683000767;
        } else {
            Field_32917 = Field_32917 + "Using GL 1.3 texture combiners.\n";
            Field_32919 = 33590655 & 143173616;
            Field_32921 = 303146493 & 536909685;
            Field_32884 = 688692735 & 37791607;
            Field_32908 = 309628406 & -2013100681;
            Field_32903 = 1250985336 & 69381503;
            Field_32897 = -2143250447 & 235046269;
            Field_32905 = 470859136 & 99736;
            Field_32929 = -1039759959 & 136374145;
            Field_32927 = 277534106 & -2129360989;
            Field_32924 = 1551951252 & -2147312136;
            Field_32882 = 1091863961 & 144951187;
            Field_32900 = 12682646 & 1107733979;
            Field_32916 = -1056192646 & 337942003;
            Field_32932 = 1304602073 & 536926122;
            Field_32899 = 1771610041 & 33605001;
            Field_32926 = 1912907146 & 6407563;
            Field_32920 = -2111773286 & 755664312;
            Field_32904 = 321557913 & 1620092861;
            Field_32918 = 2160026 & 269323706;
        }
        Field_32894 = contextCapabilities.GL_EXT_blend_func_separate && !contextCapabilities.OpenGL14 ? 17411 & 13097 : 5120 & 2179;
        Field_32885 = contextCapabilities.OpenGL14 || contextCapabilities.GL_EXT_blend_func_separate ? -23547 & 20545 : -17790 & 1;
        Field_32879 = Field_32885 && (contextCapabilities.GL_ARB_framebuffer_object || contextCapabilities.GL_EXT_framebuffer_object || contextCapabilities.OpenGL30) ? -27839 & 1057 : 4690 & -32636;
        int n2 = Field_32879 ? 1 : 0;
        if (Field_32879) {
            Field_32917 = Field_32917 + "Using framebuffer objects because ";
            if (contextCapabilities.OpenGL30) {
                Field_32917 = Field_32917 + "OpenGL 3.0 is supported and separate blending is supported.\n";
                Field_32880 = 22186 & -30652;
                Field_32910 = 269131072 & 134581696;
                Field_32925 = 4754769 & 1251000291;
                Field_32887 = 404532960 & -1583182616;
                Field_32914 = 1239207746 & 67157425;
                Field_32886 = -1795121961 & 2141653;
                Field_32901 = -2067489289 & 185724126;
                Field_32877 = -536834849 & 514624727;
                Field_32895 = 562203867 & 404802779;
                Field_32889 = 1346952446 & 9801180;
            } else if (contextCapabilities.GL_ARB_framebuffer_object) {
                Field_32917 = Field_32917 + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                Field_32880 = 129 & -15093;
                Field_32910 = 21400906 & 171544516;
                Field_32925 = 42319185 & 1092259141;
                Field_32887 = 1093389544 & -1610306334;
                Field_32914 = 40013633 & 105904;
                Field_32886 = 539938005 & -1878942219;
                Field_32877 = 1263587031 & 3128575;
                Field_32901 = 638647510 & -1712943658;
                Field_32895 = 578862299 & 1364496351;
                Field_32889 = 17878493 & 9150204;
            } else if (contextCapabilities.GL_EXT_framebuffer_object) {
                Field_32917 = Field_32917 + "EXT_framebuffer_object is supported.\n";
                Field_32880 = 2 & 550;
                Field_32910 = 75537861 & -227242166;
                Field_32925 = 622898505 & -2146443917;
                Field_32887 = 71732449 & 51506418;
                Field_32914 = -1065108224 & 692637035;
                Field_32886 = 291609813 & -939488011;
                Field_32877 = -1941926697 & 1670418167;
                Field_32901 = 1083092694 & 876666070;
                Field_32895 = 68201723 & -2006934309;
                Field_32889 = -1604268323 & 486911196;
            }
        } else {
            Field_32917 = Field_32917 + "Not using framebuffer objects because ";
            Field_32917 = Field_32917 + "OpenGL 1.4 is " + (contextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
            Field_32917 = Field_32917 + "EXT_blend_func_separate is " + (contextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            Field_32917 = Field_32917 + "OpenGL 3.0 is " + (contextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
            Field_32917 = Field_32917 + "ARB_framebuffer_object is " + (contextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            Field_32917 = Field_32917 + "EXT_framebuffer_object is " + (contextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        Field_32928 = contextCapabilities.OpenGL21;
        Field_32888 = Field_32928 || contextCapabilities.GL_ARB_vertex_shader && contextCapabilities.GL_ARB_fragment_shader && contextCapabilities.GL_ARB_shader_objects ? 16451 & 4373 : 4106 & 17760;
        Field_32917 = Field_32917 + "Shaders are " + (Field_32888 ? "" : "not ") + "available because ";
        if (Field_32888) {
            if (contextCapabilities.OpenGL21) {
                Field_32917 = Field_32917 + "OpenGL 2.1 is supported.\n";
                Field_32923 = -6654 & 4260;
                Field_32909 = 411077506 & -2145850494;
                Field_32896 = 5364613 & 897878915;
                Field_32893 = 1419349873 & 33721269;
                Field_32907 = -1732191435 & 1075948466;
            } else {
                Field_32917 = Field_32917 + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                Field_32923 = -24319 & 2753;
                Field_32909 = 33856394 & 339972050;
                Field_32896 = 1078497195 & 278170517;
                Field_32893 = 36539379 & 1561365305;
                Field_32907 = 755543921 & 310561714;
            }
        } else {
            Field_32917 = Field_32917 + "OpenGL 2.1 is " + (contextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
            Field_32917 = Field_32917 + "ARB_shader_objects is " + (contextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            Field_32917 = Field_32917 + "ARB_vertex_shader is " + (contextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            Field_32917 = Field_32917 + "ARB_fragment_shader is " + (contextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        Field_32906 = Field_32879 && Field_32888 ? 25 & 24641 : 208 & 40;
        String string = GL11.glGetString((int)(8064 & -24792)).toLowerCase();
        Field_32930 = string.contains("nvidia");
        Field_32883 = !contextCapabilities.OpenGL15 && contextCapabilities.GL_ARB_vertex_buffer_object ? -27499 & 8483 : -24560 & 1545;
        Field_32878 = contextCapabilities.OpenGL15 || Field_32883 ? -32475 & 8393 : 9217 & 22952;
        Field_32917 = Field_32917 + "VBOs are " + (Field_32878 ? "" : "not ") + "available because ";
        if (Field_32878) {
            if (Field_32883) {
                Field_32917 = Field_32917 + "ARB_vertex_buffer_object is supported.\n";
                Field_32912 = 10528997 & -2091610900;
                Field_32881 = 1615522034 & 330402710;
            } else {
                Field_32917 = Field_32917 + "OpenGL 1.5 is supported.\n";
                Field_32912 = 1648593141 & 278985966;
                Field_32881 = -1676900174 & 1627494610;
            }
        }
        if (Field_32892 = string.contains("ati")) {
            if (Field_32878) {
                Field_32902 = 1281 & -32239;
            } else {
                Class_6340.Field_6359.Method_6695(0.5131579f * 31.179487f);
            }
        }
        try {
            Processor[] arrprocessor = new SystemInfo().getHardware().getProcessors();
            Object[] arrobject = new Object[1058 & 13074];
            arrobject[276 & -27991] = arrprocessor.length;
            arrobject[1537 & 18479] = arrprocessor[392 & 9234];
            Field_32891 = String.format("%dx %s", arrobject).replaceAll("\\s+", " ");
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static void Method_32955(int n, IntBuffer intBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform2ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform2((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void Method_32956(int n) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glDeleteRenderbuffers((int)n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteRenderbuffers((int)n);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteRenderbuffersEXT((int)n);
                }
            }
        }
    }

    public static void Method_32957(int n) {
        if (Field_32883) {
            ARBVertexBufferObject.glDeleteBuffersARB((int)n);
        } else {
            GL15.glDeleteBuffers((int)n);
        }
    }

    public static void Method_32958(int n, IntBuffer intBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform1ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform1((int)n, (IntBuffer)intBuffer);
        }
    }

    public static String Method_32959() {
        return Field_32917;
    }

    public static int Method_32960(int n, CharSequence charSequence) {
        return Field_32923 ? ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)charSequence) : GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
    }

    public static void Method_32961(int n) {
        if (Field_32923) {
            ARBShaderObjects.glCompileShaderARB((int)n);
        } else {
            GL20.glCompileShader((int)n);
        }
    }

    public static void Method_32962(int n, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform2ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform2((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void Method_32963(int n, int n2) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glBindRenderbuffer((int)n, (int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindRenderbuffer((int)n, (int)n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindRenderbufferEXT((int)n, (int)n2);
                }
            }
        }
    }

    public static void Method_32964(int n, boolean bl, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniformMatrix4ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix4((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static boolean Method_32965() {
        return Field_32906;
    }

    public static void Method_32966(int n) {
        if (Field_32890) {
            ARBMultitexture.glActiveTextureARB((int)n);
        } else {
            GL13.glActiveTexture((int)n);
        }
    }

    public static void Method_32967(int n, int n2, int n3, int n4) {
        if (Field_32885) {
            if (Field_32894) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT((int)n, (int)n2, (int)n3, (int)n4);
            } else {
                GL14.glBlendFuncSeparate((int)n, (int)n2, (int)n3, (int)n4);
            }
        } else {
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    public static void Method_32968(int n, int n2) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glBindFramebuffer((int)n, (int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindFramebuffer((int)n, (int)n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindFramebufferEXT((int)n, (int)n2);
                }
            }
        }
    }

    public static void Method_32969(int n) {
        if (Field_32923) {
            ARBShaderObjects.glLinkProgramARB((int)n);
        } else {
            GL20.glLinkProgram((int)n);
        }
    }

    public static void Method_32970(int n) {
        if (Field_32890) {
            ARBMultitexture.glClientActiveTextureARB((int)n);
        } else {
            GL13.glClientActiveTexture((int)n);
        }
    }

    public static void Method_32971(int n, ByteBuffer byteBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glShaderSourceARB((int)n, (ByteBuffer)byteBuffer);
        } else {
            GL20.glShaderSource((int)n, (ByteBuffer)byteBuffer);
        }
    }

    public static void Method_32972(int n, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform1ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform1((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static String Method_32973(int n, int n2) {
        return Field_32923 ? ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2) : GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static void Method_32974(int n, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform3ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform3((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void Method_32975(int n, FloatBuffer floatBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform4ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform4((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void Method_32976(int n) {
        if (Field_32923) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
        } else {
            GL20.glDeleteProgram((int)n);
        }
    }

    public static void Method_32977(int n, int n2) {
        if (Field_32923) {
            ARBShaderObjects.glAttachObjectARB((int)n, (int)n2);
        } else {
            GL20.glAttachShader((int)n, (int)n2);
        }
    }

    public static void Method_32978(int n, int n2, int n3, int n4) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glRenderbufferStorageEXT((int)n, (int)n2, (int)n3, (int)n4);
                }
            }
        }
    }

    private void Method_32979() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_32980() {
        if (!Field_32879) {
            return -1 & -1;
        }
        switch (Field_32880) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
        }
        return -1 & -1;
    }

    public static void Method_32981(int n, int n2) {
        if (Field_32883) {
            ARBVertexBufferObject.glBindBufferARB((int)n, (int)n2);
        } else {
            GL15.glBindBuffer((int)n, (int)n2);
        }
    }

    static {
        Field_32917 = "";
        Field_32898 = 0.0f;
        Field_32913 = 0.0f;
    }

    public static void Method_32982(int n, IntBuffer intBuffer) {
        if (Field_32923) {
            ARBShaderObjects.glUniform3ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform3((int)n, (IntBuffer)intBuffer);
        }
    }

    public static int Method_32983(int n, int n2) {
        return Field_32923 ? ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2) : GL20.glGetShaderi((int)n, (int)n2);
    }

    public static void Method_32984(int n, int n2, int n3, int n4, int n5) {
        if (Field_32879) {
            switch (Field_32880) {
                case 0: {
                    GL30.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                }
            }
        }
    }
}

