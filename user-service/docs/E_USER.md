# Entidade: Usuário (User)

Campos (atributos) que um usuário deve possuir no sistema:

- ID: Identificador único vindo do Keycloak (não editável, usado para linkar).
- Username: Nome de usuário para login (não editável, gerenciado no Keycloak).
- Email: Endereço de e-mail do usuário (não editável, gerenciado no Keycloak).
- Nome: O nome do usuário. (não editável, gerenciado no Keycloak).
- CPF: Número do CPF do usuário, usado para identificação (editável).
- Nome de Exibição (Apelido): Um nome ou apelido que o usuário escolhe para aparecer publicamente no sistema (editável).
- Avatar (Foto de Perfil): Imagem de perfil do usuário (editável).
- Biografia: Um pequeno texto de descrição pessoal (editável).
- Data de Cadastro: Data em que o usuário registrou-se (não editável, informativo).
- Data de atualização: Data em que o usuário atualizou suas informações (não editável, informativo).

**Função (Role):** Nível de permissão no sistema (ex: "Administrador", "Usuário Padrão"). Este campo só pode ser alterado por um Administrador.