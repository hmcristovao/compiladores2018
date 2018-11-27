.source prog_destino.java 
.class public teste_completo
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 345 
.limit locals 132
ldc2_w 2.0
dstore_1
ldc2_w 1.0
ldc2_w 2.0
dadd 
dstore_3
dload_1
dload_3
dadd 
dstore 5
dload_1
ldc2_w 1.0
dsub 
dload_3
ldc2_w 2.0
dsub 
dmul 
dload 5
ldc2_w 3.0
dsub 
dmul 
ldc2_w 1.0
dadd 
dstore 7
ldc2_w 2.0
dstore_1
ldc2_w 3.0
dstore_3
ldc2_w 4.0
dstore 5
ldc2_w 0.0
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_0
dconst_0 
goto SAIDA_1
COLOCATRUE_0:
dconst_1 
SAIDA_1:
dstore 11
dload_3
dload_1
dcmpg 
ifge COLOCATRUE_2
dconst_0 
goto SAIDA_3
COLOCATRUE_2:
dconst_1 
SAIDA_3:
dstore 13
dload_1
ldc2_w 2.0
dadd 
dload_3
ldc2_w 1.0
dadd 
dcmpg 
ifge COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dstore 15
ldc2_w 1.0
ldc2_w 0.0
dcmpg 
ifge COLOCATRUE_6
dconst_0 
goto SAIDA_7
COLOCATRUE_6:
dconst_1 
SAIDA_7:
dstore 17
ldc2_w 0.0
ldc2_w 0.0
dconst_1 
dcmpg 
ifeq SAIDA_8
pop2 
dconst_0 
SAIDA_8:
dstore 19
ldc2_w 0.0
ldc2_w 1.0
dconst_1 
dcmpg 
ifeq SAIDA_9
pop2 
dconst_0 
SAIDA_9:
dstore 21
ldc2_w 1.0
ldc2_w 0.0
dconst_1 
dcmpg 
ifeq SAIDA_10
pop2 
dconst_0 
SAIDA_10:
dstore 23
ldc2_w 1.0
ldc2_w 1.0
dconst_1 
dcmpg 
ifeq SAIDA_11
pop2 
dconst_0 
SAIDA_11:
dstore 25
dload_1
ldc2_w 1.0
dadd 
ldc2_w 2.0
dmul 
ldc2_w 1.0
ldc2_w 3.0
dadd 
dcmpg 
ifge COLOCATRUE_12
dconst_0 
goto SAIDA_13
COLOCATRUE_12:
dconst_1 
SAIDA_13:
dload 5
ldc2_w 1.0
dload_3
dadd 
dcmpg 
ifeq COLOCATRUE_14
dconst_0 
goto SAIDA_15
COLOCATRUE_14:
dconst_1 
SAIDA_15:
dconst_1 
dcmpg 
ifeq SAIDA_16
pop2 
dconst_0 
SAIDA_16:
dstore 27
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 11
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 13
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 15
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 17
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 19
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 21
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 23
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 25
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 27
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w 2.0
dstore_1
ldc2_w 5.0
dstore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
dload_3
dadd 
invokevirtual java/io/PrintStream/print(D)V 
dload_1
dload_3
dcmpg 
ifeq COLOCATRUE_18
dconst_0 
goto SAIDA_19
COLOCATRUE_18:
dconst_1 
SAIDA_19:
dconst_0 
dcmpg 
ifeq LABELFALSE_17

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Igual"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_17:
ldc "aaaa"
astore 29
ldc "bbbbb"
astore 30
ldc "hello"
astore 34
ldc "world"
astore 35
ldc2_w 10.0
dstore 36
dload 36
ldc2_w 1.0
dadd 
dstore 38
dload 36
dload 38
dadd 
dstore 40
ldc2_w 1.0
dstore 42
ldc2_w 3.0
dstore 44
ldc2_w 0.0
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w 0.0
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
dload 42
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
dload 42
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
dload 42
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
dload 42
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
dload 42
ldc2_w 0.0
ddiv 
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w 0.0
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w 0.0
ldc2_w 0.0
dadd 
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w 0.0
ldc2_w 0.0
dsub 
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w 0.0
ldc2_w 0.0
dadd 
ldc2_w 5.0
dadd 
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
dload 42
dload 44
dmul 
dload 42
ldc2_w 3.0
dmul 
ldc2_w 0.0
dmul 
dadd 
ldc2_w 0.0
dsub 
dstore 42
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 42
invokevirtual java/io/PrintStream/print(D)V 
ldc2_w -14.56
dstore 46
dload 46
dstore 50
dload 48
dload 50
ddiv 
dstore 48
ldc2_w 1.0
dstore 46
ldc2_w 1.0
ldc2_w 3.0
ddiv 
ldc2_w 5.0
dsub 
ldc2_w 3.0
dmul 
ldc2_w 4.0
dload 46
ddiv 
ldc2_w 3.0
ddiv 
dadd 
ldc2_w 3.0
dload 46
ldc2_w 3.0
dsub 
ddiv 
dsub 
dstore 46
dload 46
dload 48
dadd 
dload 50
ldc2_w 1.0
dload 46
ddiv 
ldc2_w 4.0
ldc2_w 1.0
ldc2_w 3.0
ddiv 
dmul 
dsub 
ldc2_w 5.0
dload 50
dmul 
dload 46
ddiv 
dsub 
ddiv 
dadd 
dstore 46
ldc2_w -2.0
dstore 52
ldc2_w 3.0
dstore 52
ldc2_w 4.0
dstore 52
ldc2_w 2.0
ldc2_w 3.0
invokestatic java/lang/Math/pow(DD)D 
dstore_1
ldc2_w 2.0
ldc2_w 1.0
ldc2_w 2.0
ddiv 
invokestatic java/lang/Math/pow(DD)D 
dstore_3
ldc2_w 1.0
ldc2_w 2.0
ldc2_w 3.0
ldc2_w 2.0
invokestatic java/lang/Math/pow(DD)D 
dmul 
ldc2_w 2.0
dmul 
dadd 
dload_1
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "==================================="
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste A"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Digite um valor negativo ou de 5 a 10:"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 54
dload 54
ldc2_w 0.0
dcmpg 
iflt COLOCATRUE_22
dconst_0 
goto SAIDA_23
COLOCATRUE_22:
dconst_1 
SAIDA_23:
dload 54
ldc2_w 5.0
dcmpg 
ifge COLOCATRUE_24
dconst_0 
goto SAIDA_25
COLOCATRUE_24:
dconst_1 
SAIDA_25:
dload 54
ldc2_w 10.000001
dcmpg 
iflt COLOCATRUE_26
dconst_0 
goto SAIDA_27
COLOCATRUE_26:
dconst_1 
SAIDA_27:
dconst_1 
dcmpg 
ifeq SAIDA_28
pop2 
dconst_0 
SAIDA_28:
dconst_0 
dcmpg 
ifeq SAIDA_29
pop2 
dconst_1 
SAIDA_29:
dconst_0 
dcmpg 
ifeq LABELFALSE_20

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "ok!"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
goto LABELSAIDA_21

