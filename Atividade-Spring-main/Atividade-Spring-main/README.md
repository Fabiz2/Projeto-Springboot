# 💎 Sistema de Gestão de Minerais e Cristais

Uma API REST desenvolvida em Spring Boot para gerenciamento científico e comercial de minerais, cristais e pedras preciosas.

## 🌟 Sobre o Projeto

Este sistema foi desenvolvido para catalogar e gerenciar informações detalhadas sobre minerais e cristais de todo o mundo, incluindo propriedades físico-químicas, características cristalográficas e valores de mercado.

## 🔬 Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot** - Framework principal
- **Maven** - Gerenciamento de dependências
- **Jackson** - Processamento de JSON
- **Jakarta** - Anotações para ciclo de vida

## 💰 Funcionalidades

- 📊 **Catálogo Completo**: Informações detalhadas sobre minerais e cristais
- 🔬 **Propriedades Científicas**: Fórmulas químicas, sistemas cristalinos, dureza Mohs
- 💎 **Avaliação de Valores**: Preços de mercado por grama em reais
- 🌍 **Geolocalização**: Principais locais de extração mundial
- 📈 **Classificação por Raridade**: Comum, Incomum, Raro, Muito Raro, Extremamente Raro
- 🔒 **Status de Disponibilidade**: Disponível, Escasso, Indisponível, Protegido

## 🚀 Endpoints da API

### Listar todos os minerais
```http
GET /api/v1/minerais
```

**Exemplo de resposta:**
```json
[
  {
    "id": 1,
    "nome": "Diamante",
    "categoria": "Metal Nativo",
    "formulaQuimica": "C",
    "corPrincipal": "Incolor",
    "sistemaCristalino": "Cúbico",
    "durezaMohs": 10.0,
    "densidade": 3.52,
    "pontoFusao": 3550.0,
    "brilho": "Adamantino",
    "transparencia": "Transparente",
    "valorMercado": 50000.0,
    "localizacaoPrincipal": "África do Sul - Kimberley",
    "aplicacoes": "Joalheria, Corte industrial, Eletrônicos",
    "raridade": "Muito Raro",
    "status": "Escasso"
  }
]
```

## 🧪 Estrutura dos Dados de Minerais

### Propriedades Físicas
- **Dureza Mohs**: Escala de 1 a 10 (1 = talco, 10 = diamante)
- **Densidade**: Massa específica em g/cm³
- **Ponto de Fusão**: Temperatura de fusão em °C

### Características Ópticas
- **Brilho**: Metálico, Vítreo, Resinoso, Pérola, Adamantino
- **Transparência**: Transparente, Translúcido, Opaco

### Classificação Cristalográfica
- **Sistemas Cristalinos**: Cúbico, Hexagonal, Tetragonal, Ortorrômbico, Monoclínico, Triclínico
- **Categorias**: Metaloide, Metal Nativo, Óxido, Sulfeto, Silicato, Carbonato, Sulfato, Fosfato

## 🌍 Principais Minerais do Catálogo

### 💎 Pedras Preciosas
- **Diamante**: O mineral mais duro conhecido
- **Esmeralda**: Berilo verde com cromo
- **Rubi**: Coríndum vermelho
- **Safira Azul**: Coríndum azul
- **Topázio Imperial**: Variedade rara de topázio

### 🔮 Cristais Metafísicos
- **Quartzo Rosa**: Pedra do amor e harmonia
- **Ametista**: Cristal da claridade espiritual
- **Turquesa**: Pedra de proteção ancestral

## 💰 Valores de Mercado

Os valores são apresentados em reais por grama e variam de acordo com:
- Pureza e qualidade do cristal
- Tamanho e peso
- Procedência geográfica
- Tratamentos aplicados
- Demanda do mercado

## ⚙️ Configuração e Execução

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6 ou superior

### Instalação
```bash
# Clone o repositório
git clone <url-do-repositorio>

# Entre no diretório
cd sistema-minerais

# Compile o projeto
mvn clean install

# Execute a aplicação
mvn spring-boot:run
```

### Acesso
Após iniciar a aplicação, acesse:
- API: `http://localhost:8080/api/v1/minerais`

## 🔬 Análise Mineralógica

### Dureza Mohs de Referência
1. Talco
2. Gipsita
3. Calcita
4. Fluorita
5. Apatita
6. Ortoclásio
7. Quartzo
8. Topázio
9. Coríndum
10. Diamante

### Sistemas Cristalinos
- **Cúbico**: 3 eixes iguais em ângulos retos
- **Hexagonal**: 4 eixes (3 iguais, 1 diferente)
- **Tetragonal**: 3 eixes (2 iguais, 1 diferente)
- **Ortorrômbico**: 3 eixes desiguais em ângulos retos
- **Monoclínico**: 3 eixes desiguais, 2 ângulos retos
- **Triclínico**: 3 eixes desiguais, nenhum ângulo reto

## 📊 Status dos Minerais

- **Disponível**: Extração ativa, abundante no mercado
- **Escasso**: Disponibilidade limitada, preço elevado
- **Indisponível**: Suspensão temporária de extração
- **Protegido**: Restrições legais de extração/comércio

## 🛡️ Segurança e Conformidade

Este sistema segue as diretrizes internacionais para:
- Comércio de minerais e pedras preciosas
- Certificação de origem (Kimberley Process)
- Regulamentações ambientais
- Direitos humanos na mineração

## 📞 Suporte

Para dúvidas sobre propriedades minerais, valores de mercado ou informações técnicas, consulte nossa base de dados através da API REST.

---

**💎 Desenvolvido com 💎 para entusiastas de minerais e cristais!**