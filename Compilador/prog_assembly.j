.source prog_assembly.java
.class public prog_assembly
.super java/lang/Object
.method public <init>()V
.limit stack 90
.limit locals 100
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 90
.limit locals 100
ldc2_w 5.0
dstore 7

ldc2_w 2.0
ldc2_w 3.0
ldc2_w 5.0
dadd
dmul
dstore_1

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

dload_1
ldc2_w 2.0
ddiv
dstore_3

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

dload_1
ldc2_w 16.0
dcmpg 
ifne labelFalseExpRelacional_1
dconst_1 
goto labelFimExpRelacional_2

labelFalseExpRelacional_1: 
dconst_0
labelFimExpRelacional_2:
dstore 5

ldc2_w 0.0
ldc2_w 0.0
dstore 80
dconst_0
dcmpg
ifne labelTrue_3
dload 80
dconst_0 
dcmpg 
ifne labelTrue_3
dconst_0 
goto labelFim_4

labelTrue_3:
dconst_1
labelFim_4:
ldc2_w 1.0
ldc2_w 2.5
ldc2_w 2.5
ddiv
dsub
dstore 80
dconst_0
dcmpg
ifne labelTrue_5
dload 80
dconst_0 
dcmpg 
ifne labelTrue_5
dconst_0 
goto labelFim_6

labelTrue_5:
dconst_1
labelFim_6:
ldc2_w 0.0
ldc2_w 1000.0
ldc2_w 8.0
dadd
dmul
dstore 80
dconst_0
dcmpg
ifne labelTrue_7
dload 80
dconst_0 
dcmpg 
ifne labelTrue_7
dconst_0 
goto labelFim_8

labelTrue_7:
dconst_1
labelFim_8:
dstore 5

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Ou logico: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

dload_3
ldc2_w 8.0
dcmpg 
ifne labelFalseExpRelacional_9
dconst_1 
goto labelFimExpRelacional_10

labelFalseExpRelacional_9: 
dconst_0
labelFimExpRelacional_10:
dload_1
ldc2_w 10.0
dcmpg 
ifne labelFalseExpRelacional_11
dconst_1 
goto labelFimExpRelacional_12

labelFalseExpRelacional_11: 
dconst_0
labelFimExpRelacional_12:
dstore 80
dconst_0
dcmpg
ifne labelTrue_13
dload 80
dconst_0 
dcmpg 
ifne labelTrue_13
dconst_0 
goto labelFim_14

labelTrue_13:
dconst_1
labelFim_14:
ldc "joaA"
ldc "joao"
astore 80
astore 81
 
new java/lang/String 
invokespecial java/lang/String/<init>()V
aload 80
aload 81
invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I
iconst_0
if_icmpeq  labelFalseExpRelacional_15
dconst_0
goto labelFimExpRelacional_16

labelFalseExpRelacional_15:
dconst_1
labelFimExpRelacional_16:
dstore 80
dconst_0
dcmpg
ifne labelTrue_17
dload 80
dconst_0 
dcmpg 
ifne labelTrue_17
dconst_0 
goto labelFim_18

labelTrue_17:
dconst_1
labelFim_18:
dstore 5

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Digite um numero:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 9

dload 9
dload 7
dcmpg 
ifne labelFalseExpRelacional_20
dconst_1 
goto labelFimExpRelacional_21

labelFalseExpRelacional_20: 
dconst_0
labelFimExpRelacional_21:
dconst_0 
dcmpg 
ifeq LabelFalse_19

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "igual a variavel d\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

LabelFalse_19:

ldc2_w 1.0
dstore 9

LabelInicio_24:

dload 9
ldc2_w 1.0
dcmpg 
ifne labelFalseExpRelacional_25
dconst_1 
goto labelFimExpRelacional_26

labelFalseExpRelacional_25: 
dconst_0
labelFimExpRelacional_26:
dconst_0 
dcmpg 
ifeq LabelFalse_23

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "entre com o valor de n:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 9
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "n = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 9
invokevirtual java/io/PrintStream/print(D)V
dload 9
ldc2_w 1.0
dsub
dconst_0 
dcmpg 
ifeq LabelFalse_22

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Finalizou o loop.\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
LabelFalse_22:

goto LabelInicio_24


LabelFalse_23:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\nProximo enquanto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

LabelInicio_28:

dload 7
ldc2_w 5.0
dcmpg 
ifne labelFalseExpRelacional_29
dconst_1 
goto labelFimExpRelacional_30

labelFalseExpRelacional_29: 
dconst_0
labelFimExpRelacional_30:
dconst_0 
dcmpg 
ifeq LabelFalse_27

dload 7
ldc2_w 1.0
dadd
dstore 7
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 7
invokevirtual java/io/PrintStream/print(D)V

goto LabelInicio_28


LabelFalse_27:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Teste de concatenação\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

ldc "Compila"
astore 11

ldc "dores\n"
astore 12

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 11
aload 12
swap
astore 80
astore 81
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 80
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 81
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

aload 11
aload 12
swap
astore 80
astore 81
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 80
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 81
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

astore 13

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Resultado: "
aload 13
swap
astore 80
astore 81
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 80
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 81
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

ldc " Ahh miserávi!\n"
swap
astore 80
astore 81
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 80
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 81
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

LabelInicio_32:

dload_1
dload_3
dstore 80
dconst_0
dcmpg
ifne labelTrue_33
dload 80
dconst_0 
dcmpg 
ifne labelTrue_33
dconst_0 
goto labelFim_34

labelTrue_33:
dconst_1
labelFim_34:
dconst_0 
dcmpg 
ifeq LabelFalse_31

getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/print(D)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " OU "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/print(D)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore_1
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore_3

goto LabelInicio_32


LabelFalse_31:

return
.end method
