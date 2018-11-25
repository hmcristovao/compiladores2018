.source prog_destino.java 
.class public tarefa17
.super java/lang/Object 
.method public <init>()V 
.limit stack 1 
.limit locals 1 
aload_0 
invokespecial java/lang/Object/<init>()V 
return 
.end method 

.method public static main([Ljava/lang/String;)V 
.limit stack 25 
.limit locals 12
ldc2_w 0.0
dstore 5
ldc2_w 1.0
dstore 7
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
dstore_1
dload_1
ldc2_w 1.0
dcmpg 
ifeq COLOCATRUE_1
dconst_0 
goto SAIDA_2
COLOCATRUE_1:
dconst_1 
SAIDA_2:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_0

getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n## Soma 2 ##"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com o numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 7
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
dload 7
ldc2_w 1.0
dadd 
dstore 7
dload 5
dload_3
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com o numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 7
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
dload 7
ldc2_w 1.0
dadd 
dstore 7
dload 5
dload_3
dadd 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nSomados: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_0:
dload_1
ldc2_w 2.0
dcmpg 
ifeq COLOCATRUE_4
dconst_0 
goto SAIDA_5
COLOCATRUE_4:
dconst_1 
SAIDA_5:
dconst_0 
dcmpg 
ifeq LABELFALSECASO_3

ldc2_w 1.0
dstore 5
ldc2_w 1.0
dstore 7
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n## Multiplica 2 ##"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com 0 numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 7
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
dload 7
ldc2_w 1.0
dadd 
dstore 7
dload 5
dload_3
dmul 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nEntre com 0 numero "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 7
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc ": "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextDouble()D 
dstore_3
dload 7
ldc2_w 1.0
dadd 
dstore 7
dload 5
dload_3
dmul 
dstore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nMultiplicados: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
dload 5
invokevirtual java/io/PrintStream/print(D)V 
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
LABELFALSECASO_3:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\ndeseja sair?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "You Shall not pass, here?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\ndeseja sair?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "deseja SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "DESEJA SAIR?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Eu perguntei se quer sair daqui?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "You Shall not pass, here?"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
new java/util/Scanner 
dup 
getstatic java/lang/System.in Ljava/io/InputStream; 
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V 
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; 
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Adios mi amigo\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
return 
.end method 