LABELFALSE_20:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "errado!"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELSAIDA_21:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "==================================="
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste B"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 10.0
dstore 58
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite um valor de 'a' abaixo de 50;"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n-Para exibir o valor de a, digite abaixo de 10;"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "-Para exibir o valor de b, digite 10 ou mais;"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "-Se a = 25 exibe mensagem diferente(Caso de um 'se' dentro de um 'senao');"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 56
LABELINICIOENQUANTO_38:
dload 56
ldc2_w 50.0
dcmpg 
iflt COLOCATRUE_39
dconst_0 
goto SAIDA_40
COLOCATRUE_39:
dconst_1 
SAIDA_40:
dconst_0 
dcmpg 
ifeq LABELFALSE_37

dload 56
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_35
dconst_0 
goto SAIDA_36
COLOCATRUE_35:
dconst_1 
SAIDA_36:
dconst_0 
dcmpg 
ifeq LABELFALSE_33

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nValor de a"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 56
invokevirtual java/io/PrintStream/print(D)V 
goto LABELSAIDA_34

LABELFALSE_33:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nValor de b"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 58
invokevirtual java/io/PrintStream/print(D)V 
dload 56
ldc2_w 25.0
dcmpg 
ifeq COLOCATRUE_31
dconst_0 
goto SAIDA_32
COLOCATRUE_31:
dconst_1 
SAIDA_32:
dconst_0 
dcmpg 
ifeq LABELFALSE_30

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Voce entrou em uma condicional dentro de uma condicional(Inception!)"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_30:
LABELSAIDA_34:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite um valor de a"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 56
goto LABELINICIOENQUANTO_38

