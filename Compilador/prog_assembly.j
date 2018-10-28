.source prog_assembly.java
.class public prog_assembly
.super java/lang/Object
.method public <init>()V
.limit stack 28
.limit locals 100
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 28
.limit locals 100
;	INICIO ATRIBUICAO 
ldc2_w 5.0
ldc2_w -2.5
dadd
dstore 7
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
ldc2_w -5.0
dstore 9
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
ldc "joao"
astore 14
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
ldc2_w 2.0
ldc2_w 3.0
ldc2_w 5.0
dadd
dmul
dstore_1
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "g = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 7
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
dload_1
ldc2_w 2.0
ddiv
dstore_3
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
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
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
ldc2_w 0.0
ldc2_w 0.0
dstore 18
dconst_0
dcmpg
ifne labelTrue_3
dload 18
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
dstore 18
dconst_0
dcmpg
ifne labelTrue_5
dload 18
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
dstore 18
dconst_0
dcmpg
ifne labelTrue_7
dload 18
dconst_0 
dcmpg 
ifne labelTrue_7
dconst_0 
goto labelFim_8

labelTrue_7:
dconst_1
labelFim_8:
dstore 5
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "LOGICO OU: C: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
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
dstore 18
dconst_0
dcmpg
ifne labelTrue_13
dload 18
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
astore 18
astore 19
 
new java/lang/String 
invokespecial java/lang/String/<init>()V
aload 18
aload 19
invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I
iconst_0
if_icmpeq  labelFalseExpRelacional_15
dconst_0
goto labelFimExpRelacional_16

labelFalseExpRelacional_15:
dconst_1
labelFimExpRelacional_16:
dstore 18
dconst_0
dcmpg
ifne labelTrue_17
dload 18
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
astore 18
astore 19
 
new java/lang/String 
invokespecial java/lang/String/<init>()V
aload 18
aload 19
invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I
iconst_0
if_icmpeq  labelFalseExpRelacional_19
dconst_0
goto labelFimExpRelacional_20

labelFalseExpRelacional_19:
dconst_1
labelFimExpRelacional_20:
dstore 18
dconst_0
dcmpg
ifne labelTrue_21
dload 18
dconst_0 
dcmpg 
ifne labelTrue_21
dconst_0 
goto labelFim_22

labelTrue_21:
dconst_1
labelFim_22:
dstore 5
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Digite um numero:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ENTRADA
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 11
;	FIM ENTRADA 
;	INICIO CONDICIONAL
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

;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "igual a variavel d\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	FIM CONDICIONAL
LabelFalse_23:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\nPrimeiro enquanto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
ldc2_w 1.0
dstore 11
;	FIM ATRIBUICAO
LabelInicio_30:
;	INICIO CONDICIONAL
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

;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Entre com o valor de n:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ENTRADA
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 11
;	FIM ENTRADA 
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "n = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 11
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO CONDICIONAL
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

;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Roda de novo.\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	FIM CONDICIONAL
LabelFalse_26:
;	FIM CONDICIONAL
goto LabelInicio_30

LabelFalse_29:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\nSegundo enquanto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
LabelInicio_34:
;	INICIO CONDICIONAL
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

;	INICIO ATRIBUICAO 
dload 9
ldc2_w 1.0
dadd
dstore 9
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 9
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	FIM CONDICIONAL
goto LabelInicio_34

LabelFalse_33:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n Teste de concatenação\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
ldc "Compila"
astore 13
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
ldc "dores\n"
astore 14
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 13
aload 14
swap
astore 18
astore 19
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 18
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 19
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
aload 13
aload 14
swap
astore 18
astore 19
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 18
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 19
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 15
;	FIM ATRIBUICAO
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Resultado: "
aload 15
swap
astore 18
astore 19
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 18
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 19
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
ldc " Ahh miserávi!\n"
swap
astore 18
astore 19
new java/lang/StringBuilder 
dup
invokespecial java/lang/StringBuilder/<init>()V
aload 18
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 19
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
LabelInicio_38:
;	INICIO CONDICIONAL
dload_1
dload_3
dstore 18
dconst_0
dcmpg
ifne labelTrue_39
dload 18
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

;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_1
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " OU "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload_3
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ENTRADA
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore_1
;	FIM ENTRADA 
;	INICIO ENTRADA
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore_3
;	FIM ENTRADA 
;	FIM CONDICIONAL
goto LabelInicio_38

LabelFalse_37:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Informe o número de linhas do triangulo:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ENTRADA
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 11
;	FIM ENTRADA 
;	INICIO ATRIBUICAO 
dload 11
dstore_3
;	FIM ATRIBUICAO
LabelInicio_44:
;	INICIO CONDICIONAL
dload 11
dconst_0 
dcmpg 
ifeq LabelFalse_43

;	INICIO ATRIBUICAO 
dload_3
dload 11
dsub
ldc2_w 1.0
dadd
dstore_1
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
ldc2_w 1.0
dstore 5
;	FIM ATRIBUICAO
LabelInicio_42:
;	INICIO CONDICIONAL
dload_1
dconst_0 
dcmpg 
ifeq LabelFalse_41

;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 5
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
dload_1
ldc2_w 1.0
dsub
dstore_1
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
dload 5
ldc2_w 1.0
dadd
dstore 5
;	FIM ATRIBUICAO
;	FIM CONDICIONAL
goto LabelInicio_42

LabelFalse_41:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ATRIBUICAO 
dload 11
ldc2_w 1.0
dsub
dstore 11
;	FIM ATRIBUICAO
;	FIM CONDICIONAL
goto LabelInicio_44

LabelFalse_43:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Informe um valor pra  calcular o fatorial:\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO ENTRADA
new java/util/Scanner 
dup 
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_0 
aload_0 
invokevirtual java/util/Scanner/nextDouble()D
dstore 11
;	FIM ENTRADA 
;	INICIO ATRIBUICAO 
ldc2_w 1.0
dstore 16
;	FIM ATRIBUICAO
LabelInicio_46:
;	INICIO CONDICIONAL
dload 11
dconst_0 
dcmpg 
ifeq LabelFalse_45

;	INICIO ATRIBUICAO 
dload 16
dload 11
dmul
dstore 16
;	FIM ATRIBUICAO
;	INICIO ATRIBUICAO 
dload 11
ldc2_w 1.0
dsub
dstore 11
;	FIM ATRIBUICAO
;	FIM CONDICIONAL
goto LabelInicio_46

LabelFalse_45:
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Fatorial = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
dload 16
invokevirtual java/io/PrintStream/print(D)V
;	 FIM SAIDA
;	INICIO SAIDA
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
;	 FIM SAIDA
return
.end method
