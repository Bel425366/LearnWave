# UsuarioController - Operações CRUD

## Operações Implementadas

### 1. CADASTRAR Usuários
- `cadastrarUsuario(Usuario usuario)` - Cadastra novo usuário com validações
- Validações incluídas:
  - Nome obrigatório
  - Email obrigatório e único
  - Senha obrigatória
  - Tipo de usuário obrigatório
  - CPF único (se informado)
- Define valores padrão: status "ativo", statusVerificacao "pendente"

### 2. PESQUISAR Usuários
- `buscarPorId(Integer id)` - Busca usuário por ID
- `buscarPorEmail(String email)` - Busca usuário por email
- `listarTodos()` - Lista todos os usuários
- `buscarPorTipo(TipoUsuario tipo)` - Busca usuários por tipo (aluno, professor, administrador)
- `buscarPorStatus(String status)` - Busca usuários por status (ativo, inativo)

### 3. ALTERAR Usuários
- `atualizarUsuario(Usuario usuario)` - Atualiza dados do usuário
- `alterarStatus(Integer id, String status)` - Altera status (ativo/inativo)
- Validações incluídas:
  - ID obrigatório para atualização
  - Email único para outros usuários
  - Atualiza data_atualizacao automaticamente

### 4. LOGAR Usuários
- `login(String email, String senha)` - Autentica usuário
- Validações incluídas:
  - Email e senha obrigatórios
  - Credenciais válidas
  - Usuário deve estar ativo
- Retorna o usuário autenticado

### 5. APAGAR Usuários
- `excluirUsuario(Integer id)` - Remove usuário do banco
- Validação de ID obrigatório

### Operações Específicas para Professores
- `listarProfessoresPendentes()` - Lista professores aguardando aprovação
- `aprovarProfessor(Integer id)` - Aprova professor
- `rejeitarProfessor(Integer id)` - Rejeita professor

## Estrutura do Banco de Dados Suportada

O controller está alinhado com a tabela `usuarios` que possui:
- `id` (INT IDENTITY PRIMARY KEY)
- `nome` (NVARCHAR(255) NOT NULL)
- `email` (NVARCHAR(255) UNIQUE NOT NULL)
- `senha` (NVARCHAR(255) NOT NULL)
- `tipo_usuario` (NVARCHAR(20) CHECK: 'aluno', 'professor', 'administrador')
- `cpf` (NVARCHAR(14) NULL)
- `telefone` (NVARCHAR(20) NULL)
- `area_ensino` (NVARCHAR(255) NULL)
- `formacao` (NVARCHAR(255) NULL)
- `experiencia` (NVARCHAR(100) NULL)
- `disciplina` (NVARCHAR(100) NULL)
- `escola` (NVARCHAR(255) NULL)
- `documento_url` (NVARCHAR(500))
- `status_verificacao` (NVARCHAR(20) DEFAULT 'pendente')
- `status` (NVARCHAR(20) DEFAULT 'ativo')
- `data_criacao` (DATETIME2 DEFAULT GETDATE())
- `data_atualizacao` (DATETIME2 DEFAULT GETDATE())

## Tratamento de Erros

Todas as operações incluem tratamento de erros com mensagens específicas:
- Dados obrigatórios não informados
- Usuário não encontrado
- Email/CPF já cadastrado
- Credenciais inválidas
- Usuário inativo tentando fazer login
- Status inválido

## Exemplo de Uso

Consulte a classe `UsuarioControllerExample.java` para exemplos práticos de como usar todas as operações.