LABELFALSE_37:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste A\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 5.0
dstore 60
LABELINICIOENQUANTO_42:
dload 60
ldc2_w 0.0
dcmpg 
ifge COLOCATRUE_43
dconst_0 
goto SAIDA_44
COLOCATRUE_43:
dconst_1 
SAIDA_44:
dconst_0 
dcmpg 
ifeq LABELFALSE_41

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " xc="
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 60
invokevirtual java/io/PrintStream/print(D)V 
dload 60
ldc2_w 1.0
dsub 
dstore 60
goto LABELINICIOENQUANTO_42

LABELFALSE_41:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nTeste B\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore_1
LABELINICIOENQUANTO_53:
dload_1
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_54
dconst_0 
goto SAIDA_55
COLOCATRUE_54:
dconst_1 
SAIDA_55:
dconst_0 
dcmpg 
ifeq LABELFALSE_52

ldc2_w 0.0
dstore_3
LABELINICIOENQUANTO_49:
dload_3
ldc2_w 10.0
dcmpg 
iflt COLOCATRUE_50
dconst_0 
goto SAIDA_51
COLOCATRUE_50:
dconst_1 
SAIDA_51:
dconst_0 
dcmpg 
ifeq LABELFALSE_48

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload_1
dload_3
dcmpg 
ifeq COLOCATRUE_46
dconst_0 
goto SAIDA_47
COLOCATRUE_46:
dconst_1 
SAIDA_47:
dconst_0 
dcmpg 
ifeq LABELFALSE_45

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "os dois sao iguais\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_45:
dload_3
ldc2_w 1.0
dadd 
dstore_3
goto LABELINICIOENQUANTO_49

LABELFALSE_48:
dload_1
ldc2_w 1.0
dadd 
dstore_1
goto LABELINICIOENQUANTO_53

LABELFALSE_52:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste A\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 2.0
dstore 62
dload 62
ldc2_w 2.0
dadd 
ldc2_w 10.0
dcmpg 
ifeq COLOCATRUE_57
dconst_0 
goto SAIDA_58
COLOCATRUE_57:
dconst_1 
SAIDA_58:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_56

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 10\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_56:
dload 62
ldc2_w 2.0
dadd 
ldc2_w 4.0
dcmpg 
ifeq COLOCATRUE_60
dconst_0 
goto SAIDA_61
COLOCATRUE_60:
dconst_1 
SAIDA_61:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_59

ldc "Acertou - caso 4!!\n"
astore 64
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload 64
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_59:
dload 62
ldc2_w 2.0
dadd 
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_63
dconst_0 
goto SAIDA_64
COLOCATRUE_63:
dconst_1 
SAIDA_64:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_62

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 62
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nErrado - caso 2\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_62:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nTeste B\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w -1.0
dstore 65
dload 62
dload 65
dsub 
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_66
dconst_0 
goto SAIDA_67
COLOCATRUE_66:
dconst_1 
SAIDA_67:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_65

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 10\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_65:
dload 62
dload 65
dsub 
ldc2_w 4.0
dcmpg 
ifeq COLOCATRUE_69
dconst_0 
goto SAIDA_70
COLOCATRUE_69:
dconst_1 
SAIDA_70:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_68

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 4\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_68:
dload 62
dload 65
dsub 
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_72
dconst_0 
goto SAIDA_73
COLOCATRUE_72:
dconst_1 
SAIDA_73:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_71

getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 62
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Errado - caso 2\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_71:
dload 62
dload 65
dsub 
ldc2_w 3.0
dcmpg 
ifeq COLOCATRUE_75
dconst_0 
goto SAIDA_76
COLOCATRUE_75:
dconst_1 
SAIDA_76:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_74

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Acertou - caso 3!!\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 62
ldc2_w 10.0
dmul 
dload 65
dadd 
dstore 62
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 62
invokevirtual java/io/PrintStream/print(D)V 
LABELFALSECASO_74:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nTeste C\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 71
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nDigite 5 numeros entre 10 e 30\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
dstore 67
LABELINICIOENQUANTO_93:
dload 67
ldc2_w 5.0
dcmpg 
iflt COLOCATRUE_94
dconst_0 
goto SAIDA_95
COLOCATRUE_94:
dconst_1 
SAIDA_95:
dconst_0 
dcmpg 
ifeq LABELFALSE_92

new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 69
dload 69
ldc2_w 11.0
dcmpg 
ifeq COLOCATRUE_78
dconst_0 
goto SAIDA_79
COLOCATRUE_78:
dconst_1 
SAIDA_79:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_77

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 71
ldc2_w 1.0
dadd 
dstore 71
LABELFALSECASO_77:
dload 69
ldc2_w 15.0
dcmpg 
ifeq COLOCATRUE_81
dconst_0 
goto SAIDA_82
COLOCATRUE_81:
dconst_1 
SAIDA_82:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_80

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 71
ldc2_w 1.0
dadd 
dstore 71
LABELFALSECASO_80:
dload 69
ldc2_w 20.0
dcmpg 
ifeq COLOCATRUE_84
dconst_0 
goto SAIDA_85
COLOCATRUE_84:
dconst_1 
SAIDA_85:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_83

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 71
ldc2_w 1.0
dadd 
dstore 71
LABELFALSECASO_83:
dload 69
ldc2_w 25.0
dcmpg 
ifeq COLOCATRUE_87
dconst_0 
goto SAIDA_88
COLOCATRUE_87:
dconst_1 
SAIDA_88:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_86

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 71
ldc2_w 1.0
dadd 
dstore 71
LABELFALSECASO_86:
dload 69
ldc2_w 26.0
dcmpg 
ifeq COLOCATRUE_90
dconst_0 
goto SAIDA_91
COLOCATRUE_90:
dconst_1 
SAIDA_91:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_89

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "numero correto\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 71
ldc2_w 1.0
dadd 
dstore 71
LABELFALSECASO_89:
dload 67
ldc2_w 1.0
dadd 
dstore 67
goto LABELINICIOENQUANTO_93

LABELFALSE_92:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 71
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " acertos"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 71
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_97
dconst_0 
goto SAIDA_98
COLOCATRUE_97:
dconst_1 
SAIDA_98:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_96

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nazarado"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_96:
dload 71
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_100
dconst_0 
goto SAIDA_101
COLOCATRUE_100:
dconst_1 
SAIDA_101:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_99

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\naruim"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_99:
dload 71
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_103
dconst_0 
goto SAIDA_104
COLOCATRUE_103:
dconst_1 
SAIDA_104:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_102

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nmediano"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_102:
dload 71
ldc2_w 3.0
dcmpg 
ifeq COLOCATRUE_106
dconst_0 
goto SAIDA_107
COLOCATRUE_106:
dconst_1 
SAIDA_107:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_105

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nsortudo"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_105:
dload 71
ldc2_w 4.0
dcmpg 
ifeq COLOCATRUE_109
dconst_0 
goto SAIDA_110
COLOCATRUE_109:
dconst_1 
SAIDA_110:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_108

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\ncagao"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_108:
dload 71
ldc2_w 5.0
dcmpg 
ifeq COLOCATRUE_112
dconst_0 
goto SAIDA_113
COLOCATRUE_112:
dconst_1 
SAIDA_113:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_111

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nvc nao existe!"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_111:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste 01\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 10.0
dstore 73
LABELINICIOFAZERENQUANTO_115:
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 73
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 73
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_116
dconst_0 
goto SAIDA_117
COLOCATRUE_116:
dconst_1 
SAIDA_117:
dconst_0 
dcmpg 
ifeq LABELFALSE_114

goto LABELINICIOFAZERENQUANTO_115

