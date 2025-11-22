# feito gemini

# --- VARIÁVEIS DE CONFIGURAÇÃO ---
MAIN_CLASS = Main
JAR_FILE = app.jar

JC = javac
JVM = java
JFLAGS = -d bin -cp src
CP = -cp bin

# --- DETECÇÃO AUTOMÁTICA DE FONTES ---
SOURCES = $(shell find src -name '*.java')
CLASSES = $(SOURCES:src/%.java=bin/%.class)

# --- RECEITAS (TARGETS) ---

# 'all' apenas compila as classes
all: $(CLASSES)

# 'build' compila (se necessário) e empacota num JAR executável
build: all
	@echo "Empacotando em $(JAR_FILE)..."
	# c=create, f=file, e=entrypoint (Main-Class)
	# -C bin . = muda para a pasta bin e inclui todos os arquivos de lá
	jar cfe $(JAR_FILE) $(MAIN_CLASS) -C bin .
	@echo "Build concluído: $(JAR_FILE)"

bin/%.class: src/%.java
	@mkdir -p $(dir $@)
	@echo "Compilando $<..."
	$(JC) $(JFLAGS) $<

# Agora o run pode rodar o JAR (opcional) ou as classes soltas.
# Mantive rodando as classes soltas para desenvolvimento rápido.
run: all
	@echo "Executando $(MAIN_CLASS)..."
	$(JVM) $(CP) $(MAIN_CLASS)

# Runjar: Novo utilitário para testar o JAR final
runjar: build
	@echo "Executando o JAR..."
	$(JVM) -jar $(JAR_FILE)

clean:
	@echo "Limpando diretório bin/ e artefatos..."
	rm -rf bin $(JAR_FILE)

.PHONY: all build run runjar clean
