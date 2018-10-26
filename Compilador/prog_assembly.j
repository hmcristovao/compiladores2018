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
ldc2_w -2.5
dadd
dstore 7

ldc2_w -5.0
dstore 9

ldc "joao"
astore 14

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

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "g = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 7
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
ldc "LOGICO OU: C: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

dload_3
ldc2_w 8.0
dsub
ldc2_w 0.0
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
ldc "joaO"
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
ldc "joao"
aload 14
astore 80
astore 81
 
new java/lang/String 
invokespecial java/lang/String/<init>()V
aload 80
aload 81
invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I
iconst_0
if_icmpeq  labelFalseExpRelacional_19
dconst_0
goto labelFimExpRelacional_20

labelFalseExpRelacional_19:
dconst_1
labelFimExpRelacional_20:
dstore 80
dconst_0
dcmpg
ifne labelTrue_21
dload 80
dconst_0 
dcmpg 
ifne labelTrue_21
dconst_0 
goto labelFim_22

labelTrue_21:
dconst_1
labelFim_22:
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
dstore 11

dload 11
dload 9
dcmpg 
ifne labelFalseExpRelacional_24
dconst_1 
goto labelFimExpRelacional_25

labelFalseExpRelacional_24: 
dconst_0
labelFimExpRelacional_25:
dconst_0 
dcmpg 
ifeq LabelFalse_23

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "igual a variavel d\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

LabelFalse_23:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\nPrimeiro enquanto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

ldc2_w 1.0
dstore 11

LabelInicio_30:

dload 11
ldc2_w 1.0
dcmpg 
ifne labelFalseExpRelacional_31
dconst_1 
goto labelFimExpRelacional_32

labelFalseExpRelacional_31: 
dconst_0
labelFimExpRelacional_32:
dconst_0 
dcmpg 
ifeq LabelFalse_29

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Entre com o valor de n:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 11
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "n = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 11
invokevirtual java/io/PrintStream/print(D)V
dload 11
ldc2_w 1.0
dsub
ldc2_w 0.0
dcmpg 
ifne labelFalseExpRelacional_27
dconst_1 
goto labelFimExpRelacional_28

labelFalseExpRelacional_27: 
dconst_0
labelFimExpRelacional_28:
dconst_0 
dcmpg 
ifeq LabelFalse_26

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Roda de novo.\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
LabelFalse_26:

goto LabelInicio_30


LabelFalse_29:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\nSegundo enquanto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

LabelInicio_34:

dload 9
ldc2_w 5.0
dcmpg 
ifne labelFalseExpRelacional_35
dconst_1 
goto labelFimExpRelacional_36

labelFalseExpRelacional_35: 
dconst_0
labelFimExpRelacional_36:
dconst_0 
dcmpg 
ifeq LabelFalse_33

dload 9
ldc2_w 1.0
dadd
dstore 9
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 9
invokevirtual java/io/PrintStream/print(D)V

goto LabelInicio_34


LabelFalse_33:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Teste de concatenação\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

ldc "Compila"
astore 13

ldc "dores\n"
astore 14

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 13
aload 14
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

aload 13
aload 14
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

astore 15

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Resultado: "
aload 15
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

LabelInicio_38:

dload_1
dload_3
dstore 80
dconst_0
dcmpg
ifne labelTrue_39
dload 80
dconst_0 
dcmpg 
ifne labelTrue_39
dconst_0 
goto labelFim_40

labelTrue_39:
dconst_1
labelFim_40:
dconst_0 
dcmpg 
ifeq LabelFalse_37

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

goto LabelInicio_38


LabelFalse_37:

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "informe o número de linhas do triangulo:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 11

dload 11
dstore_3

LabelInicio_44:

dload 11
dconst_0 
dcmpg 
ifeq LabelFalse_43

dload_3
dload 11
dsub
ldc2_w 1.0
dadd
dstore_1
ldc2_w 1.0
dstore 5
LabelInicio_42:
dload_1
dconst_0 
dcmpg 
ifeq LabelFalse_41

getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
dload_1
ldc2_w 1.0
dsub
dstore_1
dload 5
ldc2_w 1.0
dadd
dstore 5
goto LabelInicio_42

LabelFalse_41:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
dload 11
ldc2_w 1.0
dsub
dstore 11

goto LabelInicio_44


LabelFalse_43:

return
.end method