LABELFALSE_114:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste 02\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 75
LABELINICIOFAZERENQUANTO_119:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "ye: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 75
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 75
ldc2_w 1.0
dadd 
dstore 75
dload 75
ldc2_w 11.0
dcmpg 
iflt COLOCATRUE_120
dconst_0 
goto SAIDA_121
COLOCATRUE_120:
dconst_1 
SAIDA_121:
dconst_0 
dcmpg 
ifeq LABELFALSE_118

goto LABELINICIOFAZERENQUANTO_119

LABELFALSE_118:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Teste 03\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELINICIOFAZERENQUANTO_130:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Informe um valor para calcular o fatorial, 0 para sair: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 77
dload 77
dstore 79
ldc2_w 1.0
dstore 81
LABELINICIOFAZERENQUANTO_123:
dload 81
dload 79
dmul 
dstore 81
dload 79
ldc2_w 1.0
dsub 
dstore 79
dload 79
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_124
dconst_0 
goto SAIDA_125
COLOCATRUE_124:
dconst_1 
SAIDA_125:
dconst_0 
dcmpg 
ifeq LABELFALSE_122

goto LABELINICIOFAZERENQUANTO_123

LABELFALSE_122:
dload 77
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_127
dconst_0 
goto SAIDA_128
COLOCATRUE_127:
dconst_1 
SAIDA_128:
dconst_0 
dcmpg 
ifeq LABELFALSE_126

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Resultado fatorial: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 81
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_126:
dload 77
ldc2_w 1.0
dcmpg 
ifge COLOCATRUE_131
dconst_0 
goto SAIDA_132
COLOCATRUE_131:
dconst_1 
SAIDA_132:
dconst_0 
dcmpg 
ifeq LABELFALSE_129

goto LABELINICIOFAZERENQUANTO_130

LABELFALSE_129:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nTeste A\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 20.0
dstore 9
ldc2_w 2.0
ldc2_w 3.0
invokestatic java/lang/Math/pow(DD)D 
dstore_1
ldc2_w 2.0
ldc2_w 1.0
ldc2_w 2.0
ddiv 
invokestatic java/lang/Math/pow(DD)D 
dstore_3
ldc2_w 0.0
dstore 122
LABELINICIOENQUANTO_138:
dload 122
ldc2_w 5.0
dcmpg 
iflt COLOCATRUE_139
dconst_0 
goto SAIDA_140
COLOCATRUE_139:
dconst_1 
SAIDA_140:
dconst_0 
dcmpg 
ifeq LABELFALSE_137

dload_1
dload_3
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nc = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 124
LABELINICIOENQUANTO_134:
dload 124
ldc2_w 3.0
dcmpg 
iflt COLOCATRUE_135
dconst_0 
goto SAIDA_136
COLOCATRUE_135:
dconst_1 
SAIDA_136:
dconst_0 
dcmpg 
ifeq LABELFALSE_133

dload_1
dload 5
dadd 
dstore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\na = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_1
invokevirtual java/io/PrintStream/print(D)V 
dload 124
ldc2_w 1.0
dadd 
dstore 124
goto LABELINICIOENQUANTO_134

LABELFALSE_133:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nb = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
dload 122
ldc2_w 1.0
dadd 
dstore 122
goto LABELINICIOENQUANTO_138

LABELFALSE_137:
ldc2_w 0.0
dstore_1
ldc2_w 0.0
dstore_3
dload_1
ldc2_w 0.0
dcmpg 
ifeq COLOCATRUE_142
dconst_0 
goto SAIDA_143
COLOCATRUE_142:
dconst_1 
SAIDA_143:
dconst_0 
dcmpg 
ifeq LABEL_FALSE_SE_REPETE_141

ldc2_w 0.0
dstore 126
LABELINICIOENQUANTO_155:
dload 126
ldc2_w 5.0
dcmpg 
iflt COLOCATRUE_156
dconst_0 
goto SAIDA_157
COLOCATRUE_156:
dconst_1 
SAIDA_157:
dconst_0 
dcmpg 
ifeq LABELFALSE_154

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Etapa --- "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " ---\n\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_145
dconst_0 
goto SAIDA_146
COLOCATRUE_145:
dconst_1 
SAIDA_146:
dconst_0 
dcmpg 
ifeq LABEL_FALSE_SE_REPETE_144

