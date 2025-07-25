# Requisitos Funcionais (Estórias de Usuário)

As estórias estão divididas pelas ações que cada tipo de usuário pode realizar.

## 1. Funcionalidades do Usuário
   
### EPIC-01: Gerenciar o Próprio Perfil

Como um Usuário, eu quero acessar uma página para visualizar meu próprio perfil, para que eu possa ver minhas informações cadastradas, como meu nome de exibição, avatar e biografia.

Como um Usuário, eu quero poder editar os campos do meu perfil que não afetam a autenticação (Nome de Exibição, Avatar, Biografia), para que eu possa personalizar como eu apareço para outros usuários no sistema.

Como um Usuário, eu quero ver os campos username, nome e email como somente leitura na minha página de perfil, para que eu saiba quais são minhas informações de login, mas entenda que não posso alterá-las por aqui.

## 2. Funcionalidades do Administrador

### EPIC-02: Gerenciar Todos os Usuários do Sistema

Como um Administrador, eu quero acessar uma área de gerenciamento com uma lista de todos os usuários cadastrados no sistema, para que eu tenha uma visão geral de toda a base de usuários.

Como um Administrador, eu quero poder buscar e filtrar usuários por username, cpf ou email, para que eu possa encontrar rapidamente um usuário específico para gerenciar.

Como um Administrador, eu quero clicar em qualquer usuário da lista para ver sua página de perfil completa, para que eu possa inspecionar seus dados.

Como um Administrador, eu quero poder editar os campos do perfil de qualquer usuário (Nome de Exibição, Avatar, Biografia), para que eu possa moderar o conteúdo ou auxiliar um usuário que precise de ajuda com seus dados.

Como um Administrador, eu quero poder alterar a Função (Role) de um usuário (ex: promover para Administrador ou rebaixar para Usuário Padrão), para que eu possa gerenciar as permissões de acesso dentro do sistema.

Como um Administrador, eu quero que o sistema me impeça de editar os campos de autenticação (Username, Email) de qualquer usuário através desta interface,  para que a integridade da autenticação seja mantida e eu seja orientado a usar a ferramenta correta para essa finalidade.