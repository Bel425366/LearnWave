# Controllers Ajustados - Script SQL

## Novos Controllers Criados

### 1. ProgressoAtividadeController (/api/progresso-atividades)
- `POST /` - Iniciar atividade
- `GET /aluno/{alunoId}` - Listar por aluno
- `GET /atividade/{atividadeId}` - Listar por atividade
- `PUT /{id}` - Atualizar progresso
- `PATCH /{id}/concluir?nota={nota}` - Concluir atividade

### 2. ProgressoVideoaulaController (/api/progresso-videoaulas)
- `POST /` - Iniciar videoaula
- `GET /aluno/{alunoId}` - Listar por aluno
- `GET /videoaula/{videoaulaId}` - Listar por videoaula
- `PUT /{id}` - Atualizar progresso
- `PATCH /{id}/tempo?tempoAssistido={tempo}` - Atualizar tempo
- `PATCH /{id}/concluir` - Concluir videoaula

### 3. DownloadMaterialController (/api/downloads)
- `POST /` - Registrar download
- `GET /aluno/{alunoId}` - Listar por aluno
- `GET /material/{materialId}` - Listar por material
- `GET /material/{materialId}/count` - Contar downloads

### 4. DocumentoVerificacaoController (/api/documentos-verificacao)
- `POST /` - Upload documento
- `GET /usuario/{usuarioId}` - Listar por usuário
- `GET /{id}` - Buscar por ID
- `DELETE /{id}` - Excluir documento

### 5. ConfiguracaoController (/api/configuracoes)
- `POST /` - Criar configuração
- `GET /` - Listar todas
- `GET /{chave}` - Buscar por chave
- `PUT /{chave}` - Atualizar configuração
- `DELETE /{chave}` - Excluir configuração

## Controllers Existentes Atualizados

### UsuarioController (/api/usuarios)
**Novas rotas adicionadas:**
- `GET /area/{area}` - Buscar por área de ensino
- `GET /disciplina/{disciplina}` - Buscar por disciplina
- `GET /escola/{escola}` - Buscar por escola
- `GET /verificacao/{status}` - Buscar por status verificação

### AtividadeController (/api/atividades)
**Novas rotas adicionadas:**
- `GET /status/{status}` - Buscar por status (rascunho, publicada, arquivada)
- `PATCH /{id}/rascunho` - Voltar para rascunho
- `GET /publicadas` - Listar apenas publicadas

### VideoaulaController (/api/videoaulas)
**Novas rotas adicionadas:**
- `GET /status/{status}` - Buscar por status
- `PATCH /{id}/rascunho` - Voltar para rascunho
- `GET /publicadas` - Listar apenas publicadas
- `GET /duracao/{duracao}` - Buscar por duração

### MaterialController (/api/materiais)
**Novas rotas adicionadas:**
- `GET /status/{status}` - Buscar por status (rascunho, publicado, arquivado)
- `GET /tipo/{tipo}` - Buscar por tipo de arquivo
- `PATCH /{id}/rascunho` - Voltar para rascunho
- `GET /publicados` - Listar apenas publicados
- `GET /{id}/downloads/count` - Contar downloads

## Campos do Script SQL Suportados

### Tabela usuarios
- ✅ id, nome, email, senha, tipo_usuario
- ✅ cpf, telefone, area_ensino, formacao, experiencia
- ✅ disciplina, escola, documento_url
- ✅ status_verificacao, status
- ✅ data_criacao, data_atualizacao

### Tabela atividades
- ✅ id, titulo, descricao, area, professor_id
- ✅ conteudo, status
- ✅ data_criacao, data_atualizacao

### Tabela videoaulas
- ✅ id, titulo, descricao, area, professor_id
- ✅ url_video, duracao, status
- ✅ data_criacao, data_atualizacao

### Tabela materiais
- ✅ id, titulo, descricao, area, professor_id
- ✅ arquivo_url, tipo_arquivo, tamanho_arquivo, status
- ✅ data_criacao, data_atualizacao

### Tabelas de Progresso e Downloads
- ✅ progresso_atividades (aluno_id, atividade_id, status, nota, tentativas)
- ✅ progresso_videoaulas (aluno_id, videoaula_id, status, tempo_assistido)
- ✅ downloads_materiais (aluno_id, material_id, data_download)

### Tabelas Auxiliares
- ✅ documentos_verificacao (usuario_id, nome_arquivo, caminho_arquivo, tipo_documento)
- ✅ configuracoes (chave, valor, descricao)

## Status dos Controllers
✅ **Todos os controllers estão alinhados com o script SQL fornecido**
✅ **Novas funcionalidades baseadas na estrutura do banco**
✅ **Rotas REST completas para todas as entidades**