ldc2_w 0.0
dstore 128
LABELINICIOENQUANTO_151:
dload 128
ldc2_w 3.0
dcmpg 
iflt COLOCATRUE_152
dconst_0 
goto SAIDA_153
COLOCATRUE_152:
dconst_1 
SAIDA_153:
dconst_0 
dcmpg 
ifeq LABELFALSE_150

dload_3
ldc2_w 2.0
dcmpg 
ifge COLOCATRUE_148
dconst_0 
goto SAIDA_149
COLOCATRUE_148:
dconst_1 
SAIDA_149:
dconst_0 
dcmpg 
ifeq LABELFALSE_147

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Chegando ao fim! :(\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSE_147:
dload 128
ldc2_w 1.0
dadd 
dstore 128
goto LABELINICIOENQUANTO_151

LABELFALSE_150:
LABEL_FALSE_SE_REPETE_144:
dload_3
ldc2_w 1.0
dadd 
dstore_3
dload 126
ldc2_w 1.0
dadd 
dstore 126
goto LABELINICIOENQUANTO_155

LABELFALSE_154:
LABEL_FALSE_SE_REPETE_141:
ldc2_w 0.0
dstore_3
ldc2_w 1.0
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n1 - Somar  dois numeros"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n2 - Multiplicar dois numeros"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com a opcao: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore 83
dload 83
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_159
dconst_0 
goto SAIDA_160
COLOCATRUE_159:
dconst_1 
SAIDA_160:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_158

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n## Soma 2 ##"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com o numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_1
dload 5
ldc2_w 1.0
dadd 
dstore 5
dload_3
dload_1
dadd 
dstore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com o numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_1
dload 5
ldc2_w 1.0
dadd 
dstore 5
dload_3
dload_1
dadd 
dstore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nSomados: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_158:
dload 83
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_162
dconst_0 
goto SAIDA_163
COLOCATRUE_162:
dconst_1 
SAIDA_163:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_161

ldc2_w 1.0
dstore_3
ldc2_w 1.0
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n## Multiplica 2 ##"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com 0 numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_1
dload 5
ldc2_w 1.0
dadd 
dstore 5
dload_3
dload_1
dmul 
dstore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com 0 numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_1
dload 5
ldc2_w 1.0
dadd 
dstore 5
dload_3
dload_1
dmul 
dstore_3
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nMultiplicados: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload_3
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_161:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\ndeseja sair?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "You Shall not pass, here?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\ndeseja sair?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "You Shall not pass, here?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 85
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Adios mi amigo\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 0.0
dstore 67
dload 67
dstore 86
dload 86
dstore 88
ldc2_w 0.0
dstore 92
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "*****Primeiro Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
dstore 67
LABELINICIOENQUANTO_173:
dload 67
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_174
dconst_0 
goto SAIDA_175
COLOCATRUE_174:
dconst_1 
SAIDA_175:
dconst_0 
dcmpg 
ifeq LABELFALSE_172

ldc2_w 1.0
dstore 86
LABELINICIOENQUANTO_169:
dload 86
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_170
dconst_0 
goto SAIDA_171
COLOCATRUE_170:
dconst_1 
SAIDA_171:
dconst_0 
dcmpg 
ifeq LABELFALSE_168

ldc2_w 1.0
dstore 88
LABELINICIOENQUANTO_165:
dload 88
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_166
dconst_0 
goto SAIDA_167
COLOCATRUE_166:
dconst_1 
SAIDA_167:
dconst_0 
dcmpg 
ifeq LABELFALSE_164

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "i = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 67
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ j = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 86
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ k = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 88
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 92
ldc2_w 1.0
dadd 
dstore 92
dload 88
ldc2_w 1.0
dadd 
dstore 88
goto LABELINICIOENQUANTO_165

LABELFALSE_164:
dload 86
ldc2_w 1.0
dadd 
dstore 86
goto LABELINICIOENQUANTO_169

LABELFALSE_168:
dload 67
ldc2_w 1.0
dadd 
dstore 67
goto LABELINICIOENQUANTO_173

LABELFALSE_172:
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 92
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc " possibilidades\n\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n*****Segundo Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 2.0
dstore 94
LABELINICIOENQUANTO_185:
dload 94
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_186
dconst_0 
goto SAIDA_187
COLOCATRUE_186:
dconst_1 
SAIDA_187:
dconst_0 
dcmpg 
ifeq LABELFALSE_184

ldc2_w 2.0
dstore 96
LABELINICIOENQUANTO_181:
dload 96
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_182
dconst_0 
goto SAIDA_183
COLOCATRUE_182:
dconst_1 
SAIDA_183:
dconst_0 
dcmpg 
ifeq LABELFALSE_180

ldc2_w 2.0
dstore 98
LABELINICIOENQUANTO_177:
dload 98
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_178
dconst_0 
goto SAIDA_179
COLOCATRUE_178:
dconst_1 
SAIDA_179:
dconst_0 
dcmpg 
ifeq LABELFALSE_176

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "var_1 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 94
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ var_2 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 96
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ var_3 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 98
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 98
ldc2_w 1.0
dadd 
dstore 98
goto LABELINICIOENQUANTO_177

LABELFALSE_176:
dload 96
ldc2_w 1.0
dadd 
dstore 96
goto LABELINICIOENQUANTO_181

LABELFALSE_180:
dload 94
ldc2_w 1.0
dadd 
dstore 94
goto LABELINICIOENQUANTO_185

LABELFALSE_184:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n*****Terceiro Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 2.0
dstore 9
LABELINICIOENQUANTO_207:
dload 9
ldc2_w 4.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_208
dconst_0 
goto SAIDA_209
COLOCATRUE_208:
dconst_1 
SAIDA_209:
dconst_0 
dcmpg 
ifeq LABELFALSE_206

ldc2_w 2.0
dstore 100
LABELINICIOENQUANTO_203:
dload 100
ldc2_w 4.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_204
dconst_0 
goto SAIDA_205
COLOCATRUE_204:
dconst_1 
SAIDA_205:
dconst_0 
dcmpg 
ifeq LABELFALSE_202

ldc2_w 2.0
dstore 102
LABELINICIOENQUANTO_199:
dload 102
ldc2_w 4.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_200
dconst_0 
goto SAIDA_201
COLOCATRUE_200:
dconst_1 
SAIDA_201:
dconst_0 
dcmpg 
ifeq LABELFALSE_198

dload 9
dload 100
dcmpg 
ifeq COLOCATRUE_193
dconst_0 
goto SAIDA_194
COLOCATRUE_193:
dconst_1 
SAIDA_194:
dload 100
dload 102
dcmpg 
ifeq COLOCATRUE_195
dconst_0 
goto SAIDA_196
COLOCATRUE_195:
dconst_1 
SAIDA_196:
dconst_1 
dcmpg 
ifeq SAIDA_197
pop2 
dconst_0 
SAIDA_197:
dconst_0 
dcmpg 
ifeq LABELFALSE_192

ldc2_w 0.0
dstore 90
LABELINICIOENQUANTO_189:
dload 90
dload 9
ldc2_w 1.0
dsub 
dcmpg 
iflt COLOCATRUE_190
dconst_0 
goto SAIDA_191
COLOCATRUE_190:
dconst_1 
SAIDA_191:
dconst_0 
dcmpg 
ifeq LABELFALSE_188

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "indices iguais\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 90
ldc2_w 1.0
dadd 
dstore 90
goto LABELINICIOENQUANTO_189

LABELFALSE_188:
LABELFALSE_192:
dload 102
ldc2_w 1.0
dadd 
dstore 102
goto LABELINICIOENQUANTO_199

LABELFALSE_198:
dload 100
ldc2_w 1.0
dadd 
dstore 100
goto LABELINICIOENQUANTO_203

LABELFALSE_202:
dload 9
ldc2_w 1.0
dadd 
dstore 9
goto LABELINICIOENQUANTO_207

LABELFALSE_206:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n*****Quarto Teste ******\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
ldc2_w 1.0
dstore 69
ldc2_w 0.0
dstore 104
LABELINICIOENQUANTO_243:
dload 104
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_244
dconst_0 
goto SAIDA_245
COLOCATRUE_244:
dconst_1 
SAIDA_245:
dconst_0 
dcmpg 
ifeq LABELFALSE_242

ldc2_w 0.0
dstore 106
LABELINICIOENQUANTO_239:
dload 106
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_240
dconst_0 
goto SAIDA_241
COLOCATRUE_240:
dconst_1 
SAIDA_241:
dconst_0 
dcmpg 
ifeq LABELFALSE_238

ldc2_w 0.0
dstore 108
LABELINICIOENQUANTO_235:
dload 108
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_236
dconst_0 
goto SAIDA_237
COLOCATRUE_236:
dconst_1 
SAIDA_237:
dconst_0 
dcmpg 
ifeq LABELFALSE_234

ldc2_w 0.0
dstore 110
LABELINICIOENQUANTO_231:
dload 110
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_232
dconst_0 
goto SAIDA_233
COLOCATRUE_232:
dconst_1 
SAIDA_233:
dconst_0 
dcmpg 
ifeq LABELFALSE_230

ldc2_w 0.0
dstore 112
LABELINICIOENQUANTO_227:
dload 112
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_228
dconst_0 
goto SAIDA_229
COLOCATRUE_228:
dconst_1 
SAIDA_229:
dconst_0 
dcmpg 
ifeq LABELFALSE_226

ldc2_w 0.0
dstore 114
LABELINICIOENQUANTO_223:
dload 114
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_224
dconst_0 
goto SAIDA_225
COLOCATRUE_224:
dconst_1 
SAIDA_225:
dconst_0 
dcmpg 
ifeq LABELFALSE_222

ldc2_w 0.0
dstore 116
LABELINICIOENQUANTO_219:
dload 116
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_220
dconst_0 
goto SAIDA_221
COLOCATRUE_220:
dconst_1 
SAIDA_221:
dconst_0 
dcmpg 
ifeq LABELFALSE_218

ldc2_w 0.0
dstore 118
LABELINICIOENQUANTO_215:
dload 118
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_216
dconst_0 
goto SAIDA_217
COLOCATRUE_216:
dconst_1 
SAIDA_217:
dconst_0 
dcmpg 
ifeq LABELFALSE_214

ldc2_w 0.0
dstore 120
LABELINICIOENQUANTO_211:
dload 120
ldc2_w 2.0
ldc2_w 1.0
dadd 
dcmpg 
iflt COLOCATRUE_212
dconst_0 
goto SAIDA_213
COLOCATRUE_212:
dconst_1 
SAIDA_213:
dconst_0 
dcmpg 
ifeq LABELFALSE_210

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "n = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 69
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "x1 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 104
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ y1 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 106
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ z1 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 108
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "x2 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 110
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ y2 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 112
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ z2 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 114
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "x3 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 110
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ y3 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 118
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "/ z3 = "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 120
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
dload 69
ldc2_w 1.0
dadd 
dstore 69
dload 120
ldc2_w 1.0
dadd 
dstore 120
goto LABELINICIOENQUANTO_211

LABELFALSE_210:
dload 118
ldc2_w 1.0
dadd 
dstore 118
goto LABELINICIOENQUANTO_215

LABELFALSE_214:
dload 116
ldc2_w 1.0
dadd 
dstore 116
goto LABELINICIOENQUANTO_219

LABELFALSE_218:
dload 114
ldc2_w 1.0
dadd 
dstore 114
goto LABELINICIOENQUANTO_223

LABELFALSE_222:
dload 112
ldc2_w 1.0
dadd 
dstore 112
goto LABELINICIOENQUANTO_227

LABELFALSE_226:
dload 110
ldc2_w 1.0
dadd 
dstore 110
goto LABELINICIOENQUANTO_231

LABELFALSE_230:
dload 108
ldc2_w 1.0
dadd 
dstore 108
goto LABELINICIOENQUANTO_235

LABELFALSE_234:
dload 106
ldc2_w 1.0
dadd 
dstore 106
goto LABELINICIOENQUANTO_239

LABELFALSE_238:
dload 104
ldc2_w 1.0
dadd 
dstore 104
goto LABELINICIOENQUANTO_243

LABELFALSE_242:
return 
.end method 
