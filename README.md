# 🛠️ Sistema de Ordem de Serviço - OS Climatização

Este é um sistema de *Back-End* robusto e simplificado para gerenciamento de **Ordens de Serviço (OS)**, desenvolvido sob medida para otimizar as operações diárias de uma empresa de climatização e refrigeração. 

O projeto foi construído seguindo as melhores práticas de mercado, utilizando a **Arquitetura em Camadas** (Controller, Service, Repository, Entity, DTO, Exception), garantindo facilidade de manutenção e escalabilidade.

---

## 🚀 Funcionalidades Principais

- **Gerenciamento de Clientes:** Cadastro e listagem de clientes integrados ao banco de dados.
- **Gerenciamento de Técnicos:** Cadastro de profissionais e suas respectivas especialidades (ex: Especialista em Inverter, VRF, etc.).
- **Ciclo de Vida da OS:** Abertura automática de Ordens de Serviço (status `ABERTA` e data de início automática), transição de status (`EM_ANDAMENTO`, `CANCELADA`) e encerramento com registro automatizado de data/hora de fechamento (`CONCLUIDA`).
- **Histórico do Equipamento:** Registro detalhado do aparelho diretamente na OS (Marca, Modelo e Capacidade em BTUs).
- **Buscas Customizadas:** Filtro especializado para listar todas as ordens de serviço vinculadas a um técnico específico.
- **Tratamento Global de Erros:** Sistema protegido contra falhas, retornando respostas limpas com Status HTTP corretos (ex: Erro 404 customizado quando um recurso não existe).

---

## 🛠️ Tecnologias Utilizadas

- **Java 21** (Versão LTS estável mais recente)
- **Spring Boot 4.0.x** (Framework ecossistema Java)
- **Spring Data JPA** (Persistência de dados e mapeamento ORM)
- **MySQL 8.x** (Banco de dados relacional)
- **Lombok** (Produtividade e eliminação de código boiler-plate)
- **Springdoc OpenAPI / Swagger UI** (Documentação interativa e testes da API)
- **Maven** (Gerenciador de dependências e automação de build)

---

## 📋 Como Executar o Projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:
- Java JDK 21
- Maven
- MySQL Server ativo com um banco de dados criado chamado `os_climatizacao`.

### Passo a Passo

1. 1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/leosimaodev/osclimatizacao.git](https://github.com/leosimaodev/osclimatizacao.git)